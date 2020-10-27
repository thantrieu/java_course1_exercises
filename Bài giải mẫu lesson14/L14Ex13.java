import java.util.Scanner;

/**
 * @author Branium Academy
 * @address https://braniumacademy.net/
 */

public class L14Ex13 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        var choice = 0;
        var str = "==========================================";
        do {
            System.out.println(str);
            System.out.println("Nhập 0 để thoát. Nhập số khác để tiếp tục.");
            choice = input.nextInt();
            System.out.println("Nhập ngày sinh tháng sinh cách nhau bởi 1 dấu cách: ");
            var day = input.nextInt();
            var month = input.nextInt();
            var zodiac = ""; // biến lưu tên con giáp
            System.out.println("Ngày sinh của bạn: " + day + "/" + month);
            // ta xét tháng trước ngày sau vì số tháng ít hơn số ngày
            switch (month) {
                case 1:
                    if (day < 20) { // 1 - 19/1
                        zodiac = "Ma Kết";
                    } else if (day <= 31) { // 20 - 31/1
                        zodiac = "Bảo Bình";
                    } else {
                        System.out.println("Ngày không hợp lệ");
                    }
                    break;
                case 2:
                    if (day < 19) { // 1 - 18/2
                        zodiac = "Bảo Bình";
                    } else if (day <= 29) { // 19 - 29/2
                        zodiac = "Song Ngư";
                    } else {
                        System.out.println("Ngày không hợp lệ");
                    }
                    break;
                case 3:
                    if (day < 21) { // 1 - 20/3
                        zodiac = "Song Ngư";
                    } else if (day <= 31) { // 21 - 31/3
                        zodiac = "Bạch Dương";
                    } else {
                        System.out.println("Ngày không hợp lệ");
                    }
                    break;
                case 4:
                    if (day < 21) { // 1 - 20/4
                        zodiac = "Bạch Dương";
                    } else if (day <= 30) { // 21 - 30/4
                        zodiac = "Kim Ngưu";
                    } else {
                        System.out.println("Ngày không hợp lệ");
                    }
                    break;
                case 5:
                    if (day < 21) { // 1 - 20/5
                        zodiac = "Kim Ngưu";
                    } else if (day <= 31) { // 21 - 31/5
                        zodiac = "Song Tử";
                    } else {
                        System.out.println("Ngày không hợp lệ");
                    }
                    break;
                case 6:
                    if (day < 22) { // 1 - 21/6
                        zodiac = "Song Tử";
                    } else if (day <= 30) { // 22 - 30/6
                        zodiac = "Cự Giải";
                    } else {
                        System.out.println("Ngày không hợp lệ");
                    }
                    break;
                case 7:
                    if (day < 23) { // 1 - 22/7
                        zodiac = "Cự Giải";
                    } else if (day <= 31) { // 23 - 31/7
                        zodiac = "Sư Tử";
                    } else {
                        System.out.println("Ngày không hợp lệ");
                    }
                    break;
                case 8:
                    if (day < 23) { // 1 - 22/8
                        zodiac = "Sư Tử";
                    } else if (day <= 31) { // 23 - 31/8
                        zodiac = "Xử Nữ";
                    } else {
                        System.out.println("Ngày không hợp lệ");
                    }
                    break;
                case 9:
                    if (day < 23) { // 1 - 22/9
                        zodiac = "Xử Nữ";
                    } else if (day <= 30) { // 23 - 30/9
                        zodiac = "Thiên Bình";
                    } else {
                        System.out.println("Ngày không hợp lệ");
                    }
                    break;
                case 10:
                    if (day < 24) { // 1 - 23/10
                        zodiac = "Thiên Bình";
                    } else if (day <= 31) { // 24 - 31/10
                        zodiac = "Bọ Cạp";
                    } else {
                        System.out.println("Ngày không hợp lệ");
                    }
                    break;
                case 11:
                    if (day < 23) { // 1 - 22/11
                        zodiac = "Bọ Cạp";
                    } else if (day <= 30) { // 23 - 30/11
                        zodiac = "Nhân Mã";
                    } else {
                        System.out.println("Ngày không hợp lệ");
                    }
                    break;
                case 12:
                    if (day < 22) { // 1 - 21/12
                        zodiac = "Nhân Mã";
                    } else if (day <= 31) { // 22 - 31/12
                        zodiac = "Ma Kết";
                    } else {
                        System.out.println("Ngày không hợp lệ");
                    }
                    break;
                default:
                    System.out.println("Tháng không hợp lệ. Vui lòng kiểm tra lại.");
                    break;
            }
            if (!zodiac.isEmpty()) {
                System.out.println("Cung hoàng đạo nhà bạn là: " + zodiac);
            }
        } while (choice != 0);
    }
}
