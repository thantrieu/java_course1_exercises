package practice_interface;

/**
 * Thiết kế interface cho phép quản lý tài khoản gồm các thao tác:
 * đăng kí
 * đăng nhập
 * đăng xuất
 * xóa tài khoản
 * ->add: vô hiệu hóa TK
 * khôi phục tài khoản
 * đổi mật khẩu
 * ->add: cấp lại mật khẩu
 * chỉnh sửa thông tin tài khoản
 */

public interface AccountManagerment {
    boolean signup(Account account);

    boolean login(Account account);

    void logout(Account account);

    boolean removeAccount(Account account);

    boolean recoverAccount(Account account);

    boolean changePassword(Account account);

    void changeAccountInfo(Account account);

    default void deactiveAccount(Account account) {
        System.out.println("Tài khoản của bạn đã vô hiệu hóa");
    }

    default String randomPassword(Account account) {
        return "";
    }
}
