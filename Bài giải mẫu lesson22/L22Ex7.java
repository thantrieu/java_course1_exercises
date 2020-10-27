import java.util.Scanner;

/**
 * @author Branium Academy
 * @ link: https: braniumacademy.net
 */

public class L22Ex7 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhập số phần tử của mảng: ");
        var n = input.nextInt();
        var grades = getGrades(n, input);
        showResult(grades);
    }

    /**
     * phương thức hiển thị kết quả
     *
     * @param grades danh sách đầu điểm cần hiển thị kết quả
     */
    private static void showResult(float[] grades) {
        System.out.println("Kết luận phân loại sinh viên: ");
        for (int i = 0; i < grades.length; i++) {
            System.out.println("STT " + i + ": "
                    + grades[i] + " -> " + classify(grades[i]));
        }
    }

    /**
     * phương thức xếp loại sinh viên giả định dựa trên điểm TB
     *
     * @param grade điểm đầu vào
     * @return kết luận tương ứng ở kiểu String
     */
    private static String classify(float grade) {
        if (grade < 2.0f) {
            return "Trượt";
        } else if (grade < 2.5f) {
            return "Yếu";
        } else if (grade < 3.0) {
            return "TB";
        } else if (grade < 3.2) {
            return "Khá";
        } else if (grade < 3.6) {
            return "Giỏi";
        } else {
            return "Xuất sắc";
        }
    }

    // phương thức nhập vào danh sách các đầu điểm
    private static float[] getGrades(int n, Scanner input) {
        var numbers = new float[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập điểm TB SV thứ " + (i + 1) + ": ");
            numbers[i] = input.nextFloat();
        }
        return numbers;
    }
}
