import java.util.Scanner;

/**
 * @author Branium Academy
 * @address https://braniumacademy.net/
 */

public class L20Ex4 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhập tên ngày của tuần-> ");
        var dayOfWeek = input.nextLine();
        var result = ""; // biến lưu kết quả chuyển đổi
        // tiến hành kiểm tra và đánh giá
        dayOfWeek = dayOfWeek.toLowerCase(); // viết thường hết cho dễ so sánh
        dayOfWeek = dayOfWeek.trim(); // loại bỏ hết các dấu cách thừa
        // vào switch expression
        result = switch (dayOfWeek) {
            case "thứ hai" -> "Monday";
            case "thứ ba" -> "Tuesday";
            case "thứ tư" -> "Wednesday";
            case "thứ năm" -> "Thursday";
            case "thứ sáu" -> "Friday";
            case "thứ bảy" -> "Saturday";
            case "chủ nhật" -> "Sunday";
            default -> "Invalid day of week";
        };
        System.out.println("Kết quả chuyển đổi-> ");
        System.out.println(dayOfWeek + " -> " + result);
    }
}
