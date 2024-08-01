
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.tut.model;

import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.*;

/**
 *
 * @author boika
 */
public class UniversityManager implements DatabaseInterface<University> {

    private Connection connect;

    public UniversityManager(String url, String user, String password) throws SQLException {
        connect = DriverManager.getConnection(url, user, password);
    }

    @Override
    public boolean add(University t) throws SQLException {
        String sqlCommand = "INSERT INTO university   VALUES(?,?,?,?,?,?,?)";

        PreparedStatement statement = connect.prepareStatement(sqlCommand);

        statement.setInt(1, t.getUniversityID());
        statement.setString(2, t.getName());
        statement.setString(3, t.getLocation());
        statement.setInt(4, t.getApplicantNumber());
        statement.setString(5, t.getUniverAccLetter());
        statement.setString(6, t.getGender());
        statement.setString(7, t.getBirthday());

        statement.execute();
        statement.close();

        return true;
    }

    @Override
    public boolean delete(int appID) throws SQLException {

        String sqlComm = "DELETE FROM university   WHERE universityid= ?";

        PreparedStatement state = connect.prepareStatement(sqlComm);

        state.setInt(1, appID);
        state.execute();
        state.close();

        return true;

    }

    @Override
    public String searchApplicant(int appID) throws SQLException {

        University theAdmin;
        String newUser = "";

        String sqlTable = "SELECT *  FROM university  WHERE universityid=?";
        PreparedStatement pState = connect.prepareStatement(sqlTable);
        pState.setInt(1, appID);

        ResultSet result = pState.executeQuery();

        if (result.next()) {

            int adNum = result.getInt("universityid");
            String name = result.getString("name");
            String location = result.getString("location");
            //String filePart = result.getString("UniversityAccLetter");

            int appNum = result.getInt("applicantID");
            String gender = result.getString("gender");
            String birthday = result.getString("birthday");

            theAdmin = new University(appID, name, location, appNum, gender, birthday);
            newUser = theAdmin.toString();

        } else {
            theAdmin = null;
            newUser = " The University is not in the database.";
        }

        return newUser;

    }

    @Override
    public boolean update(University newApp) throws SQLException {
        String sqlTable = "UPDATE university    SET location = ?, name =? "
                + "  WHERE applicantID = ? ";

        PreparedStatement statement = connect.prepareStatement(sqlTable);
        statement.setString(1, newApp.getLocation());
        statement.setString(2, newApp.getName());
        statement.setInt(3, newApp.getApplicantNumber());

        statement.executeUpdate();
        statement.close();

        return true;
    }

    @Override
    public ArrayList<University> getAllApplicant() throws SQLException {
        ArrayList<University> adminList = new ArrayList<>();

        University theAdmin;
        String newUser = "";

        String sqlTable = "SELECT *  FROM university ";
        PreparedStatement pState = connect.prepareStatement(sqlTable);

        ResultSet result = pState.executeQuery();

        while (result.next()) {

            int adNum = result.getInt("universityID");
            String name = result.getString("name");
            String location = result.getString("location");
            //String letter = result.getString("universityId");
            //String status = result.getString("universityId");
            int appNum = result.getInt("applicantID");

            String gender = result.getString("gender");
            String birthday = result.getString("birthday");

            theAdmin = new University(appNum, name, location, appNum, gender, birthday);

            adminList.add(theAdmin);
        }

        return adminList;

    }

    @Override
    public Applicant viewApplicant(String string) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Administrator viewAdministrator(String logUsername) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<University> getAllApplicants() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean updateStatus(Applicant t) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Bursary_Interviewer viewBursaryInterviewer(String string) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Bursary viewBursary(String string) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
