<%-- 
    Document   : getAllTheApplicants
    Created on : Apr 16, 2024, 6:05:06 PM
    Author     : boika
--%>
<%@page import="java.util.List"%>
<%@page import="za.ac.tut.model.Applicant"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Applicants Outcome</title>
    </head>
    <body>
        <h1>Applicants List</h1>

        <%
            List<Applicant> list = ( List<Applicant>)request.getAttribute("list");
        %>




        <% 

                for(int i=0;i<list.size();i++){
                 String results = list.get(i).toString();
                
        %>
        <p><%=results%></p>

        <%
            } 
        %>




    </body>
</html>
