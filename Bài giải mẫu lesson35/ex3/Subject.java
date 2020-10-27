package net.braniumacademy.exercises_lesson35.ex3;

/**
 * Lớp này mô tả thông tin môn học
 */
public class Subject {
    private String id;      // mã môn
    private String name;    // tên môn
    private int credit;     // số tín
    private int numOfLesson;// số tiết
    private int numOfExam;  // số bài kiểm tra

    public Subject() {
    }

    public Subject(String id) {
        this.id = id;
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
        this.id = id;
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
