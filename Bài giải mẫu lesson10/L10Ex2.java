import java.util.Scanner;

/**
 * @author Branium Academy
 * @address https://braniumacademy.net/
 */

public class L10Ex2 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhập giá trị số từ 1-12: ");
        var number = input.nextInt();
        var zodiac = ""; // biến lưu tên con giáp
        // tiến hành đánh giá với switch
        switch (number) {
            case 0:
                System.out.println("Kết thúc chương trình");
                break;
            case 1:
                zodiac = "Tý";
                break;
            case 2:
                zodiac = "Sửu";
                break;
            case 3:
                zodiac = "Dần";
                break;
            case 4:
                zodiac = "Mão";
                break;
            case 5:
                zodiac = "Thìn";
                break;
            case 6:
                zodiac = "Tỵ";
                break;
            case 7:
                zodiac = "Ngọ";
                break;
            case 8:
                zodiac = "Mùi";
                break;
            case 9:
                zodiac = "Thân";
                break;
            case 10:
                zodiac = "Dậu";
                break;
            case 11:
                zodiac = "Tuất";
                break;
            case 12:
                zodiac = "Hợi";
                break;
            default:
                System.out.println("Giá trị không hợp lệ. Vui lòng nhập giá trị [1-12]");
        }
        if (!zodiac.isEmpty()) {
            System.out.println("STT " + number + " là con giáp: " + zodiac);
        }
    }
}
