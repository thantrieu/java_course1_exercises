import java.util.Scanner;

/**
 * @author Branium Academy
 * @ link: https: braniumacademy.net
 */

public class L22Ex3 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhập số phần tử của mảng: ");
        var n = input.nextInt();
        var numbers = getNumbers(n, input); // gọi phương thức
        var result = isRevert(numbers) ? "Mảng đối xứng" : "Không đối xứng";
        System.out.println(result);
    }

    /**
     * phương thức kiểm tra mảng numbers có đối xứng hay không
     * thuật toán: lần lượt xét từng cặp phần tử thứ i và length-1-i
     * nếu có bất kì cặp nào khác nhau->không đối xứng
     * sau cùng mặc định sẽ trả về mảng đối xứng nếu quá trình xét
     * không return
     *
     * @param numbers mảng cần xét kiểu int
     * @return true nếu mảng đối xứng và false trong trường hợp ngược lại
     */
    private static boolean isRevert(int[] numbers) {
        // chỉ cần xét 1 nửa và lấy đối xứng qua tâm là xong
        for (int i = 0; i <= numbers.length / 2; i++) {
            if (numbers[i] != numbers[numbers.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }

    // phương thức nhập vào danh sách các số nguyên
    private static int[] getNumbers(int n, Scanner input) {
        var numbers = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }
        return numbers;
    }
}
