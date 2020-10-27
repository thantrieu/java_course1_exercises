import java.util.Scanner;

/**
 * @author Branium Academy
 * @address https://braniumacademy.net/
 */

public class L6Ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập họ và tên phân tách bởi 1 dấu cách: ");
        String fullName = scanner.nextLine();
        // tìm vị trí dấu cách đầu tiên:
        int firstIndex = fullName.indexOf(" ");
        // tìm vị trí dấu cách cuối cùng
        int lastIndex = fullName.lastIndexOf(" ");
        // hiện nội dung chuỗi ra bao bởi " để dễ nhận biết
        System.out.println("Chuỗi gốc: \"" + fullName + "\"");
        // đầu tiên tách họ: từ đầu đến trước dấu cách đầu tiên
        String last = fullName.substring(0, firstIndex);
        // tiếp theo tách lấy tên: từ sau dấu cách cuối cùng đến hết
        String first = fullName.substring(lastIndex + 1);
        // cuối cùng lấy đệm: từ sau dấu cách thứ 1 đến trước dấu cách cuối cùng
        String middle = fullName.substring(firstIndex + 1, lastIndex);
        // hiện kết quả:
        System.out.println("Họ: " + last
                + "\nĐệm: " + middle + "\nTên: " + first);
    }
}
// ấn Ctrl Alt L để format code