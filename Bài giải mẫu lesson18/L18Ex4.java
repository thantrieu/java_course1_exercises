import java.util.Scanner;

/**
 * @author Branium Academy
 * @address https://braniumacademy.net/
 */

public class L18Ex4 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhập vào ba số thực: ");
        var a = input.nextDouble();
        var b = input.nextDouble();
        var c = input.nextDouble();
        // tìm giá trị max và gán cho maxValue
        var maxValue = max(a, b, c);
        // hiện kết quả nhận được
        System.out.println("max(" + a + ", "
                + b + ", " + c + ") = " + maxValue);
    }

    // phương thức tìm giá trị max trong ba số
    public static double max(double a, double b, double c) {
        double max = a; // giả định rằng max là a
        if (max < b) { // nếu b > max thì max là b
            max = b;
        }
        if (max < c) { // sau đó tiếp tục ktra nếu c > max
            max = c; // max là c.
        }
        return max; // trả về kết quả là giá trị max
    }
}
