import java.util.Scanner;

/**
 * @author Branium Academy
 * @address https://braniumacademy.net/
 */

public class L13Ex9 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhập số nguyên dương n <= 90: ");
        var n = input.nextInt();
        // tiến hành tạo số fibo:
        long f0 = 0;
        long f1 = 1;
        long fn = (n < 2) ? n : 0; // nếu n < 2, fn = n
        for (int i = 2; i <= n; i++) {
            fn = f0 + f1;
            f0 = f1;
            f1 = fn;
        }
        System.out.println("F" + n + " = " + fn);
    }
}
