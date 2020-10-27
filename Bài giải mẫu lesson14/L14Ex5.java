import java.util.Scanner;

/**
 * @author Branium Academy
 * @address https://braniumacademy.net/
 */

public class L14Ex5 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        var sum = 0; // kiểu int
        var n = -1;
        while (n != 0) {
            System.out.println("Nhập 0 để thoát, nhập giá trị khác để cộng tổng: ");
            n = input.nextInt();
            sum += n;
        }
        System.out.println("Tổng các số đã nhập: " + sum);
    }
}
