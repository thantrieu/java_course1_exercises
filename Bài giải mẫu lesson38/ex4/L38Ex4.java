package net.braniumacademy.ex4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author Branium Academy
 * @website braniumacademy.net
 */

public class L38Ex4 {
    public static void main(String[] args) throws ParseException {
        var remain = getRemain();
        System.out.printf("Còn %5.2f ngày là hết năm.", remain);
    }

    /**
     * phương thức dùng để tính số ngày còn lại của năm hiện thời
     * @return số ngày còn lại
     * @throws ParseException
     */
    private static float getRemain() throws ParseException {
        // lấy năm hiện tại + 1 thành năm tiếp theo
        var nextYear = Calendar.getInstance().get(Calendar.YEAR) + 1;
        var format = "dd/MM/yyyy"; // tạo chuỗi định dạng
        SimpleDateFormat dateFormat = new SimpleDateFormat(format);
        // lấy thời gian milisec từ ngày đầu tiên của năm kế tiếp
        var nextTime = dateFormat.parse("01/01/" + nextYear).getTime();
        // kết quả = số mili giây dư lại của hiệu hai thời điểm chia
        // số mili giây trong 1 ngày
        var result = (nextTime - new Date().getTime()) * 1.0f / (86400 * 1000);
        return result;
    }
}
