<%-- 
    Document   : addAdministrator
    Created on : Apr 16, 2024, 7:42:39 PM
    Author     : boika
--%>

<%@page import="java.util.List"%>
<%@page import="za.ac.tut.model.Applicant"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Administrator Registration</title>
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
            input[type="text"],
            input[type="password"],
            input[type="email"] {
                width: 100%;
                padding: 8px;
                margin-bottom: 10px;
                border: 1px solid #ccc;
                border-radius: 3px;
                box-sizing: border-box;
            }
            select {
                width: 100%;
                padding: 8px;
                margin-bottom: 10px;
                border: 1px solid #ccc;
                border-radius: 3px;
                box-sizing: border-box;
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
        <h1>Bursary Care Advisor Administrator.</h1>
        <form action="AdministratorServlet.do" method="post" enctype="multipart/form-data">
            
            <label for="admin_image">Image:</label>
            <input type="file" id="admin_image" name="image">
            
            <label for="admin_number">Admin Number:</label>
            <input type="text" id="admin_number" name="adminNumber" required>

            <label for="username">Username:</label>
            <input type="text" id="username" name="username" required>

            <label for="password">Password:</label>
            <input type="password" id="password" name="password" required>

            <!-- Adding the gender code to the servlet is left -->
            <label for="gender">Gender: </label>
            <input type="radio"  name="gender" value="male">Male<br/>
            <input type="radio"  name="gender" value="female">Female<br/>
            <br/>

            <!-- Adding the gender code to the servlet is left -->
            <label for="birthday">Date of birth:</label>
            <input type="date" id="birthday" name="birthday"  required="" />

            <label for="email">Email:</label>
            <input type="email" id="email" name="email" required>

            <label for="status">Status:</label>
            <select id="status" name="status" required>
                <option value="active">Active</option>
                <option value="inactive">Inactive</option>
            </select>


            <label for="applicant_number">Applicant Number:</label>
            <select  id="applicant"  name="applicantNumber" required>
                <% for (int i = 0; i < getList.size(); i++) {%>
                <option value="<%=getList.get(i).getApplicantNumber()%>"><%=getList.get(i).getApplicantNumber()%></option>
                <%}%>
                
            </select>

            <input type="submit" value="Submit">
            <input type="hidden" name="option" value="add"/>
            
        </form>


    </body>
</html>
