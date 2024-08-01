<%-- 
    Document   : ApplicantSearch
    Created on : Apr 16, 2024, 3:58:05 PM
    Author     : boika
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Search Applicant Page</title>
    </head>
    <body>
        <h1>Search with  an Id.</h1>

        <form action="ApplicantServlet.do" method="POST">
            <table>
                <tr>
                    <td>Applicant ID:</td>
                    <td><input type="text" name="id" required=""></td>
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
