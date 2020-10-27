package net.braniumacademy.ex5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Branium Academy
 * @website braniumacademy.net
 */

public class L38Ex5 {
    public static void main(String[] args) throws ParseException {
        var remain = getRemain();
        System.out.printf("Còn %10.2f ngày là hết thế kỉ hiện tại.", remain);
    }

    /**
     * phương thức dùng để tính số ngày còn lại của thế kỉ hiện thời
     * @return số ngày còn lại
     * @throws ParseException
     */
    private static double getRemain() throws ParseException {
        var format = "dd/MM/yyyy"; // tạo chuỗi định dạng
        SimpleDateFormat dateFormat = new SimpleDateFormat(format);
        // lấy thời gian milisec từ ngày đầu tiên của thế kỉ kế tiếp
        var nextTime = dateFormat.parse("01/01/2100").getTime();
        // kết quả = số mili giây dư lại của hiệu hai thời điểm chia
        // số mili giây trong 1 ngày
        var result = (nextTime - new Date().getTime()) * 1.0 / (86400 * 1000);
        return result;
    }
}

