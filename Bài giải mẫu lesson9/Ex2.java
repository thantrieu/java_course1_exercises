import java.util.Scanner;

/**
 * @author braniumacademy
 * @see braniumacademy.net
 * @version 2021.1.28
 * @video https://youtu.be/6ghnLSEa1Ik
 */

public class Ex2 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        double number1;
        double number2;
        // nhập dữ liệu vào
        System.out.println("Nhập vào hai số thực cách nhau bởi dấu cách: ");
        number1 = scanner.nextDouble();
        number2 = scanner.nextDouble();
        // kết luận
        if (number1 < number2) {
            System.out.println(number1 + " < " + number2);
        } else if (number1 == number2) {
            System.out.println(number1 + " = " + number2);
        } else {
            System.out.println(number1 + " > " + number2);
        }
    }
}
