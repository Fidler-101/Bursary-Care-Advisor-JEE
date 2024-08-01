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
public class Bursary_Interviewer {

    private int interviewerID;
    private String username;
    private String name;
    private String password;
    private String email;
    private int applicantNumber;
    private int adminNumber;
    private int bursaryID;
    private ArrayList<Applicant> AcceptedList;

    public ArrayList<Applicant> getAcceptedList() {
        return AcceptedList;
    }

    public void setAcceptedList(ArrayList<Applicant> AcceptedList) {
        this.AcceptedList = AcceptedList;
    }

    public Bursary_Interviewer() {
       
    }

    public Bursary_Interviewer(int interviewerID, String username, String password, String email, int applicantNumber, int adminNumber, int bursaryID, Applicant getApplicant) {
        this.interviewerID = interviewerID;
        this.username = username;
        this.password = password;
        this.email = email;
        this.applicantNumber = applicantNumber;
        this.adminNumber = adminNumber;
        this.bursaryID = bursaryID;
        this.AcceptedList.add(getApplicant);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getInterviewerID() {
        return interviewerID;
    }

    public void setInterviewerID(int interviewerID) {
        this.interviewerID = interviewerID;
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

    public int getApplicantNumber() {
        return applicantNumber;
    }

    public void setApplicantNumber(int applicantNumber) {
        this.applicantNumber = applicantNumber;
    }

    public int getAdminNumber() {
        return adminNumber;
    }

    public void setAdminNumber(int adminNumber) {
        this.adminNumber = adminNumber;
    }

    public int getBursaryID() {
        return bursaryID;
    }

    public void setBursaryID(int bursaryID) {
        this.bursaryID = bursaryID;
    }

}
