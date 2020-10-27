package net.braniumacademy.exercises_lesson36;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author Branium Academy
 * @address https://braniumacademy.net/
 */

public class L36Ex24 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("input24.txt");
        var input = new Scanner(file);
        var m = input.nextInt();
        var n = input.nextInt();
        var matrixA = new int[m][n];
        var matrixB = new int[m][n];
        fillMatrix(matrixA, input);
        fillMatrix(matrixB, input);
        var matrixSum = add(matrixA, matrixB);
        System.out.println("Ma trận A: ");
        onScreen(matrixA);
        System.out.println("Ma trận B: ");
        onScreen(matrixB);
        System.out.println("Ma trận tổng: ");
        onScreen(matrixSum);
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
     * phương thức tính tổng hai ma trận
     *
     * @param matrixA ma trận thứ nhất
     * @param matrixB ma trận thứ hai
     * @return ma trận tổng
     */
    private static int[][] add(int[][] matrixA, int[][] matrixB) {
        // ma trận tổng có cùng cấp với hai ma trận thành phần
        int[][] sum = new int[matrixA.length][matrixA[0].length];
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA[i].length; j++) {
                sum[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }
        return sum;
    }

    /**
     * phương thức dùng để nhập vào các phần tử cho ma trận
     *
     * @return mảng 2 chiều sau khi nhập
     */
    private static void fillMatrix(int[][] matrix, Scanner input) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = input.nextInt();
            }
        }
    }
}
