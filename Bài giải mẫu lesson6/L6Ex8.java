import java.util.Scanner;

/**
 * @author Branium Academy
 * @address https://braniumacademy.net/
 */

public class L6Ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào một chuỗi kí tự: ");
        String message = scanner.nextLine();
        // vị trí phần tử đầu tiên: 0
        System.out.println("Vị trí phần tử đầu: 0, giá trị: "
                + message.charAt(0));
        // vị trí phần tử cuối: length() - 1
        int lastIndex = message.length() - 1;
        System.out.println("Vị trí phần tử cuối: " + lastIndex
                + ", Giá trị: " + message.charAt(lastIndex));
    }
}
// ấn Ctrl Alt L để format code