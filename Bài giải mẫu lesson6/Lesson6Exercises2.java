import java.util.Scanner;

public class Lesson6Exercises2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi đầu vào: ");
        String input = scanner.nextLine();
        String result = input.toUpperCase();
        System.out.println(result);
    }
}
