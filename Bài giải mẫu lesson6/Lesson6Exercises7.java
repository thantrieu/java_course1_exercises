import java.util.Scanner;

public class Lesson6Exercises7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào cả dòng chuỗi họ và tên: ");
        String fullName = scanner.nextLine();
        int firstSpaceIndex = fullName.indexOf(" ");
        int lastSpaceIndex = fullName.lastIndexOf(" ");
        String lastName = fullName.substring(0, firstSpaceIndex);
        String firstName = fullName.substring(lastSpaceIndex + 1);
        String midName = fullName.substring(firstSpaceIndex + 1, lastSpaceIndex);
        System.out.println("Họ: " + lastName);
        System.out.println("Đệm: " + midName);
        System.out.println("Tên: " + firstName);
    }
}
