package practice_interface;

import java.util.Objects;

/**
 * Thông tin tài khoản gồm mã tài khoản, username,
 * mật khẩu, họ, đệm, tên, địa chỉ, email, số điện thoại
 */
public class Account {
    private String id;
    private String username;
    private String password;
    private FullName fullName;
    private String address;
    private String email;
    private String phoneNumber;

    public Account() {
    }

    public Account(String id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public Account(String id, String username, String password, 
                   FullName fullName, String address, String email, 
                   String phoneNumber) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.fullName = fullName;
        this.address = address;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public FullName getFullName() {
        return fullName;
    }

    public void setFullName(FullName fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public boolean equals(Object otherObject) {
        if (this == otherObject) return true;
        if (otherObject == null
                || getClass() != otherObject.getClass()) return false;
        Account other = (Account) otherObject;
        return Objects.equals(username, other.username) &&
                Objects.equals(password, other.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, password);
    }

    class FullName {
        private String first;
        private String last;
        private String mid;

        public FullName(String first, String last, String mid) {
            this.first = first;
            this.last = last;
            this.mid = mid;
        }

        public String getFirst() {
            return first;
        }

        public void setFirst(String first) {
            this.first = first;
        }

        public String getLast() {
            return last;
        }

        public void setLast(String last) {
            this.last = last;
        }

        public String getMid() {
            return mid;
        }

        public void setMid(String mid) {
            this.mid = mid;
        }
    }
}
