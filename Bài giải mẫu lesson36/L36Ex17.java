package net.braniumacademy.exercises_lesson36;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author Branium Academy
 * @address https://braniumacademy.net/
 */

public class L36Ex17 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("input17.txt");
        var input = new Scanner(file);
        var h = input.nextInt();
        // mảng lưu kết quả
        var triangle = new String[h][h];
        // vẽ tam giác
        fillRect(triangle);
        // hiện kết quả lên màn hình
        onScreen(triangle);
    }

    /**
     * phương thức vẽ lên màn hình các giá trị trong mảng
     *
     * @param rect mảng chứa dữ liệu cần hiển thị lên màn hình
     */
    private static void onScreen(String[][] rect) {
        System.out.println("Hình cần vẽ: ");
        for (int i = 0; i < rect.length; i++) {
            for (int j = 0; j < rect.length - i; j++) {
                System.out.print(rect[i][j]); // in ra giá trị trong mảng
            }
            System.out.println(); // in xuống dòng
        }
    }

    /**
     * phương thức điền kí tự * và khoảng trắng vào mảng
     *
     * @param rect mảng chứa hình tam giác vuông cần vẽ
     */
    private static void fillRect(String[][] rect) {
        // vẽ hình
        // vẽ tam giác theo hướng: hàng thứ 1 in ra h dấu *
        // từ hàng thứ 2 bắt đầu giảm đi mỗi hàng 1 dấu *
        // so với hàng trước nó
        var h = rect.length; // chiều cao tam giác bằng số hàng
        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= h - i + 1; j++) {
                rect[i - 1][j - 1] = " * ";
            }
        }
    }
}
