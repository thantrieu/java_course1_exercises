package net.braniumacademy.l44.ex4;

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
        String managerFileName = "MAN.DAT";
        int choice = 0;
        ArrayList<Employee> employees
                = new ArrayList<>(readEmpFromFile(empFileName));
        ArrayList<Manager> managers
                = new ArrayList<>(readManagerFromFile(managerFileName));
        updateEmployeeId(employees, managers);
        var input = new Scanner(in);
        do {
            out.println("=============== MENU ===============");
            out.println("1. Thêm mới 1 nhân viên");
            out.println("2. Thêm mới 1 giám đốc");
            out.println("3. Hiển thị thông tin các nhân viên");
            out.println("4. Hiển thị thông tin các giám đốc");
            out.println("5. Tìm nhân viên theo tên");
            out.println("6. Tìm nhân viên có mức lương >= x");
            out.println("7. Tìm giám đốc theo nhiệm kì");
            out.println("8. Xóa nhân viên theo mã cho trước");
            out.println("9. Lưu danh sách nhân viên, giám đốc");
            out.println("0. Thoát chương trình");
            out.println("Xin mời bạn chọn: ");
            choice = input.nextInt(); // nhập vào lựa chọn
            input.nextLine(); // đọc bỏ dòng thừa
            switch (choice) {
                case 0:
                    showMessage("CẢM ƠN BẠN ĐÃ SỬ DỤNG DỊCH VỤ");
                    break;
                case 1:
                    var emp = createNewEmployee(input);
                    employees.add(emp); // thêm vào danh sách
                    break;
                case 2:
                    var manager = createManager(input);
                    managers.add(manager);
                    break;
                case 3:
                    showEmployees(employees);
                    break;

                case 4:
                    showManagers(managers);
                    break;
                case 5:
                    if (employees.size() > 0) {
                        var name = "";
                        out.println("Nhập tên nhân viên cần tìm: ");
                        name = input.next(); // nhập mỗi tên
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

                case 6:
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
                case 7:
                    if (managers.size() > 0) {
                        out.println("Nhập năm bắt đầu nhiệm kì, ví dụ: 2020");
                        var startYear = Integer.parseInt(input.nextLine());
                        out.println("Nhập năm kết thúc nhiệm kì, ví dụ: 2020");
                        var endYear = Integer.parseInt(input.nextLine());
                        var result
                                = findManagerByTerm(managers, startYear, endYear);
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
                case 8:
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
                case 9:
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

                    if (managers.size() > 0) {
                        var isSuccess
                                = writeManagerToFile(managers, managerFileName);
                        if (isSuccess) {
                            showMessage("Ghi file thành công!");
                        } else {
                            showMessage("Ghi file thất bại!");
                        }
                    } else {
                        showMessage("Danh sách giám đốc rỗng. Ghi file thất bại");
                    }

                    break;
                default:
                    showMessage("Sai chức năng, vui lòng chọn lại");
                    break;
            }
        } while (choice != 0);
    }

    private static void showMessage(String msg) {
        out.println("==> " + msg + " <==");
    }

    /**
     * phương thức thực hiện tìm kiếm giám đốc theo nhiệm kỳ
     *
     * @param managers  danh sách giám đốc
     * @param startYear năm bắt đầu nhiệm kỳ cần tìm
     * @param endYear   năm kết thúc nhiệm kỳ cần tìm
     * @return danh sách giám đốc theo nhiệm kỳ tìm được
     */
    private static ArrayList<Manager> findManagerByTerm(
            ArrayList<Manager> managers, int startYear, int endYear) {
        ArrayList<Manager> result = new ArrayList<>();
        Calendar calendar = Calendar.getInstance();
        for (var manager : managers) {
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
     * @param managers  danh sách giám đốc
     */
    private static void updateEmployeeId(ArrayList<Employee> employees,
                                         ArrayList<Manager> managers) {
        int maxId = 1000; // giả định rằng ban đầu chưa có nhân viên nào
        // duyệt danh sách nhân viên
        for (var emp : employees) {
            // tách và chuyển phần số trong mã nhân viên ra thành giá trị int
            var curId = Integer.parseInt(emp.getEmpId().substring(3));
            if (curId > maxId) { // nếu mã này lớn hơn mã nhân viên maxId
                maxId = curId; // cập nhật mã maxId
            }
        }
        // duyệt danh sách manager
        for (var emp : managers) {
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
        var currentInFile = readEmpFromFile(fileName);
        try {
            PrintWriter printWriter = new PrintWriter(fileName);
            var format = "dd/MM/yyyy";
            SimpleDateFormat dateFormat = new SimpleDateFormat(format);
            for (Employee emp : employees) {
                printWriter.printf("%s-%s-%s-%s-%s-%s-%s-%s-%f-%f\n",
                        emp.getId(), emp.getFullNameString(),
                        emp.getAddress(), dateFormat.format(emp.getDateOfBirth()),
                        emp.getEmail(), emp.getPhoneNumber(), emp.getEmpId(),
                        emp.getDuty(), emp.getSalary(), emp.getExperience());
            }
            printWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    /**
     * phương thức ghi thông tin manager ra file, không bảo toàn
     * dữ liệu trong file cũ để update thông tin trong file
     *
     * @param managers danh sách manager
     * @param fileName tên file đích
     * @return true nếu ghi thành công và false otherwise
     */
    private static boolean writeManagerToFile(ArrayList<Manager> managers,
                                              String fileName) {
        var currentInFile = readManagerFromFile(fileName);
        try {
            PrintWriter printWriter = new PrintWriter(fileName);
            var format = "dd/MM/yyyy";
            SimpleDateFormat dateFormat = new SimpleDateFormat(format);
            for (Manager manager : managers) {
                printWriter.printf("%s-%s-%s-%s-%s-%s-%s-%s-%f-%f-%f-%s-%s\n",
                        manager.getId(), manager.getFullNameString(),
                        manager.getAddress(), dateFormat.format(manager.getDateOfBirth()),
                        manager.getEmail(), manager.getPhoneNumber(), manager.getEmpId(),
                        manager.getDuty(), manager.getSalary(), manager.getExperience(),
                        manager.getBonus(), dateFormat.format(manager.getStartDate()),
                        dateFormat.format(manager.getEndDate()));
            }
            printWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        return true;
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
        var format = "dd/MM/yyyy";
        SimpleDateFormat dateFormat = new SimpleDateFormat(format);
        try {
            file.createNewFile();
            var input = new Scanner(file);
            while (input.hasNextLine()) {
                var line = input.nextLine();
                var data = line.split("-");
                var id = data[0];
                var fullName = data[1];
                var address = data[2];
                var dob = dateFormat.parse(data[3]);
                var email = data[4];
                var phoneNum = data[5];
                var empId = data[6];
                var duty = data[7];
                var salary = Float.parseFloat(data[8]);
                var exp = Float.parseFloat(data[9]);
                Employee employee = new Employee(id, fullName, address, dob,
                        email, phoneNum, empId, duty, salary, exp);
                employees.add(employee);
            }
            input.close();
        } catch (ParseException | IOException e) {
            e.printStackTrace();
        }

        return employees;
    }

    /**
     * phương thức đọc danh sách manager từ file
     *
     * @param fileName tên file chứa danh sách manager
     * @return danh sách manager đọc được
     */
    private static ArrayList<Manager> readManagerFromFile(String fileName) {
        ArrayList<Manager> managers = new ArrayList<>();
        var file = new File(fileName);
        var format = "dd/MM/yyyy";
        SimpleDateFormat dateFormat = new SimpleDateFormat(format);
        try {
            file.createNewFile();
            var input = new Scanner(file);
            while (input.hasNextLine()) {
                var line = input.nextLine();
                var data = line.split("-");
                var id = data[0];
                var fullName = data[1];
                var address = data[2];
                var dob = dateFormat.parse(data[3]);
                var email = data[4];
                var phoneNum = data[5];
                var empId = data[6];
                var duty = data[7];
                var salary = Float.parseFloat(data[8]);
                var exp = Float.parseFloat(data[9]);
                var bonus = Float.parseFloat(data[10]);
                var startDate = dateFormat.parse(data[11]);
                var endDate = dateFormat.parse(data[12]);
                Manager manager = new Manager(id, fullName, address, dob,
                        email, phoneNum, empId, duty, salary, exp,
                        bonus, startDate, endDate);
                managers.add(manager);
            }
            input.close();
        } catch (ParseException | IOException e) {
            e.printStackTrace();
        }

        return managers;
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
        if (employees.size() > 0) {
            var format = "dd/MM/yyyy";
            SimpleDateFormat dateFormat = new SimpleDateFormat(format);
            showMessage("Danh sách nhân viên");
            out.printf("%-12s%-25s%-15s%-15s%-20s%-15s%-15s%-15s%-15s%-15s\n",
                    "Số CMT", "Tên NV", "Địa chỉ", "Ngày sinh", "Email",
                    "Số ĐT", "Mã NV", "Chức vụ", "Lương", "Kinh nghiệm");
            for (var emp : employees) {
                showEmp(emp, dateFormat);
            }
        } else {
            showMessage("Danh sách nhân viên rỗng");
        }
    }

    /**
     * phương thức hiển thị từng nhân viên
     *
     * @param emp nhân viên cần hiển thị
     */
    private static void showEmp(Employee emp, SimpleDateFormat dateFormat) {
        out.printf("%-12s%-25s%-15s%-15s%-20s%-15s%-15s%-15s%-15.2f%-15.2f\n",
                emp.getId(), emp.getFullNameString(), emp.getAddress(),
                dateFormat.format(emp.getDateOfBirth()), emp.getEmail(),
                emp.getPhoneNumber(), emp.getEmpId(), emp.getDuty(),
                emp.getSalary(), emp.getExperience());
    }

    private static void showManagers(ArrayList<Manager> managers) {
        if (managers.size() > 0) {
            var format = "dd/MM/yyyy";
            SimpleDateFormat dateFormat = new SimpleDateFormat(format);
            showMessage("Danh sách giám đốc");
            out.printf("%-12s%-25s%-15s%-15s%-20s" +
                            "%-15s%-15s%-15s%-15s%-15s%-15s%-15s%-15s\n",
                    "Số CMT", "Tên NV", "Địa chỉ", "Ngày sinh", "Email",
                    "Số ĐT", "Mã NV", "Chức vụ", "Lương", "Thưởng",
                    "Kinh nghiệm", "Ngày bắt đầu", "Ngày kết thúc");
            for (var m : managers) {
                showManager(m, dateFormat);
            }
        } else {
            showMessage("Danh sách giám đốc rỗng");
        }
    }

    private static void showManager(Manager manager,
                                    SimpleDateFormat dateFormat) {
        out.printf("%-12s%-25s%-15s%-15s%-20s%-15s%-15s" +
                        "%-15s%-15.2f%-15.2f%-15.2f%-15s%-15s\n",
                manager.getId(), manager.getFullNameString(),
                manager.getAddress(),
                dateFormat.format(manager.getDateOfBirth()),
                manager.getEmail(), manager.getPhoneNumber(),
                manager.getEmpId(), manager.getDuty(),
                manager.getSalary(), manager.getBonus(),
                manager.getExperience(),
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
        out.println("Mức thưởng: ");
        var bonus = Float.parseFloat(input.nextLine());
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
        return new Manager(employee, bonus, start, end);
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

        return new Employee(pId, name, address, dob, email,
                phoneNumber, null, duty, salary, exp);
    }
}
