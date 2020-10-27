package net.braniumacademy.l44.ex3;

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

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
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

    public float getAvgGrade() {
        return avgGrade;
    }

    public void setAvgGrade(float avgGrade) {
        this.avgGrade = avgGrade;
    }
}
