package net.braniumacademy.exercises_lesson37.ex3;

import java.util.ArrayList;

/**
 * Lớp này mô tả thông tin khóa học(lớp học)
 */
public class Course {
    private static int nextId = 1001;
    private String id;      // mã lớp
    private String name;    // tên lớp
    private String classRom; // phòng học
    private String time;    // giờ học
    private Subject subject; // môn học
    private ArrayList<TranscriptOfStudent> transcriptOfStudents; // ds sinh viên và bảng điểm tương ứng

    public Course() {
        setId(null);
        name = "";
        classRom = "";
        time = "";
        subject = null;
        transcriptOfStudents = new ArrayList<>();
    }

    public Course(String id) {
        transcriptOfStudents = new ArrayList<>();
        setId(id);
    }

    public Course(String id, String name,
                  String classRom, String time,
                  Subject subject) {
        this(id);
        this.name = name;
        this.classRom = classRom;
        this.time = time;
        this.subject = subject;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        if (id != null) {
            this.id = id;
        } else {
            this.id = "COU" + nextId;
            nextId++;
        }
    }

    public static void setNextId(int nextId) {
        Course.nextId = nextId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassRom() {
        return classRom;
    }

    public void setClassRom(String classRom) {
        this.classRom = classRom;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    /**
     * phương thức cập nhật bảng điểm của sinh viên mã s trong lớp
     *
     * @param student    sinh viên đã có trong lớp học
     * @param transcript bảng điểm của sv tương ứng
     */
    public void setTranscriptOfStudent(Student student, Transcript transcript) {
        for (int i = 0; i < transcriptOfStudents.size(); i++) {
            if (transcriptOfStudents.get(i).getStudent().getId()
                    .compareTo(student.getId()) == 0) {
                transcriptOfStudents.get(i).setTranscript(transcript);
            }
        }
    }

    /**
     * phương thức tạo mới cặp bảng điểm-sinh viên tương ứng trong danh sách lớp học
     *
     * @param student    sinh viên
     * @param transcript bảng điểm
     */
    public void addTranscriptOfStudent(Student student, Transcript transcript) {
        var tos = new TranscriptOfStudent(student, transcript);
        tos.courseId = this.id;
        transcriptOfStudents.add(tos);
    }

    /**
     * phương thức lấy bảng điểm của sinh viên tương ứng
     *
     * @param studentId mã sinh viên cần lấy bảng điểm
     * @return bảng điểm của sinh viên nếu sinh viên có trong
     * danh sách lớp và null nếu sinh viên không tồn tại
     */
    public Transcript getTranscriptOfStudent(String studentId) {
        for (int i = 0; i < transcriptOfStudents.size(); i++) {
            if (transcriptOfStudents.get(i).getStudent().getId()
                    .compareTo(studentId) == 0) {
                return transcriptOfStudents.get(i).getTranscript();
            }
        }
        return null;
    }

    /**
     * phương thức thêm sinh viên vào một lớp nào đó
     * với một bảng điểm mặc định
     *
     * @param student sinh viên cần thêm vào ds lớp học
     */
    public void addStudentToCourse(Student student) {
        transcriptOfStudents.add(new TranscriptOfStudent(student, new Transcript()));
    }

    public ArrayList<TranscriptOfStudent> getTranscriptOfStudents() {
        return transcriptOfStudents;
    }

    public class TranscriptOfStudent {
        private String id; // mã của cặp sv-bảng điểm
        private String courseId;
        private Student student;
        private Transcript transcript;

        public TranscriptOfStudent() {

        }

        public TranscriptOfStudent(Student student, Transcript transcript) {
            this.student = student;
            this.transcript = transcript;
            this.id = transcript.getId();
        }

        public TranscriptOfStudent(Student student, Transcript transcript, String courseId) {
            this(student, transcript);
            this.courseId = courseId;
        }

        public String getId() {
            return id;
        }

        public String getCourseId() {
            return courseId;
        }

        public void setCourseId(String courseId) {
            this.courseId = courseId;
        }

        public void setStudent(Student student) {
            this.student = student;
        }

        public void setTranscript(Transcript transcript) {
            this.transcript = transcript;
        }

        public Student getStudent() {
            return student;
        }

        public Transcript getTranscript() {
            return transcript;
        }
    }
}
