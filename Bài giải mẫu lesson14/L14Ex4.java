import java.util.Scanner;

/**
 * @author Branium Academy
 * @address https://braniumacademy.net/
 */

public class L14Ex4 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhập chuỗi kí tự: ");
        var str = input.nextLine();
        int i = str.length() - 1; // vị trí phần tử cuối chuỗi kí tự
        System.out.println("Chuỗi kết quả: ");
        while (i >= 0) {
            System.out.print(str.charAt(i));
            i--; // giảm i để lùi về đầu chuỗi
        }
    }
}
