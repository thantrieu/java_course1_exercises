package net.braniumacademy.exercises_lesson36;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author Branium Academy
 * @address https://braniumacademy.net/
 */

public class L36Ex19 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("input19.txt");
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
            for (int j = 0; j < rect.length; j++) {
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
        // vẽ tam giác theo hướng: trên hàng thứ i in ra h-i khoảng trắng
        // sau đó trên hàng thứ i in ra i dấu *. Do vuông góc phải dưới
        // nên trên hàng i ta in khoảng trắng nếu chỉ số cột <= h - i
        // ngược lại in dấu *
        var h = rect.length;
        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= h; j++) {
                if (j <= h - i) {
                    rect[i - 1][j - 1] = "   ";
                } else {
                    rect[i - 1][j - 1] = " * ";
                }
            }
        }
    }
}
