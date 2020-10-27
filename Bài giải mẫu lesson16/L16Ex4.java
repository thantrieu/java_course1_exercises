import java.util.Scanner;

/**
 * @author Branium Academy
 * @address https://braniumacademy.net/
 */

public class L16Ex4 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhập số nguyên dương  a < b và k != 0: ");
        // tìm ước số nguyên tố nhỏ nhất của n
        var a = input.nextInt();
        var b = input.nextInt();
        var k = input.nextInt();
        if (k != 0) { // thực hiện tiếp
            var lowBound = (int) Math.ceil(Math.sqrt(a));
            var heightBound = (int) Math.floor(Math.sqrt(b));
            for (int i = lowBound; i <= heightBound; i++) {
                if (i * i % k == 0) {
                    System.out.println("Giá trị đầu tiên thỏa: " + (i * i));
                    break;
                }
            }
        } else {
            System.out.println("Vui lòng nhập k != 0");
        }
    }
}
