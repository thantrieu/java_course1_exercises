import java.util.Scanner;

/**
 * @author Branium Academy
 * @ link: https: braniumacademy.net
 */

public class L22Ex5 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhập vào một chuỗi kí tự: ");
        var str = input.nextLine(); // đọc cả dòng
        // tách tại vị trí có 1 hoặc nhiều khoảng trắng
        String[] words = str.split("\\s+");
        // hiện kết quả
        System.out.println("Danh sách các từ in theo thứ tự ngược lại: ");
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.println(words[i]);
        }
    }
}
