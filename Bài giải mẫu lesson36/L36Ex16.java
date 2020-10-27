package net.braniumacademy.exercises_lesson36;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author Branium Academy
 * @address https://braniumacademy.net/
 */

public class L36Ex16 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("input16.txt");
        var input = new Scanner(file);
        var m = input.nextInt();
        // tạo mảng chứa kết quả
        var rect = new String[m][m];
        // vẽ hình và lưu vào mảng
        fillRect(rect);
        // hiển thị lên màn hình
        onScreen(rect);
    }

    /**
     * phương thức vẽ lên màn hình các giá trị trong mảng
     *
     * @param rect mảng chứa dữ liệu cần hiển thị
     */
    private static void onScreen(String[][] rect) {
        System.out.println("Hình cần vẽ: ");
        for (int i = 0; i < rect.length; i++) {
            for (int j = 0; j < rect.length; j++) {
                System.out.print(rect[i][j]); // in ra giá trị trong mảng
            }
            System.out.println(); // in xuống dòng
        }
    }

    /**
     * phương thức điền kí tự * và khoảng trắng vào mảng
     *
     * @param rect mảng chứa hình vuông và đường chéo cần vẽ
     */
    private static void fillRect(String[][] rect) {
        // vẽ hình
        for (int i = 1; i <= rect.length; i++) {
            for (int j = 1; j <= rect.length; j++) {
                if (i == 1 || i == rect.length || j == 1 || j == rect.length || i == j
                        || (i + j) == (rect.length + 1)) {
                    rect[i - 1][j - 1] = " * ";
                } else {
                    rect[i - 1][j - 1] = "   ";
                }
            }
        }
    }
}
