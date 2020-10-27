import java.util.Scanner;

/**
 * @author Branium Academy
 * @address https://braniumacademy.net/
 */

public class L8Ex2 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhập vào một số dương n: ");
        var n = input.nextInt(); // đọc n vào từ keyboard
        var sqrtN = Math.sqrt(n); // lấy căn bậc hai của n
        System.out.println("srt(n) = " + sqrtN);
    }
}
// code xong ấn Ctrl Alt L để format code