import java.util.Scanner;

/**
 * @author Branium Academy
 * @address https://braniumacademy.net/
 */

public class L14Ex9 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhập số nguyên dương n: ");
        var n = input.nextInt();
        var sum = n % 10; // lấy chữ số cuối cùng
        // tìm chữ số đầu tiên của n: chia lấy nguyên chừng nào
        // n còn > 10 là ra
        while (n > 10) {
            n /= 10;
        }
        sum += n; // lấy chữ số đầu tiên
        System.out.println("Tổng chữ số đầu + cuối: " + sum);
    }
}
