import java.util.Scanner;

/**
 * @author Branium Academy
 * @address https://braniumacademy.net/
 */

public class L6Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào một chuỗi kí tự: ");
        String str = scanner.nextLine();
        // thay thế toàn bộ các dấu cách bằng dấu *
        String newStr = str.replaceAll(" ", "*");
        // hiện kết quả
        System.out.println("Kết quả: " + newStr);
    }
}
// code xong ấn Ctrl Alt L để format code