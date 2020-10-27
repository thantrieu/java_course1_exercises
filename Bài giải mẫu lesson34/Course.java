import java.util.ArrayList;

/**
 * Lớp này mô tả thông tin khóa học(lớp học)
 */
public class Course {
    private String id;      // mã lớp
    private String name;    // tên lớp
    private String classRom; // phòng học
    private String time;    // giờ học
    private Subject subject; // môn học
    private ArrayList<TranscriptOfStudent> transcriptOfStudents; // ds sinh viên và bảng điểm tương ứng

    public Course() {
        id = "";
        name = "";
        classRom = "";
        time = "";
        subject = null;
        transcriptOfStudents = new ArrayList<>();

    }

    public Course(String id, String name,
                  String classRom, String time,
                  Subject subject) {
        this();
        this.id = id;
        this.name = name;
        this.classRom = classRom;
        this.time = time;
        this.subject = subject;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
     * phương thức cập nhật bảng điểm của sinh viên thứ i trong lớp
     *
     * @param student    sinh viên đã có trong lớp học
     * @param transcript bảng điểm của sv tương ứng
     */
    public void setTranscriptOfStudents(Student student, Transcript transcript) {
        for (int i = 0; i < transcriptOfStudents.size(); i++) {
            if (transcriptOfStudents.get(i)
                    .student.getId().compareTo(student.getId()) == 0) {
                transcriptOfStudents.get(i).transcript = transcript;
                break; // xong thì thoát
            }
        }
    }

    /**
     * phương thức thêm sinh viên vào một lớp nào đó
     * chưa thêm bảng điểm vì bảng điểm sẽ cập nhật sau
     *
     * @param student sinh viên cần thêm vào ds lớp học
     */
    public void addStudentToCourse(Student student) {
        transcriptOfStudents.add(new TranscriptOfStudent(student, null));
    }

    public ArrayList<TranscriptOfStudent> getTranscriptOfStudents() {
        return transcriptOfStudents;
    }

    public class TranscriptOfStudent {
        private Student student;
        private Transcript transcript;

        public TranscriptOfStudent() {

        }

        public TranscriptOfStudent(Student student, Transcript transcript) {
            this.student = student;
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
