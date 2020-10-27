import java.util.Scanner;

/**
 * @author Branium Academy
 * @address https://braniumacademy.net/
 */

public class L14Ex11 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        var number = 0;
        do {
            System.out.println("=====================================" +
                    "==================");
            System.out.println("Nhập giá trị số từ 1-12 để xem kết quả." +
                    "Nhập 0 để thoát.");
            number = input.nextInt();
            var season = ""; // biến lưu tên mùa của năm
            // tiến hành đánh giá với switch
            switch (number) {
                case 0:
                    System.out.println("Kết thúc chương trình");
                    break;
                case 1:
                case 2:
                case 3:
                    season = "Mùa Xuân";
                    break;
                case 4:
                case 5:
                case 6:
                    season = "Mùa Hạ";
                    break;
                case 7:
                case 8:
                case 9:
                    season = "Mùa Thu";
                    break;
                case 10:
                case 11:
                case 12:
                    season = "Mùa Đông";
                    break;
                default:
                    System.out.println("Giá trị không hợp lệ. Vui lòng nhập giá trị trong đoạn [0-12]");
            }
            if (!season.isEmpty()) {
                System.out.println("Tháng " + number + " là " + season);
            }
        } while (number != 0);
    }
}
