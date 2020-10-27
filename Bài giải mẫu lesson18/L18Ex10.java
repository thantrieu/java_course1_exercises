import java.util.Scanner;

/**
 * @author Branium Academy
 * @address https://braniumacademy.net/
 */

public class L18Ex10 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhập vào một câu: ");
        var str = input.nextLine();
        // tìm các nguyên âm, trước đó ta viết thường cả câu
        var count = countVowl(str.toLowerCase());
        System.out.println("Số nguyên âm trong câu: " + count);
    }

    // phương thức tìm số nguyên âm trong câu str
    public static int countVowl(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e'
                    || str.charAt(i) == 'i' || str.charAt(i) == 'o'
                    || str.charAt(i) == 'u') {
                count++;
            }
        }
        return count;
    }
}
