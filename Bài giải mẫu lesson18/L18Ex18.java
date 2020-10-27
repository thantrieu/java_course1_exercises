import java.util.Scanner;

/**
 * @author Branium Academy
 * @address https://braniumacademy.net/
 */

public class L18Ex18 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhập hai số nguyên dương a < b: ");
        var a = input.nextInt();
        var b = input.nextInt();
        listedSquareNumber(a, b); // gọi phương thức
    }

    // phương thức liệt kê các số chính phương trong đoạn [a, b]
    public static void listedSquareNumber(int a, int b) {
        // lấy biên dưới và trên:
        var lowBound = (int) Math.ceil(Math.sqrt(a));
        var hightBound = (int) Math.floor(Math.sqrt(b));
        // kết luận:
        System.out.println("Các số chính phương trong đoạn [a, b]: ");
        for (int i = lowBound; i <= hightBound; i++) {
            System.out.print((i * i) + " ");
        }
    }
}
