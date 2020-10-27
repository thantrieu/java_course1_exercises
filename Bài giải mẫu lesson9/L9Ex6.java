import java.util.Scanner;

/**
 * @author Branium Academy
 * @address https://braniumacademy.net/
 */

public class L9Ex6 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhập vào một chuỗi kí tự: ");
        var str = input.nextLine(); // đọc vào cả dòng
        // tiến hành kiểm tra
        if (str.matches("^\\s+.*")) {
            System.out.println("Chuỗi bắt đầu bằng khoảng trắng");
        } else {
            System.out.println("Chuỗi bắt đầu bằng kí tự khác khoảng trắng");
        }
    }
}
