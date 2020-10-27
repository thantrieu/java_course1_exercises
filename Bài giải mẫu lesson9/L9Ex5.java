import java.util.Scanner;

/**
 * @author Branium Academy
 * @address https://braniumacademy.net/
 */

public class L9Ex5 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhập vào ba số thực: ");
        var a = input.nextDouble();
        var b = input.nextDouble();
        var c = input.nextDouble();
        // tiến hành kiểm tra đồng thời ba biểu thức:
        if ((a + b) > c && (a + c) > b && (b + c) > a) {
            System.out.println("Ba số lập thành tam giác");
        } else {
            System.out.println("Ba số không lập thành tam giác");
        }
    }
}
