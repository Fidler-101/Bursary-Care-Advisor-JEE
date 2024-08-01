<%-- 
    Document   : DeleteAdministrator
    Created on : Apr 16, 2024, 8:08:21 PM
    Author     : boika
--%>

<%@page import="za.ac.tut.model.Applicant"%>
<%@page import="za.ac.tut.model.Administrator"%>

<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Delete Administrator Page</title>
    </head>
    <body>
        <h1>Delete Administrator with Administrator id:</h1>

        <%
            List<Administrator> getList = (List<Administrator>) request.getAttribute("list");
        %>
        <form action="AdministratorServlet.do" method="POST">
            <table>
                <tr>
                <label for="applicant_number">Applicant Number:</label>
                <select  id="applicant"  name="applicantNumber" required>
                    <% for (int i = 0; i < getList.size(); i++) {%>
                    <option value="<%=getList.get(i).getAdminNumber()%>"><b><%=getList.get(i).getAdminNumber()%>- <%=getList.get(i).getUsername()%>-<%=getList.get(i).getGender()%></option>
                   
                    
                    <%
                        
                        }%>
                    <br/>
                </select>
                </tr>
               
                <tr>
                    <td></td>
                    <td>
                    <td><input type="hidden" name="option" value="delete"/></td>
                    <td><input type="submit" value="delete"/>
                    </td>

                </tr>

            </table>
        </form>
</html>
