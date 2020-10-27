package net.braniumacademy.exercises_lesson36;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author Branium Academy
 * @address https://braniumacademy.net/
 */

public class L36Ex29 {
    enum DayOfWeek {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("input29.txt");
        var input = new Scanner(file);
        while (input.hasNextLine()) {
            var dayOfWeek = input.nextLine();
            var result = ""; // biến lưu kết quả chuyển đổi
            // tiến hành kiểm tra và đánh giá
            dayOfWeek = dayOfWeek.toLowerCase(); // viết thường hết cho dễ so sánh
            dayOfWeek = dayOfWeek.trim(); // loại bỏ hết các dấu cách thừa
            // vào switch expression
            result = getDayOfWeek(dayOfWeek);
            System.out.println("Kết quả chuyển đổi-> ");
            System.out.println(dayOfWeek + " -> " + result);
        }
    }

    /**
     * trả về ngày trong tuần bằng tiếng anh tương ứng
     *
     * @param dayOfWeek tên ngày của tuần trong tiếng Việt
     * @return ngày của tuần đã chuyển sang tiếng Anh
     */
    private static String getDayOfWeek(String dayOfWeek) {
        // name() trả về tên hằng số trong enum
        var result = switch (dayOfWeek) {
            case "thứ hai" -> DayOfWeek.MONDAY.name();
            case "thứ ba" -> DayOfWeek.TUESDAY.name();
            case "thứ tư" -> DayOfWeek.WEDNESDAY.name();
            case "thứ năm" -> DayOfWeek.THURSDAY.name();
            case "thứ sáu" -> DayOfWeek.FRIDAY.name();
            case "thứ bảy" -> DayOfWeek.SATURDAY.name();
            case "chủ nhật" -> DayOfWeek.SUNDAY.name();
            default -> "Invalid day of week";
        };
        return result;
    }
}
