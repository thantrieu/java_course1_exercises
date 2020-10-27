package net.braniumacademy.l47.ex4;

import java.util.Date;

public class Manager extends Employee {
    private Date startDate;
    private Date endDate;

    public Manager() {

    }

    public Manager(Employee emp, Date startDate, Date endDate) {
        super(emp.getId(), emp.getFullNameString(), emp.getAddress(),
                emp.getDateOfBirth(), emp.getEmail(), emp.getPhoneNumber(),
                emp.getEmpId(), emp.getDuty(), emp.getSalary(),
                emp.getExperience(), emp.getWorkingDay(),
                emp.getTotalSalary(), emp.getBonus());
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Manager(String empId, String duty, float salary,
                   float experience, float workingDay, float totalSalary,
                   float bonus, Date startDate, Date endDate) {
        super(empId, duty, salary, experience, workingDay, totalSalary, bonus);
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Manager(String id, String fullName, String address,
                   Date dateOfBirth, String email, String phoneNumber,
                   String empId, String duty, float salary, float experience,
                   float workingDay, float totalSalary, float bonus,
                   Date startDate, Date endDate) {
        super(id, fullName, address, dateOfBirth, email,
                phoneNumber, empId, duty, salary, experience,
                workingDay, totalSalary, bonus);
        this.startDate = startDate;
        this.endDate = endDate;
    }

    @Override
    public void work() {
        System.out.println("Giám đốc đang làm việc trong phòng riêng");
    }

    @Override
    public void eat(String food) {
        System.out.println("Giám đốc đang ăn món " + food);
    }

    @Override
    public void sleep() {
        System.out.println("Giám đốc đang ngủ khò khò");
    }

    @Override
    public void speak() {
        System.out.println("Giám đốc đang nói chuyện với nhân viên");
    }

    @Override
    public void relax(String thing) {
        System.out.println("Giám đốc đang giải trí bằng " + thing);
    }

    @Override
    public void calculBonus() { // thưởng của giám đốc
        if (getWorkingDay() >= 22) { // nếu đi làm chăm chỉ
            setBonus(getTotalSalary() * 1.25f);
        } else { // ngược lại
            setBonus(0);
        }
    }

    @Override
    public void receiveSalary() {
        System.out.println("Giám đốc nhận mức lương: " + getTotalSalary());
    }

    @Override
    public String receiBonus() {
       return "Nhận cổ phiếu";
    }

    @Override
    public void travel() {
        System.out.println("Giám đốc đang đi du lịch");
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
