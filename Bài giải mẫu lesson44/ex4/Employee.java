package net.braniumacademy.l44.ex4;

import java.util.Date;

public class Employee extends Person {
    private static int nextId = 1001;
    private String empId; // mã nhân viên
    private String duty; // chức vụ
    private float salary; // lương
    private float experience; // số năm kinh nghiệm

    public Employee() {

    }

    public Employee(String empId, String duty, float salary, float experience) {
        setEmpId(empId);
        this.duty = duty;
        this.salary = salary;
        this.experience = experience;
    }

    public Employee(String id, String fullName, String address,
                    Date dateOfBirth, String email, String phoneNumber,
                    String empId, String duty, float salary, float experience) {
        super(id, fullName, address, dateOfBirth, email, phoneNumber);
        setEmpId(empId);
        this.duty = duty;
        this.salary = salary;
        this.experience = experience;
    }

    public void work() {
        System.out.println(getFullName() + " đang làm công việc của một " + duty);
    }

    public void rest() {
        System.out.println(getFullName() + " đang nghỉ ngơi");
    }

    public void receiveSalary() {
        System.out.println("Mức lương của nhân viên " + getFullName() + ": " + salary);
    }

    public void travel() {
        System.out.println(getFullName() + " đang đi du lịch");
    }

    public String getEmpId() {
        return empId;
    }

    public static void setNextId(int nextId) {
        Employee.nextId = nextId;
    }

    public void setEmpId(String empId) {
        if (empId == null) { // nếu id rỗng chứng tỏ đối tượng cần được tạo mới
            this.empId = "EMP" + nextId;
            nextId++;
        } else {
            this.empId = empId;
        }
    }

    public String getDuty() {
        return duty;
    }

    public void setDuty(String duty) {
        this.duty = duty;
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
