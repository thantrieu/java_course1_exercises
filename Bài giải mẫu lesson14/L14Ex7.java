import java.util.Scanner;

/**
 * @author Branium Academy
 * @address https://braniumacademy.net/
 */

public class L14Ex7 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhập số nguyên dương n: ");
        var n = input.nextInt();
        var sum = 0.0;
        var i = 1;
        while (i <= n) {
            sum += 1.0 / (i * i);
            i++;
        }
        System.out.println("S = " + sum);
    }
}
