import java.util.Scanner;

/**
 * @author Branium Academy
 * @address https://braniumacademy.net/
 */

public class L13Ex2 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhập số nguyên dương n: ");
        var n = input.nextInt(); // đọc vào số n
        var sum = 0;
        // tiến hành tính tổng
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        // kết quả:
        System.out.println("S = " + sum);
    }
}
