import java.util.Scanner;

/**
 * @author Branium Academy
 * @address https://braniumacademy.net/
 */

public class L9Ex1 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhập một số nguyên: ");
        int number = input.nextInt();
        // tiến hành kiểm tra xem number chẵn hay lẻ
        if (number % 2 == 0) {
            System.out.println(number + " là số chẵn.");
        } else {
            System.out.println(number + " là số lẻ.");
        }
    }
}
