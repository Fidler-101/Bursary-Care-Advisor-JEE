<%-- 
    Document   : GetAllUniversities
    Created on : Apr 17, 2024, 12:12:24 PM
    Author     : boika
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Get All Universities Page</title>
    </head>
    <body>
        <h1>Get All Universities !</h1>


        <form  action="UniversityServlet.do" method="POST">
            <table>
                <tr>

                    <td>To View All Universities</td>
                    <td>

                        <input type="hidden"  value="getAll" name="option">
                        <input type="submit" value="getAll"/>
                    </td>
                </tr>
            </table>
        </form>
    </body>
</html>
