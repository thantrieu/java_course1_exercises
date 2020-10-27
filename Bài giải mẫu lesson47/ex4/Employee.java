package net.braniumacademy.l47.ex4;

import java.util.Date;

public class Employee extends Person {
    private static int nextId = 1001;
    private String empId; // mã nhân viên
    private String duty; // chức vụ
    private float salary; // lương
    private float experience; // số năm kinh nghiệm
    private float workingDay; // số ngày làm việc
    private float totalSalary; // tổng lương
    private float bonus; // thưởng

    public Employee() {

    }

    public Employee(String empId, String duty, float salary,
                    float experience, float workingDay,
                    float totalSalary, float bonus) {
        setEmpId(empId);
        this.duty = duty;
        this.salary = salary;
        this.experience = experience;
        this.bonus = bonus;
        this.workingDay = workingDay;
        this.totalSalary = totalSalary;
    }

    public Employee(String id, String fullName, String address,
                    Date dateOfBirth, String email, String phoneNumber,
                    String empId, String duty, float salary,
                    float experience, float workingDay, float totalSalary, float bonus) {
        super(id, fullName, address, dateOfBirth, email, phoneNumber);
        setEmpId(empId);
        this.duty = duty;
        this.salary = salary;
        this.experience = experience;
        this.bonus = bonus;
        this.workingDay = workingDay;
        this.totalSalary = totalSalary;
    }

    @Override
    public void work() {
        System.out.println(getFullNameString()
                + " đang làm công việc của một " + duty);
    }

    @Override
    public void eat(String food) {
        System.out.println("Nhân viên " + getFullNameString()
                + " đang ăn " + food);
    }

    @Override
    public void sleep() {
        System.out.println("Nhân viên " + getFullNameString() + " đang ngủ");
    }

    @Override
    public void speak() {
        System.out.println("Nhân viên " + getFullNameString()
                + " đang nói chuyện");
    }

    @Override
    public void relax(String thing) {
        System.out.println("Nhân viên " + getFullNameString()
                + " đang giải trí bằng " + thing);
    }

    public void calculTotalSalary() { // tính tổng lương
        totalSalary = workingDay * salary / 22 + bonus;
    }

    public void calculBonus() { // tính thưởng
        if (workingDay >= 20) {
            var bonusDay = workingDay - 20;
            bonus = bonusDay * 0.5f * salary / 22;
        } else {
            bonus = 0;
        }
    }

    public void receiveSalary() { // nhận lương
        System.out.println("Mức lương chuyển khoản của nhân viên "
                + getFullNameString() + ": " + totalSalary);
    }

    public String receiBonus() {
        return "Nhận tiền mặt";
    }

    public void travel() {
        System.out.println("Nhân viên " + getFullNameString() + " đang đi du lịch");
    }

    public final float getWorkingDay() {
        return workingDay;
    }

    public final void setWorkingDay(float workingDay) {
        this.workingDay = workingDay;
    }

    public final float getTotalSalary() {
        return totalSalary;
    }

    public final void setTotalSalary(float totalSalary) {
        this.totalSalary = totalSalary;
    }

    public final float getBonus() {
        return bonus;
    }

    public final void setBonus(float bonus) {
        this.bonus = bonus;
    }

    public final String getEmpId() {
        return empId;
    }

    public final static void setNextId(int nextId) {
        Employee.nextId = nextId;
    }

    public final void setEmpId(String empId) {
        if (empId == null) { // nếu id rỗng chứng tỏ đối tượng cần được tạo mới
            this.empId = "EMP" + nextId;
            nextId++;
        } else {
            this.empId = empId;
        }
    }

    public final String getDuty() {
        return duty;
    }

    public final void setDuty(String duty) {
        this.duty = duty;
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
