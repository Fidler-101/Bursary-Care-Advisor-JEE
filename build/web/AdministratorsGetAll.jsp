<%-- 
    Document   : AdministratorsGetAll
    Created on : Apr 16, 2024, 9:15:21 PM
    Author     : boika
--%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="za.ac.tut.model.Administrator"%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
           <title>Administrators Outcome</title>
    </head>
    <body>
        <h1>Administrators List</h1>

        <%
            List<Administrator> list = ( ArrayList<Administrator>)request.getAttribute("list");
        %>




        <% 

                for(int i=0;i<list.size();i++){
                 String results = list.get(i).toString();
                
        %>
        <p><%=results%></p>
        <br/>

        <%
            } 
        %>
    </body>
</html>
