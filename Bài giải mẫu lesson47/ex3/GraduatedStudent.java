package net.braniumacademy.l47.ex3;

import java.util.Date;

/**
 * lớp mô tả thông tin sinh viên đã tốt nghiệp
 */
public class GraduatedStudent extends Student {
    private int graduatedYear; // năm tốt nghiệp
    private int creditRetake; // số tín chỉ học lại
    private int failed; // số môn đã trượt
    private float startingSalary; // mức lương khởi điểm
    private String compayName; // tên cty
    private String role; // chức vụ

    public GraduatedStudent() {
    }

    public GraduatedStudent(int graduatedYear, int creditRetake, int failed,
                            float startingSalary, String compayName, String role) {
        this.graduatedYear = graduatedYear;
        this.creditRetake = creditRetake;
        this.failed = failed;
        this.startingSalary = startingSalary;
        this.compayName = compayName;
        this.role = role;
    }

    public GraduatedStudent(String studentId, String schoolName,
                            String className, String major, float avgGrade,
                            int graduatedYear, int creditRetake, int failed,
                            float startingSalary, String compayName, String role) {
        super(studentId, schoolName, className, major, avgGrade);
        this.graduatedYear = graduatedYear;
        this.creditRetake = creditRetake;
        this.failed = failed;
        this.startingSalary = startingSalary;
        this.compayName = compayName;
        this.role = role;
    }

    public GraduatedStudent(String id, String fullName, String address,
                            Date dateOfBirth, String email, String phoneNumber,
                            String studentId, String schoolName,
                            String className, String major, float avgGrade,
                            int graduatedYear, int creditRetake, int failed,
                            float startingSalary, String compayName, String role) {
        super(id, fullName, address, dateOfBirth, email, phoneNumber,
                studentId, schoolName, className, major, avgGrade);
        this.graduatedYear = graduatedYear;
        this.creditRetake = creditRetake;
        this.failed = failed;
        this.startingSalary = startingSalary;
        this.compayName = compayName;
        this.role = role;
    }

    public void visitOldSchool() {
        System.out.println("Cựu sinh viên thăm trường cũ");
    }

    public void registerPostgraduate(String subject) {
        System.out.println("Cựu sinh viên đang đăng kí học cao học môn "
                + subject);
    }

    public void manageWork(String work) {
        System.out.println("Cựu sinh viên đang quản lý công việc: " + work);
    }

    @Override
    public void doHomework(String subject) {
        System.out.println("Sinh viên đã tốt nghiệp không có bài tập về nhà");
    }

    @Override
    public void doExam(String subject) {
        System.out.println("Sinh viên đã tốt nghiệp không phải làm bài kiểm tra");
    }

    @Override
    public void payFee(float amount) {
        System.out.println("Sinh viên đã tốt nghiệp không phải nộp học phí");
    }

    @Override
    public void registerCredit(int credit) {
        System.out.println("Cựu sinh viên không phải đăng kí tín chỉ");
    }

    @Override
    public void eat(String food) {
        super.eat(food);
        System.out.println("Cựu sinh viên đang ăn tôm hùm luộc");
    }

    @Override
    public void sleep() {
        super.sleep();
        System.out.println("Cựu sinh viên đang ngủ trong khách sạn");
    }

    @Override
    public void speak() {
        super.speak();
        System.out.println("Cựu sinh viên đang bàn luận chuyện công việc");
    }

    @Override
    public void relax(String thing) {
        super.relax(thing);
        System.out.println("Cựu sinh viên đang nghỉ trưa");
    }

    @Override
    public void work() {
        super.work();
        System.out.println("Cựu sinh viên đang làm việc ngày đêm");
    }

    public final int getGraduatedYear() {
        return graduatedYear;
    }

    public final void setGraduatedYear(int graduatedYear) {
        this.graduatedYear = graduatedYear;
    }

    public final int getCreditRetake() {
        return creditRetake;
    }

    public final void setCreditRetake(int creditRetake) {
        this.creditRetake = creditRetake;
    }

    public final int getFailed() {
        return failed;
    }

    public final void setFiled(int failed) {
        this.failed = failed;
    }

    public final float getStartingSalary() {
        return startingSalary;
    }

    public final void setStartingSalary(float startingSalary) {
        this.startingSalary = startingSalary;
    }

    public final String getCompayName() {
        return compayName;
    }

    public final void setCompayName(String compayName) {
        this.compayName = compayName;
    }

    public final String getRole() {
        return role;
    }

    public final void setRole(String role) {
        this.role = role;
    }
}
