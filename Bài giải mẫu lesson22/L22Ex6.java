import java.util.Scanner;

/**
 * @author Branium Academy
 * @ link: https: braniumacademy.net
 */

public class L22Ex6 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhập vào tên những người bạn cách nhau bởi dấu cách: ");
        var str = input.nextLine(); // đọc cả dòng
        // tách các tên ra và lưu vào mảng mới:
        var friends = str.split("\\s+");
        // hiện kết quả những người tên ngắn nhất:
        showResult(friends);
    }

    /**
     * phương thức hiển thị kết quả
     *
     * @param friends là tham số chứa danh sách tên những người bạn
     */
    private static void showResult(String[] friends) {
        var minLength = shortestName(friends);
        System.out.println("Người có tên ngắn nhất là: ");
        for (var friend : friends) {
            if (friend.length() == minLength) {
                System.out.println(friend);
            }
        }
    }

    /**
     * phương thức tìm độ dài nhỏ nhất của tên
     *
     * @param friends danh sách các tên
     * @return một giá trị nguyên
     */
    private static int shortestName(String[] friends) {
        int min = friends[0].length();
        for (int i = 1; i < friends.length; i++) {
            if (friends[i].length() < min) {
                min = friends[i].length(); // cập nhật giá trị nhỏ nhất của tên
            }
        }
        return min;
    }
}
