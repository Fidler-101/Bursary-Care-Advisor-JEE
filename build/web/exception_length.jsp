<%-- 
    Document   : exception_length
    Created on : 15 May 2024, 21:09:48
    Author     : User
--%>

<%@page  isErrorPage="true" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Error length  Page</title>
    </head>
    <body>
        <h1>Length exception</h1>

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
