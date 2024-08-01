/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.tut.exception;

/**
 *
 * @author User
 */
public class EmptyStringExceptionManager implements EmptyStringExceptionInterface{

    @Override
    public boolean checkStringField(String fieldData) throws EmptyStringException {

        if(fieldData.isEmpty() && fieldData.isBlank()){
            
            return true;
        }else{
            throw new EmptyStringException(  "You have to fill in data to the field");
        }
        
    }
    
}
