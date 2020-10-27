package net.braniumacademy.exercises_lesson36;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author Branium Academy
 * @ link: https: braniumacademy.net
 */

public class L36Ex8 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("input8.txt");
        var input = new Scanner(file);
        var n = input.nextInt(); // đọc n
        var x = input.nextInt(); // đọc x
        var numbers = getNumbers(n, input); // gọi phương thức
        System.out.println("Các phần tử trong mảng: ");
        showArray(numbers);
        input.close();
        // tìm và kết luận
        if (isExist(numbers, x)) {
            System.out.println(x + " xuất hiện trong mảng");
        } else {
            System.out.println(x + " không xuất hiện trong mảng");
        }
    }

    /**
     * phương thức kiểm tra xem x có xuất hiện trong mảng hay không
     *
     * @param numbers là mảng chứa các giá trị cần kiểm tra
     * @param x       là giá trị cần tìm
     * @return true nếu tìm thấy x và false trong trường hợp ngược lại
     */
    private static boolean isExist(int[] numbers, int x) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == x) {
                return true;
            }
        }
        return false;
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
