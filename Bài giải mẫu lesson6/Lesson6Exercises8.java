import java.util.Scanner;

public class Lesson6Exercises8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào chuỗi kí tự: ");
        String str = scanner.nextLine();
        System.out.println(0 + " '" + str.charAt(0) + "'");
        System.out.println((str.length() - 1) + " '" + str.charAt(str.length() - 1) + "'");
    }
}
