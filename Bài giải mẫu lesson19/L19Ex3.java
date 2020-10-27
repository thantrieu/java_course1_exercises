import java.util.Scanner;

/**
 * @author Branium Academy
 * @address https://braniumacademy.net/
 */

public class L19Ex3 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhập vào ba số nguyên: ");
        var a = input.nextInt();
        var b = input.nextInt();
        var c = input.nextInt();
        System.out.printf("findMin(%d, %d, %d) = %d\n", a, b, c, findMin(a, b, c));

        System.out.println("Nhập ba số kiểu long: ");
        var lNumber1 = input.nextLong();
        var lNumber2 = input.nextLong();
        var lNumber3 = input.nextLong();
        System.out.printf("findMin(%d, %d, %d) = %d\n", lNumber1, lNumber2,
                lNumber3, findMin(lNumber1, lNumber2, lNumber3));

        System.out.println("Nhập vào ba số thực float: ");
        var fNumber1 = input.nextFloat();
        var fNumber2 = input.nextFloat();
        var fNumber3 = input.nextFloat();
        System.out.printf("findMin(%f, %f, %f) = %f\n", fNumber1,
                fNumber2, fNumber3, findMin(fNumber1, fNumber2, fNumber3));

        System.out.println("Nhập ba số thực double: ");
        var dNumber1 = input.nextDouble();
        var dNumber2 = input.nextDouble();
        var dNumber3 = input.nextDouble();
        System.out.printf("findMin(%f, %f, %f) = %f\n", dNumber1,
                dNumber2, dNumber3, findMin(dNumber1, dNumber2, dNumber3));
    }

    public static int findMin(int a, int b, int c) {
        var min = a; // ban đầu gán min là a
        if (b < min) {   // nếu b < min thì min là b
            min = b;
        }
        if (c < min) {   // nếu c < min thì min là c
            min = c;
        }
        return min;
    }

    public static long findMin(long a, long b, long c) {
        var min = a;
        if (b < min) {
            min = b;
        }
        if (c < min) {
            min = c;
        }
        return min;
    }

    public static float findMin(float a, float b, float c) {
        var min = a;
        if (b < min) {
            min = b;
        }
        if (c < min) {
            min = c;
        }
        return min;
    }

    public static double findMin(double a, double b, double c) {
        var min = a;
        if (b < min) {
            min = b;
        }
        if (c < min) {
            min = c;
        }
        return min;
    }
}
