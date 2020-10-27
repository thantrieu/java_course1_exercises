package net.braniumacademy.l47.ex4;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class Test {
    public static void main(String[] args) {
        String empFileName = "EMP.DAT";
        int choice = 0;
        ArrayList<Employee> employees
                = new ArrayList<>(readEmpFromFile(empFileName));
        updateEmployeeId(employees);
        var input = new Scanner(in);
        do {
            out.println("=================== MENU ===================");
            out.println("1. Thêm mới 1 nhân viên");
            out.println("2. Hiển thị thông tin các nhân viên");
            out.println("3. Tìm nhân viên theo tên");
            out.println("4. Tìm nhân viên có mức lương >= x");
            out.println("5. Tìm giám đốc theo nhiệm kì");
            out.println("6. Xóa nhân viên theo mã cho trước");
            out.println("7. Tính lương nhân viên");
            out.println("8. Tính thưởng nhân viên");
            out.println("9. Hiển thị mức thưởng và cách nhận thưởng");
            out.println("10. Hiển thị bảng lương");
            out.println("11. Lưu danh sách nhân viên, giám đốc");
            out.println("0. Thoát chương trình");
            out.println("Xin mời bạn chọn: ");
            choice = Integer.parseInt(input.nextLine()); // đọc vào lựa chọn
            switch (choice) {
                case 0:
                    showMessage("CẢM ƠN BẠN ĐÃ SỬ DỤNG DỊCH VỤ");
                    break;
                case 1:
                    out.println("Chọn 1: Thêm nhân viên hoặc 2: Thêm giám đốc." +
                            "\nXin mời chọn: ");
                    var slot = Integer.parseInt(input.nextLine());
                    if (slot == 1) {
                        var emp = createNewEmployee(input);
                        employees.add(emp); // thêm vào danh sách
                    } else if (slot == 2) {
                        var emp = createManager(input);
                        employees.add(emp); // thêm vào danh sách
                    }
                    break;
                case 2:
                    if (employees.size() > 0) {
                        showEmployees(employees);
                    } else {
                        showMessage("Danh sách nhân viên rỗng");
                    }
                    break;
                case 3:
                    if (employees.size() > 0) {
                        var name = "";
                        out.println("Nhập tên nhân viên cần tìm: ");
                        name = input.next(); // nhập mỗi tên
                        input.nextLine(); // đọc bỏ kí tự thừa
                        var result = searchByName(employees, name);
                        if (result.size() > 0) {
                            showMessage("Tìm thấy " + result.size()
                                    + " kết quả");
                            showEmployees(result);
                        } else {
                            out.println(
                                    "==> Không tìm thấy nhân viên nào tên \""
                                            + name + "\"");
                        }
                    } else {
                        showMessage("Danh sách nhân viên rỗng");
                    }
                    break;

                case 4:
                    if (employees.size() > 0) {
                        out.println("Nhập mức lương cần tìm: ");
                        var salary = Float.parseFloat(input.nextLine());
                        var result
                                = searchBySalary(employees, salary);
                        if (result.size() > 0) {
                            showMessage("Tìm thấy " + result.size()
                                    + " kết quả");
                            showEmployees(result);
                        } else {
                            showMessage("Không có kết quả nào");
                        }
                    } else {
                        showMessage("Danh sách nhân viên rỗng");
                    }
                    break;
                case 5:
                    if (employees.size() > 0) {
                        out.println("Nhập năm bắt đầu nhiệm kì, ví dụ: 2020");
                        var startYear = Integer.parseInt(input.nextLine());
                        out.println("Nhập năm kết thúc nhiệm kì, ví dụ: 2020");
                        var endYear = Integer.parseInt(input.nextLine());
                        var result
                                = findManagerByTerm(employees, startYear, endYear);
                        if (result.size() > 0) {
                            showMessage("Tìm thấy " + result.size()
                                    + " kết quả");
                            showManagers(result);
                        } else {
                            showMessage("Không có kết quả nào");
                        }
                    } else {
                        showMessage("Chưa có giám đốc nào trong danh sách");
                    }
                    break;
                case 6:
                    if (employees.size() > 0) {
                        out.println("Nhập mã nhân viên cần xóa: ");
                        var id = input.nextLine();
                        var isDeleted = removeEmp(employees, id);
                        if (isDeleted) {
                            showMessage("Xóa thành công");
                        } else {
                            showMessage("Mã nhân viên không đúng");
                        }
                    } else {
                        showMessage("Danh sách nhân viên rỗng");
                    }
                    break;
                case 7:
                    if (employees.size() > 0) {
                        calculSalary(employees);
                    } else {
                        showMessage("Danh sách nhân viên rỗng");
                    }
                    break;
                case 8:
                    if (employees.size() > 0) {
                        calculBonus(employees);
                    } else {
                        showMessage("Danh sách nhân viên rỗng");
                    }
                    break;
                case 9:
                    if (employees.size() > 0) {
                        showBonus(employees);
                    } else {
                        showMessage("Danh sách nhân viên rỗng");
                    }
                    break;
                case 10:
                    if (employees.size() > 0) {
                        showPayroll(employees);
                    } else {
                        showMessage("Danh sách nhân viên rỗng");
                    }
                    break;
                case 11:
                    if (employees.size() > 0) {
                        var isSuccess = writeEmpToFile(employees, empFileName);
                        if (isSuccess) {
                            showMessage("Ghi file thành công!");
                        } else {
                            showMessage("Ghi file thất bại!");
                        }
                    } else {
                        showMessage("Danh sách nhân viên rỗng. Ghi file thất bại");
                    }
                    break;
                default:
                    showMessage("Sai chức năng, vui lòng chọn lại");
                    break;
            }
        } while (choice != 0);
    }

    private static void showPayroll(ArrayList<Employee> employees) {
        out.printf("%-15s%-25s%-15s%-15s%-15s%-20s\n", "Mã NV", "Tên NV",
                "Mức lương", "Số ngày làm", "Thưởng", "Tổng lương");
        for (var emp : employees) {
            out.printf("%-15s%-25s%-15.2f%-15.2f%-15.2f%-20.2f\n", emp.getEmpId(),
                    emp.getFullNameString(), emp.getSalary(),
                    emp.getWorkingDay(), emp.getBonus(), emp.getTotalSalary());
        }
    }

    private static void showBonus(ArrayList<Employee> employees) {
        out.printf("%-15s%-25s%-15s%-25s\n", "Mã NV",
                "Tên NV", "Bonus", "Hình thức nhận");
        for (var emp : employees) {
            out.printf("%-15s%-25s%-15.2f%-25s\n", emp.getEmpId(),
                    emp.getFullNameString(), emp.getBonus(), emp.receiBonus());
        }
    }

    private static void calculBonus(ArrayList<Employee> employees) {
        for (int i = 0; i < employees.size(); i++) {
            var emp = employees.get(i);
            emp.calculBonus();
        }
    }

    private static void calculSalary(ArrayList<Employee> employees) {
        for (int i = 0; i < employees.size(); i++) {
            var emp = employees.get(i);
            emp.calculTotalSalary();
        }
    }

    private static void showMessage(String msg) {
        out.println("==> " + msg + " <==");
    }

    /**
     * phương thức thực hiện tìm kiếm giám đốc theo nhiệm kỳ
     *
     * @param employees danh sách giám đốc
     * @param startYear năm bắt đầu nhiệm kỳ cần tìm
     * @param endYear   năm kết thúc nhiệm kỳ cần tìm
     * @return danh sách giám đốc theo nhiệm kỳ tìm được
     */
    private static ArrayList<Employee> findManagerByTerm(
            ArrayList<Employee> employees, int startYear, int endYear) {
        ArrayList<Employee> result = new ArrayList<>();
        Calendar calendar = Calendar.getInstance();
        for (var emp : employees) {
            if (emp instanceof Manager) {
                var manager = (Manager) emp;
                calendar.setTime(manager.getStartDate());
                var start = calendar.get(Calendar.YEAR);
                calendar.setTime(manager.getEndDate());
                var end = calendar.get(Calendar.YEAR);
                // nếu nhiệm kì cần tìm nằm trong giai đoạn
                // nhiệm kì của manager hiện tại, add vào danh sách kết quả
                if (start <= startYear && end >= endYear) {
                    result.add(manager);
                }
            }
        }
        return result;
    }

    /**
     * phương thức tìm nhân viên theo mức lương >= salary
     *
     * @param employees danh sách nhân viên
     * @param salary    mức lương cần tìm
     * @return danh sách nhân viên tìm được
     */
    private static ArrayList<Employee> searchBySalary(
            ArrayList<Employee> employees, float salary) {
        ArrayList<Employee> ressult = new ArrayList<>();
        for (var emp : employees) {
            if (emp.getSalary() >= salary) {
                ressult.add(emp);
            }
        }
        return ressult;
    }

    /**
     * phương thức dùng để cập nhật mã nhân viên. Quy ước
     * mã nhân viên tăng liên tục nên ta sẽ tìm mã lớp nhất
     * trong danh sách nhân viên, giám đốc cũ tăng thêm 1
     * dùng làm mã nhân viên kế tiếp.
     *
     * @param employees danh sách nhân viên
     */
    private static void updateEmployeeId(ArrayList<Employee> employees) {
        int maxId = 1000; // giả định rằng ban đầu chưa có nhân viên nào
        // duyệt danh sách nhân viên
        for (var emp : employees) {
            // tách và chuyển phần số trong mã nhân viên ra thành giá trị int
            var curId = Integer.parseInt(emp.getEmpId().substring(3));
            if (curId > maxId) { // nếu mã này lớn hơn mã nhân viên maxId
                maxId = curId; // cập nhật mã maxId
            }
        }
        // thiết lập mã cho nhân viên kế tiếp
        Employee.setNextId(maxId + 1);
    }

    /**
     * phương thức này dùng để ghi thông tin của danh sách nhân viên
     * vào file. Chỉ ghi thông tin các nhân viên chưa xuất hiện trong file
     * không bảo toàn dữ liệu trong file để update file.
     *
     * @param employees danh sách nhân viên cần ghi
     * @param fileName  tên file cần ghi
     * @return true nếu ghi file thành công và false nếu ngược lại
     */
    private static boolean writeEmpToFile(ArrayList<Employee> employees,
                                          String fileName) {
        try {
            PrintWriter printWriter = new PrintWriter(fileName);
            var format = "dd/MM/yyyy";
            SimpleDateFormat dateFormat = new SimpleDateFormat(format);
            for (var emp : employees) {
                if (emp instanceof Manager) {
                    printWriter.printf("%s-%s-%s-%s-%s-%s-%s-%s-%f-%f-%f-%f-%f-%s-%s\n",
                            emp.getId(), emp.getFullNameString(),
                            emp.getAddress(), dateFormat.format(emp.getDateOfBirth()),
                            emp.getEmail(), emp.getPhoneNumber(), emp.getEmpId(),
                            emp.getDuty(), emp.getSalary(), emp.getExperience(),
                            emp.getWorkingDay(), emp.getTotalSalary(), emp.getBonus(),
                            dateFormat.format(((Manager) emp).getStartDate()),
                            dateFormat.format(((Manager) emp).getEndDate()));
                } else {
                    printWriter.printf("%s-%s-%s-%s-%s-%s-%s-%s-%f-%f-%f-%f-%f\n",
                            emp.getId(), emp.getFullNameString(),
                            emp.getAddress(), dateFormat.format(emp.getDateOfBirth()),
                            emp.getEmail(), emp.getPhoneNumber(), emp.getEmpId(),
                            emp.getDuty(), emp.getSalary(), emp.getExperience(),
                            emp.getWorkingDay(), emp.getTotalSalary(), emp.getBonus());
                }
            }
            printWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        return true;
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
        var format = "dd/MM/yyyy";
        SimpleDateFormat dateFormat = new SimpleDateFormat(format);
        try {
            file.createNewFile();
            var input = new Scanner(file);
            while (input.hasNextLine()) {
                var line = input.nextLine();
                var data = line.split("-");
                Employee employee = createEmpFromData(data, dateFormat);
                if (employee != null) {
                    employees.add(employee);
                }
            }
            input.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return employees;
    }

    /**
     * phương thức tách và tạo thông tin đối tượng nhân viên hoặc
     * giám đốc
     *
     * @param data       dữ liệu đã tách
     * @param dateFormat định dạng thời gian
     * @return đối tượng được tham chiếu đến bởi kiểu Employee
     */
    private static Employee createEmpFromData(String[] data,
                                              SimpleDateFormat dateFormat) {
        var id = data[0];
        var fullName = data[1];
        var address = data[2];
        Date dob = null;
        try {
            dob = dateFormat.parse(data[3]);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        var email = data[4];
        var phoneNum = data[5];
        var empId = data[6];
        var duty = data[7];
        var salary = Float.parseFloat(data[8]);
        var exp = Float.parseFloat(data[9]);
        var workingDay = Float.parseFloat(data[10]);
        var totalSalary = Float.parseFloat(data[11]);
        var bonus = Float.parseFloat(data[12]);
        Date start = null;
        Date end = null;
        if (data.length > 13) {
            try {
                start = dateFormat.parse(data[13]);
                end = dateFormat.parse(data[14]);
                // String id, String fullName, String address,
                //                   Date dateOfBirth, String email, String phoneNumber,
                //                   String empId, String duty, float salary, float experience,
                //                   float workingDay, float totalSalary, float bonus,
                return new Manager(id, fullName, address, dob,
                        email, phoneNum, empId, duty,
                        salary, exp, workingDay, totalSalary, bonus, start, end);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        } else {
            return new Employee(id, fullName, address, dob,
                    email, phoneNum, empId, duty,
                    salary, exp, workingDay, totalSalary, bonus);
        }
        return null;
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
            if (employees.get(i).getEmpId().compareTo(id) == 0) {
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
            var firstName = emp.getFullName().getFirst();
            // nếu tên so sánh trùng nhau
            if (firstName.compareToIgnoreCase(name) == 0) {
                res.add(emp); // thêm nhân viên này vào danh sách kết quả
            }
        }
        return res;
    }

    /**
     * phương thức hiển thị danh sách nhân viên theo hàng cột
     *
     * @param employees danh sách nhân viên cần hiển thị
     */
    private static void showEmployees(ArrayList<Employee> employees) {
        var format = "dd/MM/yyyy";
        SimpleDateFormat dateFormat = new SimpleDateFormat(format);
        showMessage("Danh sách nhân viên");
        out.printf("%-12s%-25s%-15s%-15s%-20s%-15s%-15s%-15s%-15s%-15s\n",
                "Số CMT", "Tên NV", "Địa chỉ", "Ngày sinh", "Email",
                "Số ĐT", "Mã NV", "Chức vụ", "Lương", "Kinh nghiệm");
        for (var emp : employees) {
            showEmp(emp, dateFormat);
        }
    }

    /**
     * phương thức hiển thị từng nhân viên
     *
     * @param emp nhân viên cần hiển thị
     */
    private static void showEmp(Employee emp, SimpleDateFormat dateFormat) {
        out.printf("%-12s%-25s%-15s%-15s%-20s" +
                        "%-15s%-15s%-15s%-15.2f%-15.2f\n",
                emp.getId(), emp.getFullNameString(), emp.getAddress(),
                dateFormat.format(emp.getDateOfBirth()), emp.getEmail(),
                emp.getPhoneNumber(), emp.getEmpId(), emp.getDuty(),
                emp.getSalary(), emp.getExperience());
    }

    private static void showManagers(ArrayList<Employee> managers) {
        if (managers.size() > 0) {
            var format = "dd/MM/yyyy";
            SimpleDateFormat dateFormat = new SimpleDateFormat(format);
            showMessage("Danh sách giám đốc");
            out.printf("%-12s%-25s%-15s%-15s%-20s%-15s%-15s%-15s" +
                            "%-15s%-15s%-15s%-15s%-15s%-15s%-15s%-15s\n",
                    "Số CMT", "Tên NV", "Địa chỉ", "Ngày sinh", "Email",
                    "Số ĐT", "Mã NV", "Chức vụ", "Lương", "Thưởng",
                    "Kinh nghiệm", "Số ngày làm", "Thưởng", "Tổng lương",
                    "Ngày bắt đầu", "Ngày kết thúc");
            for (var emp : managers) {
                if (emp instanceof Manager) {
                    var m = (Manager) emp;
                    showManager(m, dateFormat);
                }
            }
        } else {
            showMessage("Danh sách giám đốc rỗng");
        }
    }

    private static void showManager(Manager manager,
                                    SimpleDateFormat dateFormat) {
        out.printf("%-12s%-25s%-15s%-15s%-20s%-15s%-15s" +
                        "%-15s%-15.2f-%15.2f-%15.2f-%15.2f-%15.2f-%15.2f-%15s%-15s\n",
                manager.getId(), manager.getFullNameString(),
                manager.getAddress(),
                dateFormat.format(manager.getDateOfBirth()),
                manager.getEmail(), manager.getPhoneNumber(),
                manager.getEmpId(), manager.getDuty(),
                manager.getSalary(), manager.getBonus(),
                manager.getExperience(), manager.getWorkingDay(),
                manager.getBonus(), manager.getTotalSalary(),
                dateFormat.format(manager.getStartDate()),
                dateFormat.format(manager.getEndDate()));
    }

    /**
     * phương thức tạo mới đối tượng giám đốc
     *
     * @param input đối tượng của lớp Scanner
     * @return đối tượng giám đốc vừa tạo
     */
    private static Manager createManager(Scanner input) {
        Employee employee = createNewEmployee(input);
        var format = "dd/MM/yyyy";
        SimpleDateFormat dateFormat = new SimpleDateFormat(format);
        out.println("Ngày bắt đầu nhiệm kì(dd/MM/yyyy): ");
        Date start = null;
        try {
            start = dateFormat.parse(input.nextLine());
        } catch (ParseException e) {
            e.printStackTrace();
        }
        out.println("Ngày kết thúc nhiệm kì(dd/MM/yyyy): ");
        Date end = null;
        try {
            end = dateFormat.parse(input.nextLine());
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return new Manager(employee, start, end);
    }

    /**
     * phương thức nhập vào thông tin một nhân viên
     *
     * @param input đối tượng của lớp Scanner
     * @return nhân viên với thông tin vừa nhập
     */
    private static Employee createNewEmployee(Scanner input) {
        out.println("Số chứng minh thư: ");
        var pId = input.nextLine();
        out.println("Nhập tên nhân viên: ");
        var name = input.nextLine();
        out.println("Địa chỉ: ");
        var address = input.nextLine();
        out.println("Số điện thoại: ");
        var phoneNumber = input.nextLine();
        out.println("Email: ");
        var email = input.nextLine();
        out.println("Ngày sinh dd/MM/yyyy, ví dụ 12/10/2020: ");
        var format = "dd/MM/yyyy";
        SimpleDateFormat dateFormat = new SimpleDateFormat(format);
        Date dob = null;
        try {
            dob = dateFormat.parse(input.nextLine());
        } catch (ParseException e) {
            e.printStackTrace();
            dob = new Date(); // giả định nếu nhập sai thì ngày sinh là ngày hiện tại
        }
        out.println("Chức vụ: ");
        var duty = input.nextLine();
        out.println("Mức lương: ");
        var salary = Float.parseFloat(input.nextLine());
        out.println("Số năm kinh nghiệm: ");
        var exp = Float.parseFloat(input.nextLine());
        out.println("Số ngày làm việc trong tháng: ");
        var workingDay = Float.parseFloat(input.nextLine());
        // ban đầu chưa cần biết lương thưởng nên ta cho chúng = 0
        return new Employee(pId, name, address, dob, email,
                phoneNumber, null, duty, salary, exp, workingDay, 0, 0);
    }
}
