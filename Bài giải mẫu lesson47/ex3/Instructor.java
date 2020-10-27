package net.braniumacademy.l47.ex3;

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

    // chấm bài
    public void mark(String subject) {
        System.out.println("Giảng viên đang chấm bài môn " + subject);
    }

    // soạn bài
    public void prepareLesson(String subject) {
        System.out.println("Giảng viên đang soạn bài môn " + subject);
    }

    // tham gia họp
    public void joinMeeting() {
        System.out.println("Giảng viên đang họp");
    }

    // ra đề thi
    public void createExam(String subject) {
        System.out.println("Giảng viên đang ra đề thi môn " + subject);
    }

    // ghi đè các phương thức của lớp cha
    @Override
    public void eat(String food) {
        super.eat(food);
        System.out.println("Giảng viên đang ăn trưa");
    }

    @Override
    public void sleep() {
        super.sleep();
        System.out.println("Giảng viên đang ngủ nướng");
    }

    @Override
    public void speak() {
        super.speak();
        System.out.println("Giảng viên đang nói chuyện với các đồng nghiệp");
    }

    @Override
    public void relax(String thing) {
        super.relax(thing);
        System.out.println("Giảng viên đang relax giữa trưa");
    }

    @Override
    public void work() {
        super.work();
        System.out.println("Giảng viên đang giảng dạy trên lớp");
    }

    public final String getInstructorId() {
        return instructorId;
    }

    public final void setInstructorId(String instructorId) {
        this.instructorId = instructorId;
    }

    public final String getExpertise() {
        return expertise;
    }

    public final void setExpertise(String expertise) {
        this.expertise = expertise;
    }

    public final float getSalary() {
        return salary;
    }

    public final void setSalary(float salary) {
        this.salary = salary;
    }

    public final float getExperience() {
        return experience;
    }

    public final void setExperience(float experience) {
        this.experience = experience;
    }
}
