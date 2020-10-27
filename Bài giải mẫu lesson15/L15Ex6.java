import java.util.Scanner;

/**
 * @author Branium Academy
 * @address https://braniumacademy.net/
 */

public class L15Ex6 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhập chiều cao tam giác: ");
        var h = input.nextInt();
        // vẽ tam giác cân đặc bằng các dấu *
        // nguyên lý: vẽ dấu * đối xứng qua cột h, i, j bắt đầu từ 1
        // trên hàng thứ i vẽ dấu * tại vị trí h-i+1 và h+i-1
        // các vị trí còn lại vẽ khoảng trắng. Riêng hàng cuối vẽ dấu *
        for (int i = 1; i <= h; i++) {
            for (int j = 1; j < 2 * h; j++) {
                // nếu i là hàng cuối hoặc các hàng khác tại cột j thỏa
                if (i == h || j == h - i + 1 || j == h + i - 1) {
                    System.out.print(" * "); // vẽ dấu *
                } else {
                    System.out.print("   "); // vẽ khoảng trắng
                }
            }
            System.out.println();
        }
    }
}
