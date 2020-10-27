import java.util.Scanner;

/**
 * @author Branium Academy
 * @address https://braniumacademy.net/
 */

public class L13Ex4 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhập vào chuỗi kí tự: ");
        var str = input.nextLine();
        str = str.trim(); // loại bỏ các dấu cách thừa
        // thay thế các chỗ có 1 hoặc nhiều khoảng trắng bằng 1 dấu cách
        str = str.replace("\\s+", " ");
        int count = 0;
        if (!str.isEmpty()) { // nếu str không rỗng
            count = 1; // ít nhất chuỗi str có 1 từ
        }
        // tiến hành đếm số từ
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                count++; // tăng biến đếm lên
            }
        }
        System.out.println("Chuỗi đã chuẩn hóa: \"" + str + "\"");
        System.out.println("Số từ: " + count);
    }
}
