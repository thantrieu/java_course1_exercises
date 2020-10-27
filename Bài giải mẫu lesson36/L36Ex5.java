package net.braniumacademy.exercises_lesson36;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Branium Academy
 * @ link: https: braniumacademy.net
 */

public class L36Ex5 {
    public static void main(String[] args) throws FileNotFoundException {
        // dữ liệu cho trước đã chuẩn hóa nên k cần dùng nextX để kiểm tra
        File file = new File("input5.txt");
        var input = new Scanner(file);
        var n = input.nextInt();
        var numbers = getNumbers(n, input); // gọi phương thức
        input.close(); // đóng file
        // hiển thị mảng gốc:
        showArray(numbers);
        // sắp xếp và hiển thị
        // nửa đầu mảng sắp xếp tăng dần
        Arrays.sort(numbers, 0, numbers.length / 2);
        sort(numbers); // nửa sau của mảng sắp xếp giảm dần
        System.out.println("Mảng sau khi sắp xếp: ");
        showArray(numbers);
    }

    /**
     * phương thức sắp xếp nổi bọt sắp xếp nửa sau của mảng giảm dần
     *
     * @param numbers mảng cần sắp xếp
     */
    private static void sort(int[] numbers) {
        for (int i = numbers.length / 2; i < numbers.length; i++) {
            for (int j = numbers.length - 1; j > i; j--) {
                if (numbers[j] > numbers[j - 1]) { // sắp xếp giảm dần
                    var x = numbers[j];
                    numbers[j] = numbers[j - 1];
                    numbers[j - 1] = x;
                }
            }
        }
    }

    /**
     * phương thức tìm và trả về giá trị min2 trong mảng đã sắp xếp
     *
     * @param numbers là mảng chứa các giá trị cần xét
     * @return giá trị min2 tìm được
     */
    private static int findMin2(int[] numbers) {
        int max = numbers[numbers.length - 1];
        // tìm min2
        for (int i = numbers.length - 1; i >= 0; i--) {
            if (numbers[i] != max) { // nếu tìm thấy min2
                return numbers[i];
            }
        }
        return max;
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
