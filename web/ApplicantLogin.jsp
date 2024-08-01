<%-- 
    Document   : ApplicantLogin
    Created on : May 15, 2024, 1:09:11 AM
    Author     : boika
--%>

<%@page import="java.util.Base64"%>
<%@page import="za.ac.tut.model.Applicant"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Applicant Profile</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <style>
            /* Basic styling for the navigation bar */
            body {
                font-family: Arial, sans-serif;
                margin: 0;
                padding: 0;
                 background-image: url('Pictures/medium-shot-colleagues-posing-together_23-2148950574.avif');
            }

            header {
                background-color: #333;
                color: #fff;
                padding: 10px 20px;
                display: flex;
                justify-content: space-between;
                align-items: center;
            }

            .logo {
                display: flex;
                align-items: center;
            }

            .logo img {
                width: 40px;
                height: 40px;
                border-radius: 50%;
                margin-right: 10px;
            }

            nav ul {
                list-style-type: none;
                margin: 0;
                padding: 0;
                display: flex;
            }

            nav ul li {
                margin-right: 20px;
            }

            nav ul li a {
                color: #fff;
                text-decoration: none;
            }

            nav ul li a:hover {
                color: #ffcc00;
            }
        </style>
    </head>
    <body>

        <%
            Applicant app = (Applicant) session.getAttribute("pic");
            String imageSource = "Pictures/download (4).jpeg";
            String firstName = (String) session.getAttribute("firstname");
             String lastname = (String) session.getAttribute("lastname");
            
           //String imageSource = "data:image/*;base64," + Base64.getEncoder().encodeToString(app.getImage());
        %>
        <header>
            <div class="logo">
                <img src="<%=imageSource%>" alt="Profile Picture">
                <p><%=firstName%>, <%=lastname%></p>


            </div>
            <nav>
                <ul>
                    <li><a href="viewApplicantAccount.jsp">View Account</a></li>
                    <li><a href="#bursary-search">Bursary Search</a></li>
                    <li><a href="EditInfo.jsp">Edit Profile Info</a></li>
                </ul>
            </nav>
        </header> 
    </body>
</html>
