package net.braniumacademy.l47.ex4;

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

    public void eat(String food) {
        System.out.println("Người đang ăn " + food);
    }

    public void sleep() {
        System.out.println("Người đang ngủ");
    }

    public void speak() {
        System.out.println("Người đang nói chuyện");
    }

    public void relax(String thing) {
        System.out.println("Người đang giải trí bằng " + thing);
    }

    public void work() {
        System.out.println("Người đang làm việc");
    }

    public final String getId() {
        return id;
    }

    public final void setId(String id) {
        this.id = id;
    }

    /**
     * phương thức này trả về một fullname đầy đủ
     * ở dạng String
     *
     * @return một string tên-đệm-họ
     */
    public final String getFullNameString() {
        return fullName.last + " " + fullName.mid + fullName.first;
    }

    /**
     * phương thức lấy đối tượng của FullName
     *
     * @return đối tượng fullName
     */
    public final FullName getFullName() {
        return fullName;
    }

    public final void setFullName(String fullName) {
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

    public final String getAddress() {
        return address;
    }

    public final void setAddress(String address) {
        this.address = address;
    }

    public final Date getDateOfBirth() {
        return dateOfBirth;
    }

    public final void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public final String getEmail() {
        return email;
    }

    public final void setEmail(String email) {
        this.email = email;
    }

    public final String getPhoneNumber() {
        return phoneNumber;
    }

    public final void setPhoneNumber(String phoneNumber) {
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

        public final String getFirst() {
            return first;
        }

        public final void setFirst(String first) {
            this.first = first;
        }

        public final String getLast() {
            return last;
        }

        public final void setLast(String last) {
            this.last = last;
        }

        public final String getMid() {
            return mid;
        }

        public final void setMid(String mid) {
            this.mid = mid;
        }
    }
}
