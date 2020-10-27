import java.util.Scanner;

/**
 * @author Branium Academy
 * @address https://braniumacademy.net/
 */

public class L14Ex1 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhập số nguyên dương n: ");
        var n = input.nextInt();
        // tiến hành tìm ước và in ra:
        System.out.println("Các ước tự nhiên của n: ");
        int i = 1;
        while (i <= n) {
            if (n % i == 0) { // nếu i là ước của n
                System.out.print(i + " ");
            }
            i++;
        }
    }
}
