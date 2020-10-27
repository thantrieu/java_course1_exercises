import java.util.Scanner;

/**
 * @author Branium Academy
 * @ link: https: braniumacademy.net
 */

public class L25Ex8 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhập vào một chuỗi kí tự: ");
        var str = input.nextLine();
        countLetters(str);
    }

    /**
     * phương thức dùng để đếm số lần xuất hiện của từng
     * phần tử trong chuỗi str
     *
     * @param str chuỗi kí tự gốc
     */
    private static void countLetters(String str) {
        System.out.println("Các kí tự và số lần xuất hiện tương ứng: ");
        for (int i = 0; i < str.length(); i++) {
            if (!isExist(str, str.charAt(i), i)) {
                var result = count(str, str.charAt(i));
                System.out.println("\'" + str.charAt(i) + "\'" + " : " + result);
            }
        }
    }

    /**
     * phương thức dùng để kiểm tra xem trong khoảng [0, bound]
     * đã có sự xuất hiện của c hay chưa
     *
     * @param str   là chuỗi gốc
     * @param c     là kí tự cần kiểm tra
     * @param bound là biên trên
     * @return true nếu c đã xuất hiện trong [0, bound) và false trong trường hợp ngược lại
     */
    private static boolean isExist(String str, char c, int bound) {
        for (int i = 0; i < bound; i++) {
            if (str.charAt(i) == c) { // nếu xuất hiện rồi
                return true;
            }
        }
        return false; // chưa xuất hiện
    }

    /**
     * phương thức dùng để đếm số lần xuất hiện của từng kí tự
     *
     * @param str chuỗi gốc
     * @param key kí tự cần đếm
     * @return số lần c xuất hiện trong str
     */
    private static int count(String str, char key) {
        var counter = 0;
        for (int i = 0; i < str.length(); i++) {
            if (key == str.charAt(i)) {
                counter++;
            }
        }
        return counter;
    }
}
