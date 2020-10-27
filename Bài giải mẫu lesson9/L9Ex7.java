import java.util.Scanner;

/**
 * @author Branium Academy
 * @address https://braniumacademy.net/
 */

public class L9Ex7 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhập vào họ và tên cách nhau bằng 1 khoảng trắng: ");
        var fullName = input.nextLine(); // đọc vào cả dòng
        // tách lấy tên, từ sau vị trí dấu cách cuối cùng đến hết
        var firstName = fullName.substring(fullName.lastIndexOf(" ") + 1);
        // tiến hành kiểm tra
        if (firstName.matches("^[A-Z]+.*")) {
            System.out.println("Tên bắt đầu bằng chữ cái hoa");
        } else {
            System.out.println("Tên không bắt đầu bằng chữ hoa");
        }
    }
}
