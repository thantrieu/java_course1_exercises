import java.util.Scanner;

/**
 * @author Branium Academy
 * @address https://braniumacademy.net/
 */

public class L18Ex11 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhập cạnh hình vuông: ");
        var m = input.nextInt();
        // vẽ hình
        drawRect(m); // gọi phương thức
    }

    // phương thức vẽ hình vuông rỗng và đ.chéo cạnh m
    public static void drawRect(int m) {
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= m; j++) {
                if (i == 1 || i == m || j == 1 || j == m || i == j
                        || (i + j) == (m + 1)) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
