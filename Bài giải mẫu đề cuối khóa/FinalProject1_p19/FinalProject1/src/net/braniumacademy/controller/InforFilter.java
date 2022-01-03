package net.braniumacademy.controller;

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
public interface InforFilter {

    boolean isStudentIdValid(String id) throws InvalidStudentIdException;

    boolean isPersonIdValid(String id) throws InvalidPersonIdException;

    boolean isNameValid(String name) throws InvalidNameException;

    boolean isEmailValid(String email) throws InvalidEmailException;

    boolean isPhoneNumberValid(String phoneNumber) 
            throws InvalidPhoneNumberException;

    boolean isDateOfBirthValid(String dobString) 
            throws InvalidDateOfBirthException;
}
