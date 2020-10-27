import java.util.Scanner;

/**
 * @author Branium Academy
 * @address https://braniumacademy.net/
 */

public class L18Ex5 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhập vào ba số thực: ");
        var a = input.nextDouble();
        var b = input.nextDouble();
        var c = input.nextDouble();
        // tìm trung bình cộng ba số:
        var avg = findAvg(a, b, c);
        System.out.println("Trung bình cộng ba số = " + avg);
    }

    // phương thức tính trung bình cộng ba số
    public static double findAvg(double a, double b, double c) {
        return (a + b + c) / 3; // trả về tbc
    }
}
