/**
 * lớp mô tả thông tin đối tượng nhân viên
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
