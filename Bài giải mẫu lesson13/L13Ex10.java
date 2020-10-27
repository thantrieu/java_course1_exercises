import java.util.Scanner;

/**
 * @author Branium Academy
 * @address https://braniumacademy.net/
 */

public class L13Ex10 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhập 2 số a, b với 0 <= a < b <= 90: ");
        var a = input.nextInt();
        var b = input.nextInt();
        // tiến hành tìm số fibo thứ i:
        for (int i = a; i <= b; i++) {
            // nhớ fresh f0, f1, fn nếu không sẽ sai kq
            long f0 = 0;
            long f1 = 1;
            long fn = (i < 2) ? i : 0;
            for (int j = 2; j <= i; j++) {
                fn = f0 + f1;
                f0 = f1;
                f1 = fn;
            }
            System.out.println("F" + i + " = " + fn);
        }
    }
}
