import java.util.Scanner;

/**
 * @author Branium Academy
 * @address https://braniumacademy.net/
 */

public class L9Ex4 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhập vào chuỗi thứ nhất: ");
        var str1 = input.nextLine();
        System.out.println("Nhập vào chuỗi thứ hai: ");
        var str2 = input.nextLine();
        // tiến hành so sánh:
        var result = str1.compareTo(str2);
        if (result < 0) {
            System.out.println("Chuỗi str1 đứng trước str2");
        } else if (result == 0) {
            System.out.println("str1 tương đương str2");
        } else {
            System.out.println("str1 đứng sau str2");
        }
    }
}
