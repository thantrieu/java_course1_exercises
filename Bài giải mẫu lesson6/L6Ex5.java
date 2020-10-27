import java.util.Scanner;

/**
 * @author Branium Academy
 * @address https://braniumacademy.net/
 */

public class L6Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi str1: ");
        String str1 = scanner.nextLine();
        System.out.println("Nhập chuỗi str2: ");
        String str2 = scanner.nextLine();
        // tìm vị trí xuất hiện của str2 trong str1:
        int index = str1.lastIndexOf(str2);
        System.out.println("Vị trí cuối cùng str2 xuất hiện trong str1: " + index);
        // nếu kết quả là -1 sẽ không xuất hiện str2 trong str1
    }
}
// code xong ấn Ctrl Alt L để format code