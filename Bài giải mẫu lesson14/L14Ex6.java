import java.util.Scanner;
import java.util.regex.Matcher;

/**
 * @author Branium Academy
 * @address https://braniumacademy.net/
 */

public class L14Ex6 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        double a = 0;
        double b, c;
        while (a == 0) {
            System.out.println("Nhập hệ số a khác 0: ");
            a = input.nextDouble();
        }
        System.out.println("Nhập hệ số b, c: ");
        b = input.nextDouble();
        c = input.nextDouble();
        // giải biện luận pt bậc hai:
        var delta = b * b - 4 * a * c;
        if (delta < 0) {
            System.out.println("Phương trình vô nghiệm");
        } else if (delta == 0) {
            System.out.println("Phương trình có nghiệm kép: ");
            System.out.println("x = " + (-b / (2 * a)));
        } else {
            var x1 = (-b + Math.sqrt(delta)) / (2 * a);
            var x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Nghiệm phương trình: ");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }
    }
}
