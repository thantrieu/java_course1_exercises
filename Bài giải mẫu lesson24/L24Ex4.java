import java.util.Scanner;

/**
 * @author Branium Academy
 * @ link: https: braniumacademy.net
 */

public class L24Ex4 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhập số phần tử của mảng: ");
        var n = input.nextInt();
        var numbers = getNumbers(n, input); // gọi phương thức
        // sắp xếp và hiển thị
        sort(numbers);
        System.out.println("Mảng sau khi sắp xếp: ");
        showArray(numbers);
        int min2 = findMin2(numbers);
        if (min2 != numbers[numbers.length - 1]) {
            showMin2(numbers, min2);
        } else {
            System.out.println("Không có giá trị nhỏ thứ hai trong mảng");
        }
    }

    /**
     * phương thức sắp xếp nổi bọt
     *
     * @param numbers mảng cần sắp xếp
     */
    private static void sort(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = numbers.length - 1; j > i; j--) {
                if (numbers[j] > numbers[j - 1]) { // sắp xếp giảm dần
                    var x = numbers[j];
                    numbers[j] = numbers[j - 1];
                    numbers[j - 1] = x;
                }
            }
        }
    }

    /**
     * phương thức hiển thị chỉ số các phần tử trùng với giá trị min2
     *
     * @param numbers là mảng chứa các phần tử cần xét
     * @param min2    là giá trị nhỏ thứ hai
     */
    private static void showMin2(int[] numbers, int min2) {
        System.out.println("Giá trị min2 = " + min2);
        System.out.print("Chỉ số: ");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == min2) {
                System.out.print(i + " ");
            }
        }
    }

    /**
     * phương thức tìm và trả về giá trị min2 trong mảng đã sắp xếp
     *
     * @param numbers là mảng chứa các giá trị cần xét
     * @return giá trị min2 tìm được
     */
    private static int findMin2(int[] numbers) {
        int max = numbers[numbers.length - 1];
        // tìm min2
        for (int i = numbers.length - 1; i >= 0; i--) {
            if (numbers[i] != max) { // nếu tìm thấy min2
                return numbers[i];
            }
        }
        return max;
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
