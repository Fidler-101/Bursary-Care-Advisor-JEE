<%-- 
    Document   : addApplicant
    Created on : Apr 15, 2024, 6:41:30 PM
    Author     : boika
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add an Applicant Page</title>

        <style>
            h1{
                font-family: Arial,sans-serif;
                text-align: center;

            }
            body {
                font-family: Arial, sans-serif;
                margin: 0;
                padding: 0;
                box-sizing: border-box;
            }
            form {
                max-width: 400px;
                margin: 50px auto;
                padding: 20px;
                border: 1px solid #ccc;
                border-radius: 5px;
            }
            label {
                display: block;
                margin-bottom: 5px;
                font-weight: bold;
            }
            input[type="text"],
            input[type="password"],
            input[type="tel"],
            input[type="email"] {
                width: 100%;
                padding: 8px;
                margin-bottom: 10px;
                border: 1px solid #ccc;
                border-radius: 3px;
                box-sizing: border-box;
            }
            input[type="submit"] {
                width: 100%;
                padding: 10px;
                border: none;
                background-color: #007bff;
                color: #fff;
                cursor: pointer;
                border-radius: 3px;
            }
            input[type="submit"]:hover {
                background-color: #0056b3;
            }
        </style>
        <script>
            function validationForm() {
                var checkbox = document.getElementById("terms");
                if (!checkbox.checked) {
                    alert("Please agree to the terms and conditions.");
                    return false;
                }

                var firstname = document.getElementById("firstname").value;
                var lastname = document.getElementById("lastname").value;

                // Check if firstname contains numbers
                if (/\d/.test(firstname)) {
                    alert("First name cannot contain numbers.");
                    return false;
                }

                // Check if lastname contains numbers
                if (/\d/.test(lastname)) {
                    alert("Last name cannot contain numbers.");
                    return false;
                }

                // Check if ID length is not 13
                var id = document.getElementById("id").value;
                if (id.length !== 13) {
                    alert("ID must be exactly 13 characters long.");
                    return false;
                }

                return true;
            }
        </script>

    </head>
    <body>
        <h1>Bursary Care Advisor</h1>

        <form action="ApplicantServlet.do" method="post" onsubmit="return validationForm()">

            <label for="username">Username:</label>
            <input type="text" id="username" name="username" required>

            <label for="firstname">Firstname:</label>
            <input type="text" id="firstname" name="firstname" required>

            <label for="lastname">Lastname:</label>
            <input type="text" id="lastname" name="lastname" required>

            <label for="password">Password:</label>
            <input type="password" id="password" name="password" required>

            <!-- Adding the gender code to the servlet is left -->
            <label for="gender">Gender: </label>
            <input type="radio"  name="gender" value="male">Male<br/>
            <input type="radio"  name="gender" value="female">Female<br/>
            <br/>

            <!-- Adding the gender code to the servlet is left -->
            <label for="birthday">Date of birth:</label>
            <input type="date" id="birthday" name="birthday"  required="" />

            <label for="phone_number">Phone Number:</label>
            <input type="text" id="phone_number" name="phoneNumber" required>

            <label for="terms">
                <input type="checkbox" id="terms" name="terms" required>By continuing, you agree and accept out <a href="Privacy.jsp">Privacy</a> & 
                <a href="terms.jsp">Terms Of Service</a>.
            </label>

            <input type="submit" value="ADD">
            <input type="hidden" name="option" value="add"/>
        </form>
    </body>
</html>
