import java.util.Scanner;

/**
 * @author Branium Academy
 * @address https://braniumacademy.net/
 */

public class L19Ex4 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhập vào ba số nguyên: ");
        var a = input.nextInt();
        var b = input.nextInt();
        var c = input.nextInt();
        System.out.printf("findMax(%d, %d, %d) = %d\n", a, b, c, findMax(a, b, c));

        System.out.println("Nhập ba số kiểu long: ");
        var lNumber1 = input.nextLong();
        var lNumber2 = input.nextLong();
        var lNumber3 = input.nextLong();
        System.out.printf("findMax(%d, %d, %d) = %d\n", lNumber1, lNumber2,
                lNumber3, findMax(lNumber1, lNumber2, lNumber3));

        System.out.println("Nhập vào ba số thực float: ");
        var fNumber1 = input.nextFloat();
        var fNumber2 = input.nextFloat();
        var fNumber3 = input.nextFloat();
        System.out.printf("findMax(%f, %f, %f) = %f\n", fNumber1,
                fNumber2, fNumber3, findMax(fNumber1, fNumber2, fNumber3));

        System.out.println("Nhập ba số thực double: ");
        var dNumber1 = input.nextDouble();
        var dNumber2 = input.nextDouble();
        var dNumber3 = input.nextDouble();
        System.out.printf("findMax(%f, %f, %f) = %f\n", dNumber1,
                dNumber2, dNumber3, findMax(dNumber1, dNumber2, dNumber3));
    }

    public static int findMax(int a, int b, int c) {
        var max = a; // ban đầu gán max là a
        if (b > max) {   // nếu b > max thì max là b
            max = b;
        }
        if (c > max) {   // nếu c > max thì max là c
            max = c;
        }
        return max;
    }

    public static long findMax(long a, long b, long c) {
        var max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
    }

    public static float findMax(float a, float b, float c) {
        var max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
    }

    public static double findMax(double a, double b, double c) {
        var max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
    }
}
