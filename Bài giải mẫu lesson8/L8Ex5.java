import java.util.Scanner;

/**
 * @author Branium Academy
 * @address https://braniumacademy.net/
 */

public class L8Ex5 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhập vào hai số a, b: ");
        var a = input.nextInt(); // đọc a
        var b = input.nextInt(); // đọc b
        // tính a / b
        var result = 1.0 * a / b; // ép kiểu để có kết quả chính xác
        System.out.println("a/b = " + result); // hiện kết quả gốc
        // làm tròn kết quả đến số nguyên gần nhất:
        // lẻ >= 0.5 làm tròn lên. ngược lại làm tròn xuống
        System.out.println("Làm tròn a/b = " + Math.round(result));
    }
}
// code xong ấn Ctrl Alt L để format code