<%-- 
    Document   : AdministratorSearch
    Created on : Apr 16, 2024, 8:07:52 PM
    Author     : boika
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Administrator search Page</title>
    </head>
    <body>
                <h1>Search with  an Id.</h1>

        <form action="AdministratorServlet.do" method="POST">
            <table>
                <tr>
                    <td>Administrator ID:</td>
                    <td><input type="text" name="adminNumber" required=""></td>
                </tr>
                <tr>
                    <td></td>
                    <td>
                    <td><input type="hidden" name="option" value="search"/></td>
                    <td><input type="submit" value="Search"/>
                </td>

                </tr>

            </table>
        </form>
    </body>
</html>
