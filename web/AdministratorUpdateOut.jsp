<%-- 
    Document   : AdministratorUpdateOut
    Created on : Apr 16, 2024, 9:25:47 PM
    Author     : boika
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
             <title>Administrator Update Outcome Page</title>
    </head>
    <body>
        <h1>Administrator Outcome</h1>
        <%
            Integer id = (Integer)request.getAttribute("id");
            
        %>
        <p>
            The applicant with  ID :<b>[<%=id%>]</b> has been updated successfully.
        </p>  
        <p>

            click <a href="index.html">here</a> to go to the main page.
        </p>
    </body>
</html>
