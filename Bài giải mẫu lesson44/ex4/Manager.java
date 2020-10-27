package net.braniumacademy.l44.ex4;

import java.util.Date;

public class Manager extends Employee {
    private float bonus;
    private Date startDate;
    private Date endDate;

    public Manager() {

    }

    public Manager(float bonus, Date startDate, Date endDate) {
        this.bonus = bonus;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Manager(Employee employee, float bonus, Date startDate, Date endDate) {
        super(employee.getEmpId(), employee.getFullNameString(), employee.getAddress(),
                employee.getDateOfBirth(), employee.getEmail(), employee.getPhoneNumber(),
                employee.getEmpId(), employee.getDuty(), employee.getSalary(),
                employee.getExperience());
        this.bonus = bonus;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Manager(String empId, String duty, float salary, float experience,
                   float bonus, Date startDate, Date endDate) {
        super(empId, duty, salary, experience);
        this.bonus = bonus;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Manager(String id, String fullName, String address, Date dateOfBirth,
                   String email, String phoneNumber, String empId, String duty,
                   float salary, float experience, float bonus, Date startDate,
                   Date endDate) {
        super(id, fullName, address, dateOfBirth, email,
                phoneNumber, empId, duty, salary, experience);
        this.bonus = bonus;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public void meeting() {
        System.out.println("Giám đốc đang họp hội đồng quản trị");
    }

    public void signDocument() {
        System.out.println("Giám đốc đang kí văn bản");
    }

    public void meetPartner() {
        System.out.println("Giám đốc đang gặp gỡ đối tác");
    }

    public float getBonus() {
        return bonus;
    }

    public void setBonus(float bonus) {
        this.bonus = bonus;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
}
