import java.util.Scanner;

/**
 * @author Branium Academy
 * @ link: https: braniumacademy.net
 */
 
public class L22Ex9 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhập số phần tử của mảng: ");
        var n = input.nextInt();
        if (n > 0) {
            var grades = getGrades(n, input);
            var avgGrades = averageGrades(grades);
            System.out.printf("Điểm trung bình cả lớp là: %2.2f", avgGrades);
        } else {
            System.out.println("Nhập số phần tử mảng > 0");
        }
    }

    /**
     * phương thức tính điểm trung bình của cả lớp
     *
     * @param grades danh sách điểm tb từng sinh viên
     * @return điểm trung bình cả lớp
     */
    private static float averageGrades(float[] grades) {
        float sum = 0;
        for (var grade : grades) {
            sum += grade;
        }
        return sum / grades.length;
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


