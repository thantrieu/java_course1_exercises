package net.braniumacademy.exercises_lesson37.ex3.run;

import net.braniumacademy.exercises_lesson37.ex3.*;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.out;

/**
 * lớp thực thi các thao tác liên quan đến lớp Subject, Student, Course...
 *
 * @author Branium Academy
 * @website: https://braniumacademy.net
 */

public class L37Ex3 {
    private static String subjectFileName = "SUB.DAT";
    private static String studentFileName = "STUD.DAT";
    private static String courseFileName = "COU.DAT";
    private static String transcriptFileName = "TRAN.DAT";
    private static String tosFileName = "COU-TRAN.DAT";

    public static void main(String[] args) {
        int choice = 0;
        // load data từ file tương ứng ra:
        ArrayList<Transcript> transcripts = new ArrayList<>(readTransFromFile());
        ArrayList<Subject> subjects = new ArrayList<>(readSubjectFromFile());
        ArrayList<Student> students = new ArrayList<>(readStudentFromFile());
        ArrayList<Course> courses = new ArrayList<>(readCourseFromFile());
        // việc đọc bảng điểm phải thực hiện sau khi đọc khóa học
        ArrayList<Course.TranscriptOfStudent> transcriptOfStudents
                = new ArrayList<>(readTOSFromFile(courses, students, transcripts));
        fillCourseInfo(courses, transcriptOfStudents, subjects);
        setNextId(subjects, students, courses, transcripts);

        var input = new Scanner(System.in);
        do {
            showMessage("========================= MENU =========================");
            showMessage("1. Thêm mới 1 môn học vào danh sách môn học             ");
            showMessage("2. Thêm mới một sinh viên vào danh sách sinh viên       ");
            showMessage("3. Thêm mới một khóa học vào danh sách khóa học         ");
            showMessage("4. Thêm mới một sinh viên vào khóa học nào đó           ");
            showMessage("5. Hiển thị danh sách môn học                           ");
            showMessage("6. Hiển thị danh sách sinh viên                         ");
            showMessage("7. Hiển thị danh sách khóa học                          ");
            showMessage("8. Nhập và tính điểm trung bình cho từng sv trong lớp   ");
            showMessage("9. Xét học lực cho từng sinh viên trong lớp             ");
            showMessage("10. Hiển thị bảng điểm, học lực các sinh viên trong lớp ");
            showMessage("11. Tìm xem sinh viên s có trong khóa học nào không     ");
            showMessage("12. Ghi thông tin hiện thời vào file                    ");
            showMessage("0. Thoát chương trình                                   ");
            showMessage("Xin mời bạn chọn:                                       ");
            choice = input.nextInt(); // nhập vào lựa chọn
            input.nextLine(); // đọc bỏ dòng thừa
            switch (choice) {
                case 0:
                    showMessage("===============================");
                    showMessage(" CẢM ƠN BẠN ĐÃ SỬ DỤNG DỊCH VỤ ");
                    showMessage("===============================");
                    break;
                case 1:
                    var s = createNewSubject(input);
                    subjects.add(s);
                    showMessage("Thêm môn học thành công!");
                    break;
                case 2:
                    var student = createNewStudent(input);
                    students.add(student);
                    showMessage("Thêm sinh viên thành công");
                    break;
                case 3:
                    if (subjects.size() > 0) {
                        var course = createNewCourse(input, subjects);
                        if (course != null) {
                            courses.add(course);
                            showMessage("Thêm khóa học thành công");
                        } else {
                            showMessage("Tạo khóa học thất bại");
                        }
                    } else {
                        showMessage("Danh sách môn học rỗng");
                    }
                    break;
                case 4:
                    if (courses.size() > 0 && students.size() > 0) {
                        var isSuccess
                                = addStudentToCouse(courses, students,
                                transcripts, transcriptOfStudents, input);
                        if (isSuccess) {
                            showMessage("Thêm sinh viên vào khóa học thành công!");
                        } else {
                            showMessage("Thêm sinh viên vào khóa học thất bại");
                        }
                    } else {
                        showMessage("Danh sách khóa học hoặc" +
                                " danh sách sinh viên rỗng");
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
                        addGrades(courses, students, transcripts, input);
                    } else {
                        showMessage("Danh sách khóa học rỗng");
                    }
                    break;
                case 9:
                    if (courses.size() > 0) {
                        calculCapacity(courses);
                    } else {
                        showMessage("Danh sách khóa học rỗng");
                    }
                    break;
                case 10:
                    if (courses.size() > 0) {
                        showTranscript(courses, input);
                    } else {
                        showMessage("Danh sách khóa học rỗng");
                    }
                    break;
                case 11:
                    if (courses.size() > 0) {
                        out.println("Nhập mã sinh viên cần tìm: ");
                        var studentId = input.nextLine();
                        var searchedCourse
                                = findStudentInCourse(courses, studentId);
                        if (searchedCourse != null) {
                            showMessage("Tìm thấy sinh viên mã \""
                                    + studentId + "\" trong khóa học môn "
                                    + searchedCourse.getSubject().getName()
                                    + "");
                        } else {
                            showMessage("Không tìm thấy sinh viên mã \""
                                    + studentId + "\" trong khóa học nào");
                        }
                    } else {
                        showMessage("Danh sách khóa học rỗng");
                    }
                    break;
                case 12:
                    if (courses.size() > 0) {
                        saveTranscriptsToFile(transcripts);
                        saveTOSListToFile(transcriptOfStudents,
                                courses, students, transcripts);
                        var isSuccess = saveCoursesToFile(courses);
                        if (isSuccess) {
                            showMessage("Lưu danh sách khóa học thành công!");
                        } else {
                            showMessage("Lưu danh sách khóa học thất bại!");
                        }
                    } else {
                        showMessage("Danh sách khóa học trống!");
                    }
                    if (students.size() > 0) {
                        var isSuccess = saveStudentsToFile(students);
                        if (isSuccess) {
                            showMessage("Lưu danh sách sinh viên thành công!");
                        } else {
                            showMessage("Lưu danh sách sinh viên thất bại!");
                        }
                    } else {
                        showMessage("Danh sách sinh viên trống!");
                    }
                    if (subjects.size() > 0) {
                        var isSuccess = saveSubjectsToFile(subjects);
                        if (isSuccess) {
                            showMessage("Lưu danh sách môn học thành công!");
                        } else {
                            showMessage("Lưu danh sách môn học thất bại!");
                        }
                    } else {
                        showMessage("Danh sách môn học trống!");
                    }

                    break;
                default:
                    showMessage("Sai chức năng, vui lòng chọn lại!");
                    break;
            }
        } while (choice != 0);
    }

    /**
     * phương thức dùng để nạp dữ liệu danh sách sinh viên, môn học và bảng điểm
     * tương ứng của từng sinh viên cho lớp học
     *
     * @param courses  danh sách khóa học
     * @param tosList  danh sách sinh viên-bảng điểm
     * @param subjects danh sách môn học
     */
    private static void fillCourseInfo(ArrayList<Course> courses,
                                       ArrayList<Course.TranscriptOfStudent> tosList,
                                       ArrayList<Subject> subjects) {
        // tìm thông tin môn học cho từng lớp
        for (int i = 0; i < courses.size(); i++) {
            var course = courses.get(i);
            var sub = findSubjectById(subjects, course.getSubject().getId());
            course.setSubject(sub);
        }
        // tìm thông tin sinh viên và bảng điểm tương ứng của từng lớp
        for (int i = 0; i < courses.size(); i++) {
            var course = courses.get(i);
            var tosOfCouse = course.getTranscriptOfStudents();
            for (int j = 0; j < tosList.size(); j++) {
                var item = tosList.get(j);
                if (item.getCourseId().compareTo(course.getId()) == 0) {
                    tosOfCouse.add(item);
                }
            }
        }
    }

    /**
     * phương thức dùng để tìm kiếm bảng điểm theo mã bảng điểm
     * trong danh sách cho trước.
     *
     * @param transcripts danh sách bảng điểm
     * @param id          mã bảng điểm cần tìm
     * @return bảng điểm được tìm thấy hoặc null nếu không tìm thấy
     */
    private static Transcript findTransById(ArrayList<Transcript> transcripts, String id) {
        for (var item : transcripts) {
            if (item.getId().compareTo(id) == 0) {
                return item;
            }
        }
        return null;
    }

    /**
     * phương thức dùng để hiển thị danh sách bảng điểm
     *
     * @param courses danh sách khóa học
     */
    private static void showTranscript(ArrayList<Course> courses,
                                       Scanner input) {
        out.println("Nhập mã lớp cần hiển thị bảng điểm: ");
        var id = input.nextLine();
        var course = findCourseById(courses, id);
        if (course != null) {
            // nếu đã có bảng điểm
            if (course.getTranscriptOfStudents().size() > 0) {
                // sắp xếp theo thứ tự điểm giảm dần sau đó hiển thị
                var tosList = course.getTranscriptOfStudents();
                sortTOSList(tosList);
                showTranscriptOfAllStudent(id, tosList);
            } else {
                showMessage("Lớp học này chưa có sinh viên nào");
            }
        } else {
            showMessage("Không tồn tại lớp học mã \"" + id + "\"");
        }
    }

    /**
     * phương thức dùng để sắp xếp danh sách sv-bảng điểm
     *
     * @param tosList
     */
    private static void sortTOSList(ArrayList<Course.TranscriptOfStudent> tosList) {
        for (int i = 0; i < tosList.size() - 1; i++) {
            for (int j = tosList.size() - 1; j > i; j--) {
                if (tosList.get(j).getTranscript().getAvgGrade()
                        > tosList.get(j - 1).getTranscript().getAvgGrade()) {
                    var tmp = tosList.get(j);
                    tosList.set(j, tosList.get(j - 1));
                    tosList.set(j - 1, tmp);
                }
            }
        }
    }

    /**
     * phương thức dùng để hiển thị bảng điểm của các sinh viên trong
     * một lớp học
     *
     * @param couseId     mã lớp
     * @param transcripts bảng điểm
     */
    private static void showTranscriptOfAllStudent(String couseId,
                                                   ArrayList<Course.TranscriptOfStudent> transcripts) {
        showMessage("================= BẢNG ĐIỂM =================");
        out.printf("%-12s%-15s%-20s%-10s%-10s%-10s%-10s%-10s\n",
                "Mã lớp", "Mã SV", "Tên SV", "Hệ 1", "Hệ 2",
                "Hệ 3", "Điểm TB", "Học lực");
        for (var item : transcripts) {
            out.printf("%-12s%-15s%-20s%-10.2f%-10.2f%-10.2f%-10.2f%-10s\n",
                    couseId, item.getStudent().getId(),
                    item.getStudent().getFullName(),
                    item.getTranscript().getGrade1(),
                    item.getTranscript().getGrade2(),
                    item.getTranscript().getGrade3(),
                    item.getTranscript().getAvgGrade(),
                    item.getTranscript().getCapacity().getValue());
        }
    }

    /**
     * phương thức dùng để thiết lập mã cho môn học, sinh viên, khóa học
     * và bảng điểm. Nếu danh sách rỗng thì không thiết lập. Ngược lại
     * thiết lập mã mới là mã cũ sau cùng tăng thêm 1.
     *
     * @param subjects    danh sách môn học
     * @param students    danh sách sinh viên
     * @param courses     danh sách khóa học
     * @param transcripts danh sách bảng điểm
     */
    private static void setNextId(ArrayList<Subject> subjects,
                                  ArrayList<Student> students,
                                  ArrayList<Course> courses,
                                  ArrayList<Transcript> transcripts) {
        if (subjects.size() > 0) {
            var id = subjects.get(subjects.size() - 1).getId();
            var nextId = getNextId(id);
            Subject.setNextId(nextId + 1);
        }
        if (students.size() > 0) {
            var id = students.get(students.size() - 1).getId();
            var nextId = getNextId(id);
            Student.setNextId(nextId + 1);
        }
        if (courses.size() > 0) {
            var id = courses.get(courses.size() - 1).getId();
            var nextId = getNextId(id);
            Course.setNextId(nextId + 1);
        }
        if (transcripts.size() > 0) {
            var id = transcripts.get(transcripts.size() - 1).getId();
            var nextId = getNextId(id);
            Transcript.setNextId(nextId + 1);
        }
    }

    /**
     * phương thức dùng để tách lấy phần số trong mã
     *
     * @param id mã ở dạng String
     * @return phần số tách được
     */
    private static int getNextId(String id) {
        var nextIdStr = id.substring(3); // tách lấy phần số
        var nextIdInt = Integer.parseInt(nextIdStr);
        return nextIdInt;
    }

    /**
     * phương thức dùng để hiển thị thông báo ra màn hình
     *
     * @param msg thông điệp cần hiển thị ra màn hình
     */
    private static void showMessage(String msg) {
        out.println("==> " + msg + " <==");
    }

    /**
     * phương thức dùng để kiểm tra một đối tượng cần ghi vào file
     * đã tồn tại trước đó hay chưa
     *
     * @param subjects danh sách môn học hiện có trong file
     * @param subject  đối tượng cần kiểm tra xem đã tồn tại chưa
     * @return true nếu đối tượng cần kiểm tra đã tồn tại
     * và false trong trường hợp ngược lại
     */
    private static boolean isExist(ArrayList<Subject> subjects,
                                   Subject subject) {
        for (var item : subjects) {
            if (subject.getId().compareTo(item.getId()) == 0) {
                return true;
            }
        }
        return false;
    }

    /**
     * phương thức dùng để kiểm tra một đối tượng cần ghi vào file
     * đã tồn tại trước đó hay chưa
     *
     * @param students danh sách sinh viên hiện có trong file
     * @param student  đối tượng cần kiểm tra xem đã tồn tại chưa
     * @return true nếu đối tượng cần kiểm tra đã tồn tại
     * và false trong trường hợp ngược lại
     */
    private static boolean isExist(ArrayList<Student> students,
                                   Student student) {
        for (var item : students) {
            if (student.getId().compareTo(item.getId()) == 0) {
                return true;
            }
        }
        return false;
    }

    /**
     * phương thức dùng để kiểm tra một đối tượng cần ghi vào file
     * đã tồn tại trước đó hay chưa
     *
     * @param courses danh sách khóa học hiện có trong file
     * @param course  đối tượng cần kiểm tra xem đã tồn tại chưa
     * @return true nếu đối tượng cần kiểm tra đã tồn tại
     * và false trong trường hợp ngược lại
     */
    private static boolean isExist(ArrayList<Course> courses, Course course) {
        for (var item : courses) {
            if (course.getId().compareTo(item.getId()) == 0) {
                return true;
            }
        }
        return false;
    }

    /**
     * phương thức dùng để kiểm tra xem đối tượng lưu trữ thông tin
     * bảng điểm-sinh viên nào đó đã tồn tại hay chưa
     *
     * @param tosList danh sách gốc
     * @param other   đối tượng cần kiểm tra
     * @return true nếu đã tồn tại và false nếu ngược lại
     */
    private static boolean isExist(ArrayList<Course.TranscriptOfStudent> tosList,
                                   Course.TranscriptOfStudent other) {
        for (var item : tosList) {
            if (other.getId().compareTo(item.getId()) == 0) {
                return true;
            }
        }
        return false;
    }

    /**
     * phương thức dùng để lưu danh sách môn học vào file
     *
     * @param subjects danh sách môn học cần lưu
     * @return true nếu lưu thành công và false nếu ngược lại
     */
    private static boolean saveSubjectsToFile(ArrayList<Subject> subjects) {
        var currentInFile = readSubjectFromFile();
        try {
            FileWriter fileWriter = new FileWriter(subjectFileName, true);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            for (Subject subject : subjects) {
                if (!isExist(currentInFile, subject)) {
                    printWriter.printf("%s*%s*%d*%d*%d\n", subject.getId(), subject.getName(),
                            subject.getCredit(), subject.getNumOfLesson(), subject.getNumOfExam());
                }
            }
            printWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    /**
     * phương thức dùng để lưu danh sách sinh viên vào file
     *
     * @param students danh sách sinh viên cần lưu
     * @return true nếu lưu thành công và false nếu ngược lại
     */
    private static boolean saveStudentsToFile(ArrayList<Student> students) {
        var currentInFile = readStudentFromFile();
        try {
            FileWriter fileWriter = new FileWriter(studentFileName, true);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            for (Student student : students) {
                if (!isExist(currentInFile, student)) {
                    printWriter.printf("%s*%s*%s*%s*%s*%s*%s*%s\n",
                            student.getId(), student.getFullName(),
                            student.getAddress(), student.getEmail(),
                            student.getGender(), student.getPhoneNumber(),
                            student.getClassName(), student.getMajor());
                }
            }
            printWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    /**
     * phương thức thực hiện lưu danh sách khóa học vào file
     *
     * @param courses danh sách khóa học cần lưu
     * @return true nếu lưu thành công và false nếu ngược lại
     */
    private static boolean saveCoursesToFile(ArrayList<Course> courses) {
        var currentInFile = readCourseFromFile();
        try {
            FileWriter fileWriter = new FileWriter(courseFileName, true);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            for (var course : courses) {
                if (!isExist(currentInFile, course)) {
                    printWriter.printf("%s*%s*%s*%s*%s\n",
                            course.getId(), course.getName(),
                            course.getClassRom(), course.getTime(),
                            course.getSubject().getId());
                }
            }
            printWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    private static boolean saveTOSListToFile(
            ArrayList<Course.TranscriptOfStudent> tosList,
            ArrayList<Course> courses, ArrayList<Student> students,
            ArrayList<Transcript> transcripts) {
        var currentInFile
                = readTOSFromFile(courses, students, transcripts);
        try {
            FileWriter fileWriter = new FileWriter(tosFileName, true);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            for (var item : tosList) {
                if (!isExist(currentInFile, item)) {
                    printWriter.printf("%s*%s*%s\n", item.getCourseId(),
                            item.getStudent().getId(), item.getTranscript().getId());
                }
            }
            printWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    /**
     * phương thức dùng để lưu danh sách bảng điểm vào file
     *
     * @param transcripts danh sách bảng điểm cần lưu
     * @return true nếu lưu thành công và false nếu ngược lại
     */
    private static boolean saveTranscriptsToFile(ArrayList<Transcript> transcripts) {
        var currentInFile = readTransFromFile();
        try {
            FileWriter fileWriter = new FileWriter(transcriptFileName);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            for (Transcript transcript : transcripts) {
                printWriter.printf("%s*%f*%f*%f*%f*%s\n",
                        transcript.getId(),
                        transcript.getGrade1(), transcript.getGrade2(),
                        transcript.getGrade3(), transcript.getAvgGrade(),
                        transcript.getCapacity().name());
            }
            printWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    /**
     * phương thức đọc đối tượng subject từ file
     *
     * @return danh sách các subject có trong file
     */
    private static ArrayList<Subject> readSubjectFromFile() {
        ArrayList<Subject> subjects = new ArrayList<>();
        var file = new File(subjectFileName);
        try {
            file.createNewFile(); // tránh lỗi khi file không tồn tại
            var input = new Scanner(file);
            while (input.hasNextLine()) {
                var line = input.nextLine();
                var subjectInfo = line.split("[*]");
                var id = subjectInfo[0];
                var name = subjectInfo[1];
                var credit = Integer.parseInt(subjectInfo[2]);
                var numOfLesson = Integer.parseInt(subjectInfo[3]);
                var numOfEx = Integer.parseInt(subjectInfo[4]);
                var subject = new Subject(id, name, credit, numOfLesson, numOfEx);
                subjects.add(subject);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return subjects;
    }

    /**
     * phương thức đọc các đối tượng sinh viên từ file
     *
     * @return danh sách sinh viên đọc được
     */
    private static ArrayList<Student> readStudentFromFile() {
        ArrayList<Student> students = new ArrayList<>();
        var file = new File(studentFileName);
        try {
            file.createNewFile(); // tránh lỗi khi file không tồn tại
            var input = new Scanner(file);
            while (input.hasNextLine()) {
                var line = input.nextLine();
                var studentInfo = line.split("[*]");
                var id = studentInfo[0];
                var name = studentInfo[1];
                var address = studentInfo[2];
                var email = studentInfo[3];
                var gender = studentInfo[4];
                var phoneNumber = studentInfo[5];
                var className = studentInfo[6];
                var major = studentInfo[7];
                var student = new Student(id, name, address, email,
                        gender, className, major, phoneNumber);
                students.add(student);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return students;
    }

    /**
     * phương thức đọc các khóa học từ file
     *
     * @return danh sách khóa học hiện có trong file
     */
    private static ArrayList<Course> readCourseFromFile() {
        ArrayList<Course> courses = new ArrayList<>();
        var file = new File(courseFileName);
        try {
            file.createNewFile(); // tránh lỗi khi file không tồn tại
            var input = new Scanner(file);
            while (input.hasNextLine()) {
                var line = input.nextLine();
                var courseInfo = line.split("[*]");
                var id = courseInfo[0];
                var name = courseInfo[1];
                var classRom = courseInfo[2];
                var time = courseInfo[3];
                var subjecId = courseInfo[4];
                var course = new Course(id, name,
                        classRom, time, new Subject(subjecId));
                courses.add(course);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return courses;
    }

    /**
     * phương thức dùng để đọc danh sách sinh viên và bảng điểm tương ứng
     * trong các lớp học.
     *
     * @param courses     danh sách khóa học
     * @param students    danh sách sinh viên
     * @param transcripts danh sách bảng điểm
     * @return danh sách sinh viên-bảng điểm đọc được
     */
    private static ArrayList<Course.TranscriptOfStudent> readTOSFromFile(
            ArrayList<Course> courses, ArrayList<Student> students,
            ArrayList<Transcript> transcripts) {
        ArrayList<Course.TranscriptOfStudent> tosList = new ArrayList<>();
        var file = new File(tosFileName);
        try {
            file.createNewFile(); // tránh lỗi khi file không tồn tại
            var input = new Scanner(file);
            while (input.hasNextLine()) {
                var line = input.nextLine();
                var courseInfo = line.split("[*]");
                var courseId = courseInfo[0];
                var studentId = courseInfo[1];
                var tranId = courseInfo[2];
                var course = findCourseById(courses, courseId);
                var student = findStudentById(students, studentId);
                var tran = findTransById(transcripts, tranId);
                var tos = course.new TranscriptOfStudent(student, tran,
                        courseId);
                tosList.add(tos);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return tosList;
    }

    /**
     * phương thức dùng để đọc các bảng điểm từ file
     *
     * @return danh sách bảng điểm hiện có trong file
     */
    private static ArrayList<Transcript> readTransFromFile() {
        ArrayList<Transcript> transcripts = new ArrayList<>();
        var file = new File(transcriptFileName);
        try {
            file.createNewFile(); // tránh lỗi khi file không tồn tại
            var input = new Scanner(file);
            while (input.hasNextLine()) {
                var line = input.nextLine();
                var transInfo = line.split("[*]");
                var id = transInfo[0];
                var g1 = Float.parseFloat(transInfo[1]);
                var g2 = Float.parseFloat(transInfo[2]);
                var g3 = Float.parseFloat(transInfo[3]);
                var ga = Float.parseFloat(transInfo[4]);
                var cap = transInfo[5];
                var tran = new Transcript(id, g1,
                        g2, g3, ga, Capacity.valueOf(cap));
                transcripts.add(tran);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return transcripts;
    }

    /**
     * phương thức dùng để thêm bảng điểm từng sinh viên của khóa học nào đó
     *
     * @param courses     danh sách các khóa học
     * @param transcripts bảng điểm
     * @param input       đối tượng lớp Scanner
     */
    private static void addGrades(ArrayList<Course> courses,
                                  ArrayList<Student> students,
                                  ArrayList<Transcript> transcripts,
                                  Scanner input) {
        out.println("Nhập mã khóa học: ");
        var gradeId = input.nextLine();
        var course = findCourseById(courses, gradeId);
        if (course != null) {
            // hiện danh sách sinh viên
            if (course.getTranscriptOfStudents().size() > 0) {
                showStudentInCourse(course.getTranscriptOfStudents());
            } else {
                showMessage("Danh sách sinh viên của lớp học này rỗng");
                return; // kết thúc chức năng này
            }
            out.println("Nhập mã sinh viên: ");
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
            if (isFound) { // nếu tìm thấy sinh viên trong lớp học
                // lấy thông tin sinh viên
                var student = findStudentById(students, studentId);
                // lấy thông tin bảng điểm của sv
                var tran = course.getTranscriptOfStudent(studentId);
                fillGrades(tran); // nhập và tính điểm trung bình cho từng sinh viên
                course.setTranscriptOfStudent(student, tran);
                transcripts.add(tran); // thêm vào danh sách bảng điểm
                showMessage("Cập nhật bảng điểm thành công");
            } else {
                showMessage("Sinh viên mã \"" + studentId
                        + "\" không tồn tại trong lớp");
            }
        } else {
            showMessage("Mã khóa học không tồn tại. Vui lòng kiểm tra lại");
        }
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
        showMessage("Các sinh viên đã có trong khóa học:");
        out.printf("%-12s%-22s%-20s%-20s%-12s%-20s%-15s%-15s\n",
                "Mã SV", "Họ và tên", "Địa chỉ", "Email", "Giới tính", "Số ĐT",
                "khóa học", "Khoa");
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
    private static Transcript fillGrades(Transcript tran) {
        var input = new Scanner(System.in);
        showMessage("Điểm hệ số 1: ");
        var g1 = input.nextFloat();
        showMessage("Điểm hệ số 2: ");
        var g2 = input.nextFloat();
        showMessage("Điểm hệ số 3: ");
        var g3 = input.nextFloat();

        tran.setGrade1(g1);
        tran.setGrade2(g2);
        tran.setGrade3(g3);
        tran.calculAvgGrade(); // tính điểm TB

        return tran;
    }

    /**
     * phương thức dùng để thêm một sinh viên vào khóa học
     * được chỉ định theo mã của chúng
     *
     * @param courses     danh sách khóa học
     * @param students    danh sách sinh viên
     * @param transcripts danh sách bảng điểm
     * @param tosList     danh sách các cặp sv-bảng điểm
     * @param input       đối tượng của lớp Scanner
     * @return true nếu thêm thành công và false otherwise
     */
    private static boolean addStudentToCouse(ArrayList<Course> courses,
                                             ArrayList<Student> students,
                                             ArrayList<Transcript> transcripts,
                                             ArrayList<Course.TranscriptOfStudent> tosList,
                                             Scanner input) {
        out.println("Nhập mã khóa học: ");
        var courseId = input.nextLine();
        var course = findCourseById(courses, courseId);
        if (course == null) {
            showMessage("Mã khóa học không tồn tại");
            return false;
        }
        // hiện danh sách sinh viên
        showStudentInCourse(course.getTranscriptOfStudents());

        out.println("Nhập mã sinh viên: ");
        var studentId = input.nextLine();
        var student = findStudentById(students, studentId);

        if (student != null) {
            var tran = new Transcript();
            course.addTranscriptOfStudent(student, tran);
            transcripts.add(tran);
            // thêm cặp sinh viên-bảng điểm vào danh sách các cặp sv-bảng điểm
            // do khi tạo mới ta thêm vào cuối danh sách nên giờ chỉ cần lấy
            // ở cuối danh sách của khóa học tương ứng
            tosList.add(course.getTranscriptOfStudents()
                    .get(course.getTranscriptOfStudents().size() - 1));
            return true;
        } else {
            showMessage("Mã sinh viên không tồn tại");
        }
        return false;
    }

    /**
     * phương thức tìm và trả về khóa học trong danh sách theo mã
     *
     * @param courses  danh sách khóa học
     * @param courseId mã khóa học cần tìm
     * @return khóa học tìm đc hoặc null nếu không tìm thấy
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
        out.printf("%-12s%-22s%-20s%-20s%-12s%-20s%-15s%-15s\n",
                student.getId(), student.getFullName(), student.getAddress(),
                student.getEmail(), student.getGender(), student.getPhoneNumber(),
                student.getClassName(), student.getMajor());
    }

    /**
     * phương thức tìm sinh viên có trong danh sách khóa học không
     *
     * @param courses   danh sách khóa học
     * @param studentId mã sinh viên cần tìm
     * @return trả về khóa học mà sinh viên có mặt hoặc null nếu
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
     * phương thức này dùng để xét học lực cho các sinh viên trong khóa học
     *
     * @param courses danh sách khóa học
     */
    private static void calculCapacity(ArrayList<Course> courses) {
        showMessage("Mã khóa học cần xét học lực: ");
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
                        showMessage("Chưa nhập bảng điểm");
                        isSuccess = false;
                        break;
                    }
                }
                if (isSuccess) {
                    showMessage("Xét học lực thành công!");
                } else {
                    showMessage("Xét học lực thất bại!");
                }
            } else {
                showMessage("khóa học này chưa có sinh viên nào!");
            }
        } else {
            showMessage("khóa học có mã cần tìm không tồn tại");
        }
    }

    /**
     * phương thức này dùng để hiển thị danh sách các khóa học
     *
     * @param courses danh sách các khóa học
     */
    private static void showCourses(ArrayList<Course> courses) {
        showMessage("Danh sách các khóa học");
        out.printf("%-12s%-25s%-15s%-15s%-15s\n",
                "Mã lớp", "Tên lớp", "Phòng học", "Giờ học", "Môn học");
        for (var course : courses) {
            showACourse(course);
        }
    }

    /**
     * phương thức dùng để hiển thị thông tin một khóa học
     * chưa bao gồm danh sách sinh viên. Chức năng hiển thị
     * danh sách sinh viên trong môn học sẽ được
     * cập nhật dần trong các phiên bản tiếp theo để giảm tải.
     *
     * @param course
     */
    private static void showACourse(Course course) {
        out.printf("%-12s%-25s%-15s%-15s%-15s\n",
                course.getId(), course.getName(), course.getClassRom(),
                course.getTime(), course.getSubject().getName());
    }

    /**
     * phương thức này dùng để hiển thị danh sách sinh viên
     *
     * @param students danh sách sinh viên cần hiển thị
     */
    private static void showStudents(ArrayList<Student> students) {
        showMessage("Danh sách sinh viên");
        out.printf("%-12s%-22s%-20s%-20s%-12s%-20s%-15s%-15s\n",
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
        showMessage("Danh sách môn học");
        out.printf("%-12s%-25s%-12s%-12s%-12s\n",
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
        out.printf("%-12s%-25s%-12d%-12d%-12d\n",
                subject.getId(), subject.getName(), subject.getCredit(),
                subject.getNumOfLesson(), subject.getNumOfExam());
    }

    /**
     * phương thức này tạo mới khóa học từ các thông tin có sẵn của
     * danh sách sinh viên và danh sách môn học. Bảng điểm sẽ để tạo sau
     *
     * @param input    đối tượng của lớp Scanner
     * @param subjects danh sách môn học
     * @return đối tượng khác null nếu tạo thành công và null nếu failed
     */
    private static Course createNewCourse(Scanner input,
                                          ArrayList<Subject> subjects) {
        out.println("Tên lớp: ");
        var name = input.nextLine();
        out.println("Phòng học: ");
        var room = input.nextLine();
        out.println("Giờ học: ");
        var time = input.nextLine();
        out.println("Mã môn học: ");
        var subjectId = input.nextLine();
        var subject = findSubjectById(subjects, subjectId);
        if (subject == null) {
            showMessage("Môn học mã \"" + subjectId + "\" không tồn tại");
            return null;
        } else {
            Course course = new Course();
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
        out.println("Họ và tên: ");
        var fullName = input.nextLine();
        out.println("Địa chỉ: ");
        var address = input.nextLine();
        out.println("Email: ");
        var email = input.nextLine();
        out.println("Số điện thoại: ");
        var number = input.nextLine();
        out.println("Giới tính: ");
        var gender = input.nextLine();
        out.println("Lớp: ");
        var className = input.nextLine();
        out.println("Khoa: ");
        var major = input.nextLine();

        Student student = new Student(null, fullName, address,
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
        out.println("Tên môn học: ");
        var name = input.nextLine();
        out.println("Số tín chỉ: ");
        var credit = input.nextInt();
        out.println("Số tiết học: ");
        var lesson = input.nextInt();
        out.println("Số bài kiểm tra: ");
        var numOfExam = input.nextInt();

        Subject subject = new Subject(null, name, credit, lesson, numOfExam);
        return subject;
    }
}
