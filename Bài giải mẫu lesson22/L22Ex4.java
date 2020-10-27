import java.util.Scanner;

/**
 * @author Branium Academy
 * @ link: https: braniumacademy.net
 */

public class L22Ex4 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhập vào một chuỗi kí tự: ");
        var str = input.nextLine(); // đọc cả dòng
        // tách tại vị trí có 1 hoặc nhiều khoảng trắng
        String[] words = str.split("\\s+");
        // hiện kết quả
        System.out.println("Danh sách các từ và chỉ số của nó: ");
        for (int i = 0; i < words.length; i++) {
            System.out.println(i + " - " + words[i]);
        }
    }
}
