/**
 * @author Branium Academy
 * @address https://braniumacademy.net/
 */

public class L9Ex11 {
    public static void main(String[] args) {
        // tiến hành tính toán:
        var moneyArea = 152 * 65 * 0.01 * 0.01; // đổi ra mét vuông
        var buildingArea = 72 * 12 * 80; // diện tích tòa nhà
        // số tờ tiền cần rải, làm tròn lên
        var needed = Math.ceil(buildingArea / moneyArea);
        // thực hiện quy đổi:
        var base = 500_000; // lấy 500k làm cơ sở
        var property = 200_000_000_000L; // 200 tỉ usd
        var vnd = 23250; // 1 usd tương đương bằng này vnđ
        var exchange = property * vnd; // đổi sang vnđ
        var total = exchange / base; // tổng số tờ 500k sau khi quy đổi
        // kết luận
        var result = total / needed;
        System.out.println("Số tòa nhà có thể rải: " + result);
    }
}
