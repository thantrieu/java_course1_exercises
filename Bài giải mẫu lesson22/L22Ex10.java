import java.util.Scanner;

/**
 * @author Branium Academy
 * @ link: https: braniumacademy.net
 */

public class L22Ex10 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhập số lượng nhân viên: ");
        var n = input.nextInt();
        // lấy ngày công cho n nhân viên
        var works = getWorks(n, input);
        // thông báo kết quả:
        showResult(works);
    }

    /**
     * phương thức tính toán và hiển thị thông tin về lương bổng nhân viên
     *
     * @param works mảng danh sách ngày công nhân viên
     */
    private static void showResult(float[] works) {
        System.out.println("Thông tin chấm công từng nhân viên:");
        // dấu trừ để căn lề sang trái. Xem lại lý thuyết bài học về
        // kiểu dữ liệu trong Java
        System.out.printf("%-5s%-10s%-15s%-10s%-10s%-12s\n", "STT",
                "Số công", "Lương cứng", "Phụ cấp", "Bonus", "Tổng lương");
        for (int i = 0; i < works.length; i++) {
            var standard = 330 * works[i]; // lương chuẩn
            var pensision = 33 * (int) works[i]; // phụ cấp
            var bonusDay = (works[i] - 25 >= 0) ? (works[i] - 24) : 0;
            var bonus = bonusDay * 50; // tiền bonus
            var total = standard + pensision + bonus; // tổng lương
            System.out.printf("%-5d%-10.2f%-15.2f%-10d%-10.2f%-12.2f\n",
                    i + 1, works[i], standard, pensision, bonus, total);
        }
    }

    /**
     * phương thức nhập vào ngày công của từng nhân viên trong c.ty
     *
     * @param n     là số nhân viên
     * @param input là đối tượng của Scanner
     * @return danh sách ngày công của n nhân viên
     */
    private static float[] getWorks(int n, Scanner input) {
        var works = new float[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập ngày công NV thứ " + (i + 1) + ": ");
            works[i] = input.nextFloat();
            if (works[i] < 0 || works[i] > 30) {
                System.out.println("Nhập ngày công trong đoạn [0-30]");
                i--; // không tăng i
            }
        }
        return works;
    }
}
