import java.util.Scanner;

/**
 * @author Branium Academy
 * @address https://braniumacademy.net/
 */

public class L19Ex5 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhập vào hai số nguyên: ");
        var a = input.nextInt();
        var b = input.nextInt();
        // gọi phương thức 1 tham số:
        showResult(a + " + " + b + " = " + (a + b));
        // gọi phương thức 2 tham số:
        showResult(a + " + " + b + " = ", a + b);
        // gọi phương thức 4 tham số:
        showResult("Kết quả ", a, b, a + b);

        System.out.println("Nhập hai số thực double: ");
        var dNumber1 = input.nextDouble();
        var dNumber2 = input.nextDouble();
        // gọi phương thức 1 tham số:
        showResult(dNumber1 + " + " + dNumber2 + " = " + (dNumber1 + dNumber2));
        // gọi phương thức 2 tham số:
        showResult(dNumber1 + " + " + dNumber2 + " = ", dNumber1 + dNumber2);
        // gọi phương thức 4 tham số:
        showResult("Kết quả ", dNumber1, dNumber2, dNumber1 + dNumber2);
    }
    // a, tên phương thức là showResult nhận vào một tham số String
    public static void showResult(String result) {
        System.out.println(result);
    }
    // b
    public static void showResult(String msg, int result) {
        System.out.println(msg + result);
    }
    // c
    public static void showResult(String msg, float result) {
        System.out.println(msg + result);
    }
    // d
    public static void showResult(String msg, long result) {
        System.out.println(msg + result);
    }
    // e
    public static void showResult(String msg, double result) {
        System.out.println(msg + result);
    }
    // f
    public static void showResult(String msg, int a, int b, int result) {
        System.out.println(msg + a + " + " + b + " = " + result);
    }
    // g
    public static void showResult(String msg, long a, long b, long result) {
        System.out.println(msg + a + " + " + b + " = " + result);
    }
    // h
    public static void showResult(String msg, float a, float b, float result) {
        System.out.println(msg + a + " + " + b + " = " + result);
    }
    // i
    public static void showResult(String msg, double a, double b, double result) {
        System.out.println(msg + a + " + " + b + " = " + result);
    }
}
