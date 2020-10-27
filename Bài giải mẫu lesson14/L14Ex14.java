import java.util.Scanner;

/**
 * @author Branium Academy
 * @address https://braniumacademy.net/
 */

public class L14Ex14 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        var str = "=============================================";
        var choice = 0;
        do {
            System.out.println(str);
            System.out.println("Nhập 0 để kết thúc. Nhập số khác để tiếp tục.");
            choice = input.nextInt();
            // đọc bỏ dòng chứa kí tự thừa:
            input.nextLine();
            System.out.println("Nhập tên ngày của tuần: ");
            var dayOfWeek = input.nextLine();
            var result = ""; // biến lưu kết quả chuyển đổi
            // tiến hành kiểm tra và đánh giá
            dayOfWeek = dayOfWeek.toLowerCase(); // viết thường hết cho dễ so sánh
            dayOfWeek = dayOfWeek.trim(); // loại bỏ hết các dấu cách thừa
            // vào cấu trúc switch
            switch (dayOfWeek) {
                case "thứ hai":
                    result = "Monday";
                    break;
                case "thứ ba":
                    result = "Tuesday";
                    break;
                case "thứ tư":
                    result = "Wednesday";
                    break;
                case "thứ năm":
                    result = "Thursday";
                    break;
                case "thứ sáu":
                    result = "Friday";
                    break;
                case "thứ bảy":
                    result = "Saturday";
                    break;
                case "chủ nhật":
                    result = "Sunday";
                    break;
                default:
                    result = "Invalid day of week";
                    break;
            }
            System.out.println("Kết quả chuyển đổi: ");
            System.out.println(dayOfWeek + " -> " + result);
        } while (choice != 0);
    }
}
