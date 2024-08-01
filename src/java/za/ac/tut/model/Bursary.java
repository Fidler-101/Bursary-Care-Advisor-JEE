/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.tut.model;

import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author boika
 */
public class Bursary {
    
    private int bursaryID;
    private String name;
    private String description;
    private LocalDate appliedDate;
    private Date  deadline;
    private String status;
    private int applicantNumber;

    public Bursary() {
        bursaryID =0;
        name =" ";
        description =" ";
        appliedDate =null;
        deadline = null;
        status =" ";
        applicantNumber = 0;
    }

    public Bursary(int bursaryID, String name, String description, LocalDate appliedDate, Date deadline, String status, int applicantNumber) {
        this.bursaryID = bursaryID;
        this.name = name;
        this.description = description;
        this.appliedDate = appliedDate;
        this.deadline = deadline;
        this.status = status;
        this.applicantNumber = applicantNumber;
    }

    public int getBursaryID() {
        return bursaryID;
    }

    public void setBursaryID(int bursaryID) {
        this.bursaryID = bursaryID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getAppliedDate() {
        return appliedDate;
    }

    public void setAppliedDate(LocalDate appliedDate) {
        this.appliedDate = appliedDate;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
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
    
    
    
}
