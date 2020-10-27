import java.util.Scanner;

/**
 * @author Branium Academy
 * @address https://braniumacademy.net/
 */

public class L19Ex7 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        // kiểm tra số int
        System.out.println("Số kí tự có trong số 12345678: "
                + length(12345678));
        // kiểm tra số long
        System.out.println("Số kí tự có trong số 12345678901235L: "
                + length(12345678901235L));
        // kiểm tra chuỗi kí tự
        System.out.println("Nhập chuỗi kí tự: ");
        var str = input.nextLine();
        System.out.println("Số kí tự có trong \"" + str + "\": "
                + length(str));
    }
    // đếm số kí tự cấu thành số n
    public static int length(int n) {
        var count = 0;
        while (n > 0) {
            n /= 10;
            count++;
        }
        return count;
    }
    // đếm số kí tự cấu thành số n
    public static int length(long n) {
        var count = 0;
        while (n > 0) {
            n /= 10;
            count++;
        }
        return count;
    }
    // đếm số kí tự cấu thành số n
    public static int length(String str) {
        return str.length();
    }
}
