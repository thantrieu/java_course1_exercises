import java.util.Scanner;

/**
 * @author Branium Academy
 * @ link: https: braniumacademy.net
 */

public class L25Ex6 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhập số phần tử của mảng: ");
        var n = input.nextInt();
        // gọi phương thức và nhận về danh sách tên sv
        var students = getStudents(n, input);
        countName(students);
    }

    /**
     * phương thức hiển thị từng tên và số lần xuất hiện của mỗi tên
     *
     * @param students
     */
    private static void countName(String[] students) {
        System.out.printf("%-15s%-10s\n", "Tên", "Xuất hiện");
        for (int i = 0; i < students.length; i++) {
            var isExist = false;
            for (int j = 0; j < i; j++) {
                // nếu tên sv đã xuất hiện rồi
                if (students[j].toLowerCase()
                        .compareTo(students[i].toLowerCase()) == 0) {
                    isExist = true; // đánh dấu lại
                    break; // thoát lặp
                }
            }
            if(!isExist) { // nếu tên chưa xuất hiện thì mới xét
                var count = numOfExist(students, students[i]);
                System.out.printf("%-15s:%-10d\n", students[i], count);
            }
        }
    }

    /**
     * phương thức tìm số lần xuất hiện của từng tên sv
     *
     * @param students danh sách sv
     * @param key      tên cần tìm
     * @return số lần xuất hiện của tên sv
     */
    private static int numOfExist(String[] students, String key) {
        var count = 0; // mặc định gán biến count bằng 0
        for (var s : students) {
            // nếu tên sv s trùng với tên cần tìm
            if (key.toLowerCase().compareTo(s.toLowerCase()) == 0) {
                count++; // tăng biến đếm lên
            }
        }
        return count;
    }

    /**
     * phương thức dùng để nhập tên n sinh viên
     *
     * @param n     số sinh viên cần nhập
     * @param input là đối tượng của lớp scanner
     * @return danh sách sinh viên đã nhập
     */
    private static String[] getStudents(int n, Scanner input) {
        var students = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Tên sinh viên thứ " + (i + 1) + ": ");
            students[i] = input.next();
        }
        return students;
    }
}
