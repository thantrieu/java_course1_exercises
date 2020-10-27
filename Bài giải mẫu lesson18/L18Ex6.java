import java.util.Scanner;

/**
 * @author Branium Academy
 * @address https://braniumacademy.net/
 */

public class L18Ex6 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhập vào một số nguyên dương: ");
        var a = input.nextInt();
        showFirstDigit(a); // gọi phương thức hiển thị chữ số đầu của a
    }

    public static void showFirstDigit(int n) {
        while (n > 10) {
            n /= 10;
        }
        // lúc này n chỉ còn lại chữ số đầu tiên
        System.out.println("Chữ số đầu tiên của n: " + n);
    }
}
