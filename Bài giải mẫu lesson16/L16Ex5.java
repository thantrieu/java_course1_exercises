import java.util.Scanner;

/**
 * @author Branium Academy
 * @address https://braniumacademy.net/
 */

public class L16Ex5 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhập số nguyên dương k, m <= 1000: ");
        // tìm ước số nguyên tố nhỏ nhất của n
        var k = input.nextInt();
        var m = input.nextInt();
        // khởi tạo biến đếm
        var count = 0;
        for (int i = 10000; i <= 99999; i++) {
            int j = i;
            int sumDigits = 0; // tổng các chữ số
            while (j > 0) { // tính tổng các chữ số của j
                sumDigits += j % 10; // lấy phần đơn vị
                j /= 10; // loại bỏ phần đã lấy
            }
            if (sumDigits % m == 0) { // nếu tổng chữ số chia hết cho m
                System.out.println(i + " "); // in ra i
                count++; // tăng biến đếm
                if (count >= k) {
                    break; // tìm đc k số thỏa thì kết thúc việc tìm
                }
            }
        }
    }
}
