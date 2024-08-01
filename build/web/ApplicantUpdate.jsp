<%-- 
    Document   : ApplicantUpdate
    Created on : Apr 16, 2024, 6:51:40 PM
    Author     : boika
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Applicant Update Page</title>
    </head>
    <body>
        <h1>Update Applicant</h1>


        <form action =" ApplicantServlet.do" method="POST">
            <table>

                <tr>
                    <td>Email:</td>
                    <td><input type="email" name="email" required=""/></td>
                </tr>

                <tr>
                    <td>Status:</td>
                    <td><input type="text" name="status" required=""/></td>
                </tr>
                <tr>
                    <td>University Acceptance$ Letter:</td>
                    <td><input type="text" name="univerAccLetter" required=""/></td>
                </tr>

                <tr>
                    <td>Update with Applicant id:</td>
                    <td><input type="text" name="id" required=""/></td>
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
