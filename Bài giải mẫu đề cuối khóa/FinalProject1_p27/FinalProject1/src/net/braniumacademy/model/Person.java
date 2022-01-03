package net.braniumacademy.model;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;
import net.braniumacademy.controller.InfoFilterImp;
import net.braniumacademy.exception.InvalidDateOfBirthException;
import net.braniumacademy.exception.InvalidEmailException;
import net.braniumacademy.exception.InvalidNameException;
import net.braniumacademy.exception.InvalidPersonIdException;
import net.braniumacademy.exception.InvalidPhoneNumberException;

/**
 *
 * @author braniumacademy <braniumacademy.net>
 */
public class Person implements Serializable {

    private String id;
    private String address;
    private String email;
    private String phoneNumber;
    private FullName fullName;
    private Date dob;

    public Person() {
        fullName = new FullName();
    }

    public Person(String id) throws InvalidPersonIdException {
        setId(id);
    }

    public Person(String id, String address, String email,
            String phoneNumber, String fullName, String dob)
            throws InvalidPersonIdException, InvalidEmailException,
            InvalidPhoneNumberException, InvalidDateOfBirthException, 
            InvalidNameException {
        this();
        setId(id);
        this.address = address;
        setEmail(email);
        setPhoneNumber(phoneNumber);
        setFullName(fullName);
        setDob(dob);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) throws InvalidPersonIdException {
        var infoFilter = new InfoFilterImp();
        try {
            if (infoFilter.isPersonIdValid(id)) {
                this.id = id;
            }
        } catch (InvalidPersonIdException ex) {
            throw ex;
        }
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) throws InvalidEmailException {
        var infoFilter = new InfoFilterImp();
        try {
            if (infoFilter.isEmailValid(email)) {
                this.email = email;
            }
        } catch (InvalidEmailException ex) {
            throw ex;
        }
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) throws InvalidPhoneNumberException {
        var infoFilter = new InfoFilterImp();
        try {
            if (infoFilter.isPhoneNumberValid(phoneNumber)) {
                this.phoneNumber = phoneNumber;
            }
        } catch (InvalidPhoneNumberException ex) {
            throw ex;
        }
    }

    public String getFullName() {
        return fullName.last + " " + this.fullName.mid + this.fullName.first;
    }
    
    public String getFirstName() {
        return this.fullName.first;
    }

    public void setFullName(String fullName) throws InvalidNameException {
        var infoFilter = new InfoFilterImp();
        try {
            if (infoFilter.isNameValid(fullName)) {
                var words = fullName.split("\\s+");
                this.fullName.first = words[words.length - 1];
                this.fullName.last = words[0];
                var mid = "";
                for (int i = 1; i < words.length - 1; i++) {
                    mid += words[i] + " ";
                }
                this.fullName.mid = mid;
            }
        } catch (InvalidNameException ex) {
            throw ex;
        }
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(String dob) throws InvalidDateOfBirthException {
        var infoFilter = new InfoFilterImp();
        try {
            if (infoFilter.isDateOfBirthValid(dob)) {
                var dobStr = "dd/MM/yyyy";
                SimpleDateFormat dateFormat = new SimpleDateFormat(dobStr);
                this.dob = dateFormat.parse(dob);
            }
        } catch (InvalidDateOfBirthException ex) {
            throw ex;
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
    }

    class FullName implements Serializable {

        private String first;
        private String mid;
        private String last;

        public FullName() {
            first = "";
            last = "";
            mid = "";
        }

        public FullName(String first, String mid, String last) {
            this.first = first;
            this.mid = mid;
            this.last = last;
        }

        public String getFirst() {
            return first;
        }

        public void setFirst(String first) {
            this.first = first;
        }

        public String getMid() {
            return mid;
        }

        public void setMid(String mid) {
            this.mid = mid;
        }

        public String getLast() {
            return last;
        }

        public void setLast(String last) {
            this.last = last;
        }
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + Objects.hashCode(this.id);
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
        final Person other = (Person) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

}
