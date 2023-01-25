<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html >
<head>
    <title>Login Form</title>
    <link rel="stylesheet" href="admin.css">
</head>
<body>
    <div class="loginbox">
        <h1>Sign In</h1>
        <form action="AdminLog" method="post">
            <label>UserId</label>
            <input type="text" placeholder="Enter UserId" name="adminId">
            <label>Password</label>
            <input type="text" placeholder="Enter Password" name="adminPass">
            <input type="submit" value="Sign In">
        </form>
        <a href="#">Forgot Password?</a>
    </div>
</body>
</html>