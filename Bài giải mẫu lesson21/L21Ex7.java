import java.util.Scanner;

/**
 * @author Branium Academy
 * @address https://braniumacademy.net/
 */

public class L21Ex7 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhập vào một chuỗi kí tự: ");
        var str = input.nextLine();
        showRevert(str, str.length() - 1);
    }
    // phương thức hiển thị string theo thứ tự giảm dần
    public static void showRevert(String str, int pos) {
        if (pos >= 0) { // điều kiện đệ quy
            System.out.print(str.charAt(pos));
            showRevert(str, pos - 1);
        }
    }
}
