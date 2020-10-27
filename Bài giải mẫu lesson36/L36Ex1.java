package net.braniumacademy.exercises_lesson36;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Branium Academy
 * @ link: https: braniumacademy.net
 */

public class L36Ex1 {
    public static void main(String[] args) throws FileNotFoundException {
        // dữ liệu cho trước đã chuẩn hóa nên k cần dùng nextX để kiểm tra
        File file = new File("input1.txt");
        var input = new Scanner(file);
        var n = input.nextInt();
        var numbers = getNumbers(n, input); // gọi phương thức
        input.close();
        // hiển thị mảng trước sắp xếp
        System.out.println("Mảng trước khi sắp xếp: ");
        showArray(numbers);
        // sắp xếp và hiển thị
        Arrays.sort(numbers);
        System.out.println("Mảng sau khi sắp xếp: ");
        showArray(numbers);

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
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }
        return numbers;
    }
}
