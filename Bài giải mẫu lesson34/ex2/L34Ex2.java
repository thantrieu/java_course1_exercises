import java.util.ArrayList;
import java.util.Scanner;

/**
 * lớp thực thi các thao tác liên quan đến lớp BankAccount
 *
 * @author Branium Academy
 * @website: https://braniumacademy.net
 */

public class L34Ex2 {
    public static void main(String[] args) {
        int choice = 0;
        ArrayList<BankAccount> accounts = new ArrayList<>();
        var input = new Scanner(System.in);
        do {
            System.out.println("=================== MENU ===================");
            System.out.println("1. Thêm mới 1 tài khoản");
            System.out.println("2. Hiển thị thông tin tài khoản");
            System.out.println("3. Nạp thêm tiền vào tài khoản");
            System.out.println("4. Rút tiền từ tài khoản");
            System.out.println("5. Chuyển tiền từ tài khoản A đến tài khoản B");
            System.out.println("6. Tìm tài khoản theo tên tài khoản");
            System.out.println("7. Tìm tài khoản theo mã tài khoản");
            System.out.println("8. Tìm tài khoản với số dư >= x");
            System.out.println("9. Xóa một tài khoản theo mã cho trước");
            System.out.println("0. Thoát chương trình");
            System.out.println("Xin mời bạn chọn: ");
            choice = input.nextInt(); // nhập vào lựa chọn
            input.nextLine(); // đọc bỏ dòng thừa
            switch (choice) {
                case 0:
                    System.out.println("==> CẢM ƠN BẠN ĐÃ SỬ DỤNG DỊCH VỤ <==");
                    break;
                case 1:
                    var acc = createNewAcc(input);
                    accounts.add(acc);
                    System.out.println("==> Thêm tài khoản thành công! <==");
                    break;
                case 2:
                    showAccounts(accounts);
                    break;
                case 3:
                    if (accounts.size() > 0) {
                        System.out.println("Nhập mã TK cần nạp tiền: ");
                        var id = input.next();
                        System.out.println("Nhập số tiền cần nạp: ");
                        var amount = input.nextLong();
                        var isSuccess = deposit(accounts, id, amount);
                        if (isSuccess) {
                            System.out.println("==> Nạp tiền thành công! <==");
                        } else {
                            System.out.println(
                                    "==> Tài khoản không tồn tại " +
                                            "hoặc số tiền không hợp lệ <==");
                        }
                    } else {
                        System.out.println("==> Danh sách tài khoản rỗng <==");
                    }
                    break;

                case 4:
                    if (accounts.size() > 0) {
                        System.out.println("Nhập mã TK cần rút: ");
                        var id = input.next();
                        System.out.println("Nhập số tiền cần rút: ");
                        var amount = input.nextLong();
                        var isSuccess = withdraw(accounts, id, amount);
                        if (isSuccess) {
                            System.out.println("==> Thực hiện rút tiền thành công! <==");
                        } else {
                            System.out.println("==> Thất bại." +
                                    "\nSố tiền cần rút vượt quá số dư hiện thời." +
                                    "Hoặc tài khoản không đúng. <==");
                        }
                    } else {
                        System.out.println("==> Danh sách tài khoản rỗng <==");
                    }
                    break;
                case 5:
                    if (accounts.size() > 0) {
                        System.out.println("Nhập số tài khoản nguồn: ");
                        var srcAccId = input.nextLine();
                        System.out.println("Nhập số tài khoản đích: ");
                        var desAccId = input.nextLine();
                        System.out.println("Nhập số tiền cần chuyển: ");
                        var amount = input.nextLong();
                        var isSuccess
                                = bankTransfer(accounts, srcAccId, desAccId, amount);
                        if (isSuccess) {
                            System.out.println("==> Bạn đã chuyển khoản thành công <==");
                        } else {
                            System.out.println("==> Thất bại." +
                                    "\nSố tiền cần chuyển vượt quá số dư hiện thời." +
                                    "\nHoặc tài khoản không hợp lệ. <==");
                        }
                    } else {
                        System.out.println("==> Danh sách tài khoản rỗng <==");
                    }
                    break;
                case 6:
                    if (accounts.size() > 0) {
                        var name = "";
                        System.out.println("Nhập tên tài khoản cần tìm: ");
                        name = input.next(); // nhập mỗi tên
                        var result
                                = searchByName(accounts, name);
                        if (result.size() > 0) {
                            System.out.println("==> Tìm thấy " + result.size()
                                    + " kết quả <==");
                            showAccounts(result);
                        } else {
                            System.out.println(
                                    "==> Không tìm thấy tài khoản nào tên \""
                                            + name + "\" <==");
                        }
                    } else {
                        System.out.println("==> Danh sách tài khoản rỗng <==");
                    }
                    break;
                case 7:
                    if (accounts.size() > 0) {
                        System.out.println("Nhập mã tài khoản cần tìm: ");
                        var id = input.next(); // nhập mỗi tên
                        var result = searchByAccId(accounts, id);
                        if (result != null) {
                            System.out.println("==> Tìm thấy tài khoản mã "
                                    + id + " <==");
                            showAcc(result);
                        } else {
                            System.out.println(
                                    "==> Không tìm thấy tài khoản nào mã \""
                                            + id + "\" <==");
                        }
                    } else {
                        System.out.println("==> Danh sách tài khoản rỗng <==");
                    }
                    break;
                case 8:
                    if (accounts.size() > 0) {
                        System.out.println("Nhập số dư: ");
                        var ballance = input.nextLong(); // nhập mỗi tên
                        var result
                                = searchByAccBallance(accounts, ballance);
                        if (result.size() > 0) {
                            System.out.println("==> Tìm thấy "
                                    + result.size() + " tài khoản <==");
                            showAccounts(result);
                        } else {
                            System.out.println(
                                    "==> Không tìm thấy tài khoản nào <==");
                        }
                    } else {
                        System.out.println("==> Danh sách tài khoản rỗng <==");
                    }
                    break;
                case 9:
                    if (accounts.size() > 0) {
                        System.out.println("Nhập mã tài khoản cần xóa: ");
                        var id = input.nextLine();
                        var isDeleted = removeAccById(accounts, id);
                        if (isDeleted) {
                            System.out.println("==> Xóa thành công <==");
                        } else {
                            System.out.println("==> Mã tài khoản không đúng <==");
                        }
                    } else {
                        System.out.println("==> Danh sách tài khoản rỗng <==");
                    }
                    break;
                default:
                    System.out.println("==>Sai chức năng, vui lòng chọn lại <==");
                    break;
            }
        } while (choice != 0);
    }

    private static BankAccount createNewAcc(Scanner input) {
        System.out.println("Nhập mã tài khoản: ");
        var id = input.nextLine();
        System.out.println("Nhập số tài khoản: ");
        var number = input.nextLine();
        System.out.println("Nhập tên tài khoản: ");
        var owner = input.nextLine();
        System.out.println("Nhập loại tài khoản: ");
        var type = input.nextLine();
        System.out.println("Số dư: ");
        var amount = input.nextLong();
        input.nextLine(); // remove this line
        System.out.println("Tên ngân hàng phát hành: ");
        var bankName = input.nextLine();
        System.out.println("Ngày phát hành: ");
        var startDate = input.nextLine();
        System.out.println("Ngày hết hạn: ");
        var endDate = input.nextLine();

        BankAccount account = new BankAccount(id, number, owner, type,
                amount, bankName, startDate, endDate);
        return account;
    }

    /**
     * phương thức nạp tiền vào tài khoản. Để nạp tiền bước đầu tiên
     * phải đảm bảo tài khoản với mã cho trước đã tồn tại trong
     *
     * @param accounts danh sách tài khoản hiện có
     * @param id       mã tài khoản
     * @param amount   số tiền cần nạp
     * @return true nếu nạp tiền thành công và false otherwise
     */
    private static boolean deposit(ArrayList<BankAccount> accounts,
                                   String id, long amount) {
        var acc = searchByAccId(accounts, id);
        if (acc != null) {
            return acc.deposit(amount);
        }
        return false;
    }

    /**
     * phương thức thực hiện việc chuyển khoản ngân hàng
     *
     * @param accounts danh sách tài khoản đích
     * @param srcAccId tài khoản nguồn(tk chuyển)
     * @param desAccId tài khoản đích(tk nhận)
     * @param amount   lượng tiền cần chuyển
     * @return true nếu thực hiện giao dịch thành công và false otherwise
     */
    private static boolean bankTransfer(ArrayList<BankAccount> accounts,
                                        String srcAccId, String desAccId,
                                        long amount) {
        var srcAcc = searchByAccNumber(accounts, srcAccId);
        var desAcc = searchByAccNumber(accounts, desAccId);
        // nếu tài khoản đích và tài khoản nguồn tồn tại
        if (srcAcc != null && desAcc != null) {
            return srcAcc.bankTransfer(desAcc, amount);
        }
        return false;
    }

    /**
     * phương thức tìm tài khoản theo số tài khoản cho trước
     *
     * @param accounts danh sách tài khoản cần tìm
     * @param accNum   số tài khoản
     * @return tài khoản tìm đc và null otherwise
     */
    private static BankAccount searchByAccNumber(
            ArrayList<BankAccount> accounts, String accNum) {
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).getAccNumber().compareTo(accNum) == 0) {
                return accounts.get(i);
            }
        }
        return null;
    }

    /**
     * phương thức thực hiện việc rút tiền trong một tài khoản nào đó
     *
     * @param accounts danh sách tài khoản gốc
     * @param id       mã tài khoản cần rút tiền
     * @param amount   lượng tiền cần rút
     * @return kết quả thực hiện hành động
     */
    private static boolean withdraw(ArrayList<BankAccount> accounts,
                                    String id, long amount) {
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).getId().compareTo(id) == 0) {
                return accounts.get(i).withdraw(amount);
            }
        }
        return false;
    }

    /**
     * phương thức tìm tài khoản có số dư >= x
     *
     * @param accounts danh sách tài khoản gốc
     * @param ballance số dư cần tìm
     * @return danh sách kết quả
     */
    private static ArrayList<BankAccount> searchByAccBallance(
            ArrayList<BankAccount> accounts, long ballance) {
        ArrayList<BankAccount> result = new ArrayList<>();
        for (var acc : accounts) {
            if (acc.getBallance() >= ballance) {
                result.add(acc);
            }
        }
        return result;
    }

    /**
     * phương thức tìm kiếm tài khoản theo mã tài khoản
     * cho trước
     *
     * @param accounts danh sách gốc
     * @param id       mã tài khoản
     * @return kết quả
     */
    private static BankAccount searchByAccId(ArrayList<BankAccount>
                                                     accounts, String id) {
        for (int i = 0; i < accounts.size(); i++) {
            // nếu tìm thấy
            if (accounts.get(i).getId().compareToIgnoreCase(id) == 0) {
                return accounts.get(i); // trả về
            }
        }
        return null; // trả về không có gì
    }

    /**
     * phương thức tìm tài khoản theo tên chủ tài khoản
     * thực hiện tìm kiếm gần đúng với regex *name*
     * tức là nếu trong tên có từ khóa cần tìm thì trả về
     *
     * @param accounts danh sách cần tìm
     * @param name     tên cần tìm
     * @return danh sách kết quả
     */
    private static ArrayList<BankAccount> searchByName(ArrayList<BankAccount> accounts, String name) {
        ArrayList<BankAccount> res = new ArrayList<>();
        for (var acc : accounts) {
            // nếu trong tên tk có xuất hiện keyword cần tìm
            if (acc.getOwner().toLowerCase().matches(".*" + name + ".*")) {
                res.add(acc); // thêm vào kết quả tìm kiếm
            }
        }
        return res; // trả về danh sách kết quả tìm kiếm
    }

    /**
     * phương thức xóa tài khoản khỏi danh sách theo mã
     *
     * @param accounts danh sách tài khoản gốc
     * @param id       mã tài khoản cần xóa
     * @return true nếu xóa thành công và false nếu ngược lại
     */
    private static boolean removeAccById(ArrayList<BankAccount> accounts, String id) {
        for (int i = 0; i < accounts.size(); i++) {
            // nếu thấy tài khoản mã trùng khớp
            if (accounts.get(i).getId().compareTo(id) == 0) {
                accounts.remove(i); // xóa bỏ tài khoản này khỏi danh sách
                return true; // xóa thành công
            }
        }
        return false; // không xóa được
    }

    /**
     * phương thức hiển thị danh sách tài khoản theo hàng cột
     *
     * @param accounts danh sách tài khoản cần hiển thị
     */
    private static void showAccounts(ArrayList<BankAccount> accounts) {
        if (accounts.size() > 0) {
            System.out.println("==> Danh sách tài khoản <==");
            System.out.printf("%-12s%-15s%-25s%-15s%-15s%-20s%-15s%-15s\n",
                    "Mã TK", "Số TK", "Tên TK", "Loại TK", "Số dư",
                    "Ngân hàng", "Ngày PH", "Ngày KT");
            for (var acc : accounts) {
                showAcc(acc);
            }
        } else {
            System.out.println("==> Danh sách tài khoản rỗng <==");
        }
    }

    /**
     * phương thức hiển thị từng tài khoản
     *
     * @param acc tài khoản cần hiển thị
     */
    private static void showAcc(BankAccount acc) {
        System.out.printf("%-12s%-15s%-25s%-15s%-15d%-20s%-15s%-15s\n",
                acc.getId(), acc.getAccNumber(), acc.getOwner(),
                acc.getType(), acc.getBallance(), acc.getBankName(),
                acc.getStartDate(), acc.getEndDate());
    }
}
