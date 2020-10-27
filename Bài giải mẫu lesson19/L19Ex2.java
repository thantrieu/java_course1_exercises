import java.util.Scanner;

// để đảm bảo kết quả đúng ta để kiểu trả về của TBC là double
/**
 * @author Branium Academy
 * @address https://braniumacademy.net/
 */

public class L19Ex2 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhập vào hai số nguyên: ");
        var a = input.nextInt();
        var b = input.nextInt();
        System.out.printf("average(%d, %d) = %f\n", a, b, average(a, b));

        System.out.println("Nhập hai số kiểu long: ");
        var c = input.nextLong();
        var d = input.nextLong();
        System.out.printf("average(%d, %d) = %f\n", c, d, average(c, d));

        System.out.println("Nhập vào hai số thực float: ");
        var fNumber1 = input.nextFloat();
        var fNumber2 = input.nextFloat();
        System.out.printf("average(%f, %f) = %f\n",
                fNumber1, fNumber2, average(fNumber1, fNumber2));

        System.out.println("Nhập hai số thực double: ");
        var dNumber1 = input.nextDouble();
        var dNumber2 = input.nextDouble();
        System.out.printf("average(%f, %f) = %f\n",
                dNumber1, dNumber2, average(dNumber1, dNumber2));
    }
    // tính trung bình cộng hai số nguyên int
    public static double average(int a, int b) {
        return 0.5 * (a + b); // số nguyên cần phải ép kiểu
    }
    // tính trung bình cộng hai số nguyên long
    public static double average(long a, long b) {
        return 0.5 * (a + b); // số nguyên cần ép kiểu
    }
    // tính trung bình cộng hai số thực float
    public static double average(float a, float b) {
        return (a + b) / 2;
    }
    // tính trung bình cộng hai số thực double
    public static double average(double a, double b) {
        return (a + b) / 2;
    }
}
