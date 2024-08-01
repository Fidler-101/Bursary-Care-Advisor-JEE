/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.tut.model;

import java.util.ArrayList;

/**
 *
 * @author boika
 */
public class Senior_Administrator {
    
    private int seniorAdminID;
    private String username;
    private String password;
    private String email;
    private String status;
    private int applicantNumber;
    private ArrayList<Applicant> fundedList;

    public ArrayList<Applicant> getFundedList() {
        return fundedList;
    }

    public void setFundedList(ArrayList<Applicant> fundedList) {
        this.fundedList = fundedList;
    }

    
    public Senior_Administrator() {
        seniorAdminID =0;
        username="";
        password="";
        email="";
        status="";
        applicantNumber=0;
        fundedList= new ArrayList<>();
    }

    public Senior_Administrator(int seniorAdminID, String username, String password, String email, String status, int applicantNumber) {
        this.seniorAdminID = seniorAdminID;
        this.username = username;
        this.password = password;
        this.email = email;
        this.status = status;
        this.applicantNumber = applicantNumber;
        fundedList = new ArrayList<>();
    }

    public int getSeniorAdminID() {
        return seniorAdminID;
    }

    public void setSeniorAdminID(int seniorAdminID) {
        this.seniorAdminID = seniorAdminID;
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

    public int getApplicantNumber() {
        return applicantNumber;
    }

    public void setApplicantNumber(int applicantNumber) {
        this.applicantNumber = applicantNumber;
    }
    
    public String sendSMS(int phoneNum){
    
        return "  Senior administrator: " +this.seniorAdminID +" has  approved the applicant to be funded";
    }
    
    public String sendEmail(String newEmail){
     
        return " Senior administrator: " +this.email+" has  approved the applicant to be funded";
    }
}
