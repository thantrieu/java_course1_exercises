import java.util.Scanner;

/**
 * @author Branium Academy
 * @address https://braniumacademy.net/
 */

public class l15Ex7 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhập chiều cao tam giác: ");
        var h = input.nextInt();
        // vẽ tam giác cân đặc bằng các chữ số theo nguyên lý:
        // lấy đối xứng qua cột h, j, i bắt đầu từ 1
        // trên hàng thứ i vẽ số tại các vị trí từ h-i+1 đến h+i-1
        // giá trị in ra trên cột j là i-|h-j|. Các vị trí còn lại
        // vẽ khoảng trắng
        for (int i = 1; i <= h; i++) {
            for (int j = 1; j < 2 * h; j++) {
                // nếu i là hàng cuối hoặc các hàng khác tại cột j thỏa
                if (j >= h - i + 1 && j <= h + i - 1) {
                    System.out.print(" " + (i - Math.abs(h - j)) + " "); // vẽ số
                } else {
                    System.out.print("   "); // vẽ khoảng trắng
                }
            }
            System.out.println();
        }
    }
}
