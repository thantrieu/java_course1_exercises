import java.util.Scanner;

/**
 * @author Branium Academy
 * @address https://braniumacademy.net/
 */

public class L14Ex8 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhập số nguyên dương n: ");
        var n = input.nextInt();
        // tìm chữ số đầu tiên của n: chia lấy nguyên chừng nào
        // n còn > 10 là ra
        while (n > 10) {
            n /= 10;
        }
        System.out.println("Chữ số đầu tiên: " + n);
    }
}
