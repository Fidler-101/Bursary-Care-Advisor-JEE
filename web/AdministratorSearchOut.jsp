<%-- 
    Document   : AdministratorSearchOut
    Created on : Apr 16, 2024, 8:56:42 PM
    Author     : boika
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin Output Page</title>
    </head>
    <body>
                <h1>Outcome!! </h1>

        <%
            String admin = (String)request.getAttribute("adminResults");
            
        %>

        <p>
            <%=admin%>
        </p>
        
        <p>
            
            click <a href="index.html">here</a> to go to the main page.
        </p>
    </body>
</html>
