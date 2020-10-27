import java.util.Scanner;

/**
 * @author Branium Academy
 * @address https://braniumacademy.net/
 */

public class L30Ex2 {
    enum Zodiac {
        THE_RAT("TÝ"), THE_OX("SỬU"), THE_TIGER("DẦN"),
        THE_CAT("MÃO"), THE_DRAGON("THÌN"), THE_SNAKE("TỴ"),
        THE_HORSE("NGỌ"), THE_GOAT("MÙI"), THE_MONKEY("THÂN"),
        THE_ROOTSTER("DẬU"), THE_DOG("TUẤT"), THE_PIG("HỢI");

        private String value;

        Zodiac(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhập giá trị số từ 1-12: ");
        var number = input.nextInt();
        String zodiac = getZodiac(number);
        System.out.println("STT " + number + " là con giáp: " + zodiac);
    }

    /**
     * phương thức trả về con giáp thứ i tương ứng
     *
     * @param number giá trị tháng truyền vào
     * @return tên con giáp tương ứng với tháng
     */
    private static String getZodiac(int number) {
        String zodiac = switch (number) {
            case 0 -> "Kết thúc chương trình";
            case 1 -> Zodiac.THE_RAT.getValue();
            case 2 -> Zodiac.THE_OX.getValue();
            case 3 -> Zodiac.THE_TIGER.getValue();
            case 4 -> Zodiac.THE_CAT.getValue();
            case 5 -> Zodiac.THE_DRAGON.getValue();
            case 6 -> Zodiac.THE_SNAKE.getValue();
            case 7 -> Zodiac.THE_HORSE.getValue();
            case 8 -> Zodiac.THE_GOAT.getValue();
            case 9 -> Zodiac.THE_MONKEY.getValue();
            case 10 -> Zodiac.THE_ROOTSTER.getValue();
            case 11 -> Zodiac.THE_DOG.getValue();
            case 12 -> Zodiac.THE_PIG.getValue();
            default -> "Giá trị không hợp lệ. Vui lòng nhập giá trị [1-12]";
        };
        return zodiac;
    }
}
