package net.braniumacademy.exercises_lesson36;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Branium Academy
 * @address https://braniumacademy.net/
 */

public class L36Ex23 {
    public static void main(String[] args) throws FileNotFoundException {
        // nhập vào ma trận
        var matrix = getMatrix();
        // sắp xếp và hiển thị
        sort(matrix);
        onScreen(matrix);
    }

    /**
     * phương thức hiển thị ma trận lên màn hình
     *
     * @param matrix ma trận chứa các phần tử cần hiển thị
     */
    private static void onScreen(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    /**
     * phương thức sắp xếp ma trận theo thứ tự tăng dần
     * từ trái qua phải. Do mỗi hàng trong mảng 1 chiều bản chất
     * là mảng 1 chiều nên ta có thể sử dụng phương thức Arrays.sort()
     *
     * @param matrix mảng hai chiều chứa các phần tử cần sắp xếp
     */
    private static void sort(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            Arrays.sort(matrix[i]);
        }
    }

    /**
     * phương thức dùng để nhập vào các phần tử cho mảng hai chiều và trả
     * về mảng sau khi nhập
     *
     * @return mảng sau khi nhập
     */
    private static int[][] getMatrix() throws FileNotFoundException {
        File file = new File("input23.txt");
        var input = new Scanner(file);
        var m = input.nextInt();
        var n = input.nextInt();
        var matrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = input.nextInt();
            }
        }
        return matrix;
    }
}
