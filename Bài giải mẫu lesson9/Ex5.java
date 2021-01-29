import java.util.Scanner;

/**
 * @author braniumacademy
 * @see braniumacademy.net
 * @version 2021.1.29
 * @video https://youtu.be/1wTIPk0mljU
 */

public class Ex5 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Nhập vào ba số thực dương a, b, c: ");
        var a = scanner.nextDouble();
        var b = scanner.nextDouble();
        var c = scanner.nextDouble();
        // kiểm tra đưa ra kết luận
        if (a <= 0 || b <= 0 || c <= 0) {
            System.out.println("KHÔNG");
        } else if ((a + b > c) && (b + c > a) && (c + a > b)) {
            System.out.println("CÓ");
        } else {
            System.out.println("KHÔNG");
        }
    }
}
