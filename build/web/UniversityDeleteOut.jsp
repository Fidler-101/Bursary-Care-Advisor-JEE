<%-- 
    Document   : UniversityDeleteOut
    Created on : Apr 17, 2024, 9:43:10 AM
    Author     : boika
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>University Delete Outcome Page</title>
    </head>
    <body>
        <h1>University Delete Outcome!</h1>
        <%
            Integer id = (Integer)request.getAttribute("id");    
        %>
        <p>

            The University that has Applicant id of  <%=id%> has been successfully deleted

        </p>

        <p>
            please click <a href="index.html">here</a> to go to the main page
        </p>

    </body>
</html>
