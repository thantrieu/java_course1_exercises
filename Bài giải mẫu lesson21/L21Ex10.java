import java.util.Scanner;

/**
 * @author Branium Academy
 * @address https://braniumacademy.net/
 */

public class L21Ex10 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhập số nguyên dương n: ");
        var n = input.nextInt();
        var sum = add(n);
        System.out.println("S = 1 + 1/2 + ... + 1/n = " + sum);
    }

    // phương thức tính toán S = 1 + 1/2 ... + 1/n
    private static double add(int n) {
        if (n == 1) { // điểm dừng
            return 1;
        } else { // bước đệ quy
            return 1.0 / n + add(n - 1);
        }
    }
}
