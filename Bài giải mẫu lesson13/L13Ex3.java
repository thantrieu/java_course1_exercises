import java.util.Scanner;
// đầu tiên ta chuẩn hóa chuỗi: loại bỏ dấu cách thừa đầu, cuối
// thay thế dấu cách thừa ở giữa chuỗi bằng 1 dấu cách
// sau đó tiến hành in ra chữ cái đầu từ. Dấu hiệu nhận biết từ là
// vị trí đầu tiên của chuỗi và sau các dấu cách.

/**
 * @author Branium Academy
 * @address https://braniumacademy.net/
 */

public class L13Ex3 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhập vào chuỗi kí tự: ");
        var str = input.nextLine();
        str = str.trim(); // loại bỏ các dấu cách thừa
        // thay thế các chỗ có 1 hoặc nhiều khoảng trắng bằng 1 dấu cách
        str = str.replace("\\s+", " ");
        System.out.println("Chuỗi sau chuẩn hóa: " + str);
        // tiến hành kiểm tra và in ra
        for (int i = 0; i < str.length(); i++) {
            if (i == 0) { // in ra chữ cái đầu từ đầu tiên
                System.out.println(str.charAt(i));
            }
            if (str.charAt(i) == ' ') { // in ra chữ cái đầu từ tiếp theo
                System.out.println(str.charAt(i + 1));
            }
        }
    }
}
