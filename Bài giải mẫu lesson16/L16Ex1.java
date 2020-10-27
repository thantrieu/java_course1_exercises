import java.util.Scanner;

/**
 * @author Branium Academy
 * @address https://braniumacademy.net/
 */

public class L16Ex1 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhập số nguyên dương n: ");
        // tìm ước số nguyên tố nhỏ nhất của n
        var n = input.nextInt();
        for (int i = 2; i <= n; i++) {
            boolean isPrime = true; // mặc định ban đầu giả sử i ng.tố
            var bound = (int) Math.sqrt(i); // lấy phần nguyên căn i
            // tiến hành kiểm chứng i có ng.tố hay không
            for (int j = 2; j <= bound; j++) {
                if (i % j == 0) {
                    isPrime = false; // đánh dấu k phải số ng.tố
                    break; // thoát lặp for với j
                }
            }
            if (isPrime && n % i == 0) { // nếu i ng.tố và n chia hết cho i
                System.out.println("Giá trị thỏa mãn: " + i);
                break; // kết thúc vòng lặp tìm ước ng.tố nhỏ nhất
            }
        }
    }
}
