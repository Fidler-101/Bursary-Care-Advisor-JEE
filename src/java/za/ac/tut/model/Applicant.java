/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.tut.model;

import java.sql.Timestamp;

public class Applicant {

    private int applicantNumber;
    private String username;
    private String lastName;
    private String firstName;
    private Timestamp dateJoined;
    private String password;
    private String univerAccLetter;
    private int phoneNumber;
    private String email;
    private Timestamp lastLogin;
    private String status;
    private String gender;
    private String birthday;
    private byte[] image;
    private byte[] letter;

    public Applicant() {
        applicantNumber = 0;
        username = "";
        lastName = "";
        firstName = "";
        dateJoined = null;
        password = "";
        univerAccLetter = "";
        phoneNumber = 0;
        email = "";
        lastLogin = null;
        status = "";
        gender = "";
        birthday = "";
        image = new byte[0];
        letter =new byte[0];

    }

    public Applicant(int applicantNumber, String lastName, String firstName, int phoneNumber, String email, String gender, String birthday, byte[] image, byte[] letter) {
        this.applicantNumber = applicantNumber;
        this.lastName = lastName;
        this.firstName = firstName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.gender = gender;
        this.birthday = birthday;
    }

    public Applicant(int applicantNumber, String username, String lastName, String firstName, Timestamp dateJoined, String password, String univerAccLetter, int phoneNumber, String email, Timestamp lastLogin, String status, String gender, String birthday, byte[] image, byte[] letter) {
        this.applicantNumber = applicantNumber;
        this.username = username;
        this.lastName = lastName;
        this.firstName = firstName;
        this.dateJoined = dateJoined;
        this.password = password;
        this.univerAccLetter = univerAccLetter;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.lastLogin = lastLogin;
        this.status = status;
        this.gender = gender;
        this.birthday = birthday;
        this.image = image;
        this.letter = letter;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public byte[] getLetter() {
        return letter;
    }

    public void setLetter(byte[] letter) {
        this.letter = letter;
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

    public int getApplicantNumber() {
        return applicantNumber;
    }

    public void setApplicantNumber(int applicantNumber) {
        this.applicantNumber = applicantNumber;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Timestamp getDateJoined() {
        return dateJoined;
    }

    public void setDateJoined(Timestamp dateJoined) {
        this.dateJoined = dateJoined;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUniverAccLetter() {
        return univerAccLetter;
    }

    public void setUniverAccLetter(String univerAccLetter) {
        this.univerAccLetter = univerAccLetter;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Timestamp getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(Timestamp lastLogin) {
        this.lastLogin = lastLogin;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Applicant{" + "applicantNumber=" + applicantNumber + ", username=" + username + ", lastName=" + lastName + ", firstName=" + firstName + ", dateJoined=" + dateJoined + ", password=" + password + ", univerAccLetter=" + univerAccLetter + ", phoneNumber=" + phoneNumber + ", email=" + email + ", lastLogin=" + lastLogin + ", status=" + status + ", gender=" + gender + ", birthday=" + birthday + '}';
    }

}
