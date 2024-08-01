/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.tut.exception;

/**
 *
 * @author User
 */
public class NumberExceptionManager implements NumberExceptionInterface {

    @Override
    public boolean isCorrectNumberFormat(String enteredData) throws NumberException {

        boolean isValid = false;
        int count = 0;

        for (int i = 0; i < enteredData.length(); i++) {

            char index = enteredData.charAt(i);
            if (Character.isDigit(index)) {
                count++;
            }
        }

        if (count == 0) {
            isValid = true;
            return isValid;
        } else {
            throw new NumberException(enteredData + " must have numbers only.");
        }

    }

}
