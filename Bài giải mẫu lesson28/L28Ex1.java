/**
 * @author Branium Academy
 * @website: https://braniumacademy.net
 */
public class L28Ex1 {
    public static void main(String[] args) {
        // gọi các phương thức khởi tạo khác nhau để tạo đối tượng
        // lưu ý rằng ở đây mỗi lần gọi constructor sẽ tạo một đối tượng
        Employee employee1 = new Employee(); // gọi default constructor
        // tạo đối tượng Employee với mã nhân viên cho trước:
        Employee employee2 = new Employee("EMP001");
        // tạo đối tượng Employee với mã và tên cho trước
        Employee employee3 = new Employee("EMP001", "Trương Hoàng Anh");
        // tương tự ta cung cấp các giá trị ban đầu cho đối tượng cần tạo qua
        // các constructor tương ứng:
        Employee employee4 = new Employee("EMP001",
                "Trương Hoàng Anh", "Hà Nội");
        Employee employee5 = new Employee("EMP001", "Trương Hoàng Anh",
                "Hà Nội", 22);
        Employee employee6 = new Employee("EMP001", "Trương Hoàng Anh",
                "Hà Nội", 22, "098277688");
        Employee employee7 = new Employee("EMP001", "Trương Hoàng Anh",
                "Hà Nội", 22, "098277688", 31000000);
    }
}
