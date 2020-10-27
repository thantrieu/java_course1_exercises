/**
 * @author Branium Academy
 * @website: https://braniumacademy.net
 */

public class L28Ex3 {
    public static void main(String[] args) {
        // tạo tài khoản với constructor 0 tham số:
        BankAccount account = new BankAccount();
        // tạo tài khoản với constructor 1 tham số:
        BankAccount account1 = new BankAccount("0021000439800");
        // tạo tài khoản với constructor 2 tham số:
        BankAccount account2 = new BankAccount("0021000439800", "Trần Văn Hưng");
        // tương tự ta tạo tài khoản với nhiều hơn các thông tin ban đầu
        // bằng cách gọi đến các phương thức khởi tạo khác:
        BankAccount account3 = new BankAccount("0021000439800",
                "Trần Văn Hưng", "Tiết kiệm");
        BankAccount account4 = new BankAccount("0021000439800",
                "Trần Văn Hưng", "Tiết kiệm", 999999999);
        BankAccount account5 = new BankAccount("0021000439800",
                "Trần Văn Hưng", "Tiết kiệm", 999999999, "ViraniumBank");
        BankAccount account6 = new BankAccount("0021000439800",
                "Trần Văn Hưng", "Tiết kiệm", 999999999,
                "ViraniumBank", "12/06/2025");
        BankAccount account7 = new BankAccount("0021000439800",
                "Trần Văn Hưng", "Tiết kiệm", 999999999,
                "ViraniumBank", "12/06/2025", "12/6/2030");
    }
}
