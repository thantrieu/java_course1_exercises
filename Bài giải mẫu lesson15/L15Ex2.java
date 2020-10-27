import java.util.Scanner;

/**
 * @author Branium Academy
 * @address https://braniumacademy.net/
 */

public class L15Ex2 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhập chiều cao tam giác: ");
        var h = input.nextInt();
        // vẽ tam giác theo hướng: hàng thứ 1 in ra h dấu *
        // từ hàng thứ 2 bắt đầu giảm đi mỗi hàng 1 dấu *
        // so với hàng trước nó
        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= h - i + 1; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
