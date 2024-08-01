<%-- 
    Document   : exception_empty_string
    Created on : 15 May 2024, 21:08:19
    Author     : User
--%>

<%@page   isErrorPage="true" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Empty Field Error Page</title>
    </head>
    <body>
        <h1>Empty Field exception</h1>

        <%
            String errorMsg = exception.getMessage();

        %>

        <p>
            <b>Error Message --> <%=errorMsg%></b>
        </p>

        <p>
            Please click <a href=""> here</a> to go back to the update page.
            <br/>
            Please click <a href=""> here</a> to go the main page.
        </p>


    </body>
</html>
