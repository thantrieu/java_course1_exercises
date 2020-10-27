import java.util.Scanner;

/**
 * @author Branium Academy
 * @address https://braniumacademy.net/
 */

/*
    Ý tưởng của bài rất đơn giản: Sinh số ngẫu nhiên, nhân kết quả với
    10^n để được giá trị có n chữ số. Sau đó ép kiểu sang kiểu nguyên.
    Chia dư của giá trị vừa có cho n được kết quả.
 */
public class L8Ex7 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhập vào số nguyên dương n: ");
        var n = input.nextInt(); // đọc n
        var randNumber = Math.random() * Math.pow(10, n); // sinh số ngẫu nhiên
        var tmp = (int)randNumber; // ép kiểu sang int
        var result = tmp % n; // lấy dư để đảm bảo kết quả trong [0, n)
        // hiện kết quả:
        System.out.println(result);
    }
}
// code xong ấn Ctrl Alt L để format code