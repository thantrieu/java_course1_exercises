import java.util.Scanner;

/**
 * @author Branium Academy
 * @address https://braniumacademy.net/
 */

public class L8Ex1 {
    public static void main(String[] args) {
        int n;
        var input = new Scanner(System.in);
        System.out.println("Nhập vào một số n: ");
        n = input.nextInt(); // đọc n vào từ keyboard
        int absN = Math.abs(n); // lấy trị tuyệt đối của n
        System.out.println("n = " + n + "\n|n| = " + absN);
    }
}
// code xong ấn Ctrl Alt L để format code