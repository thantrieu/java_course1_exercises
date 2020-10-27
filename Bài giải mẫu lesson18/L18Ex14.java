import java.util.Scanner;

/**
 * @author Branium Academy
 * @address https://braniumacademy.net/
 */

public class L18Ex14 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhập chiều cao tam giác: ");
        var h = input.nextInt();
        drawTriangle(h);
    }

    // phương thức vẽ tam giác
    public static void drawTriangle(int h) {
        // vẽ tam giác theo hướng: trên hàng thứ i in ra h-i khoảng trắng
        // sau đó trên hàng thứ i in ra i dấu *. Do vuông góc phải dưới
        // nên trên hàng i ta in khoảng trắng nếu chỉ số cột <= h - i
        // ngược lại in dấu *
        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= h; j++) {
                if (j <= h - i) {
                    System.out.print("   ");
                } else {
                    System.out.print(" * ");
                }
            }
            System.out.println();
        }
    }
}
