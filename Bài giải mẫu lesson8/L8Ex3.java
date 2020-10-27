import java.util.Scanner;

/**
 * @author Branium Academy
 * @address https://braniumacademy.net/
 */

public class L8Ex3 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhập vào một góc ở hệ degree: ");
        var x = input.nextDouble(); // đọc vào số x
        var sinX = Math.sin(Math.toRadians(x));
        var cosX = Math.cos(Math.toRadians(x));
        var tanX = Math.tan(Math.toRadians(x));
        // hiện kết quả:
        System.out.println("sin(" + x + ") = " + sinX);
        System.out.println("cos(" + x + ") = " + cosX);
        System.out.println("tan(" + x + ") = " + tanX);
    }
}
// code xong ấn Ctrl Alt L để format code