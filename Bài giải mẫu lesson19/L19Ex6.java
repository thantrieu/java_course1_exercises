import java.util.Scanner;

/**
 * @author Branium Academy
 * @address https://braniumacademy.net/
 */

public class L19Ex6 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        drawRectangle();
        System.out.println(); // in xuống dòng

        System.out.println("Nhập kích thước: ");
        var size = input.nextInt();
        drawRectangle(size);
        System.out.println();

        System.out.println("Nhập chiều cao và chiều rộng hình chữ nhật: ");
        var height = input.nextInt();
        var width = input.nextInt();
        drawRectangle(width, height);
    }

    // phương thức không tham số
    public static void drawRectangle() {
        var size = 5;
        for (int i = 1; i <= size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    // phương thức có tham số int
    public static void drawRectangle(int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    // phương thức nhận 2 tham số int
    public static void drawRectangle(int width, int height) {
        for (int i = 1; i <= height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.printf(" * ");
            }
            System.out.println();
        }
    }
}
