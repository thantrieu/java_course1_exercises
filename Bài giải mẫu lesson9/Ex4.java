import java.util.Scanner;

/**
 * @author braniumacademy
 * @see braniumacademy.net
 * @version 2021.1.29
 * @video https://youtu.be/iC6lvM0S4H8
 */

public class Ex4 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        String str1;
        String str2;
        System.out.println("Nhập vào chuỗi str1: ");
        str1 = scanner.nextLine();
        System.out.println("Nhập vào chuỗi str2: ");
        str2 = scanner.nextLine();
        // So sánh và kết luậnstr
        var result = str1.compareTo(str2);
        if (result < 0) {
            System.out.println("str1 đứng trước str2");
        } else if (result == 0) {
            System.out.println("str1 tương đương str2");
        } else {
            System.out.println("str1 đứng sau str2");
        }
    }
}
