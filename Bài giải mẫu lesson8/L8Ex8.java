import java.util.Scanner;

/**
 * @author Branium Academy
 * @address https://braniumacademy.net/
 */

/*
    Chu vi đường tròn là 2*pi*r
    Diện tích đường tròn là pi*r^2
 */
public class L8Ex8 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhập vào bán kính r > 0: ");
        var r = input.nextDouble(); // đọc r
        // tính chu vi
        var perimeter = 2 * Math.PI * r;
        // tính diện tích
        var area = Math.PI * r * r;
        // hiện kết quả:
        System.out.println("Chu vi = " + perimeter);
        System.out.println("Diện tích = " + area);
    }
}
// code xong ấn Ctrl Alt L để format code