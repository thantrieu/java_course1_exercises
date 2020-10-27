import java.util.Scanner;

/**
 * @author Branium Academy
 * @address https://braniumacademy.net/
 */

public class L9Ex8 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhập vào cả dòng dữ liệu: ");
        var str = input.nextLine(); // đọc vào cả dòng
        // tiến hành kiểm tra:
        if (str.charAt(0) == str.charAt(str.length() - 1)) {
            System.out.println("Kí tự đầu và cuối chuỗi trùng nhau");
        } else {
            System.out.println("Kí tự đầu và cuối chuỗi không trùng nhau");
        }
    }
}
