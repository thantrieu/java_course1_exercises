import java.util.Scanner;

/**
 * @author Branium Academy
 * @address https://braniumacademy.net/
 */

public class L15Ex8 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhập hai số nguyên dương a < b: ");
        var a = input.nextInt();
        var b = input.nextInt();
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
