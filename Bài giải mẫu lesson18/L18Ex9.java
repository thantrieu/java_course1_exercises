import java.util.Scanner;

/**
 * @author Branium Academy
 * @address https://braniumacademy.net/
 */

public class L18Ex9 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhập vào một câu: ");
        var str = input.nextLine();
        // để đảm bảo chính xác, ta lược bỏ các dấu cách thừa trước khi đếm
        str = str.trim(); // bỏ dấu cách đầu cuối
        // thay thế 1 hoặc nhiều dấu cách giữa bằng 1 dấu cách
        str = str.replaceAll("\\s+", " ");
        System.out.println("Số từ của câu: " + countWords(str));
    }

    // phương thức đếm số từ của một câu
    public static int countWords(String str) {
        var count = 0;
        if (!str.isEmpty()) { // nếu string k rỗng thì chắc chắn
            count++; // có 1 từ
        }
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') { // nếu gặp dấu cách thì có thêm từ
                count++; // tăng biến đếm
            }
        }
        return count; // trả về kết quả là số từ đếm được
    }
}
