import java.util.Scanner;

/**
 * @author braniumacademy
 * @see braniumacademy.net
 * @version 2021.1.28
 * @video https://youtu.be/ozl_wlqtXB0
 */

public class Ex1 {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào một số nguyên n: ");
        n = scanner.nextInt();
        // kiểm tra
        if(n % 2 == 0) {
            System.out.println("CHẴN");
        } else {
            System.out.println("LẺ");
        }
    }
}
