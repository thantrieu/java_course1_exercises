import java.util.Scanner;

/**
 * @author Branium Academy
 * @address https://braniumacademy.net/
 */

public class L9Ex2 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhập vào hai số: ");
        int a = input.nextInt();
        int b = input.nextInt();
        // tiến hành so sánh:
        if (a > b) { // nếu a > b
            System.out.println(a + " lớn hơn " + b);
        } else if (a == b) { // nếu không thì liệu a = b?
            System.out.println(a + " bằng " + b);
        } else { // trường hợp còn lại
            System.out.println(a + " nhỏ hơn " + b);
        }
    }
}
