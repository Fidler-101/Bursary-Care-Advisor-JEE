/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.tut.model;

/**
 *
 * @author boika
 */
public class University {
    
    private int universityID;
    private String name;
    private String location;
    private int applicantNumber;
    private String univerAccLetter;
    private String gender;
    private String birthday;

    public University() {
        universityID =0;
        name = "";
        location = "";
        applicantNumber = 0;
        univerAccLetter ="";
        gender ="";
        birthday ="";
        
    }


    public University(int universityID, String name, String location, int applicantNumber , String gender , String birthday) {
        this.universityID = universityID;
        this.name = name;
        this.location = location;
        this.applicantNumber = applicantNumber;
        this.gender = gender;
        this.birthday = birthday;
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

    public int getUniversityID() {
        return universityID;
    }

    public void setUniversityID(int universityID) {
        this.universityID = universityID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getApplicantNumber() {
        return applicantNumber;
    }

    public void setApplicantNumber(int applicantNumber) {
        this.applicantNumber = applicantNumber;
    }

    public String getUniverAccLetter() {
        return univerAccLetter;
    }

    public void setUniverAccLetter(String univerAccLetter) {
        this.univerAccLetter = univerAccLetter;
    }

    @Override
    public String toString() {
        return "University{" + "universityID=" + universityID + ", name=" + name + ", location=" + location + ", applicantNumber=" + applicantNumber + ", univerAccLetter=" + univerAccLetter + ", gender=" + gender + ", birthday=" + birthday + '}';
    }

    
    
    
}
