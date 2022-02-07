import java.util.Scanner;

/**
 * @author Branium Academy
 * @see: htttps://braniumacademy.net
 */

public class Lesson22Exercises1 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhập số phần tử của mảng: ");
        var n = input.nextInt();
        var numbers = getNumbers(n, input); // gọi phương thức
        var sum = sumPrimeNumbers(numbers);
        // hiển thị mảng và tổng phần tử mảng:
        showArray(numbers);
        System.out.println("Tổng các phần tử trong mảng là: " + sum);
    }

    /**
     * Phương thức kiểm tra số n có phải số nguyên tố hay không.
     *
     * @param n giá trị số nguyên cần kiểm tra.
     * @return true nếu n là số nguyên tố và false trong các trường hợp
     * ngược lại.
     */
    private static boolean isPrime(int n) {
        if (n < 2) { // n < 2 => n KHÔNG phải số nguyên tố
            return false;
        }
        int bound = (int) Math.sqrt(n); // lấy giá trị phần nguyên căn bậc hai của n
        for (int i = 2; i <= bound; i++) { // tìm nghiệm trong đoạn từ 2 đến phần nguyên căn bậc hai của n
            if (n % i == 0) { // nếu tồn tại nghiệm, n không phải số nguyên tố
                return false;
            }
        }
        return true; // mặc định n là số nguyên tố
    }

    // phương thức hiển thị các phần tử mảng
    private static void showArray(int[] numbers) {
        System.out.println("Các phần tử trong mảng là: ");
        for (int number : numbers) { // duyệt toàn bộ mảng
            System.out.print(number + " "); // in ra từng p.tử
        }
        System.out.println(); // hiện xuống dòng mới
    }

    // phương thức tính tổng các phần tử mảng
    private static long sumPrimeNumbers(int[] numbers) { // nhận tham số kiểu mảng
        long s = 0; // có thể tổng sẽ lớn nên ta dùng kiểu long
        for (int number : numbers) {
            if (isPrime(number)) {
                s += number; // cộng giá trị phần tử thứ i vào tổng
            }
        }
        return s; // trả về tổng
    }

    // phương thức nhập vào danh sách các số nguyên
    private static int[] getNumbers(int n, Scanner input) {
        var numbers = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }
        return numbers;
    }
}
