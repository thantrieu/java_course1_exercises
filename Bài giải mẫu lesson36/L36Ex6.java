package net.braniumacademy.exercises_lesson36;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author Branium Academy
 * @ link: https: braniumacademy.net
 */

public class L36Ex6 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("input6.txt");
        var input = new Scanner(file);
        while (input.hasNextLine()) { // kiểm tra còn dòng nào không trước khi đọc tiếp
            var str = input.nextLine();
            // tách các từ tại vị trí có 1 hoặc nhiều dấu cách
            var words = str.split("\\s+");
            System.out.println("Các từ trước sắp xếp: ");
            showWords(words);
            System.out.println("Các từ sau khi sắp xếp: ");
            sort(words);
            showWords(words);
        }
        input.close();
    }

    /**
     * phương thức thực hiện sắp xếp các từ theo thứ tự a-z
     *
     * @param words danh sách từ cần sắp xếp
     */
    private static void sort(String[] words) {
        for (int i = 0; i < words.length - 1; i++) {
            for (int j = words.length - 1; j > i; j--) {
                // nếu từ đứng sau mà nhỏ hơn từ đứng trước
                if (words[j].compareTo(words[j - 1]) < 0) {
                    // đổi chỗ hai từ
                    var tmp = words[j];
                    words[j] = words[j - 1];
                    words[j - 1] = tmp;
                }
            }
        }
    }

    /**
     * phương thức hiển thị danh sách các từ
     *
     * @param words danh sách các từ
     */
    private static void showWords(String[] words) {
        for (var word : words) {
            System.out.print(word + " ");
        }
        System.out.println(); // in xuống dòng
    }
}
