package net.braniumacademy.ex1;

import java.util.Date;

/**
 * lớp mô tả thông tin đối tượng nhân viên
 *
 * @author Branium Academy
 * @website: https://braniumacademy.net
 */

public class Employee {
    // các thuộc tính:
    private static int nextId = 1001;
    private String id;           // mã nhân viên
    private String fullName;     // tên đầy đủ
    private String address;      // địa chỉ
    private Date dateOfBirth;           // ngày sinh
    private String phoneNumber;  // số điện thoại
    private float salary;        // mức lương
    private float experience;    // số năm kinh nghiệm

    // các phương thức khởi tạo:
    // mặc định
    public Employee() {
        setId();
        fullName = "";
        address = "";
        dateOfBirth = new Date();
        phoneNumber = "";
        salary = 0;
        experience = 0;
    }

    // 1 tham số là mã nhân viên
    public Employee(String id) {
        if (id == null) { // nếu id rỗng chứng tỏ đối tượng cần được tạo mới
            setId();
        } else {
            this.id = id;
        }
    }

    // phương thức khởi tạo 2 tham số
    public Employee(String id, String fullName) {
        this(id); // gọi phương thức khởi tạo 1 tham số
        this.fullName = fullName;
    }

    // phương thức khởi tạo 3 tham số
    public Employee(String id, String fullName, String address) {
        this(id, fullName); // gọi phương thức khởi tạo 2 tham số
        this.address = address;
    }

    // phương thức khởi tạo 4 tham số
    public Employee(String id, String fullName, String address, Date dateOfBirth) {
        this(id, fullName, address); // gọi phương thức khởi tạo 3 tham số
        this.dateOfBirth = dateOfBirth;
    }

    // phương thức khởi tạo 5 tham số
    public Employee(String id, String fullName, String address,
                    Date dateOfBirth, String phoneNumber) {
        this(id, fullName, address, dateOfBirth); // gọi phương thức khởi tạo 4 tham số
        this.phoneNumber = phoneNumber;
    }

    // phương thức khởi tạo 6 tham số
    public Employee(String id, String fullName, String address,
                    Date dateOfBirth, String phoneNumber, float salary) {
        // gọi phương thức khởi tạo 5 tham số
        this(id, fullName, address, dateOfBirth, phoneNumber);
        this.salary = salary;
    }

    // phương thức khởi tạo 7 tham số
    public Employee(String id, String fullName, String address,
                    Date dateOfBirth, String phoneNumber, float salary, float experience) {
        // gọi phương thức khởi tạo 6 tham số
        this(id, fullName, address, dateOfBirth, phoneNumber, salary);
        this.experience = experience;
    }

    public static void setNextId(int nextId) {
        Employee.nextId = nextId;
    }

    public String getId() {
        return id;
    }

    public void setId() {
        this.id = "EMP" + nextId;
        nextId++;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public float getExperience() {
        return experience;
    }

    public void setExperience(float experience) {
        this.experience = experience;
    }

    // phương thức thể hiện hành động làm việc
    public void work(String job) {
        System.out.println(fullName + " đang làm nhiệm vụ " + job);
    }

    // phương thức thể hiện hành động nghỉ ngơi
    public void relax() {
        System.out.println(fullName + " đang nghỉ ngơi.");
    }

    // phương thức thể hiện hành động nhận lương
    public void receiveSalary(float amount) {
        salary = amount;
        System.out.println(fullName + " đã nhận lương tháng là " + salary + "đ");
    }

    // phương thức thể hiện hành động đi du lịch
    public void travel(String someWhere) {
        System.out.println(fullName + " đang vi vu ở " + someWhere);
    }
}
