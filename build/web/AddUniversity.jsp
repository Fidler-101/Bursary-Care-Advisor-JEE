<%-- 
    Document   : AddUniversity
    Created on : Apr 17, 2024, 12:18:50 AM
    Author     : boika
--%>

<%@page import="java.util.List"%>
<%@page import="za.ac.tut.model.Applicant"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>University Registration</title>

        <%
            List<Applicant> getList = (List<Applicant>) request.getAttribute("list");
        %>
        <style>
            body {
                font-family: Arial, sans-serif;
                margin: 0;
                padding: 0;
                box-sizing: border-box;
            }
            form {
                max-width: 400px;
                margin: 50px auto;
                padding: 20px;
                border: 1px solid #ccc;
                border-radius: 5px;
            }
            label {
                display: block;
                margin-bottom: 5px;
                font-weight: bold;
            }
            input[type="text"] {
                width: 100%;
                padding: 8px;
                margin-bottom: 10px;
                border: 1px solid #ccc;
                border-radius: 3px;
                box-sizing: border-box;
            }
            input[type="file"] {
                margin-bottom: 10px;
            }
            input[type="submit"] {
                width: 100%;
                padding: 10px;
                border: none;
                background-color: #007bff;
                color: #fff;
                cursor: pointer;
                border-radius: 3px;
            }
            input[type="submit"]:hover {
                background-color: #0056b3;
            }
            h1{
                text-align: center;
            }
        </style>
    </head>
    <body>
        <h1>University Registration.</h1>
        <form action=" UniversityServlet.do" method="post" >
            <label for="university_id">University ID:</label>
            <input type="text" id="university_id" name="universityid" required>

            <label for="id">Applicant ID:</label>
            <select  id="applicant"  name="id"required>
                <% for (int i = 0; i < getList.size(); i++) {%>
                <option value="<%=getList.get(i).getApplicantNumber()%>"><%=getList.get(i).getApplicantNumber()%></option>
                <%}%>
                <br/>
            </select>


            <!-- Adding the gender code to the servlet is left -->
            <label for="gender">Gender: </label>
            <input type="radio"  name="gender" value="male">Male<br/>
            <input type="radio"  name="gender" value="female">Female<br/>
            <br/>

            
            <!-- Adding the gender code to the servlet is left -->
            <label for="birthday">Date of birth:</label>
            <input type="date" id="birthday" name="birthday"  required="" />

            <label for="name">Name:</label>
            <input type="text" id="name" name="name" required>

            
            <label for="location">Location:</label>
            <input type="text" id="location" name="location" required>


            <label for="university_acc_letter">University Acceptance Letter:</label>
            <input type="file" id="university_acc_letter" name="universityAccletter" accept=".pdf" required>

            <input type="submit" value="ADD">
            <input type="hidden" name="option" value="add"/>
        </form>
    </body>
</html>
