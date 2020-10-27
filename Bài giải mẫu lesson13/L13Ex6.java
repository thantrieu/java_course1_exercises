import java.util.Scanner;
// số nguyên tố là số chỉ chia hết cho 1 và chính nó.
// vậy chỉ cần chỉ ra n có ước khác 1 và chính nó thì n không ng.tố

/**
 * @author Branium Academy
 * @address https://braniumacademy.net/
 */

public class L13Ex6 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhập số nguyên n: ");
        var n = input.nextInt(); // nhập vào số n
        boolean isPrime = true; // giả sử rằng n là số n.tố
        if (n < 2) { // mọi số < 2 k ng.tố
            isPrime = false; // n k phải số nguyên tố
        } else {
            // kiểm tra các giá trị từ 2->căn bậc 2 của n là đủ
            int bound = (int) Math.sqrt(n);
            for (int i = 2; i <= bound; i++) {
                if (n % i == 0) {
                    isPrime = false; // n k phải số ng.tố
                }
            }
        }
        if (isPrime) {
            System.out.println(n + " là số nguyên tố.");
        } else {
            System.out.println(n + " không phải số nguyên tố.");
        }
    }
}
