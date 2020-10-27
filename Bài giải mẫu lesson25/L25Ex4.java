import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Branium Academy
 * @ link: https: braniumacademy.net
 */

public class L25Ex4 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhập số phần tử của mảng: ");
        var n = input.nextInt();
        var numbers = getNumbers(n, input); // gọi phương thức
        System.out.println("Các phần tử trong mảng: ");
        Arrays.sort(numbers);
        showArray(numbers);
        System.out.println("Nhập x cần tìm: ");
        var x = input.nextFloat();
        var index = Arrays.binarySearch(numbers, x);
        if (index < 0) {
            System.out.println("Không có sv nào có điểm bằng " + x);
        } else {
            System.out.println("Có ít nhất 1 sv có điểm bằng " + x);
        }
    }

    /**
     * phương thức hiển thị các phần tử mảng
     *
     * @param numbers là mảng chứa các phần tử cần hiển thị
     */
    private static void showArray(float[] numbers) {
        for (int i = 0; i < numbers.length; i++) { // duyệt toàn bộ mảng
            System.out.print(numbers[i] + " "); // in ra từng p.tử
        }
        System.out.println(); // hiện xuống dòng mới
    }

    /**
     * phương thức nhập vào điểm của các sv trong lớp
     *
     * @param n     số lượng giá trị cần nhập
     * @param input đối tượng của lớp Scanner
     * @return mảng các phần tử đã nhập vào
     */
    private static float[] getNumbers(int n, Scanner input) {
        var numbers = new float[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập điểm SV thứ " + (i + 1) + ": ");
            numbers[i] = input.nextFloat();
        }
        return numbers;
    }
}
