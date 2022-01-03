package net.braniumacademy.model;

import java.util.Objects;
import net.braniumacademy.controller.InfoFilterImp;
import net.braniumacademy.exception.InvalidDateOfBirthException;
import net.braniumacademy.exception.InvalidEmailException;
import net.braniumacademy.exception.InvalidNameException;
import net.braniumacademy.exception.InvalidPersonIdException;
import net.braniumacademy.exception.InvalidPhoneNumberException;
import net.braniumacademy.exception.InvalidStudentIdException;

/**
 *
 * @author braniumacademy <braniumacademy.net>
 */
public class Student extends Person {

    private String studentId;
    private String studentClass;
    private String major;
    private String schoolYear;

    public Student() {
    }

    public Student(String studentId) throws InvalidStudentIdException {
        setStudentId(studentId);
    }

    public Student(String studentId, String id)
            throws InvalidStudentIdException, InvalidPersonIdException {
        super(id);
        setStudentId(studentId);
    }

    public Student(String studentId, String studentClass, String major,
            String schoolYear, String id, String address, String email,
            String phoneNumber, String fullName, String dob)
            throws InvalidStudentIdException, InvalidPersonIdException,
            InvalidEmailException, InvalidPhoneNumberException,
            InvalidNameException, InvalidDateOfBirthException {
        super(id, address, email, phoneNumber, fullName, dob);
        this.setStudentId(studentId);
        this.studentClass = studentClass;
        this.major = major;
        this.schoolYear = schoolYear;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) throws InvalidStudentIdException {
        var infoFilter = new InfoFilterImp();
        try {
            if (infoFilter.isStudentIdValid(studentId)) {
                this.studentId = studentId;
            }
        } catch (InvalidStudentIdException e) {
            throw e;
        }

        this.studentId = studentId;
    }

    public String getStudentClass() {
        return studentClass;
    }

    public void setStudentClass(String studentClass) {
        this.studentClass = studentClass;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getSchoolYear() {
        return schoolYear;
    }

    public void setSchoolYear(String schoolYear) {
        this.schoolYear = schoolYear;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + Objects.hashCode(this.studentId);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Student other = (Student) obj;
        if (!Objects.equals(this.studentId, other.studentId)) {
            return false;
        }
        return true;
    }

}
