package net.braniumacademy.exercises_lesson36;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Branium Academy
 * @ link: https: braniumacademy.net
 */

public class L36Ex13 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("input13.txt");
        var input = new Scanner(file);
        // gọi phương thức và nhận về danh sách tên sv
        var students = getStudents(input);
        countName(students);
    }

    /**
     * phương thức hiển thị từng tên và số lần xuất hiện của mỗi tên
     *
     * @param students
     */
    private static void countName(ArrayList<String> students) {
        System.out.printf("%-15s%-10s\n", "Tên", "Xuất hiện");
        for (int i = 0; i < students.size(); i++) {
            var isExist = false;
            for (int j = 0; j < i; j++) {
                // nếu tên sv đã xuất hiện rồi
                if (students.get(j).toLowerCase()
                        .compareTo(students.get(i).toLowerCase()) == 0) {
                    isExist = true; // đánh dấu lại
                    break; // thoát lặp
                }
            }
            if (!isExist) { // nếu tên chưa xuất hiện thì mới xét
                var count = numOfExist(students, students.get(i));
                System.out.printf("%-15s:%-10d\n", students.get(i), count);
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
    private static int numOfExist(ArrayList<String> students, String key) {
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
     * @param input là đối tượng của lớp scanner
     * @return danh sách sinh viên đã nhập
     */
    private static ArrayList<String> getStudents(Scanner input) {
        var students = new ArrayList<String>();
        while (input.hasNext()){
            students.add(input.next());
        }
        return students;
    }
}
