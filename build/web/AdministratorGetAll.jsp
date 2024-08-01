<%-- 
    Document   : AdministratorGetAll
    Created on : Apr 16, 2024, 9:10:50 PM
    Author     : boika
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
            <title>Get Administrators</title>
    </head>
    <body>
        <h1>Get All Administrators</h1>
        <p>To View All Administrators</p>
        <form action="AdministratorServlet.do" method="POST">
            <table>

                <tr>
                    <td></td>

                    <td>
                        <input type="hidden"  value="getAll" name="option">
                        <input type="submit"  value="View All Administrators"></td>
                </tr>
            </table>
        </form>

    </body>
</html>
