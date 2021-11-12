import java.util.Scanner;

public class Lesson6Exercises5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập str1: ");
        String str1 = scanner.nextLine();
        System.out.println("Nhập str2: ");
        String str2 = scanner.nextLine();
        System.out.println(str1.lastIndexOf(str2));
    }
}
