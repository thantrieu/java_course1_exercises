package practice_interface;

public class Test {
    public static void main(String[] args) {
        AccountManagermentImp accManagerment = new AccountManagermentImp();
        // tạo tk:
        Account account = new ActiveAccount("ACC1001", "richkid2005",
                "145awgeaw*/-@", true, false);
        // đăng kí tk trong hệ thống:
        accManagerment.signup(account);
        accManagerment.login(account);
        System.out.println("Sau khi đăng nhập: ");
        showAccountOnlineStatus(account);
        accManagerment.logout(account);
        System.out.println("Sau khi đăng xuất: ");
        showAccountOnlineStatus(account);
    }

    private static void showAccountOnlineStatus(Account account) {
        ActiveAccount activeAccount = (ActiveAccount) account;
        var status
                = (activeAccount.isOnline()) ? "đang online" : "đang offline";
        System.out.println("Tài khoản \"" + activeAccount.getUsername()
                +"\" " + status);
    }
}
