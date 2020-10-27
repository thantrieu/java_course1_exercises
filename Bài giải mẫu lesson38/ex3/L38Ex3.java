package net.braniumacademy.ex3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

/**
 * @author Branium Academy
 * @website braniumacademy.net
 */

public class L38Ex3 {
    public static void main(String[] args) {
        var day1 = getDay();
        var day2 = getDay();
        var result = findDay(day1, day2);
        System.out.println("Chênh lệch ngày giữa hai ngày ");
        System.out.println(day1 + " và " + day2 + ": ");
        System.out.printf("%5.2f ngày", result);
    }

    /**
     * phương thức dùng để tính chênh lệch ngày từ ngày d1 đến d2
     * Do ngày nhập vào có thể khác thứ tự nên ta lấy trị tuyệt đối
     * của kết quả để đảm bảo kết quả chính xác
     *
     * @param day1 ngày thứ nhất
     * @param day2 ngày thứ 2
     * @return chênh lệch ngày giữa hai thời điểm cho trước
     */
    private static float findDay(String day1, String day2) {
        var format = "dd/MM/yyyy";
        var formatter = new SimpleDateFormat(format);
        try {
            var date1 = formatter.parse(day1);
            var date2 = formatter.parse(day2);
            var time1 = date1.getTime();
            var time2 = date2.getTime();
            var result = Math.abs(time1 - time2) * 1.0f / (24 * 60 * 60 * 1000);
            return result;
        } catch (ParseException e) {
            e.printStackTrace();
            return 0;
        }
    }

    /**
     * phương thức nhập dữ liệu vào ngày tháng năm theo chỉ dẫn
     * lưu ý nhập đúng định dạng nếu không chương trình sẽ bị lỗi
     * @return String ngày tháng năm
     */
    private static String getDay() {
        var input = new Scanner(System.in);
        System.out.println("Nhập ngày ở định dạng dd/MM/yyyy: ");
        var day = input.nextLine();
        if(day.length() == 10) {
            return day;
        }
        return "01/01/2025"; // mặc định nếu nhập thiếu giá trị
    }
}
