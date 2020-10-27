package net.braniumacademy.exercises_lesson36;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Branium Academy
 * @ link: https: braniumacademy.net
 */

public class L36Ex3 {
    public static void main(String[] args) throws FileNotFoundException {
        // dữ liệu cho trước đã chuẩn hóa nên k cần dùng nextX để kiểm tra
        File file = new File("input3.txt");
        var input = new Scanner(file);
        var n = input.nextInt();
        var numbers = getNumbers(n, input); // gọi phương thức
        input.close();
        // sắp xếp và hiển thị
        Arrays.sort(numbers);
        System.out.println("Mảng sau khi sắp xếp: ");
        showArray(numbers);
        int max2 = findMax2(numbers);
        if (max2 != numbers[numbers.length - 1]) {
            showMax2(numbers, max2);
        } else {
            System.out.println("Không có giá trị lớn thứ hai trong mảng");
        }

    }

    /**
     * phương thức hiển thị chỉ số các phần tử trùng với giá trị max2
     *
     * @param numbers là mảng chứa các phần tử cần xét
     * @param max2    là giá trị lớn thứ hai
     */
    private static void showMax2(int[] numbers, int max2) {
        System.out.println("Giá trị max2 = " + max2);
        System.out.print("Chỉ số: ");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == max2) {
                System.out.print(i + " ");
            }
        }
    }

    /**
     * phương thức tìm và trả về giá trị max2 trong mảng đã sắp xếp
     *
     * @param numbers là mảng chứa các giá trị cần xét
     * @return giá trị max2 tìm được
     */
    private static int findMax2(int[] numbers) {
        int max = numbers[numbers.length - 1];
        // tìm max2
        for (int i = numbers.length - 1; i >= 0; i--) {
            if (numbers[i] != max) { // nếu tìm thấy max2
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
