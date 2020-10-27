public class L29Ex1 {
    public static void main(String[] args) {
        Employee nam = new Employee(); // tạo đối tượng của lớp Employee
        var fullName = "Trần Hoàng Nam"; // gán tên
        var address = "Hà Nội"; // gán địa chỉ
        var age = 25; // gán tuổi
        nam.setFullName(fullName);
        nam.setAge(age);
        nam.setAddress(address);
        nam.receiveSalary(30000); // nhận lương
        nam.relax(); // Nam đang nghỉ ngơi
        nam.travel("Nam cực"); // Nam đi nam cực ngắm cá voi chẳng hạn
        // sử dụng getter:
        System.out.println("Hello " + nam.getFullName());
        System.out.println("Địa chỉ của tôi là: " + nam.getAddress());
    }
}
