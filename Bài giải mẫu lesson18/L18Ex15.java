import java.util.Scanner;

/**
 * @author Branium Academy
 * @address https://braniumacademy.net/
 */

public class L18Ex15 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhập chiều cao tam giác: ");
        var h = input.nextInt();
        drawTriangle(h); // gọi phương thức
    }

    // phương thức vẽ tam giác cân
    public static void drawTriangle(int h) {
        // vẽ tam giác cân đặc bằng các dấu *
        // nguyên lý: vẽ dấu * đối xứng qua cột h i, j bắt đầu từ 1
        // trên hàng thứ i vẽ dấu * tại vị trí h-i+1 đến h+i-1
        // các vị trí còn lại vẽ khoảng trắng
        for (int i = 1; i <= h; i++) {
            for (int j = 1; j < 2 * h; j++) {
                if (j < h - i + 1 || j > h + i - 1) {
                    System.out.print("   ");
                } else {
                    System.out.print(" * ");
                }
            }
            System.out.println();
        }
    }
}
