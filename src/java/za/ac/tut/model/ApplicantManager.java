/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.tut.model;

import java.io.InputStream;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.*;
import java.time.Instant;
import java.util.List;

/**
 *
 * @author boika
 */
public class ApplicantManager implements DatabaseInterface<Applicant> {

    private Connection connection;

    public ApplicantManager(String urlDB, String usernameDB, String passwordDB) throws SQLException {
        connection = DriverManager.getConnection(urlDB, usernameDB, passwordDB);
    }

    @Override
    public boolean add(Applicant t) throws SQLException {

        String sql = "INSERT INTO applicant (username,firstname,lastname,id,gender,dob,cell_number,email,password,datelogin,status) VALUES(?,?,?,?,?,?,?,?,?,?,?)";

        PreparedStatement ps = connection.prepareStatement(sql);

        Timestamp timestamp1 = Timestamp.from(Instant.now());
        Timestamp timestamp2 = Timestamp.from(Instant.now());
        ps.setString(1, t.getUsername());
        ps.setString(2, t.getFirstName());
        ps.setString(3, t.getLastName());
        ps.setInt(4, t.getApplicantNumber());
        ps.setString(5, t.getGender());
        ps.setString(6, t.getBirthday());
        ps.setInt(7, t.getPhoneNumber());
        ps.setString(8, t.getEmail());
        ps.setString(9, t.getPassword());
        ps.setTimestamp(10, timestamp1);
        ps.setString(11, t.getStatus());

        // ps.setBytes(11, t.getUniverAccLetter().getBytes());
        // ps.setBlob(0, in);
        ps.executeUpdate();
        ps.close();

        return true;
    }

    @Override
    public boolean delete(int appID) throws SQLException {
        String sql = "DELETE FROM applicant where id=?";

        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setInt(1, appID);

        ps.executeUpdate();
        ps.close();

        return true;
    }

    @Override
    public boolean update(Applicant newApp) throws SQLException {
        String sql = "UPDATE applicant SET letter=?, pictures=?  WHERE id=?";

        PreparedStatement ps = connection.prepareStatement(sql);

        ps.setBytes(1, newApp.getLetter());
        ps.setBytes(2, newApp.getImage());

        ps.setInt(3, newApp.getApplicantNumber());
        ps.executeUpdate();
        ps.close();

        return true;
    }

    @Override
    public ArrayList<Applicant> getAllApplicant() throws SQLException {

        List<Applicant> lists = new ArrayList<>();

        String sql = "SELECT id,firstname,lastname,cell_number,status,dob,email FROM  applicant";

        PreparedStatement ps = connection.prepareStatement(sql);

        ResultSet rs = ps.executeQuery();
        while (rs.next()) {

            Integer idNo = rs.getInt("id");
            // String username = rs.getString("username");
            String lastname = rs.getString("lastname");
            String firstname = rs.getString("firstname");
            // Timestamp datejoined = rs.getTimestamp("datelogin");
            Integer phoneNumber = rs.getInt("cell_number");
            // Timestamp lastLogin = rs.getTimestamp("lastlogin");
            String email = rs.getString("email");

            // String univerAccLetter = rs.getString("univerAccLetter");
            String status = rs.getString("status");
            // String gender = rs.getString("gender");
            String birthday = rs.getString("dob");

            Applicant applicant = new Applicant();

            applicant.setApplicantNumber(idNo);
            //applicant.setUsername(username);
            applicant.setFirstName(firstname);
            applicant.setLastName(lastname);
            // applicant.setDateJoined(datejoined);
            applicant.setStatus(status);
            applicant.setLastName(lastname);
            // applicant.setUniverAccLetter(univerAccLetter);

            applicant.setPhoneNumber(phoneNumber);
            applicant.setEmail(email);
            //applicant.setGender(gender);
            applicant.setBirthday(birthday);

            lists.add(applicant);

        }
        return (ArrayList<Applicant>) lists;
    }

    @Override
    public String searchApplicant(int id) throws SQLException {

        String sql = "SELECT  id,username,password,email  FROM applicant where id =?";

        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setInt(1, id);

        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            Integer idNo = rs.getInt("id");
            String username = rs.getString("username");
            String password = rs.getString("password");
            String email = rs.getString("email");

            return "Id No:" + idNo + "\n" + "username :" + username
                    + "\n" + "password :" + password;

        } else {
            return "User id :" + id + "not found";

        }
    }

    @Override
    public Applicant viewApplicant(String logUsername) throws SQLException {

        Applicant applicant = new Applicant();

        String sql = "SELECT username,firstname,lastname,id,gender,dob,cell_number,email,status FROM applicant where  username=? ";

        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, logUsername);

        ResultSet rs = ps.executeQuery();

        if (rs.next()) {

            String username = rs.getString("username");
            String lastname = rs.getString("lastname");
            String firstname = rs.getString("firstname");
            String dob = rs.getString("dob");
            String gender = rs.getString("gender");
            Integer cellNumber = rs.getInt("cell_number");
            Integer id = rs.getInt("id");
            String email = rs.getString("email");
            String status = rs.getString("status");

            //creating object
            applicant.setApplicantNumber(id);
            applicant.setFirstName(firstname);
            applicant.setLastName(lastname);
            applicant.setPhoneNumber(cellNumber);
            applicant.setUsername(username);
            applicant.setEmail(email);
            applicant.setGender(gender);
            applicant.setBirthday(dob);
            applicant.setStatus(status);

        }
        return applicant;
    }

    @Override
    public Administrator viewAdministrator(String logUsername) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<Applicant> getAllApplicants() throws SQLException {
        List<Applicant> lists = new ArrayList<>();

        String sql = "SELECT id,firstname,lastname,cell_number,status,dob,email FROM  applicant Where status = 'Accepted'";

        PreparedStatement ps = connection.prepareStatement(sql);

        ResultSet rs = ps.executeQuery();
        while (rs.next()) {

            Integer idNo = rs.getInt("id");
            // String username = rs.getString("username");
            String lastname = rs.getString("lastname");
            String firstname = rs.getString("firstname");
            // Timestamp datejoined = rs.getTimestamp("datelogin");
            Integer phoneNumber = rs.getInt("cell_number");
            // Timestamp lastLogin = rs.getTimestamp("lastlogin");
            String email = rs.getString("email");

            // String univerAccLetter = rs.getString("univerAccLetter");
            String status = rs.getString("status");
            // String gender = rs.getString("gender");
            String birthday = rs.getString("dob");

            Applicant applicant = new Applicant();

            applicant.setApplicantNumber(idNo);
            //applicant.setUsername(username);
            applicant.setFirstName(firstname);
            applicant.setLastName(lastname);
            // applicant.setDateJoined(datejoined);
            applicant.setStatus(status);
            applicant.setLastName(lastname);
            // applicant.setUniverAccLetter(univerAccLetter);

            applicant.setPhoneNumber(phoneNumber);
            applicant.setEmail(email);
            //applicant.setGender(gender);
            applicant.setBirthday(birthday);

            lists.add(applicant);

        }
        return (ArrayList<Applicant>) lists;

    }

    @Override
    public boolean updateStatus(Applicant id) throws SQLException {

        String sql = "UPDATE applicant SET status=?  WHERE id=?";

        PreparedStatement ps = connection.prepareStatement(sql);

        ps.setString(1, id.getStatus());

        ps.setInt(2, id.getApplicantNumber());
        ps.executeUpdate();
        ps.close();

        return true;

    }

    @Override
    public Bursary_Interviewer viewBursaryInterviewer(String logUsername) throws SQLException {
        Bursary_Interviewer applicant = new Bursary_Interviewer();

        String sql = "SELECT id, name,email FROM Interviewer where  username =? ";

        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, logUsername);

        ResultSet rs = ps.executeQuery();

        if (rs.next()) {

            Integer id = rs.getInt("id");
            String name = rs.getString("name");

            String email = rs.getString("email");
            // String username = rs.getString("username");

            //creating object
            applicant.setInterviewerID(id);
            applicant.setName(name);

            applicant.setEmail(email);
            applicant.setUsername(logUsername);

        }
        return applicant;
    }

    @Override
    public Bursary viewBursary(String string) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
