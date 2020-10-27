import java.util.Scanner;

/**
 * @author Branium Academy
 * @address https://braniumacademy.net/
 */

public class L18Ex2 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhập vào một số nguyên dương: ");
        var n = input.nextInt();
        boolean isRev = isRevert(n); // gọi p.thức và gán giá trị nhận đc cho isRev
        if (isRev) {
            System.out.println("n là số thuận nghịch");
        } else {
            System.out.println("n không phải số thuận nghịch");
        }
    }

    // phương thức kiểm tra giá trị n có phải là t.nghịch hay không
    public static boolean isRevert(int n) {
        int m = n; // lưu n ra biến khác để tránh mất dữ liệu
        int rev = 0;
        while (m > 0) {
            rev = rev * 10 + m % 10;
            m /= 10;
        }
        return n == rev; // nếu n=rev thì return true ngược lại return false
    }
}
