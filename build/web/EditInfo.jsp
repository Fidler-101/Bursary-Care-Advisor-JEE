<%-- 
    Document   : viewApplicantAccount
    Created on : May 14, 2024, 12:55:03 PM
    Author     : boika
--%>

<%@page import="za.ac.tut.model.Applicant"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit Account Page</title>
    </head>
    <body>
        <%

            String name = (String) session.getAttribute("firstname");
            String lastname = (String) session.getAttribute("lastname");
            String dob = (String) session.getAttribute("dob");

            String birthday = (String) session.getAttribute("birthday");

            String gender = (String) session.getAttribute("gender");
            String email = (String) session.getAttribute("email");
            Integer id = (Integer) session.getAttribute("id");
            Integer cellNumber=(Integer)session.getAttribute("cellNumber");
        %>
        <h1>View Personal Account</h1>

        <table>
            <tr>
                <td>Name:</td>
                <td><input type="text" value="<%=name%>"></td>
            </tr>

            <tr>
                <td>Surname:</td>
                <td><input type="text" value="<%=dob%>"></td>
            </tr>
            <tr>
                <td>Gender:</td>
                <td><input type="text" value="<%=gender%>"></td>
            </tr>
            <tr>
                <td>Email:</td>
                <td><input type="text" value="<%=email%>"></td>
            </tr>
            
            <tr>
                <td>Cell Number:</td>
                <td><input type="text" value="<%=cellNumber%>"></td>
            </tr>

            <tr>
                <td>ID Number:</td>
                <td><input type="text" value="<%=id%>"></td>
            </tr>
            

        </table>

    </body>
</html>
