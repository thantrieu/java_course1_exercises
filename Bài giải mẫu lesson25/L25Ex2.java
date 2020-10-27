import java.util.Scanner;

/**
 * @author Branium Academy
 * @ link: https: braniumacademy.net
 */

public class L25Ex2 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhập số phần tử của mảng: ");
        var n = input.nextInt();
        var numbers = getNumbers(n, input); // gọi phương thức
        System.out.println("Các phần tử trong mảng: ");
        showArray(numbers);
        System.out.println("Nhập x: ");
        var x = input.nextInt();
        // tìm và kết luận
        System.out.println("Giá trị " + x + " xuất hiện "
                + countX(numbers, x) + " lần.");
    }

    /**
     * phương thức đếm số lần xuất hiện của x trong mảng
     *
     * @param numbers là mảng chứa các giá trị cần đếm
     * @param x       là giá trị cần tìm
     * @return số lần xuất hiện của x trong mảng
     */
    private static int countX(int[] numbers, int x) {
        int count = 0; // ban đầu count = 0
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == x) {
                count++; // tăng biến đếm lên 01 đơn vị
            }
        }
        return count;
    }

    /**
     * phương thức hiển thị các phần tử mảng
     *
     * @param numbers là mảng chứa các phần tử cần hiển thị
     */
    private static void showArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) { // duyệt toàn bộ mảng
            System.out.print(numbers[i] + " "); // in ra từng p.tử
        }
        System.out.println(); // hiện xuống dòng mới
    }

    /**
     * phương thức nhập vào danh sách các số nguyên
     *
     * @param n     số lượng giá trị cần nhập
     * @param input đối tượng của lớp Scanner
     * @return mảng các phần tử đã nhập vào
     */
    private static int[] getNumbers(int n, Scanner input) {
        var numbers = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }
        return numbers;
    }
}
