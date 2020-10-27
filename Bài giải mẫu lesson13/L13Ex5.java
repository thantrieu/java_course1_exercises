import java.util.Scanner;

/**
 * @author Branium Academy
 * @address https://braniumacademy.net/
 */

public class L13Ex5 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhập vào chuỗi kí tự: ");
        var str = input.nextLine();
        // in ra theo thứ tự ngược lại:
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
    }
}
