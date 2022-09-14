<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import = "java.io.*,java.util.*,java.sql.*"%>
<%@ page import = "javax.servlet.http.*,javax.servlet.*" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Users List</title>
    <style>
        html {
            background-color: #72727e;
            font-family: monospace;
            margin: 0px;
            padding: 0px;
        }
        .content {
            width: fit-content;
            height: fit-content;
            padding: 25px 20px;
            margin: 100px auto 10px;
            background-color: #bbbdf6;
            text-align: center;
            border-radius: 10px;
        }
        .header {
            font-size: 30px;
            height: 45px;
            align-self: center;
        }
        input {
            border: 2px solid #72727e;
            border-radius: 7px;
            background-color: #797a9e;
            color: white;
            width: 200px;
            height: 50px;
            font-size: 20px;
            margin: 10px;
        }
        input:hover {
            background-color: #bbbdf6;
            color: black;
        }
        .database-response {
            background-color: darkorange;
        }
        table {
            width: fit-content;
            font-size: 15px;
            margin: 20px;
            border-collapse: collapse;
        }
        th, td {
            padding: 0px 15px;
        }
        table, th, td {
            border: 1px solid #72727e;
        }
    </style>
</head>
<body>
    <div class="content">
        <div class="header">
            <p>Browse users</p>
        </div>  <!-- END OF .HEADER -->

            <table>
                <tr>
                    <th>User ID</th>
                    <th>Name</th>
                    <th>Surname</th>
                    <th>Age</th>
                </tr>
                <% ResultSet rs = request. %>
                <tr>
                    <td>1</td>
                    <td>Dima</td>
                    <td>Ivanenko</td>
                    <td>21</td>
                </tr>
            </table>

        <div class="navigation">
            <form>
                <input type="button" value="Back to HomePage">
            </form>
        </div>  <!-- END OF .NAVIGATION -->
    </div>  <!-- END OF .CONTENT -->
</body>
</html>