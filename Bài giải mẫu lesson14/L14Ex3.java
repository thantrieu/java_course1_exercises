import java.util.Scanner;

/**
 * @author Branium Academy
 * @address https://braniumacademy.net/
 */

public class L14Ex3 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhập số nguyên dương n: ");
        var n = input.nextInt();
        // khởi tạo biến tổng = 0
        var sum = 0;
        while (n > 0) {
            sum += n % 10; // lấy phần đơn vị của n
            n /= 10; // loại bỏ phần đơn vị đã lấy của n
        }
        // hiện kết quả:
        System.out.println("SUM = " + sum);
    }
}
