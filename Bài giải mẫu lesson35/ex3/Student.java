package net.braniumacademy.exercises_lesson35.ex3;

/**
 * Lớp mô tả thông tin sinh viên
 */
public class Student {
    private String id;          // mã sinh viên
    private FullName fullName;  // họ và tên
    private String address;     // địa chỉ
    private String email;       // email
    private String gender;      // giới tính
    private String className;   // lớp
    private String major;       // chuyên ngành(khoa)
    private String phoneNumber; // số điện thoại

    public Student() {
        id = "";
        address = "";
        email = "";
        gender = "";
        className = "";
        major = "";
        fullName = new FullName();
    }

    public Student(String id) {
        this.id = id;
    }

    public Student(String id, String fullName) {
        this(id);
        setFullName(fullName);
    }

    public Student(String id, String fullName, String address) {
        this(id, fullName);
        this.address = address;
    }

    public Student(String id, String fullName,
                   String address, String email) {
        this(id, fullName, address);
        this.email = email;
    }

    public Student(String id, String fullName,
                   String address, String email, String gender) {
        this(id, fullName, address, email);
        this.gender = gender;
    }

    public Student(String id, String fullName,
                   String address, String email,
                   String gender, String className) {
        this(id, fullName, address, email, gender);
        this.className = className;
    }

    public Student(String id, String fullName,
                   String address, String email,
                   String gender, String className, String major) {
        this(id, fullName, address, email, gender, className);
        this.major = major;
    }

    public Student(String id, String fullName,
                   String address, String email,
                   String gender, String className,
                   String major, String phoneNumber) {
        this(id, fullName, address, email, gender, className, major);
        this.phoneNumber = phoneNumber;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName.last + " " + fullName.mid + " " + fullName.first;
    }

    /**
     * phương thức thiết lập họ, đệm tên:
     * tách các từ trong tên ra, từ đầu tiên là họ
     * từ cuối cùng là tên, phần còn lại là đệm
     *
     * @param fullName chuỗi kí tự chứa họ và tên đầy đủ
     */
    public void setFullName(String fullName) {
        var words = fullName.split(" ");
        this.fullName.last = words[0];
        this.fullName.first = words[words.length - 1];
        this.fullName.mid = "";
        for (int i = 1; i < words.length - 1; i++) {
            this.fullName.mid += words[i];
        }
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getFirst() {
        return fullName.first;
    }

    public String getLast() {
        return fullName.last;
    }

    public String getMid() {
        return fullName.mid;
    }

    /**
     * lớp inner class chứa thông tin họ và tên
     */
    class FullName {
        private String first;   // tên
        private String last;    // họ
        private String mid;     // đệm
    }
}
