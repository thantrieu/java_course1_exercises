import java.util.Scanner;

/**
 * @author Branium Academy
 * @ link: https: braniumacademy.net
 */

public class L24Ex2 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhập số phần tử của mảng: ");
        var n = input.nextInt();
        if (n > 0) {
            var grades = getGrades(n, input);
            System.out.println("Mảng trước khi sắp xếp: ");
            showArray(grades);
            // tiến hành sắp xếp và hiển thị kết quả
            sort(grades);
            System.out.println("Mảng sau khi sắp xếp: ");
            showArray(grades);
        } else {
            System.out.println("Nhập số phần tử mảng > 0");
        }
    }

    /**
     * phương thức sắp xếp mảng theo thứ tự giảm dần
     *
     * @param arr mảng chứa các phần tử cần sắp xếp
     */
    private static void sort(float[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = arr.length - 1; j > i; j--) {
                if (arr[j] > arr[j - 1]) {
                    var x = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = x;
                }
            }
        }
    }

    /**
     * phương thức hiển thị các phần tử mảng
     *
     * @param numbers là mảng chứa các phần tử cần hiển thị
     */
    private static void showArray(float[] numbers) {
        for (int i = 0; i < numbers.length; i++) { // duyệt toàn bộ mảng
            System.out.print(numbers[i] + " "); // in ra từng p.tử
        }
        System.out.println(); // hiện xuống dòng mới
    }

    /**
     * phương thức nhập vào danh sách các điểm TB từng sv
     *
     * @param n     số lượng giá trị cần nhập
     * @param input đối tượng của lớp Scanner
     * @return mảng các phần tử đã nhập vào
     */
    private static float[] getGrades(int n, Scanner input) {
        var grades = new float[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập điểm SV thứ " + (i + 1) + ": ");
            grades[i] = input.nextFloat();
            if (grades[i] < 0 || grades[i] > 10) {
                System.out.println("Nhập điểm trong đoạn [0-10]");
                i--; // không tăng i
            }
        }
        return grades;
    }
}
