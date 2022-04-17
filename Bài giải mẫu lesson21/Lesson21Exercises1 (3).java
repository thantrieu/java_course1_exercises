import java.util.Scanner;

/**
 * @author Branium Academy
 * @address https://braniumacademy.net/
 */

public class L21Ex3 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhập số nguyên dương n: ");
        var n = input.nextInt();
        System.out.println("Tổng các chữ số của n: " + sumDigits(n));
    }

    // tính tổng các chữ số của n bằng đệ quy
    public static int sumDigits(int n) {
        if (n < 10) { // trường hợp cơ sở
            return n;
        } else { // bước đệ quy
            return n % 10 + sumDigits(n / 10);
        }
    }
}
