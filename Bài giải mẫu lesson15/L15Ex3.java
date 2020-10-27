import java.util.Scanner;

/**
 * @author Branium Academy
 * @address https://braniumacademy.net/
 */

public class L15Ex3 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhập chiều cao tam giác: ");
        var h = input.nextInt();
        // vẽ tam giác theo hướng: trên hàng thứ i in ra i-1 khoảng trắng
        // sau đó trên hàng thứ i in ra h-i+1 dấu *. Do vuông góc phải trên
        // nên ta in ra giá trị dấu cách nếu chỉ số cột < chỉ số hàng
        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= h; j++) {
                if (j < i) {
                    System.out.print("   ");
                } else {
                    System.out.print(" * ");
                }
            }
            System.out.println();
        }
    }
}
