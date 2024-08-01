<%-- 
    Document   : getAllTheUniversities
    Created on : Apr 17, 2024, 12:19:39 PM
    Author     : boika
--%>
<%@page import="java.util.List"%>
<%@page import="za.ac.tut.model.University"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Get All Universities Outcome Page</title>
    </head>
    <body>
        <h1>Get All Universities Outcome!</h1>


        <%
            List<University> list = (List<University>) request.getAttribute("list");
        %>

        <table>

            <%
                for (int i = 0; i < list.size(); i++) {

            %>
            <tr>
                <td>University ID: </td>
                <td><%=list.get(i).getUniversityID()%></td>
            </tr>


            <tr>
                <td>Name: </td>
                <td> <%=list.get(i).getName()%> </td>
            </tr>

            <tr>
                <td>Location: </td>
                <td> <%=list.get(i).getLocation()%></td>
            </tr>

            <tr>
                <td>Applicant number: </td>
                <td> <%=list.get(i).getApplicantNumber()%> </td>
            </tr>

            <tr>
                <td>University acceptance letter: </td>
                <td></td>
            </tr>

            <tr>
                <td>Gender of Applicant: </td>
                <td> <%=list.get(i).getGender()%> </td>
            </tr>

            <tr>
                <td>Date of Birth: </td>
                <td> <%=list.get(i).getBirthday()%> </td>
            </tr>

            <br/><br/>

            <%                }
            %>

        </table>


        <p>
            Please click <a href="index.html">here</a> to go to the main page.
        </p>
    </body>
</html>
