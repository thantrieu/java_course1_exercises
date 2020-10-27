import java.util.Scanner;

/**
 * @author Branium Academy
 * @address https://braniumacademy.net/
 */

public class L18Ex8 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhập vào hai số nguyên dương: ");
        var a = input.nextInt();
        var b = input.nextInt();
        // hiển thị ước chung lớn nhất của a và b
        System.out.println("UCLN(" + a + ", " + b + ") = " + gcd(a, b));
    }

    // phương thức tìm ước chung lớn nhất
    public static int gcd(int a, int b) {
        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        // lúc này a hoặc b đều là UCLN
        return a; // trả về UCLN
    }
}
