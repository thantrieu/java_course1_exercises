import java.util.Scanner;

/**
 * @author braniumacademy
 * @see braniumacademy.net
 * @version 2021.1.28
 * @video https://youtu.be/Ybbltbh2vUM
 */

public class Ex3 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Nhập vào chuỗi họ tên cần kiểm tra: ");
        var name = scanner.nextLine();
        // kiểm tra và in ra kết luận
        if(name.matches("^[a-zA-Z\\s]+$")) {
            System.out.println("HỢP LỆ");
        } else {
            System.out.println("KHÔNG HỢP LỆ");
        }
    }
}
