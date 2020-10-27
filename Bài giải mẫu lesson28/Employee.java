/**
 * lớp mô tả thông tin đối tượng nhân viên
 *
 * @author Branium Academy
 * @website: https://braniumacademy.net
 */

public class Employee {
    // các thuộc tính:
    public String id;           // mã nhân viên
    public String fullName;     // tên đầy đủ
    public String address;      // địa chỉ
    public int age;             // tuổi
    public String phoneNumber;  // số điện thoại
    public float salary;        // mức lương
    public float experience;    // số năm kinh nghiệm

    // các phương thức khởi tạo:
    // mặc định
    public Employee() {
        id = "";
        fullName = "";
        address = "";
        age = 0;
        phoneNumber = "";
        salary = 0;
        experience = 0;
    }

    // 1 tham số là mã nhân viên
    public Employee(String id) {
        this.id = id;
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
    public Employee(String id, String fullName, String address, int age) {
        this(id, fullName, address); // gọi phương thức khởi tạo 3 tham số
        this.age = age;
    }

    // phương thức khởi tạo 5 tham số
    public Employee(String id, String fullName, String address,
                    int age, String phoneNumber) {
        this(id, fullName, address, age); // gọi phương thức khởi tạo 4 tham số
        this.phoneNumber = phoneNumber;
    }

    // phương thức khởi tạo 6 tham số
    public Employee(String id, String fullName, String address,
                    int age, String phoneNumber, float salary) {
        // gọi phương thức khởi tạo 5 tham số
        this(id, fullName, address, age, phoneNumber);
        this.salary = salary;
    }

    // phương thức khởi tạo 7 tham số
    public Employee(String id, String fullName, String address,
                    int age, String phoneNumber, float salary, float experience) {
        // gọi phương thức khởi tạo 6 tham số
        this(id, fullName, address, age, phoneNumber, salary);
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
