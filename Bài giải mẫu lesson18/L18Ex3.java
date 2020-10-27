import java.util.Scanner;

/**
 * @author Branium Academy
 * @address https://braniumacademy.net/
 */

public class L18Ex3 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhập vào ba số thực: ");
        var a = input.nextDouble();
        var b = input.nextDouble();
        var c = input.nextDouble();
        // tìm giá trị min và gán cho minValue
        var minValue = min(a, b, c);
        // hiện kết quả nhận được
        System.out.println("min(" + a + ", "
                + b + ", " + c + ") = " + minValue);
    }

    // phương thức tìm giá trị min trong ba số
    public static double min(double a, double b, double c) {
        double min = a; // giả định rằng min là a
        if (min > b) { // nếu b < min thì min là b
            min = b;
        }
        if (min > c) { // sau đó tiếp tục ktra nếu c < min
            min = c; // min là c.
        }
        return min; // trả về kết quả là giá trị min
    }
}
