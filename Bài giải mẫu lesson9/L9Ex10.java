import java.util.Scanner;

/**
 * @author Branium Academy
 * @address https://braniumacademy.net/
 */

public class L9Ex10 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhập vào số tiền bạn dự đoán(triệu)");
        var guess = input.nextFloat(); // nhập số tiền dự đoán
        // tiến hành tính toán:
        var moneyArea = 152 * 65 * 0.01 * 0.01; // đổi ra mét vuông
        var buildingArea = 72 * 12 * 80; // diện tích tòa nhà
        // số tờ tiền cần rải, làm tròn lên
        var needed = Math.ceil(buildingArea / moneyArea);
        // tiến hành kiểm tra. Điều kiện để rải khắp toàn nhà là
        // số tờ tiền bạn dự đoán >= số tiền cần thiết
        // và không vượt quá 100 tr
        System.out.println("Số tiền cần thiết: " + needed/2);
        if ((guess >= needed / 2) && (guess <= needed / 2 + 100)) {
            System.out.println("Chính xác!");
        } else {
            System.out.println("Chưa chính xác.");
        }
    }
}
