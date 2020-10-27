package net.braniumacademy.exercises_lesson37.ex1.run;

import net.braniumacademy.exercises_lesson37.ex1.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.out; // import static(xem bài học 35)

/**
 * lớp thực thi các thao tác liên quan đến lớp Employee
 *
 * @author Branium Academy
 * @website: https://braniumacademy.net
 */

public class L37Ex1 {
    public static void main(String[] args) {
        // tên file
        String fileName = "EMP.TXT";
        int choice = 0;
        ArrayList<Employee> employees = new ArrayList<>();
        employees.addAll(readEmpFromFile(fileName));
        var prevNumOfEmp = employees.size();
        if (prevNumOfEmp > 0) {
            setNextId(employees.get(prevNumOfEmp - 1).getId());
        }
        var input = new Scanner(System.in);
        do {
            out.println("============== MENU ==============");
            out.println("1. Thêm mới 1 nhân viên");
            out.println("2. Hiển thị thông tin nhân viên");
            out.println("3. Tìm nhân viên theo tên");
            out.println("4. Xóa nhân viên theo mã cho trước");
            out.println("5. Lưu danh sách nhân viên vào file");
            out.println("0. Thoát chương trình");
            out.println("Xin mời bạn chọn: ");
            choice = input.nextInt(); // nhập vào lựa chọn
            input.nextLine(); // đọc bỏ dòng thừa
            switch (choice) {
                case 0:
                    out.println("==> CẢM ƠN BẠN ĐÃ SỬ DỤNG DỊCH VỤ <==");
                    break;
                case 1:
                    var emp = createNewEmployee(input);
                    employees.add(emp); // thêm vào danh sách
                    break;
                case 2:
                    showEmployees(employees);
                    break;
                case 3:
                    if (employees.size() > 0) {
                        var name = "";
                        out.println("Nhập tên nhân viên cần tìm: ");
                        name = input.next(); // nhập mỗi tên
                        var result = searchByName(employees, name);
                        if (result.size() > 0) {
                            out.println("==> Tìm thấy " + result.size()
                                    + " kết quả <==");
                            showEmployees(result);
                        } else {
                            out.println(
                                    "==> Không tìm thấy nhân viên nào tên \""
                                            + name + "\" <==");
                        }
                    } else {
                        out.println("==> Danh sách nhân viên rỗng <==");
                    }
                    break;

                case 4:
                    if (employees.size() > 0) {
                        out.println("Nhập mã nhân viên cần xóa: ");
                        var id = input.nextLine();
                        var isDeleted = removeEmp(employees, id);
                        if (isDeleted) {
                            out.println("==> Xóa thành công <==");
                        } else {
                            out.println("==> Mã nhân viên không đúng <==");
                        }
                    } else {
                        out.println("==> Danh sách nhân viên rỗng <==");
                    }
                    break;
                case 5:
                    if (employees.size() > 0) {
                        var isSuccess = writeToFile(employees, fileName);
                        if (isSuccess) {
                            out.println("==> Ghi file thành công! <==");
                        } else {
                            out.println("==> Ghi file thất bại! <==");
                        }
                    } else {
                        out.println("==> Danh sách nhân viên rỗng. Ghi file thất bại <==");
                    }
                    break;
                default:
                    out.println("==>Sai chức năng, vui lòng chọn lại <==");
                    break;
            }
        } while (choice != 0);
    }

    /**
     * phương thức này dùng để ghi thông tin của danh sách nhân viên
     * vào file. Chỉ ghi thông tin các nhân viên chưa xuất hiện trong file
     *
     * @param employees danh sách nhân viên cần ghi
     * @param fileName  tên file cần ghi
     * @return true nếu ghi file thành công và false nếu ngược lại
     */
    private static boolean writeToFile(ArrayList<Employee> employees,
                                       String fileName) {
        var currentInFile = readEmpFromFile(fileName);
        try {
            FileWriter fileWriter = new FileWriter(fileName, true);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            for (int i = 0; i < employees.size(); i++) {
                var emp = employees.get(i);
                if (!isExist(currentInFile, emp)) {
                    printWriter.println(emp.getId());
                    printWriter.println(emp.getFullName());
                    printWriter.println(emp.getAddress());
                    printWriter.println(emp.getAge());
                    printWriter.println(emp.getPhoneNumber());
                    printWriter.println(emp.getSalary());
                    printWriter.println(emp.getExperience());
                }
            }
            printWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    /**
     * phương thức dùng để kiểm tra một đối tượng cần ghi vào file
     * đã tồn tại trước đó hay chưa
     *
     * @param employees danh sách nhân viên hiện có trong file
     * @param emp       đối tượng cần kiểm tra xem đã tồn tại chưa
     * @return true nếu đối tượng cần kiểm tra đã tồn tại
     * và false trong trường hợp ngược lại
     */
    private static boolean isExist(ArrayList<Employee> employees, Employee emp) {
        for (var item : employees) {
            if (emp.getId().compareTo(item.getId()) == 0) {
                return true;
            }
        }
        return false;
    }

    /**
     * phương thức dùng để thiết lập id tiếp theo
     * cho nhân viên trong trường hợp lần đọc file
     * trước đó đã có một số nhân viên. Nhằm đảm bảo
     * rằng mã các nhân viên là duy nhất liên tục
     * tăng
     *
     * @param id mã nhân viên cuối danh sách
     */
    private static void setNextId(String id) {
        var nextIdStr = id.substring(3); // tách lấy phần số
        var nextIdInt = Integer.parseInt(nextIdStr);
        Employee.setNextId(nextIdInt + 1); // thiết lập mã nhân viên tiếp theo
    }

    /**
     * phương thức dùng để đọc dữ liệu nhân viên từ file
     *
     * @param fileName là tên file cần đọc
     * @return danh sách sinh viên đọc được hoặc rỗng nếu file rỗng
     */
    private static ArrayList<Employee> readEmpFromFile(String fileName) {
        ArrayList<Employee> employees = new ArrayList<>();
        var file = new File(fileName);
        try {
            file.createNewFile(); // tránh lỗi khi file không tồn tại
            var input = new Scanner(file);
            while (input.hasNextLine()) {
                var id = input.nextLine();
                var fullName = input.nextLine();
                var address = input.nextLine();
                var age = Integer.parseInt(input.nextLine());
                var phoneNum = input.nextLine();
                var salary = Float.parseFloat(input.nextLine());
                var exp = Float.parseFloat(input.nextLine());
                Employee employee = new Employee(id, fullName, address, age,
                        phoneNum, salary, exp);
                employees.add(employee);
            }
            input.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return employees;
    }

    /**
     * phương thức xóa nhân viên khỏi danh sách theo mã
     *
     * @param employees danh sách nhân viên gốc
     * @param id        mã nhân viên cần xóa
     * @return true nếu xóa thành công và false nếu ngược lại
     */
    private static boolean removeEmp(ArrayList<Employee> employees, String id) {
        for (int i = 0; i < employees.size(); i++) {
            // nếu thấy nhân viên mã trùng khớp
            if (employees.get(i).getId().compareTo(id) == 0) {
                employees.remove(i); // xóa bỏ nhân viên này khỏi danh sách
                return true;
            }
        }
        return false;
    }

    /**
     * phương thức tìm nhân viên theo tên, dựa vào tên để tìm
     *
     * @param employees danh sách nhân viên
     * @param name      tên cần tìm
     * @return danh sách kết quả tìm kiếm
     */
    private static ArrayList<Employee> searchByName(
            ArrayList<Employee> employees, String name) {
        ArrayList<Employee> res = new ArrayList<>();
        for (var emp : employees) {
            var firstName = getFirstName(emp.getFullName());
            // nếu tên so sánh trùng nhau
            if (firstName.compareToIgnoreCase(name) == 0) {
                res.add(emp); // thêm nhân viên này vào danh sách kết quả
            }
        }
        return res;
    }

    /**
     * phương thức trích xuất tên từ họ và tên đầy đủ
     *
     * @param fullName họ và tên đầy đủ
     * @return tên trích xuất được
     */
    private static String getFirstName(String fullName) {
        int index = fullName.lastIndexOf(" ");
        return fullName.substring(index + 1); // trích tên
    }

    /**
     * phương thức hiển thị danh sách nhân viên theo hàng cột
     *
     * @param employees danh sách nhân viên cần hiển thị
     */
    private static void showEmployees(ArrayList<Employee> employees) {
        if (employees.size() > 0) {
            out.println("==> Danh sách nhân viên <==");
            out.printf("%-12s%-25s%-15s%-10s%-15s%-15s%-15s\n",
                    "Mã NV", "Tên NV", "Địa chỉ",
                    "Tuổi", "Số ĐT", "Lương", "Kinh nghiệm");
            for (var emp : employees) {
                showEmp(emp);
            }
        } else {
            out.println("==> Danh sách nhân viên rỗng <==");
        }
    }

    /**
     * phương thức hiển thị từng nhân viên
     *
     * @param emp nhân viên cần hiển thị
     */
    private static void showEmp(Employee emp) {
        out.printf("%-12s%-25s%-15s%-10d%-15s%-15.2f%-15.2f\n",
                emp.getId(), emp.getFullName(), emp.getAddress(),
                emp.getAge(), emp.getPhoneNumber(), emp.getSalary(),
                emp.getExperience());
    }

    /**
     * phương thức nhập vào thông tin một nhân viên
     *
     * @param input đối tượng của lớp Scanner
     * @return nhân viên với thông tin vừa nhập
     */
    private static Employee createNewEmployee(Scanner input) {
        out.println("Nhập tên nhân viên: ");
        var name = input.nextLine();
        out.println("Địa chỉ: ");
        var address = input.nextLine();
        out.println("Số điện thoại: ");
        var phoneNumber = input.nextLine();
        out.println("Tuổi: ");
        var age = input.nextInt();
        out.println("Mức lương: ");
        var salary = input.nextFloat();
        out.println("Số năm kinh nghiệm: ");
        var exp = input.nextFloat();
        // truyền null vào để tạo mới
        Employee employee = new Employee(null, name,
                address, age, phoneNumber, salary, exp);
        return employee;
    }
}
