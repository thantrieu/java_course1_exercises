package net.braniumacademy.exercises_lesson35.ex1.run;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * lớp thực thi các thao tác liên quan đến lớp Employee
 *
 * @author Branium Academy
 * @website: https://braniumacademy.net
 */

public class L35Ex1 {
    public static void main(String[] args) {
        int choice = 0;
        ArrayList<Employee> employees = new ArrayList<>();
        var input = new Scanner(System.in);
        do {
            System.out.println("============== MENU ==============");
            System.out.println("1. Thêm mới 1 nhân viên");
            System.out.println("2. Hiển thị thông tin nhân viên");
            System.out.println("3. Tìm nhân viên theo tên");
            System.out.println("4. Xóa nhân viên theo mã cho trước");
            System.out.println("0. Thoát chương trình");
            System.out.println("Xin mời bạn chọn: ");
            choice = input.nextInt(); // nhập vào lựa chọn
            input.nextLine(); // đọc bỏ dòng thừa
            switch (choice) {
                case 0:
                    System.out.println("==> CẢM ƠN BẠN ĐÃ SỬ DỤNG DỊCH VỤ <==");
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
                        System.out.println("Nhập tên nhân viên cần tìm: ");
                        name = input.next(); // nhập mỗi tên
                        var result = searchByName(employees, name);
                        if (result.size() > 0) {
                            System.out.println("==> Tìm thấy " + result.size() + " kết quả <==");
                            showEmployees(result);
                        } else {
                            System.out.println(
                                    "==> Không tìm thấy nhân viên nào tên \"" + name + "\" <==");
                        }
                    } else {
                        System.out.println("==> Danh sách nhân viên rỗng <==");
                    }
                    break;

                case 4:
                    if (employees.size() > 0) {
                        System.out.println("Nhập mã nhân viên cần xóa: ");
                        var id = input.nextLine();
                        var isDeleted = removeEmp(employees, id);
                        if (isDeleted) {
                            System.out.println("==> Xóa thành công <==");
                        } else {
                            System.out.println("==> Mã nhân viên không đúng <==");
                        }
                    } else {
                        System.out.println("==> Danh sách nhân viên rỗng <==");
                    }
                    break;
                default:
                    System.out.println("==>Sai chức năng, vui lòng chọn lại <==");
                    break;
            }
        } while (choice != 0);
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
            System.out.println("==> Danh sách nhân viên <==");
            System.out.printf("%-12s%-25s%-15s%-10s%-15s%-15s%-15s\n",
                    "Mã NV", "Tên NV", "Địa chỉ",
                    "Tuổi", "Số ĐT", "Lương", "Kinh nghiệm");
            for (var emp : employees) {
                showEmp(emp);
            }
        } else {
            System.out.println("==> Danh sách nhân viên rỗng <==");
        }
    }

    /**
     * phương thức hiển thị từng nhân viên
     *
     * @param emp nhân viên cần hiển thị
     */
    private static void showEmp(Employee emp) {
        System.out.printf("%-12s%-25s%-15s%-10d%-15s%-15.2f%-15.2f\n",
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
        System.out.println("Nhập mã nhân viên: ");
        var id = input.nextLine();
        System.out.println("Nhập tên nhân viên: ");
        var name = input.nextLine();
        System.out.println("Địa chỉ: ");
        var address = input.nextLine();
        System.out.println("Số điện thoại: ");
        var phoneNumber = input.nextLine();
        System.out.println("Tuổi: ");
        var age = input.nextInt();
        System.out.println("Mức lương: ");
        var salary = input.nextFloat();
        System.out.println("Số năm kinh nghiệm: ");
        var exp = input.nextFloat();
        Employee employee = new Employee(id, name,
                address, age, phoneNumber, salary, exp);
        return employee;
    }
}
