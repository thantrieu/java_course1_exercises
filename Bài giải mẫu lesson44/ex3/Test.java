package net.braniumacademy.l44.ex3;

import jdk.swing.interop.SwingInterOpUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Test {
    public static void main(String[] args) throws ParseException {
        var format = "dd/MM/yyyy"; // date format
        var dateFormat = new SimpleDateFormat(format);
        Person person = new Person("09167875426", "Tony Stark",
                "107 Malibu", dateFormat.parse("27/10/2005"),
                "ironman@xmail.com", "0123456789");

        Instructor myInstructor = new Instructor("09167875426", "Tony Stark",
                "107 Malibu", dateFormat.parse("27/10/2005"),
                "ironman@xmail.com", "0123456789",
                "INS100265IRON", "Java", 990000, 5.5f);

        Student myStudent = new Student("09167875428", "Marri Lane",
                "Cầu Giấy, Hà Nội", dateFormat.parse("17/11/2006"),
                "mrlane@xmail.com", "0123456789",
                "STU100005", "PTIT", "D25CN5", "CNTT", 8.75f);

        GraduatedStudent graduatedStudent = new GraduatedStudent("09167875428", "Marri Lane",
                "Cầu Giấy, Hà Nội", dateFormat.parse("17/11/2006"),
                "mrlane@xmail.com", "0123456789",
                "STU100005", "PTIT", "D25CN5",
                "CNTT", 8.75f, 2022, 18, 4,
                1500000.25f, "Google Inc", "IT Engineer");

        // gọi phương thức hiển thị thông tin các đối tượng trên
        System.out.println("\n==== THÔNG TIN NGƯỜI ====");
        showPerson(person);
        System.out.println("\n==== THÔNG TIN GIẢNG VIÊN ====");
        showInstructor(myInstructor);
        System.out.println("\n==== THÔNG TIN SINH VIÊN ====");
        showStudent(myStudent);
        System.out.println("\n==== THÔNG TIN SINH VIÊN ĐÃ TỐT NGHIỆP ====");
        showGraduatedStudent(graduatedStudent);
    }

    /**
     * phương thức hiển thị thông tin sinh viên đã tốt nghiệp
     *
     * @param graduatedStudent
     */
    private static void showGraduatedStudent(GraduatedStudent graduatedStudent) {
        showStudent(graduatedStudent);
        System.out.println("Năm tốt nghiệp: " + graduatedStudent.getGraduatedYear());
        System.out.println("Số môn đã trượt: " + graduatedStudent.getFailed());
        System.out.println("Số tín chỉ học lại: " + graduatedStudent.getCreditRetake());
        System.out.println("Tên công ty: " + graduatedStudent.getCompayName());
        System.out.println("Lương khởi điểm: " + graduatedStudent.getStartingSalary());
        System.out.println("Chức vụ: " + graduatedStudent.getRole());
    }

    /**
     * phương thức hiển thị thông tin sinh viên
     *
     * @param student
     */
    private static void showStudent(Student student) {
        showPerson(student);
        System.out.println("Mã SV: " + student.getStudentId());
        System.out.println("Trường: " + student.getSchoolName());
        System.out.println("Lớp: " + student.getClassName());
        System.out.println("Chuyên ngành: " + student.getMajor());
        System.out.println("Điểm TB: " + student.getAvgGrade());
    }

    /**
     * phương thức hiển thị thông tin giảng viên
     *
     * @param instructor
     */
    private static void showInstructor(Instructor instructor) {
        showPerson(instructor);
        System.out.println("Mã GV: " + instructor.getInstructorId());
        System.out.println("Chuyên môn: " + instructor.getExpertise());
        System.out.println("Mức lương: " + instructor.getSalary());
        System.out.println("Số năm kinh nghiệm: " + instructor.getExperience());
    }

    /**
     * phương thức hiển thị thông tin về người
     *
     * @param person
     */
    private static void showPerson(Person person) {
        var format = "dd/MM/yyyy"; // date format
        var dateFormat = new SimpleDateFormat(format);
        System.out.println("Số CMT/Căn cước: " + person.getId());
        System.out.println("Họ và tên: " + person.getFullName());
        System.out.println("Địa chỉ: " + person.getAddress());
        System.out.println("Email: " + person.getEmail());
        System.out.println("SĐT: " + person.getPhoneNumber());
        System.out.println("Ngày sinh: "
                + dateFormat.format(person.getDateOfBirth()));
    }

}
