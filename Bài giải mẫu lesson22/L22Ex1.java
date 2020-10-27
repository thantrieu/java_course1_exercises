import java.util.Scanner;

/**
 * @author Branium Academy
 * @ link: https: braniumacademy.net
 */

public class L22Ex1 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhập số phần tử của mảng: ");
        var n = input.nextInt();
        var numbers = getNumbers(n, input); // gọi phương thức
        var sum = sumElements(numbers);
        // hiển thị mảng và tổng phần tử mảng:
        showArray(numbers);
        System.out.println("Tổng các phần tử trong mảng là: " + sum);
    }

    // phương thức hiển thị các phần tử mảng
    private static void showArray(int[] numbers) {
        System.out.println("Các phần tử trong mảng là: ");
        for (int i = 0; i < numbers.length; i++) { // duyệt toàn bộ mảng
            System.out.print(numbers[i] + " "); // in ra từng p.tử
        }
        System.out.println(); // hiện xuống dòng mới
    }

    // phương thức tính tổng các phần tử mảng
    private static long sumElements(int[] numbers) { // nhận tham số kiểu mảng
        long s = 0; // có thể tổng sẽ lớn nên ta dùng kiểu long
        for (int i = 0; i < numbers.length; i++) {
            s += numbers[i]; // cộng giá trị phần tử thứ i vào tổng
        }
        return s; // trả về tổng
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
