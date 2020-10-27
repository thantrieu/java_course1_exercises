import java.util.Scanner;

/**
 * @author Branium Academy
 * @address https://braniumacademy.net/
 */

public class L18Ex7 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhập vào một số nguyên dương: ");
        var n = input.nextInt();
        var sum = sumDigits(n); // gọi phương thức và lưu lại giá trị
        System.out.println("Tổng chữ số của n = " + sum);
    }

    // phương thức tính tổng các chữ số của một số
    public static int sumDigits(int n) {
        int sum = 0; // ban đầu tổng  = 0
        while (n > 0) { // lặp chừng nào chưa tách hết các chữ số của n
            sum += n % 10; // cộng phần đơn vị
            n /= 10; // loại bỏ phần đơn vị đã lấy
        }
        return sum; // trả về tổng
    }
}
