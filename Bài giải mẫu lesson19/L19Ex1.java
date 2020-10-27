import java.util.Scanner;

/**
 * @author Branium Academy
 * @address https://braniumacademy.net/
 */

public class L19Ex1 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhập vào hai số nguyên: ");
        var a = input.nextInt();
        var b = input.nextInt();
        System.out.println("Tích hai số nguyên int: a * b = " + mul(a, b));

        System.out.println("Nhập hai số kiểu long: ");
        var c = input.nextLong();
        var d = input.nextLong();
        System.out.println("Tích hai số nguyên long: c * d = " + mul(c, d));

        System.out.println("Nhập vào hai số thực float: ");
        var fNumber1 = input.nextFloat();
        var fNumber2 = input.nextFloat();
        System.out.println("Tích hai số thực float: fNumber1 * fNumber2 = "
                + mul(fNumber1, fNumber2));

        System.out.println("Nhập hai số thực double: ");
        var dNumber1 = input.nextDouble();
        var dNumber2 = input.nextDouble();
        System.out.println("Tích hai số thực double: dNumber1 * dNumber2 = "
                + mul(dNumber1, dNumber2));
    }

    // nhận vào hai tham số kiểu int, trả về int
    public static int mul(int a, int b) {
        return a * b;
    }

    // nhận vào hai tham số kiểu long, trả về long
    public static long mul(long a, long b) {
        return a * b;
    }

    // nhận vào hai tham số kiểu float, trả về float
    public static float mul(float a, float b) {
        return a * b;
    }

    // nhận vào hai tham số kiểu double, trả về double
    public static double mul(double a, double b) {
        return a * b;
    }
}
