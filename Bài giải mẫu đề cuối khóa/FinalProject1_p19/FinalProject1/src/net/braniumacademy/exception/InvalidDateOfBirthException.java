package net.braniumacademy.exception;

/**
 *
 * @author braniumacademy <braniumacademy.net>
 */
public class InvalidDateOfBirthException extends Exception {

    private String invalidDob;

    public InvalidDateOfBirthException() {
    }

    public InvalidDateOfBirthException(String invalidDob, String message) {
        super(message);
        this.invalidDob = invalidDob;
    }

    public String getInvalidDob() {
        return invalidDob;
    }

    public void setInvalidDob(String invalidDob) {
        this.invalidDob = invalidDob;
    }
}
