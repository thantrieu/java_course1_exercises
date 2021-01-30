import java.util.Scanner;

/**
 * @author braniumacademy
 * @see braniumacademy.net
 * @version 2021.1.30
 */

public class Ex7 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Enter your full name: ");
        var fullName = scanner.nextLine().trim();
        // check and print result
        var lastSpaceIndex = fullName.lastIndexOf(" ");
        var firstName = fullName.substring(lastSpaceIndex + 1);
        if (firstName.matches("^[A-Z].*")) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
