import java.util.Scanner;

/**
 * @author Branium Academy
 * @address https://braniumacademy.net/
 */

public class L9Ex9 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhập vào 2 đáy và chiều cao của hình thang: ");
        var firstEdge = input.nextDouble(); // đọc vào đáy lớn
        var secondEdge = input.nextDouble(); // đọc vào đáy nhỏ
        var height = input.nextDouble(); // chiều cao
        // kiểm tra và tính diện tích hình thang
        if (firstEdge > 0 && secondEdge > 0 && height > 0) {
            var area = (firstEdge + secondEdge) * height / 2;
            System.out.println("Diện tích hình thang: " + area);
        } else {
            System.out.println("Vui lòng nhập vào các thông số hợp lệ");
        }
    }
}
