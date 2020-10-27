/**
 * @author Branium Academy
 * @address https://braniumacademy.net/
 */

public class L16Ex3 {
    public static void main(String[] args) {
        int i = 1; // bắt đầu từ 1
        int sum = 0; // tổng bắt đầu từ 0
        // ý tưởng của lời giải là bắt đầu từ giá trị i = 1
        // lần lượt tăng i lên đồng thời cộng i vào tổng gốc
        // nếu tại một thời điểm nào đó mà i cộng vào tổng cho kq >= 500
        // ta in ra kq, dừng vòng lặp => tìm xong đáp án
        while (true) { // lặp vô hạn
            sum += i;
            if (sum >= 500) { // nếu tổng thỏa mãn >= 500
                System.out.println(i); // in ra i
                break; // kết thúc vòng lặp
            }
            i++; // lần lượt tăng i lên
        }
    }
}
