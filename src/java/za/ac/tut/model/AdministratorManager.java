/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.tut.model;

import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.servlet.annotation.MultipartConfig;

/**
 *
 * @author boika
 */
@MultipartConfig
public class AdministratorManager implements DatabaseInterface<Administrator> {

    private Connection connect;

    public AdministratorManager(String url, String user, String password) throws SQLException {
        connect = DriverManager.getConnection(url, user, password);
    }

    @Override
    public boolean add(Administrator t) throws SQLException {

        String sqlCommand = "INSERT INTO administrator VALUES(?,?,?,?,?,?,?,?,?)";

        PreparedStatement statement = connect.prepareStatement(sqlCommand);

        statement.setInt(1, t.getAdminNumber());
        statement.setString(2, t.getUsername());
        statement.setString(3, t.getPassword());
        statement.setString(4, t.getEmail());
        statement.setString(7, t.getGender());
        statement.setString(8, t.getBirthday());
        statement.setString(5, t.getStatus());
        statement.setInt(6, t.getApplicantNumber());
        statement.setBytes(9, t.getImage());

        statement.execute();
        statement.close();

        return true;
    }

    @Override
    public boolean delete(int idNum) throws SQLException {

        String sqlComm = "DELETE FROM administrator   WHERE adminNumber= ?";

        PreparedStatement state = connect.prepareStatement(sqlComm);

        state.setInt(1, idNum);
        state.execute();
        state.close();

        return true;

    }

    @Override
    public String searchApplicant(int appID) throws SQLException {
        Administrator theAdmin;
        String newUser = "";

        String sqlTable = "SELECT *  FROM administrator  WHERE adminNumber=?";
        PreparedStatement pState = connect.prepareStatement(sqlTable);
        pState.setInt(1, appID);

        ResultSet result = pState.executeQuery();

        if (result.next()) {

            int adNum = result.getInt("adminNumber");
            String name = result.getString("username");
            String pass = result.getString("password");
            String email = result.getString("email");
            String gender = result.getString("gender");
            String birthday = result.getString("birthday");
            String status = result.getString("status");
            int appNum = result.getInt("id");

            theAdmin = new Administrator(adNum, name, pass, email, gender, birthday, status, appNum);
            newUser = theAdmin.toString();

        } else {
            theAdmin = null;
            newUser = " The administrator is not in the database.";
        }

        return newUser;
    }

    @Override
    public ArrayList<Administrator> getAllApplicant() throws SQLException {
        ArrayList<Administrator> adminList = new ArrayList<>();

        Administrator theAdmin;
        String newUser = "";

        String sqlTable = "SELECT *  FROM administrator ";
        PreparedStatement pState = connect.prepareStatement(sqlTable);

        ResultSet result = pState.executeQuery();

        while (result.next()) {

            int adNum = result.getInt("adminNumber");
            String name = result.getString("username");
            String pass = result.getString("password");
            String email = result.getString("email");
            String gender = result.getString("gender");
            String birthday = result.getString("birthday");
            String status = result.getString("status");
            int appNum = result.getInt("id");

            theAdmin = new Administrator(adNum, name, pass, email, gender, birthday, status, appNum);

            adminList.add(theAdmin);

        }

        return adminList;

    }

    @Override
    public boolean update(Administrator newApp) throws SQLException {
        String sqlTable = "UPDATE administrator    SET status = ? "
                + "  WHERE adminNumber = ? ";

        PreparedStatement statement = connect.prepareStatement(sqlTable);
        statement.setString(1, newApp.getStatus());
        statement.setInt(2, newApp.getAdminNumber());

        statement.executeUpdate();
        statement.close();

        return true;
    }

    @Override
    public Administrator viewAdministrator(String logUsername) throws SQLException {
        Administrator ad = new Administrator();

        String sql = "SELECT username,email,adminnumber FROM administrator where username=?";

        PreparedStatement ps = connect.prepareStatement(sql);
        ps.setString(1, logUsername);

        ResultSet rs = ps.executeQuery();

        if (rs.next()) {

            String username = rs.getString("username");
            String email = rs.getString("email");
            Integer adminNumber = rs.getInt("adminnumber");

            ad.setUsername(username);
            ad.sendEmail(email);
            ad.setAdminNumber(adminNumber);

        }
        return ad;

    }

    @Override
    public Applicant viewApplicant(String logUsername) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<Administrator> getAllApplicants() throws SQLException {
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
