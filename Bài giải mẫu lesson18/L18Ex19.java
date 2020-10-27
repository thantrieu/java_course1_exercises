/**
 * @author Branium Academy
 * @address https://braniumacademy.net/
 */

public class L18Ex19 {
    public static void main(String[] args) {
        int count = 0;
        // nếu i thỏa: nguyên tố, tổng chữ số nt, từng chữ số nt
        for (int i = 100000; i <= 999999; i++) {
            if(isPrime(i) && isDigitPrime(i) && isSumNumberPrime(i)) {
                System.out.print(i + " "); // in i ra
                count++;
                if(count % 10 == 0) { // nếu đếm thấy đạt 10 phần tử
                    count = 0; // reset biến đếm
                    System.out.println(); // in xuống dòng
                }
            }
        }
    }

    // phương thức kiểm tra tổng chữ số có nguyên tố hay không
    public static boolean isSumNumberPrime(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return isPrime(sum);
    }

    // phương thức kiểm tra chữ số có nguyên tố hay không
    public static boolean isDigitPrime(int n) {
        while (n > 0) { // kiểm tra từng chữ số
            if (!isPrime(n % 10)) {
                return false;
            }
            n /= 10;
        }
        return true;
    }

    // phương thức kiểm tra số n có nguyên tố hay không
    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
