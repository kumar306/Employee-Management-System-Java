<%-- 
    Document   : login
    Created on : 25-Jan-2022, 2:56:47 am
    Author     : adiku
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
    </head>
    <body>
        <div class="container m-5 p-5">
             <a class="btn btn-outline-primary" href="home.html">Go back to home page</a><br>
            <div class="container text-center">
            <h1>Login</h1><br><br>
        <form action="loginServlet" method="POST">
        <label for="username">Enter username:</label>
        <input type="text" name="username"></input><br><br>
        <label for="pwd">Enter password:</label>
        <input type="password" name="password"></input><br><br>
        <label for="role">Enter role:</label>
        <select name="role" id="role">
            <option value="Admin">Admin</option>
            <option value="Employee">Employee</option>
        </select>
        <br><br>
        <input type="submit" class="btn btn-primary" value="Login" />
            </div></div>
    </body>
</html>

