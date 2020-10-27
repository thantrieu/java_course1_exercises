package net.braniumacademy.exercises_lesson35.ex3.run;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * lớp thực thi các thao tác liên quan đến lớp Subject, Student, Course...
 *
 * @author Branium Academy
 * @website: https://braniumacademy.net
 */

public class L35Ex3 {
    public static void main(String[] args) {
        int choice = 0;
        ArrayList<Subject> subjects = new ArrayList<>();
        ArrayList<Student> students = new ArrayList<>();
        ArrayList<Course> courses = new ArrayList<>();

        var input = new Scanner(System.in);
        do {
            System.out.println("========================= MENU =========================");
            System.out.println("1. Thêm mới 1 môn học vào danh sách môn học");
            System.out.println("2. Thêm mới một sinh viên vào danh sách sinh viên");
            System.out.println("3. Thêm mới một lớp học vào danh sách lớp học");
            System.out.println("4. Thêm mới một sinh viên vào lớp học nào đó");
            System.out.println("5. Hiển thị danh sách môn học");
            System.out.println("6. Hiển thị danh sách sinh viên");
            System.out.println("7. Hiển thị danh sách lớp học");
            System.out.println("8. Nhập và tính điểm trung bình cho từng sv trong lớp");
            System.out.println("9. Xét học lực cho từng sinh viên trong lớp");
            System.out.println("10. Tìm xem sinh viên có mã s có trong lớp học nào không");
            System.out.println("0. Thoát chương trình");
            System.out.println("Xin mời bạn chọn: ");
            choice = input.nextInt(); // nhập vào lựa chọn
            input.nextLine(); // đọc bỏ dòng thừa
            switch (choice) {
                case 0:
                    System.out.println("==> CẢM ƠN BẠN ĐÃ SỬ DỤNG DỊCH VỤ <==");
                    break;
                case 1:
                    var s = createNewSubject(input);
                    subjects.add(s);
                    System.out.println("==> Thêm môn học thành công! <==");
                    break;
                case 2:
                    var student = createNewStudent(input);
                    students.add(student);
                    System.out.println("==> Thêm sinh viên thành công <==");
                    break;
                case 3:
                    if (subjects.size() > 0) {
                        var course = createNewCourse(input, subjects);
                        if (course != null) {
                            courses.add(course);
                            System.out.println("==> Thêm lớp học thành công <==");
                        } else {
                            System.out.println("==> Tạo lớp học thất bại <==");
                        }
                    } else {
                        System.out.println("==> Danh sách môn học rỗng <==");
                    }
                    break;
                case 4:
                    if (courses.size() > 0 && students.size() > 0) {
                        var isSuccess = addStudentToCouse(courses, students, input);
                        if (isSuccess) {
                            System.out.println("==> Thêm sinh viên vào lớp học thành công! <==");
                        } else {
                            System.out.println("==> Thêm sinh viên vào lớp học thất bại <==");
                        }
                    } else {
                        System.out.println("==> Danh sách lớp học hoặc" +
                                " danh sách sinh viên rỗng <==");
                    }
                    break;
                case 5:
                    showSubjects(subjects);
                    break;
                case 6:
                    showStudents(students);
                    break;
                case 7:
                    showCourses(courses);
                    break;
                case 8:
                    if (courses.size() > 0) {
                        addGrades(courses, input);
                    } else {
                        System.out.println("==> Danh sách lớp học rỗng <==");
                    }
                    break;
                case 9:
                    if (courses.size() > 0) {
                        calculCapacity(courses);
                    } else {
                        System.out.println("==> Danh sách lớp học rỗng <==");
                    }
                    break;
                case 10:
                    if (courses.size() > 0) {
                        System.out.println("Nhập mã sinh viên cần tìm: ");
                        var studentId = input.nextLine();
                        var searchedCourse = findStudentInCourse(courses, studentId);
                        if (searchedCourse != null) {
                            System.out.println("==> Tìm thấy sinh viên mã \""
                                    + studentId + "\" trong lớp học môn "
                                    + searchedCourse.getSubject().getName() + " <==");
                        } else {
                            System.out.println("==> Không tìm thấy sinh viên mã \""
                                    + studentId + "\" trong lớp học nào <==");
                        }
                    } else {
                        System.out.println("==> Danh sách lớp học rỗng <==");
                    }
                    break;
                default:
                    System.out.println("==> Sai chức năng, vui lòng chọn lại! <==");
                    break;
            }
        } while (choice != 0);
    }

    private static void addGrades(ArrayList<Course> courses, Scanner input) {
        System.out.println("Nhập mã lớp học: ");
        var gradeId = input.nextLine();
        var course = findCourseById(courses, gradeId);
        if (course != null) {
            // hiện danh sách sinh viên
            showStudentInCourse(course.getTranscriptOfStudents());

            System.out.println("Nhập mã sinh viên: ");
            var studentId = input.nextLine();
            var isFound = false;
            // tìm mã sinh viên trong lớp:
            for (int i = 0; i < course.getTranscriptOfStudents().size(); i++) {
                var item = course.getTranscriptOfStudents().get(i);
                if (item.getStudent().getId().compareTo(studentId) == 0) {
                    isFound = true;
                    break;
                }
            }
            if (isFound) {
                var tran = createTranscript();
                course.setTranscriptOfStudents(new Student(studentId), tran);
                System.out.println("==> Cập nhật bảng điểm thành công <==");
            } else {
                System.out.println("==> Sinh viên mã " + studentId
                        + " không tồn tại trong lớp <==");
            }
        } else {
            System.out.println("==> Mã lớp không tồn tại. Vui lòng kiểm tra lại <==");
        }
        // nhập abc còn lại
    }

    /**
     * phương thức dùng để hiển thị danh sách sinh viên trong khóa học ra
     * cho tiện theo dõi
     *
     * @param transcriptOfStudents danh sách các sinh viên và bảng điểm
     *                             tương ứng của nó
     */
    private static void showStudentInCourse(
            ArrayList<Course.TranscriptOfStudent> transcriptOfStudents) {
        System.out.println("==> Các sinh viên đã có trong lớp học: <==");
        System.out.printf("%-12s%-22s%-20s%-20s%-12s%-20s%-15s%-15s\n",
                "Mã SV", "Họ và tên", "Địa chỉ", "Email", "Giới tính", "Số ĐT",
                "Lớp", "Khoa");
        for (var item : transcriptOfStudents) {
            showAStudent(item.getStudent());
        }
    }

    /**
     * phương thức dùng để thiết lập các điểm của các hệ số 1 2 3
     * và tính điểm TB cho từng sinh viên
     *
     * @return bảng điểm với các đầu điểm hệ số 1, 2, 3
     */
    private static Transcript createTranscript() {
        Transcript tran = new Transcript();
        var input = new Scanner(System.in);
        System.out.println("Điểm hệ số 1: ");
        var g1 = input.nextFloat();
        System.out.println("Điểm hệ số 2: ");
        var g2 = input.nextFloat();
        System.out.println("Điểm hệ số 3: ");
        var g3 = input.nextFloat();

        tran.setGrade1(g1);
        tran.setGrade2(g2);
        tran.setGrade3(g3);

        tran.calculAvgGrade(); // tính điểm TB
        return tran;
    }

    /**
     * phương thức dùng để thêm một sinh viên vào lớp học
     * được chỉ định theo mã của chúng
     *
     * @param courses  danh sách lớp học
     * @param students danh sách sinh viên
     * @param input    đối tượng của lớp Scanner
     * @return true nếu thêm thành công và false otherwise
     */
    private static boolean addStudentToCouse(ArrayList<Course> courses,
                                             ArrayList<Student> students,
                                             Scanner input) {
        System.out.println("Nhập mã lớp học: ");
        var courseId = input.nextLine();
        var course = findCourseById(courses, courseId);
        if (course == null) {
            System.out.println("==> Mã lớp không tồn tại <==");
            return false;
        }
        // hiện danh sách sinh viên
        showStudentInCourse(course.getTranscriptOfStudents());

        System.out.println("Nhập mã sinh viên: ");
        var studentId = input.nextLine();
        var student = findStudentById(students, studentId);

        if (student != null) {
            course.addStudentToCourse(student);
            return true;
        } else {
            System.out.println("==> Mã sinh viên không tồn tại <==");
        }
        return false;
    }

    /**
     * phương thức tìm và trả về lớp học trong danh sách theo mã
     *
     * @param courses  danh sách lớp học
     * @param courseId mã lớp học cần tìm
     * @return lớp học tìm đc hoặc null nếu không tìm thấy
     */
    private static Course findCourseById(ArrayList<Course> courses, String courseId) {
        for (int i = 0; i < courses.size(); i++) {
            if (courses.get(i).getId().compareTo(courseId) == 0) {
                return courses.get(i);
            }
        }
        return null;
    }

    /**
     * phương thức hiển thị thông tin của một sinh viên
     *
     * @param student sinh viên cần hiển thị thông tin
     */
    private static void showAStudent(Student student) {
        System.out.printf("%-12s%-22s%-20s%-20s%-12s%-20s%-15s%-15s\n",
                student.getId(), student.getFullName(), student.getAddress(),
                student.getEmail(), student.getGender(), student.getPhoneNumber(),
                student.getClassName(), student.getMajor());
    }

    /**
     * phương thức tìm sinh viên có trong danh sách lớp không
     *
     * @param courses   danh sách lớp
     * @param studentId mã sinh viên cần tìm
     * @return trả về lớp học mà sinh viên có mặt hoặc null nếu
     * không tìm thấy
     */
    private static Course findStudentInCourse(ArrayList<Course> courses, String studentId) {
        for (var course : courses) {
            for (var item : course.getTranscriptOfStudents()) {
                if (item.getStudent().getId().compareTo(studentId) == 0) {
                    return course;
                }
            }
        }
        return null;
    }

    /**
     * phương thức này dùng để xét học lực cho các sinh viên trong lớp
     *
     * @param courses danh sách lớp của từng sinh viên
     */
    private static void calculCapacity(ArrayList<Course> courses) {
        System.out.println("Mã khóa học cần xét học lực: ");
        var input = new Scanner(System.in);
        var id = input.nextLine();
        var course = findCourseById(courses, id);
        if (course != null) {
            if (course.getTranscriptOfStudents().size() > 0) {
                boolean isSuccess = true;
                for (int j = 0; j < course.getTranscriptOfStudents().size(); j++) {
                    if (course.getTranscriptOfStudents().get(j).getTranscript() != null) {
                        course.getTranscriptOfStudents().get(j).getTranscript().calculCapacity();
                    } else {
                        System.out.println("==> Chưa nhập bảng điểm <==");
                        isSuccess = false;
                        break;
                    }
                }
                if (isSuccess) {
                    System.out.println("==> Xét học lực thành công! <==");
                } else {
                    System.out.println("==> Xét học lực thất bại! <==");
                }
            } else {
                System.out.println("==> Lớp học này chưa có sinh viên nào! <==");
            }
        } else {
            System.out.println("==> Lớp học có mã cần tìm không tồn tại <==");
        }
    }

    /**
     * phương thức này dùng để hiển thị danh sách các lớp học
     *
     * @param courses danh sách các lớp học
     */
    private static void showCourses(ArrayList<Course> courses) {
        System.out.println("==> Danh sách các lớp học <==");
        System.out.printf("%-12s%-25s%-15s%-15s%-15s\n",
                "Mã lớp", "Tên lớp", "Phòng học", "Giờ học", "Môn học");
        for (var course : courses) {
            showACourse(course);
        }
    }

    /**
     * phương thức dùng để hiển thị thông tin một lớp học
     * chưa bao gồm danh sách sinh viên. Chức năng hiển thị
     * danh sách sinh viên trong môn học sẽ được
     * cập nhật dần trong các phiên bản tiếp theo để giảm tải.
     *
     * @param course
     */
    private static void showACourse(Course course) {
        System.out.printf("%-12s%-25s%-15s%-15s%-15s\n",
                course.getId(), course.getName(), course.getClassRom(),
                course.getTime(), course.getSubject().getName());
    }

    /**
     * phương thức này dùng để hiển thị danh sách sinh viên
     *
     * @param students danh sách sinh viên cần hiển thị
     */
    private static void showStudents(ArrayList<Student> students) {
        System.out.println("==> Danh sách sinh viên <==");
        System.out.printf("%-12s%-22s%-20s%-20s%-12s%-20s%-15s%-15s\n",
                "Mã SV", "Họ và tên", "Địa chỉ", "Email", "Giới tính", "Số ĐT",
                "Lớp", "Khoa");
        for (var student : students) {
            showAStudent(student);
        }
    }

    /**
     * phương thức này dùng để hiển thị danh sách môn học
     *
     * @param subjects danh sách môn học
     */
    private static void showSubjects(ArrayList<Subject> subjects) {
        System.out.println("==> Danh sách môn học <==");
        System.out.printf("%-12s%-25s%-12s%-12s%-12s\n",
                "Mã môn", "Tên môn", "Số tín", "số tiết", "Số bài KT");
        for (var subject : subjects) {
            showASubject(subject);
        }
    }

    /**
     * phương thức hiển thị thông tin một môn học đơn
     *
     * @param subject môn học cần hiển thị
     */
    private static void showASubject(Subject subject) {
        System.out.printf("%-12s%-25s%-12d%-12d%-12d\n",
                subject.getId(), subject.getName(), subject.getCredit(),
                subject.getNumOfLesson(), subject.getNumOfExam());
    }

    /**
     * phương thức này tạo mới lớp học từ các thông tin có sẵn của
     * danh sách sinh viên và danh sách môn học. Bảng điểm sẽ để tạo sau
     *
     * @param input    đối tượng của lớp Scanner
     * @param subjects danh sách môn học
     * @return đối tượng khác null nếu tạo thành công và null nếu failed
     */
    private static Course createNewCourse(Scanner input,
                                          ArrayList<Subject> subjects) {
        System.out.println("Mã lớp: ");
        var id = input.nextLine();
        System.out.println("Tên lớp: ");
        var name = input.nextLine();
        System.out.println("Phòng học: ");
        var room = input.nextLine();
        System.out.println("Giờ học: ");
        var time = input.nextLine();
        System.out.println("Mã môn học: ");
        var subjectId = input.nextLine();
        var subject = findSubjectById(subjects, subjectId);
        if (subject == null) {
            System.out.println("==> Môn học mã \""
                    + subjectId + "\" không tồn tại <==");
            return null;
        } else {
            Course course = new Course();
            course.setId(id);
            course.setClassRom(room);
            course.setTime(time);
            course.setName(name);
            course.setSubject(subject);
            return course;
        }
    }

    /**
     * phương thức dùng để tìm môn học theo tên trong danh sách
     * cho trước
     *
     * @param subjects  danh sách môn học
     * @param subjectId mã môn cần tìm
     * @return môn học đầu tiên tìm được hoặc null nếu không tìm thấy
     */
    private static Subject findSubjectById(ArrayList<Subject> subjects, String subjectId) {
        for (var subject : subjects) {
            if (subject.getId().compareTo(subjectId) == 0) {
                return subject;
            }
        }
        return null;
    }

    /**
     * phương thức này dùng để tìm kiếm sinh viên theo mã trong một danh
     * sách cho trước
     *
     * @param students  danh sách sinh viên
     * @param studentId mã sinh viên cần tìm
     * @return sinh viên đầu tiên tìm được hoặc null nếu không tìm thấy
     */
    private static Student findStudentById(ArrayList<Student> students,
                                           String studentId) {
        for (var student : students) {
            if (student.getId().compareTo(studentId) == 0) {
                return student;
            }
        }
        return null;
    }

    /**
     * phương thức này dùng để tạo mới sinh viên với các thông tin nhập
     * vào từ bàn phím
     *
     * @param input đối tượng của lớp Scanner
     * @return đối tượng sinh viên vừa tạo
     */
    private static Student createNewStudent(Scanner input) {
        System.out.println("Mã sinh viên: ");
        var id = input.nextLine();
        System.out.println("Họ và tên: ");
        var fullName = input.nextLine();
        System.out.println("Địa chỉ: ");
        var address = input.nextLine();
        System.out.println("Email: ");
        var email = input.nextLine();
        System.out.println("Số điện thoại: ");
        var number = input.nextLine();
        System.out.println("Giới tính: ");
        var gender = input.nextLine();
        System.out.println("Lớp: ");
        var className = input.nextLine();
        System.out.println("Khoa: ");
        var major = input.nextLine();

        Student student = new Student(id, fullName, address,
                email, gender, className, major, number);
        return student;
    }

    /**
     * phương thức này dùng để tạo mới thông tin môn học nhập vào từ bàn phím
     *
     * @param input đối tượng của lớp Scanner
     * @return đối tượng môn học vừa tạo
     */
    private static Subject createNewSubject(Scanner input) {
        System.out.println("Mã môn học: ");
        var id = input.nextLine();
        System.out.println("Tên môn học: ");
        var name = input.nextLine();
        System.out.println("Số tín chỉ: ");
        var credit = input.nextInt();
        System.out.println("Số tiết học: ");
        var lesson = input.nextInt();
        System.out.println("Số bài kiểm tra: ");
        var numOfExam = input.nextInt();

        Subject subject = new Subject(id, name, credit, lesson, numOfExam);
        return subject;
    }
}
