package net.braniumacademy.exercises_lesson36;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author Branium Academy
 * @ link: https: braniumacademy.net
 */

public class L36Ex10 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("input10.txt");
        var input = new Scanner(file);
        var n = input.nextInt();
        var x = input.nextInt();
        var a = input.nextInt();
        var b = input.nextInt();

        var numbers = getNumbers(n, input); // gọi phương thức
        System.out.println("Các phần tử trong mảng: ");
        showArray(numbers);
        // tìm và kết luận
        System.out.println("Giá trị " + x + " xuất hiện "
                + countX(numbers, x, a, b) + " lần trong đoạn chỉ số ["
                + a + ", " + b + "].");
    }

    /**
     * phương thức đếm số lần xuất hiện của x trong mảng
     *
     * @param numbers là mảng chứa các giá trị cần đếm
     * @param x       là giá trị cần tìm
     * @return số lần xuất hiện của x trong mảng
     */
    private static int countX(int[] numbers, int x, int a, int b) {
        int count = 0; // ban đầu count = 0
        for (int i = a; i <= b; i++) {
            // để tránh xảy ra ngoại lệ ta phải đảm bảo chỉ số i
            // nằm trong đoạn [0, length-1]
            if (i >= 0 && i < numbers.length - 1 && numbers[i] == x) {
                count++; // tăng biến đếm lên 01 đơn vị
            }
        }
        return count;
    }

    /**
     * phương thức hiển thị các phần tử mảng
     *
     * @param numbers là mảng chứa các phần tử cần hiển thị
     */
    private static void showArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) { // duyệt toàn bộ mảng
            System.out.print(numbers[i] + " "); // in ra từng p.tử
        }
        System.out.println(); // hiện xuống dòng mới
    }

    /**
     * phương thức nhập vào danh sách các số nguyên
     *
     * @param n     số lượng giá trị cần nhập
     * @param input đối tượng của lớp Scanner
     * @return mảng các phần tử đã nhập vào
     */
    private static int[] getNumbers(int n, Scanner input) {
        var numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = input.nextInt();
        }
        return numbers;
    }
}
