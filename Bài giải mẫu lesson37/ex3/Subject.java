package net.braniumacademy.exercises_lesson37.ex3;

/**
 * Lớp này mô tả thông tin môn học
 */
public class Subject {
    private static int nextId = 1001;
    private String id;      // mã môn
    private String name;    // tên môn
    private int credit;     // số tín
    private int numOfLesson;// số tiết
    private int numOfExam;  // số bài kiểm tra

    public Subject() {
        setId(null);
        name = "";
        credit = 0;
        numOfExam = 0;
        numOfLesson = 0;
    }

    public Subject(String id) {
        setId(id);
    }

    public Subject(String id, String name) {
        this(id);
        this.name = name;
    }

    public Subject(String id, String name, int credit) {
        this(id, name);
        this.credit = credit;
    }

    public Subject(String id, String name,
                   int credit, int numOfLesson) {
        this(id, name, credit);
        this.numOfLesson = numOfLesson;
    }

    public Subject(String id, String name,
                   int credit, int numOfLesson, int numOfExam) {
        this(id, name, credit, numOfLesson);
        this.numOfExam = numOfExam;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        if (id != null) {
            this.id = id;
        } else {
            this.id = "SUB" + nextId;
            nextId++;
        }
    }

    public static void setNextId(int nextId) {
        Subject.nextId = nextId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public int getNumOfLesson() {
        return numOfLesson;
    }

    public void setNumOfLesson(int numOfLesson) {
        this.numOfLesson = numOfLesson;
    }

    public int getNumOfExam() {
        return numOfExam;
    }

    public void setNumOfExam(int numOfExam) {
        this.numOfExam = numOfExam;
    }
}
