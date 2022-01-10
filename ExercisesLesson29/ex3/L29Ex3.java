import java.util.Scanner;

public class L29Ex3 {
    public static void main(String[] args) {
        // giả định nhập chuẩn thông tin:
        BankAccount acc = new BankAccount();
        var input = new Scanner(System.in);
        System.out.println("Nhập số tài khoản của bạn: ");
        var accNum = input.nextLine();
        acc.setAccNumber(accNum);
        System.out.println("Nhập tên tài khoản: ");
        var owner = input.nextLine();
        acc.setOwner(owner);
        System.out.println("Nhập số tiền muốn gửi vào TK: ");
        acc.deposit(input.nextLong());

        // lấy thông tin tài khoản thông qua các getter:
        System.out.println("Số TK: " + acc.getAccNumber());
        System.out.println("Tên TK: " + acc.getOwner());

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
        // var dec = input.nextLine(); // nhập có/không
        // thêm các hành động khác ở đây...
    }
}
