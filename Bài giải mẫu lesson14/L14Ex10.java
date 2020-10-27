import java.util.Scanner;

/**
 * @author Branium Academy
 * @address https://braniumacademy.net/
 */

public class L14Ex10 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhập số nguyên dương n: ");
        var n = input.nextInt();
        var numOfDigits = 0;
        // ta đến số chữ số rất đơn giản: mỗi khi chia nguyên cho 10
        // thì ta đếm đc thêm 1 chữ số của n
        while (n > 0) {
            n /= 10;
            numOfDigits++; // tăng biến đếm số chữ số
        }
        System.out.println("Số chữ số của n: " + numOfDigits);
    }
}
