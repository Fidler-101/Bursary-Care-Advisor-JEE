/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package za.ac.tut.model;

import java.sql.SQLException;
import java.util.ArrayList;

public interface DatabaseInterface<T> {

    public boolean add(T t) throws SQLException;

    public boolean delete(int appID) throws SQLException;

    public String searchApplicant(int appID) throws SQLException;

    public Applicant viewApplicant(String logUsername) throws SQLException;

    public Administrator viewAdministrator(String logUsername) throws SQLException;

    public boolean update(T newApp) throws SQLException;

    public boolean updateStatus(Applicant id) throws SQLException;

    public ArrayList<T> getAllApplicant() throws SQLException;

    public Bursary_Interviewer viewBursaryInterviewer(String logUsername) throws SQLException;

    public Bursary viewBursary(String logUsername) throws SQLException;

    public ArrayList<T> getAllApplicants() throws SQLException;
    
    
}
