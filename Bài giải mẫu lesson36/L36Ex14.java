package net.braniumacademy.exercises_lesson36;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author Branium Academy
 * @ link: https: braniumacademy.net
 */

public class L36Ex14 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("input14.txt");
        var input = new Scanner(file);
        var n = input.nextInt();
        var numbers = getNumbers(n, input); // gọi phương thức
        System.out.println("Mảng gốc: ");
        showArray(numbers);
        System.out.println("Mảng sau khi lọc: ");
        filter(numbers);
    }

    /**
     * phương thức lọc bỏ các phần tử trùng nhau và chỉ hiển thị
     * mỗi phần tử duy nhất 01 lần
     *
     * @param numbers mảng chứa các phần tử
     */
    private static void filter(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            if (!isExist(numbers, numbers[i], i)) {
                System.out.print(numbers[i] + " ");
            }
        }
    }

    /**
     * phương thức kiểm tra xem n xuất hiện trong mảng trước đó chưa
     *
     * @param numbers mảng gốc
     * @param n       giá trị cần kiểm tra
     * @param bound   biên cần xét
     * @return true nếu n đã xuất hiện, false trong trường hợp ngược lại
     */
    private static boolean isExist(int[] numbers, int n, int bound) {
        for (int i = 0; i < bound; i++) { // duyệt từ đầu đến trước bound
            if (numbers[i] == n) { // nếu n đã xuất hiện
                return true; // trả về true
            }
        }
        return false; // mặc định trả về false
    }


    /**
     * phương thức kiểm tra xem mảng có đối xứng hay không
     *
     * @param numbers mảng cần kiểm tra
     * @return true nếu mảng đối xứng và false trong các trường hợp còn lại
     */
    private static boolean isSymmetrical(int[] numbers) {
        for (int i = 0; i <= numbers.length / 2; i++) {
            if (numbers[i] != numbers[numbers.length - 1 - i]) {
                return false;
            }
        }
        return true;
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
