package net.braniumacademy.l44.ex3;

import java.util.Date;

/**
 * lớp mô tả thông tin người
 */
public class Person {
    private String id; // số chứng minh thư/căn cước
    private FullName fullName; // họ tên đầy đủ
    private String address; // địa chỉ
    private Date dateOfBirth; // ngày tháng năm sinh
    private String email; // email
    private String phoneNumber; // số điện thoại

    public Person() {
    }

    public Person(String id, String fullName, String address,
                  Date dateOfBirth, String email, String phoneNumber) {
        this.id = id;
        this.setFullName(fullName);
        this.address = address;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName.first + " " + fullName.mid + fullName.last;
    }

    public void setFullName(String fullName) {
        this.fullName = new FullName();
        if (fullName != null && fullName.length() > 0) {
            var words = fullName.split("\\s+"); // tách tại vị trí có dấu cách
            this.fullName.first = words[words.length - 1];
            this.fullName.last = words[0];
            this.fullName.mid = "";
            for (int i = 1; i < words.length - 1; i++) {
                this.fullName.mid += words[i] + " ";
            }
        }
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
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

    class FullName {
        private String first;
        private String last;
        private String mid;

        public FullName() {
        }

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
