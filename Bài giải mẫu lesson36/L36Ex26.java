package net.braniumacademy.exercises_lesson36;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author Branium Academy
 * @address https://braniumacademy.net/
 */

public class L36Ex26 {
    enum Season {
        SPRING("MÙA XUÂN"), SUMMER("MÙA HẠ"),
        FALL("MÙA THU"), WINTER("MÙA ĐÔNG");
        private String value;

        Season(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("input26.txt");
        var input = new Scanner(file);
        while (input.hasNextInt()) {
            var month = input.nextInt();
            // tiến hành đánh giá với switch expression
            var season = getSeason(month);
            System.out.println("Tháng " + month + " là " + season);
        }
    }

    /**
     * trả về mùa của năm dựa vào tháng cho trước
     *
     * @param month tháng cho trước
     * @return tên mùa bằng tiếng việt
     */
    private static String getSeason(int month) {
        String season = switch (month) {
            case 0 -> "Kết thúc chương trình";
            case 1, 2, 3 -> Season.SPRING.getValue();
            case 4, 5, 6 -> Season.SUMMER.getValue();
            case 7, 8, 9 -> Season.FALL.getValue();
            case 10, 11, 12 -> Season.WINTER.getValue();
            default -> "Giá trị không hợp lệ";
        };
        return season;
    }
}
