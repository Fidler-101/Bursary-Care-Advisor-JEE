<!DOCTYPE html>
<html>
    <head>
        <title>Applicant Page</title>
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
            }

            nav {
                display: flex;
                justify-content: space-between;
                align-items: center;
            }

            nav ul {
                list-style-type: none;
                margin: 0;
                padding: 0;
            }

            nav ul li {
                display: inline;
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
            String email = (String) session.getAttribute("email");

            Integer adminNumber = (Integer) session.getAttribute("adminNumber");

        %>
        <header>
            <nav>
                <div class="logo">
                    <h2>Administrator :<%=adminNumber%></h2>
                </div>
                <ul>
                    <li><a href="view_all_applicants.jsp">View All Applicants</a></li>
                    <li><a href="#view-account">View Account</a></li>
                    <select id="id">
                        <option value="">Select an option</option>
                        <option value="Reports/Abouts.pdf">Get Reports</option>
                        <option value="Reports/Manager.pdf">Get Manager Report</option>
                        <option value="Reports/Administrator.pdf">Get Administrator Report</option>
                        <option value="Reports/Interview.pdf">Get Interviewer Report</option>
                    </select>

                    <script>
                        document.getElementById('id').addEventListener('change', function () {
                            const selectedValue = this.value;
                            if (selectedValue) {
                                window.location.href = selectedValue;
                            }
                        });
                    </script>



                </ul>
            </nav>
        </header>


    </body>
</html>
