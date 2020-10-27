import java.util.Scanner;

/**
 * @author Branium Academy
 * @ link: https: braniumacademy.net
 */

public class L22Ex2 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhập số lượng số ng.tố cần tìm: ");
        var n = input.nextInt();
        var primeNumbers = firstNPrime(n);
        showResult(primeNumbers);
    }

    // phương thức hiển thị kết quả
    private static void showResult(int[] primes) {
        System.out.println("Danh sách "
                + primes.length + " số ng.tố đầu tiên:");
        for (int i = 0; i < primes.length; i++) {
            System.out.print(primes[i] + " ");
        }
    }

    // phương thức tìm n số ng.tố đầu tiên
    private static int[] firstNPrime(int n) {
        var primes = new int[n];
        var count = 0; // biến đếm số ng.tố
        int i = 2;
        while (count < n) {
            if (isPrime(i)) { // nếu n là số ng.tố
                primes[count] = i; // lưu lại n
                count++; // tăng biến đếm lên
            }
            i++; // tăng i lên
        }
        return primes; // trả về mảng số ng.tố
    }

    // phương thức kiểm tra n có phải số nt
    private static boolean isPrime(int n) {
        if (n < 2) { // mọi n nhỏ hơn 2 đều k là số ng.tố
            return false; // trả về false
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) { // n có nghiệm khác 1 và chính nó
                return false; // n k ng.tố
            }
        }
        return true; // mặc định n là số ng.tố
    }
}
