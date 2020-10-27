import java.util.Scanner;

public class L29Ex4 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhập số lượng môn học: ");
        var n = input.nextInt();
        input.nextLine();
        if (n > 0) {
            Subject[] subjects = new Subject[n];
            fillSubjectsInfo(subjects, input);
            showSubjects(subjects);
        } else {
            System.out.println("Số lượng môn học phải nguyên dương");
        }
    }

    /**
     * phương thức nhập vào thông tin cho các môn học
     *
     * @param subjects danh sách môn học cần nhập thông tin
     * @param input    chứa đối tượng của lớp Scanner
     */
    private static void fillSubjectsInfo(Subject[] subjects, Scanner input) {
        for (int i = 0; i < subjects.length; i++) {
            Subject subject = new Subject();
            System.out.println("Nhập thông tin môn học thứ " + (i + 1) + ": ");
            System.out.print("Mã môn học: ");
            subject.setId(input.nextLine());
            System.out.print("Tên môn học: ");
            subject.setName(input.nextLine());
            System.out.print("Số tín chỉ: ");
            subject.setCredit(input.nextInt());
            System.out.print("Số tiết học: ");
            subject.setNumOfLesson(input.nextInt());
            System.out.print("Số bài kiểm tra: ");
            subject.setNumOfTest(input.nextInt());
            input.nextLine(); // đọc bỏ kí tự thừa

            subjects[i] = subject;
        }
    }

    /**
     * phương thức hiển thị thông tin các môn học
     *
     * @param subjects chứa các môn học cần hiển thị
     */
    private static void showSubjects(Subject[] subjects) {
        System.out.println("================================" +
                " THÔNG TIN MÔN HỌC ===============================");
        System.out.printf("%-15s%-20s%-15s%-15s%-15s\n",
                "Mã môn học", "Tên môn học",
                "Số tín chỉ", "Số tiết", "Số bài kiểm tra");
        for (var subject : subjects) {
            subject.showInfoInLine();
        }
    }
}
