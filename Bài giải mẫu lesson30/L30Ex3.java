import java.util.PrimitiveIterator;
import java.util.Scanner;

/**
 * @author Branium Academy
 * @address https://braniumacademy.net/
 */

public class L30Ex3 {
    enum Zodiac {
        ARIES("BẠCH DƯƠNG"), TAURUS("KIM NGƯU"), GEMINI("SONG TỬ"),
        CANCER("CỰ GIẢI"), LEO("SƯ TỬ"), VIRGO("XỬ NỮ"),
        LIBRA("THIÊN BÌNH"), SCORPIUS("BỌ CẠP"), SAGITTARIUS("NHÂN MÃ"),
        CAPRICORN("MA KẾT"), AQUARIUS("BẢO BÌNH"), PISCES("SONG NGƯ");

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
        System.out.println("Nhập ngày sinh tháng sinh cách nhau bởi 1 dấu cách: ");
        var day = input.nextInt();
        var month = input.nextInt();
        // biến lưu tên con giáp
        var zodiac = "";
        // ta xét tháng trước ngày sau vì số tháng ít hơn số ngày
        zodiac = getZodiac(day, month);
        System.out.println("Cung hoàng đạo nhà bạn là: " + zodiac);
    }

    /**
     * phương thức trả về giá trị cung hoàng đạo tương ứng
     *
     * @param day   ngày sinh
     * @param month tháng sinh
     * @return tên cung hoàng đạo ở tiếng việt
     */
    private static String getZodiac(int day, int month) {
        String zodiac = switch (month) {
            case 1 -> (day < 20) ? Zodiac.CAPRICORN.getValue()
                    : (day <= 31) ? Zodiac.AQUARIUS.getValue()
                    : "Ngày không hợp lệ";
            case 2 -> (day < 19) ? Zodiac.AQUARIUS.getValue()
                    : (day <= 29) ? Zodiac.PISCES.getValue()
                    : "Ngày không hợp lệ";
            case 3 -> (day < 21) ? Zodiac.PISCES.getValue()
                    : (day <= 31) ? Zodiac.ARIES.getValue()
                    : "Ngày không hợp lệ";
            case 4 -> (day < 21) ? Zodiac.ARIES.getValue()
                    : (day <= 30) ? Zodiac.TAURUS.getValue()
                    : "Ngày không hợp lệ";
            case 5 -> (day < 21) ? Zodiac.TAURUS.getValue()
                    : (day <= 31) ? Zodiac.GEMINI.getValue()
                    : "Ngày không hợp lệ";
            case 6 -> (day < 22) ? Zodiac.GEMINI.getValue()
                    : (day <= 30) ? Zodiac.CANCER.getValue()
                    : "Ngày không hợp lệ";
            case 7 -> (day < 23) ? Zodiac.CANCER.getValue()
                    : (day <= 31) ? Zodiac.LEO.getValue()
                    : "Ngày không hợp lệ";
            case 8 -> (day < 23) ? Zodiac.LEO.getValue()
                    : (day <= 31) ? Zodiac.VIRGO.getValue()
                    : "Ngày không hợp lệ";
            case 9 -> (day < 23) ? Zodiac.VIRGO.getValue()
                    : (day <= 30) ? Zodiac.LIBRA.getValue()
                    : "Ngày không hợp lệ";
            case 10 -> (day < 24) ? Zodiac.LIBRA.getValue()
                    : (day <= 31) ? Zodiac.SCORPIUS.getValue()
                    : "Ngày không hợp lệ";
            case 11 -> (day < 23) ? Zodiac.SCORPIUS.getValue()
                    : (day <= 30) ? Zodiac.SAGITTARIUS.getValue()
                    : "Ngày không hợp lệ";
            case 12 -> (day < 22) ? Zodiac.SAGITTARIUS.getValue()
                    : (day <= 31) ? Zodiac.CAPRICORN.getValue()
                    : "Ngày không hợp lệ";
            default -> "Tháng không hợp lệ. Vui lòng kiểm tra lại.";
        };
        return zodiac;
    }
}
