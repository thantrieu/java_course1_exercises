import java.util.Scanner;

/**
 * @author Branium Academy
 * @address https://braniumacademy.net/
 */

public class L8Ex4 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhập vào hai số a, b: ");
        var a = input.nextInt(); // đọc a
        var b = input.nextInt(); // đọc b
        // tìm min, max và hiện ra màn hình luôn
        System.out.println("min(a, b) = " + Math.min(a, b));
        System.out.println("max(a, b) = " + Math.max(a, b));
    }
}
// code xong ấn Ctrl Alt L để format code