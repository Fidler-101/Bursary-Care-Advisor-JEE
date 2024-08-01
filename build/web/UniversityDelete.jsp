<%-- 
    Document   : UniversityDelete
    Created on : Apr 17, 2024, 9:30:58 AM
    Author     : boika
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Delete University Page</title>
    </head>
    <body>
        <h1>Delete University</h1>
        <form action="UniversityServlet.do" method="POST">
            <table>
                <tr>
                    <td>Applicant ID:</td>
                    <td><input type="text" name="id" required=""></td>
                </tr>
                <tr>
                    <td></td>
                    <td>
                    <td><input type="hidden" name="option" value="delete"/></td>
                    <td><input type="submit" value="delete"/>
                    </td>

                </tr>

            </table>
        </form>
    </body>
</html>
