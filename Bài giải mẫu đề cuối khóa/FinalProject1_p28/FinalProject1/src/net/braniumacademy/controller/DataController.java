package net.braniumacademy.controller;

import java.util.Date;
import java.util.List;
import net.braniumacademy.model.Course;
import net.braniumacademy.model.Registering;
import net.braniumacademy.model.Student;
import net.braniumacademy.model.Subject;

/**
 *
 * @author braniumacademy <braniumacademy.net>
 */
public interface DataController {

    int MAX_REGISTER = 7;
    int SUBJECT = 1;
    int STUDENT = 2;
    int REGISTERING = 3;
    String SUBJECT_FILE = "SUBJECT.DAT";
    String STUDENT_FILE = "STUDENT.DAT";
    String REGISTERING_FILE = "STU_REGISTER.DAT";

    <T> void writeToFile(List<T> data, String fileName);

    <T> List<T> readDataFromFile(String fileName);

    void sortSubjectByNameASC(List<Subject> subjects);

    void sortSubjectByNameDESC(List<Subject> subjects);

    void sortSubjectByNumOfLessonASC(List<Subject> subjects);

    void sortSubjectByNumOfLessonDESC(List<Subject> subjects);

    List<Subject> searchSubjectByName(List<Subject> subjects, String key);

    List<Subject> searchSubjectByLessonRange(List<Subject> subjects,
            int fromVal, int toVal);

    void sortStudentByNameASC(List<Student> students);

    void sortStudentByNameDESC(List<Student> students);

    void sortStudentByStudentIdASC(List<Student> students);

    List<Student> searchStudentByName(List<Student> students, String name);

    List<Student> searchStudentById(List<Student> students, String id);

    List<Student> searchStudentByMajor(List<Student> students, String major);

    void sortRegisteringByStudentNameAZ(List<Registering> rs);

    void sortRegisteringByStudentNameZA(List<Registering> rs);

    void sortRegisteringByRegisterTimeEL(List<Registering> rs);

    void sortRegisteringByRegisterTimeLE(List<Registering> rs);

    List<Registering> searchReByStudentName(List<Registering> rs, String name);

    List<Registering> searchReByRegisterTime(List<Registering> rs,
            Date fromDate, Date toDate);

    List<Course> createCourse(List<Registering> rs, List<Subject> subjects);
    
    boolean isRegisterable(List<Registering> registerings, Student s);
}
