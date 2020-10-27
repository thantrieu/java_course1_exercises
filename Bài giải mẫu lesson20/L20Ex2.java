import java.util.Scanner;

/**
 * @author Branium Academy
 * @address https://braniumacademy.net/
 */

public class L20Ex2 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhập giá trị số từ 1-12: ");
        var number = input.nextInt();
        String zodiac = switch (number) {
            case 0 -> "Kết thúc chương trình";
            case 1 -> zodiac = "Tý";
            case 2 -> zodiac = "Sửu";
            case 3 -> zodiac = "Dần";
            case 4 -> zodiac = "Mão";
            case 5 -> zodiac = "Thìn";
            case 6 -> zodiac = "Tỵ";
            case 7 -> zodiac = "Ngọ";
            case 8 -> zodiac = "Mùi";
            case 9 -> zodiac = "Thân";
            case 10 -> zodiac = "Dậu";
            case 11 -> zodiac = "Tuất";
            case 12 -> zodiac = "Hợi";
            default -> "Giá trị không hợp lệ. Vui lòng nhập giá trị [1-12]";
        };
        System.out.println("STT " + number + " là con giáp: " + zodiac);
    }
}
