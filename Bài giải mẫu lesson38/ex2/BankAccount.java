package net.braniumacademy.ex2;

import java.util.Date;

/**
 * lớp này mô tả thông tin tài khoản ngân hàng của Wakanda
 *
 * @author Branium Academy
 * @website: https://braniumacademy.net
 */
public class BankAccount {
    // các thuộc tính:
    private static int nextId = 100001;
    private String id;          // mã tài khoản
    private String accNumber;    // số tài khoản
    private String owner;        // chủ tài khoản
    private String type;         // loại tài khoản(vd: tiết kiệm)
    private long ballance;       // số dư
    private String bankName;     // tên ngân hàng
    private Date startDate;    // ngày phát hành
    private Date endDate;      // ngày hết hạn

    // phương thức khởi tạo mặc định
    public BankAccount() {
        setId(null);
        accNumber = "";
        owner = "";
        type = "";
        ballance = 0;
        bankName = "";
        startDate = new Date();
        endDate = new Date();
    }

    // các constructor:
    public BankAccount(String id) {
        setId(id);
    }

    public BankAccount(String id, String accNumber) {
        this(id);
        this.accNumber = accNumber;
    }

    public BankAccount(String id, String accNumber, String owner) {
        this(id, accNumber);
        this.owner = owner;
    }

    public BankAccount(String id, String accNumber,
                       String owner, String type) {
        this(id, accNumber, owner);
        this.type = type;
    }

    public BankAccount(String id, String accNumber,
                       String owner, String type, long ballance) {
        this(id, accNumber, owner, type);
        this.ballance = ballance;
    }

    public BankAccount(String id, String accNumber,
                       String owner, String type,
                       long ballance, String bankName) {
        this(id, accNumber, owner, type, ballance);
        this.bankName = bankName;
    }

    public BankAccount(String id, String accNumber,
                       String owner, String type,
                       long ballance, String bankName, Date startDate) {
        this(id, accNumber, owner, type, ballance, bankName);
        this.startDate = startDate;
    }

    public BankAccount(String id, String accNumber,
                       String owner, String type,
                       long ballance, String bankName,
                       Date startDate, Date endDate) {
        this(id, accNumber, owner, type, ballance, bankName, startDate);
        this.endDate = endDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        if (id != null) {
            this.id = id;
        } else {
            this.id = "WAB" + nextId;
            nextId++;
        }
    }

    public static void setNextId(int nextId) {
        BankAccount.nextId = nextId;
    }

    public String getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(String accNumber) {
        this.accNumber = accNumber;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public long getBallance() {
        return ballance;
    }

    public void setBallance(long ballance) {
        this.ballance = ballance;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    // nạp tiền vào tk ngân hàng
    public boolean deposit(long amount) {
        if (amount > 0) {
            ballance += amount;
            return true; // gửi tiền vào tk thành công
        }
        return false; // gửi tiền vào tài khoản thất bại
    }

    // rút tiền
    public boolean withdraw(long amount) {
        if (amount > 0 && amount < ballance) {
            ballance -= amount;
            return true;
        }
        return false; // rút thất bại
    }

    // chuyển khoản từ tài khoản nguồn(hiện tại) sang tài khoản đích(tk nhận)
    public boolean bankTransfer(BankAccount other, long amount) {
        // nếu số tiền cần chuyển hợp lệ
        if (0 < amount && amount < ballance) {
            ballance -= amount; // giảm số tiền ở Tk hiện thời
            other.ballance += amount; // tăng số tiền ở tk đích
            return true; // chuyển khoản thành công
        }
        return false; // chuyển khoản thất bại
    }

    // kiểm tra số dư:
    public void checkAccBallance() {
        System.out.println("Số dư của bạn hiện tại là: " + ballance);
    }

    // thanh toán các dịch vụ khác
    public boolean pay(String service, long amount) {
        if (!service.isEmpty() && amount > 0 && amount < ballance) {
            ballance -= amount;
            return true; // thanh toán thành công
        }
        return false; // thanh toán thất bại
    }
}
