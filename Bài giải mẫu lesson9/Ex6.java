import java.util.Scanner;

/**
 * @author braniumacademy
 * @see braniumacademy.net
 * @version 2021.1.30
 */

public class Ex6 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        var str = scanner.nextLine();
        // check and print result
        if (str.matches("^\\s+.*")) { // str.startsWith(" ")
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
