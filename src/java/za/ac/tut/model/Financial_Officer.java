/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.tut.model;

/**
 *
 * @author boika
 */
public class Financial_Officer {
    
    private int officeID;
    private String username;
    private String password;
    private String email;
    private String status;
    private int seniorAdminID;
    

    public Financial_Officer() {
        officeID=0;
        username="";
        password="";
        email="";
        status="";
        seniorAdminID=0;
    }

    
    
    public Financial_Officer(int officeID, String username, String password, String email, String status, int seniorAdminID) {
        this.officeID = officeID;
        this.username = username;
        this.password = password;
        this.email = email;
        this.status = status;
        this.seniorAdminID = seniorAdminID;
    }

    public int getOfficeID() {
        return officeID;
    }

    public void setOfficeID(int officeID) {
        this.officeID = officeID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getSeniorAdminID() {
        return seniorAdminID;
    }

    public void setSeniorAdminID(int seniorAdminID) {
        this.seniorAdminID = seniorAdminID;
    }
    
       public String sendSMS(int phoneNum){
    
        return "Financial Officer: " +this.officeID +" is tracking your bursary payments";
    }
    
    public String sendEmail(String newEmail){
     
        return "Financial Officer: " +this.email+" is tracking your bursary payments";
    }
    
    
}
