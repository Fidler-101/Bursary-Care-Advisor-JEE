/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.tut.exception;

/**
 *
 * @author User
 */
public class LengthExceptionManager implements LengthExceptionInterface{

    @Override
    public boolean isCorrectLength(String enteredData) throws LengthException {

        if(enteredData.length() > 25){
            return true;
        }
        else{
            throw new LengthException(enteredData+" must have a length of less than 25  characters");
        }
    }
    
}
