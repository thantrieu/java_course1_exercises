import java.util.Scanner;

/**
 * @author Branium Academy
 * @address https://braniumacademy.net/
 */

public class L21Ex6 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhập số nguyên dương n: ");
        var n = input.nextInt();
        if (n < 0) {
            System.out.println("Nhập n > 0");
        } else {
            System.out.println("Chữ số đầu tiên của n: " + firstDigit(n));
        }
    }

    // phương thức tìm chữ số đầu tiên của n
    private static int firstDigit(int n) {
        if (n < 10) { // điểm dừng
            return n;
        } else { // bước đệ quy
            return firstDigit(n / 10);
        }
    }
}
