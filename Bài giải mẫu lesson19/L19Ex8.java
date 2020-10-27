import java.util.Scanner;

/**
 * @author Branium Academy
 * @address https://braniumacademy.net/
 */

public class L19Ex8 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhập chiều cao của tam giác: ");
        var height = input.nextInt();
        System.out.println("Nhập kí tự dùng để vẽ: ");
        char c = input.next().charAt(0);
        // bắt đầu vẽ:
        System.out.println("-->Vẽ tam giác mặc định<--");
        drawTriangle(); // vẽ mặc định
        System.out.println("-->Vẽ tam giác mặc định bằng kí tự c<--");
        drawTriangle(c); // vẽ mặc định bằng kí tự c
        System.out.println("-->Vẽ tam giác cao h bằng kí tự c<--");
        drawTriangle(height, c); // vẽ tam giác chiều cao h bằng kí tự c
    }

    // phương thức vẽ tam giác không tham số
    public static void drawTriangle() {
        // vẽ tam giác cân đặc bằng các dấu *
        // nguyên lý: vẽ dấu * đối xứng qua cột h i, j bắt đầu từ 1
        // trên hàng thứ i vẽ dấu * tại vị trí h-i+1 đến h+i-1
        // các vị trí còn lại vẽ khoảng trắng
        var h = 5;
        for (int i = 1; i <= h; i++) {
            for (int j = 1; j < 2 * h; j++) {
                if (j < h - i + 1 || j > h + i - 1) {
                    System.out.print("   ");
                } else {
                    System.out.print(" * ");
                }
            }
            System.out.println();
        }
    }

    // phương thức vẽ tam giác nhận 1 tham số kiểu char
    public static void drawTriangle(char c) {
        var h = 5;
        for (int i = 1; i <= h; i++) {
            for (int j = 1; j < 2 * h; j++) {
                if (j < h - i + 1 || j > h + i - 1) {
                    System.out.print("   ");
                } else {
                    System.out.printf(" %c ", c);
                }
            }
            System.out.println();
        }
    }

    // phương thức vẽ tam giác nhận 2 tham số int, char
    public static void drawTriangle(int h, char c) {
        for (int i = 1; i <= h; i++) {
            for (int j = 1; j < 2 * h; j++) {
                if (j < h - i + 1 || j > h + i - 1) {
                    System.out.print("   ");
                } else {
                    System.out.printf(" %c ", c);
                }
            }
            System.out.println();
        }
    }
}
