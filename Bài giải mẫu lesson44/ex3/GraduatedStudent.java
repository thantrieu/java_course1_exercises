package net.braniumacademy.l44.ex3;

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

    public int getGraduatedYear() {
        return graduatedYear;
    }

    public void setGraduatedYear(int graduatedYear) {
        this.graduatedYear = graduatedYear;
    }

    public int getCreditRetake() {
        return creditRetake;
    }

    public void setCreditRetake(int creditRetake) {
        this.creditRetake = creditRetake;
    }

    public int getFailed() {
        return failed;
    }

    public void setFiled(int failed) {
        this.failed = failed;
    }

    public float getStartingSalary() {
        return startingSalary;
    }

    public void setStartingSalary(float startingSalary) {
        this.startingSalary = startingSalary;
    }

    public String getCompayName() {
        return compayName;
    }

    public void setCompayName(String compayName) {
        this.compayName = compayName;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
