import java.util.Scanner;

/**
 * @author Branium Academy
 * @address https://braniumacademy.net/
 */

public class L6Ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập họ và tên có rất nhiều dấu cách thừa: ");
        String fullName = scanner.nextLine();
        // hiện nội dung chuỗi ra bao bởi " để dễ nhận biết
        System.out.println("Chuỗi gốc: \"" + fullName + "\"");
        // xóa dấu cách thừa ở đầu và cuối chuỗi bằng trim()
        fullName = fullName.trim();
        // thay thế các chỗ có 1 hoặc nhiều dấu cách bằng 1 dấu cách
        fullName = fullName.replaceAll("\\s+", " ");
        System.out.println("Kết quả: \"" + fullName + "\"");
    }
}
// code xong ấn Ctrl Alt L để format code