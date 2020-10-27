import java.util.Scanner;

/**
 * @author Branium Academy
 * @address https://braniumacademy.net/
 */

public class L20Ex1 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhập giá trị số từ 0-12: ");
        var number = input.nextInt();
        // tiến hành đánh giá với switch expression
        var season = switch (number) {
            case 0 -> "Kết thúc chương trình";
            case 1, 2, 3 -> "Mùa Xuân";
            case 4, 5, 6 -> "Mùa Hạ";
            case 7, 8, 9 -> "Mùa Thu";
            case 10, 11, 12 -> "Mùa Đông";
            default -> "Giá trị không hợp lệ. Vui lòng nhập giá trị trong đoạn [0-12]";
        };
        System.out.println("Tháng " + number + " là " + season);
    }
}
