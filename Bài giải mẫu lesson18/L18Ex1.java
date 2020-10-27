import java.util.Scanner;

/**
 * @author Branium Academy
 * @address https://braniumacademy.net/
 */

public class L18Ex1 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhập vào một thông điệp: ");
        var str = input.nextLine();
        showRevert(str); // gọi p.thức hiển thị từ cuối lên
    }

    // phương thức hiển thị đảo chuỗi
    public static void showRevert(String str) {
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
    }
}
