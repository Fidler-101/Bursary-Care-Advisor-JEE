<%-- 
    Document   : login
    Created on : May 14, 2024, 8:16:03 PM
    Author     : boika
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Login Page</title>

        <style>
            body {
                font-family: Arial, sans-serif;
                margin: 0;
                padding: 0;
                background-image: url('Pictures/medium-shot-colleagues-posing-together_23-2148950574.avif'); /* Specify the path to your background image */
                background-size: cover; /* Cover the entire background */
                display: flex;
                justify-content: center;
                align-items: center;
            }

            .login-container {
                background-color: #fff;
                padding: 40px;
                border-radius: 8px;
                box-shadow: 0 0 20px rgba(0, 0, 0, 0.1);
                max-width: 400px;
                width: 100%;
            }

            h1 {
                color: #333;
                text-align: center;
                margin-bottom: 30px;
            }

            /* Style radio buttons and labels */
            input[type="radio"] {
                margin-right: 5px;
                cursor: pointer;
            }

            label {
                display: inline-block;
                margin-bottom: 10px;
            }

            input[type="text"],
            input[type="password"],
            input[type="submit"],
            .btn {
                width: calc(100% - 20px);
                padding: 12px;
                margin: 10px 0;
                border: 1px solid #ccc;
                border-radius: 4px;
                box-sizing: border-box;
                cursor: pointer;
                text-align: center;
                background-color: #333;
                color: #fff;
                text-decoration: none;
                display: block;
                font-size: 16px;
                transition: background-color 0.3s;
            }

            input[type="text"]:focus,
            input[type="password"]:focus {
                outline: none;
                border-color: #555;
            }

            .btn:hover {
                background-color: #555;
            }

            .forgot-password,
            .create-account {
                text-align: center;
                margin-top: 20px;
            }

            .forgot-password a,
            .create-account a {
                color: #333;
                text-decoration: none;
            }

            .forgot-password a:hover,
            .create-account a:hover {
                color: #555;
            }
        </style>
    </head>

    <body>
        <div class="login-container">
            <h1>Login</h1>
            <form  action="LoginServlet.do" method="POST" id="loginForm" >
                <table>
                    <tr>
                        <td><input type="radio" id="applicant" name="role" value="applicant" onclick="showLoginForm()"></td>
                        <td><label for="applicant">Applicant</label></td>
                        <td><input type="radio" id="administrator" name="role" value="administrator" onclick="showLoginForm()"></td>
                        <td><label for="administrator">Administrator</label></td>
                        <td><input type="radio" id="seniorAdministrator" name="role" value="seniorAdministrator" onclick="showLoginForm()"></td>
                        <td><label for="seniorAdministrator">Bursary Interviewer</label></td>
                    </tr>
                </table>
                <%
                    String use = (String) request.getAttribute("incorrectUsername");

                    if (use == null) {
                        use = " ";
                    } 
                %>
             <p style="color: red; text-align: center;"><%=use%></p>
                <!-- Username and password fields -->


                <input type="text" name="logUsername" id="username" placeholder="Username" required>
                <input type="password" name="password" id="password" placeholder="Password" required>
                <!-- Login button -->

                <input type="hidden"  name="opt" value="viewApplicant"/>
                <input type="submit" value="Login" class="btn">
            </form>
            <!-- Forgot password link -->
            <div class="forgot-password">
                <a href="reset_password.html">Forgot Password?</a>
            </div>
            <!-- Create account link -->
            <div class="create-account">
                <a href="SignUpForm.html">Create Account</a>
            </div>
        </div>

        <script>
            function showLoginForm() {
                var applicantRadio = document.getElementById("applicant");
                var administratorRadio = document.getElementById("administrator");
                var seniorAdministratorRadio = document.getElementById("seniorAdministrator");
                var usernameField = document.getElementById("username");
                var passwordField = document.getElementById("password");
                var createAccountLink = document.querySelector(".create-account");

                if (applicantRadio.checked) {

                    // If applicant radio button is checked, show relevant elements
                    usernameField.placeholder = "Username";
                    passwordField.placeholder = "Password";
                    createAccountLink.style.display = "block";

                } else if (administratorRadio.checked) {
                    // If administrator radio button is checked, hide irrelevant elements
                    usernameField.placeholder = "Administrator Username";
                    passwordField.placeholder = "Administrator Password";
                    createAccountLink.style.display = "none";

                } else if (seniorAdministratorRadio.checked) {
                    // If senior administrator radio button is checked, hide irrelevant elements
                    usernameField.placeholder = "Bursary Interviewer Username";
                    passwordField.placeholder = "Bursary Interviewer Password";
                    createAccountLink.style.display = "none";
                }
            }

            function validationForm() {
                var role = document.querySelector('input[name="role"]:checked');
                var username = document.getElementById("username").value;
                var password = document.getElementById("password").value;

                if (role) {
                    if (role.value === "applicant") {
                        // window.location.href = "ApplicantLogin.html";
                    } else if (role.value === "administrator") {
                        window.location.href = "AdministratorLogin.html";
                    } else if (role.value === "seniorAdministrator") {
                        window.location.href = "SeniorAdministratorLogin.html";
                    } else if (role.value === "FinancialOfficer") {
                        window.location.href = "FinancialOfiicerLogin.html";
                    } else if (role.value === "University") {
                        window.location.href = "UniversityLogin";
                    }
                    return false;
                } else {
                    alert("Please select a role.");
                    return false;
                }

                if (username.trim() === '' || password.trim() === '') {
                    alert("Please fill in all the required fields.");
                    return false;
                }
            }
        </script>
    </body>
</html>
