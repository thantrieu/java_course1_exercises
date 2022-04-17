import java.util.Scanner;

/**
 * @author Branium Academy
 * @address https://braniumacademy.net/
 */

public class L21Ex8 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhập 2 số nguyên dương a, b: ");
        var a = input.nextInt();
        var b = input.nextInt();
        if (a > 0 && b > 0) {
            var result = gcd(a, b);
            System.out.println("gcd(" + a + ", " + b + ") = " + gcd2(a, b));
        } else {
            System.out.println("Vui lòng nhập hai số nguyên dương a, b.");
        }
    }

    // phương thức tìm ước chung lớn nhất cách 1
    public static int gcd(int a, int b) {
        if (a == b) { // đk dừng
            return a;
        } else if (a > b) { // đệ quy
            return gcd(a - b, b);
        } else { // đệ quy
            return gcd(a, b - a);
        }
    }

    // cách 2:
    public static int gcd2(int a, int b) {
        if (b == 0) { // đk dừng
            return a;
        } else { // bước đệ quy
            return gcd2(b, a % b);
        }
    }
}
