import java.util.Scanner;

/**
 * @author braniumacademy
 * @see braniumacademy.net
 * @version 2021.1.28
 */

public class Ex8 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Enter your string: ");
        var str = scanner.nextLine();
        // check and print result
        if (str.charAt(0) == str.charAt(str.length() - 1)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
