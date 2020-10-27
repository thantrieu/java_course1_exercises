package practice_interface;

import java.util.ArrayList;

public class AccountManagermentImp implements AccountManagerment {
    private ArrayList<Account> accounts;

    public AccountManagermentImp() {
        accounts = new ArrayList<>();
    }

    public AccountManagermentImp(ArrayList<Account> accounts) {
        this.accounts = accounts;
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(ArrayList<Account> accounts) {
        this.accounts = accounts;
    }

    @Override
    public boolean signup(Account account) {
        if (!isExist(account)) {
            accounts.add(account);
            return true;
        }
        return false;
    }

    private boolean isExist(Account account) {
        for (var acc : accounts) {
            if (acc.getUsername().compareTo(account.getUsername()) == 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean login(Account account) {
//        for (var acc : accounts) {
//            if (acc.equals(account)) {
//                return true;
//            }
//        }
        // code mới để test:
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).equals(account)
                    && accounts.get(i) instanceof ActiveAccount) {
                var activeAcc = (ActiveAccount) accounts.get(i);
                activeAcc.setOnline(true); // bật trạng thái online về false
                return true; // kết thúc
            }
        }
        return false;
    }

    @Override
    public void logout(Account account) {
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).equals(account)
                    && accounts.get(i) instanceof ActiveAccount) {
                var activeAcc = (ActiveAccount) accounts.get(i);
                activeAcc.setOnline(false); // bật trạng thái online về false
                break; // kết thúc
            }
        }
    }

    @Override
    public boolean removeAccount(Account account) {
        for (int i = 0; i < accounts.size(); i++) {
            if (account.equals(accounts.get(i))) {
                accounts.remove(i);
                return true;
            }
        }
        return false;
    }

    /**
     * Phương thức kích hoạt lại tài khoản đang vô hiệu hóa.
     * Điều kiện active tk là nhập đúng mật khẩu và tài khoản
     * chưa bị xóa khỏi hệ thống.
     *
     * @param account
     * @return
     */
    @Override
    public boolean recoverAccount(Account account) {
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).equals(account)
                    && accounts.get(i) instanceof ActiveAccount) {
                var activeAcc = (ActiveAccount) accounts.get(i);
                activeAcc.setActive(true); // khôi phục lại tài khoản
                return true;
            }
        }
        return false;
    }

    /**
     * phương thức thiết lập lại mật khẩu
     *
     * @param account
     * @return
     */
    @Override
    public boolean changePassword(Account account) {
        for (int i = 0; i < accounts.size(); i++) {
            var acc = accounts.get(i);
            if (acc.equals(account)) {
                acc.setPassword(account.getPassword());
                // your implement...
                return true; // xong thì thoát vì chỉ có một tk thỏa mãn đk
            }
        }
        return false;
    }

    /**
     * Phương thức dùng để cập nhật thông tin TTK
     * giả sử ta chỉ update thông tin email và số ĐT.
     * Bạn có thể tự bổ sung cập nhật các thông tin khác.
     * Lưu ý không được đổi thông tin username
     *
     * @param account
     */
    @Override
    public void changeAccountInfo(Account account) {
        for (int i = 0; i < accounts.size(); i++) {
            var acc = accounts.get(i);
            if (acc.equals(account)) {
                acc.setEmail(account.getEmail());
                acc.setPhoneNumber(account.getPhoneNumber());
                // your implement...
                break; // xong thì thoát vì chỉ có một tk thỏa mãn đk
            }
        }
    }
}
