package net.braniumacademy.l44.ex3;

import java.util.Date;

/**
 * lớp mô tả thông tin giảng viên
 */
public class Instructor extends Person {
    private String instructorId; // mã giảng viên
    private String expertise; // chuyên môn
    private float salary; // mức lương
    private float experience; // số năm kinh nghiệm

    public Instructor() {
    }

    public Instructor(String id, String fullName, String address,
                      Date dateOfBirth, String email, String phoneNumber,
                      String instructorId, String expertise, float salary,
                      float experience) {
        super(id, fullName, address, dateOfBirth, email, phoneNumber);
        this.instructorId = instructorId;
        this.expertise = expertise;
        this.salary = salary;
        this.experience = experience;
    }

    public String getInstructorId() {
        return instructorId;
    }

    public void setInstructorId(String instructorId) {
        this.instructorId = instructorId;
    }

    public String getExpertise() {
        return expertise;
    }

    public void setExpertise(String expertise) {
        this.expertise = expertise;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public float getExperience() {
        return experience;
    }

    public void setExperience(float experience) {
        this.experience = experience;
    }
}
