<%-- 
    Document   : AdministratorUpdate
    Created on : Apr 16, 2024, 8:08:45 PM
    Author     : boika
--%>

<%@page import="za.ac.tut.model.Administrator"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Administrator Update Page</title>
    </head>
    <body>
        <h1>Update Administrator</h1>
        <%
            List<Administrator> getList = (List<Administrator>) request.getAttribute("list");
        %>

        <form action =" AdministratorServlet.do" method="POST" enctype="multipart/form-data">
            <table>

                <tr>
                    <td>Update Image:</td>
                    <td><input type="file"  id="admin_image"  name="image" required=""/></td>
                </tr>

                <tr>
                    <td>Administrator ID:</td>
                    <td>
                        <select  id="adminNumber"  name="adminNumber" required="">
                            <% for (int i = 0; i < getList.size(); i++) {%>
                            <option value="<%=getList.get(i).getAdminNumber()%>"><%=getList.get(i).getAdminNumber()%></option>
                            <%}%>
                            <br/>
                    </td>
                    </select>


                </tr>
                <tr>
                    <td></td>
                    <td>
                        <input type="hidden"  value="update" name="option">
                        <input type="submit" value="Update"/>
                    </td>
                </tr>

            </table>

        </form>

    </body>
</html>
