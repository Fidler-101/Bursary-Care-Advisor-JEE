/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.tut.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author boika
 */
public class Administrator {

    private int adminNumber;
    private String username;
    private String password;
    private String email;
    private String status;
    private int applicantNumber;
    private String gender;
    private String birthday;
    // private List<Image> images;

    private byte[] image;

    public Administrator() {
        this.adminNumber = 0;
        this.username = "";
        this.password = "";
        this.email = "";
        this.status = "";
        this.applicantNumber = 0;
        this.applicantList = new ArrayList<>();
        this.gender = "";
        this.birthday = "";
        //this.images = new ArrayList<>();
    }

    public Administrator(int adminNumber, String username, String password, String email, String gender, String birthday, String status, int applicantNumber) {
        this.adminNumber = adminNumber;
        this.username = username;
        this.password = password;
        this.email = email;
        this.applicantNumber = applicantNumber;
        this.status = status;
        this.gender = gender;
        this.birthday = birthday;
    }

    public Administrator(int adminNumber, String username, String password, String email, String status, int applicantNumber, String gender, String birthday, Applicant getApplicant) {
        this.adminNumber = adminNumber;
        this.username = username;
        this.password = password;
        this.email = email;
        this.status = status;
        this.gender = gender;
        this.birthday = birthday;
        this.applicantNumber = applicantNumber;
        this.applicantList.add(getApplicant);
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
    private List<Applicant> applicantList;

    public void setApplicantList(List<Applicant> applicantList) {
        this.applicantList = applicantList;
    }

    public List<Applicant> getApplicantList() {
        return applicantList;
    }

    public int getAdminNumber() {
        return adminNumber;
    }

    public void setAdminNumber(int adminNumber) {
        this.adminNumber = adminNumber;
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

    public String sendSMS(int phoneNum) {

        return "Administrator: " + this.adminNumber + " has  approved the filled details";
    }

    public String sendEmail(String newEmail) {

        return "Administrator: " + this.email + " has  approved the filled details";
    }

    @Override
    public String toString() {
        return "Administrator{" + "adminNumber=" + adminNumber + ", username=" + username +
                ", password=" + password + ", email=" + email + ", status=" + status +
                ", applicantNumber=" + applicantNumber + ", gender=" + gender + ", birthday=" + birthday + ", applicantList=" + applicantList + '}';
    }

}
