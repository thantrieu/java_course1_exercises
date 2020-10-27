import java.util.Scanner;

/**
 * @author Branium Academy
 * @website: https://braniumacademy.net
 */
 
public class L27Ex3 {
    public static void main(String[] args) {
        // giả định nhập chuẩn thông tin:
        BankAccount acc = new BankAccount();
        var input = new Scanner(System.in);
        System.out.println("Nhập số tài khoản của bạn: ");
        acc.accNumber = input.nextLine();
        System.out.println("Nhập tên tài khoản: ");
        acc.owner = input.nextLine();
        System.out.println("Nhập số tiền muốn gửi vào TK: ");
        acc.deposit(input.nextLong());
        // thực hiện các thanh toán khác:
        System.out.println("Nhập số tiền muốn rút: ");
        var amount = input.nextLong();
        if (acc.withdraw(amount)) {
            System.out.println("Rút thành công");
            acc.checkAccBallance();
        } else {
            System.out.println("Số dư của bạn không đủ thực hiện giao dịch này");
        }
        System.out.println("Bạn có muốn thực hiện giao dịch khác không? ");
        var dec = input.nextLine(); // nhập có/không
        // thêm các hành động khác ở đây...
    }
}
