import java.util.Scanner;

/**
 * @author Branium Academy
 * @address https://braniumacademy.net/
 */

public class L8Ex6 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhập vào hai số a, b: ");
        var a = input.nextInt(); // đọc a
        var b = input.nextInt(); // đọc b
        var result1 = Math.pow(a, b); // tính a^b
        var result2 = Math.pow(b, a); // tính b^a
        System.out.println(a + "^" + b + " = " + result1);
        System.out.println(b + "^" + a + " = " + result2);
    }
}
// code xong ấn Ctrl Alt L để format code