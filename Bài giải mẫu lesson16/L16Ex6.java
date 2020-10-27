import java.util.Scanner;

/**
 * @author Branium Academy
 * @address https://braniumacademy.net/
 */

public class L16Ex6 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        var n = 0;
        for (; ; ) { // vòng lặp vô hạn
            System.out.println("Nhập số nguyên dương n: ");
            n = input.nextInt();
            boolean isPrime = true; // mặc định ban đầu giả sử i ng.tố
            var bound = (int) Math.sqrt(n); // lấy phần nguyên căn n
            if(n < 2) {
                isPrime = false;
            }
            // tiến hành kiểm chứng n có ng.tố hay không
            for (int j = 2; j <= bound; j++) {
                if (n % j == 0) {
                    isPrime = false; // đánh dấu k phải số ng.tố
                    break; // thoát lặp for với j
                }
            }
            if (isPrime) {
                System.out.println("Giá trị thỏa mãn: " + n);
                break; // kết thúc vòng lặp tìm ước ng.tố
            }
        }
    }
}
