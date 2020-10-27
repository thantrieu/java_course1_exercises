package net.braniumacademy.l47.ex3;

import java.util.Date;

/**
 * lớp mô tả thông tin sinh viên kế thừa từ người
 */
public class Student extends Person {
    private String studentId; // mã sinh viên
    private String schoolName; // tên trường
    private String className; // tên lớp
    private String major; // chuyên ngành
    private float avgGrade; // điểm trung bình

    public Student() {
    }

    public Student(String studentId, String schoolName,
                   String className, String major, float avgGrade) {
        this.studentId = studentId;
        this.schoolName = schoolName;
        this.className = className;
        this.major = major;
        this.avgGrade = avgGrade;
    }

    public Student(String id, String fullName, String address,
                   Date dateOfBirth, String email, String phoneNumber,
                   String studentId, String schoolName, String className,
                   String major, float avgGrade) {
        super(id, fullName, address, dateOfBirth, email, phoneNumber);
        this.studentId = studentId;
        this.schoolName = schoolName;
        this.className = className;
        this.major = major;
        this.avgGrade = avgGrade;
    }

    public void doHomework(String subject) {
        System.out.println("Sinh viên đang làm bài tập môn " + subject);
    }

    public void doExam(String subject) {
        System.out.println("Sinh viên đang làm bài thi môn " + subject);
    }

    public void payFee(float amount) {
        System.out.println("Sinh viên đóng học phí " + amount + "đ");
    }

    public void registerCredit(int credit) {
        System.out.println("Sinh viên đăng kí " + credit + " tín chỉ");
    }

    @Override
    public void eat(String food) {
        super.eat(food);
        System.out.println("Sinh viên đang ăn mì tôm");
    }

    @Override
    public void sleep() {
        super.sleep();
        System.out.println("Sinh viên đang ngủ trong giờ học");
    }

    @Override
    public void speak() {
        super.speak();
        System.out.println("Sinh viên đang nói chuyện trong lớp");
    }

    @Override
    public void relax(String thing) {
        super.relax(thing);
        System.out.println("Sinh viên đang chơi game");
    }

    @Override
    public void work() {
        super.work();
        System.out.println("Sinh viên đang làm thêm ở quán kem");
    }

    public final String getStudentId() {
        return studentId;
    }

    public final void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public final String getSchoolName() {
        return schoolName;
    }

    public final void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public final String getClassName() {
        return className;
    }

    public final void setClassName(String className) {
        this.className = className;
    }

    public final String getMajor() {
        return major;
    }

    public final void setMajor(String major) {
        this.major = major;
    }

    public final float getAvgGrade() {
        return avgGrade;
    }

    public final void setAvgGrade(float avgGrade) {
        this.avgGrade = avgGrade;
    }
}
