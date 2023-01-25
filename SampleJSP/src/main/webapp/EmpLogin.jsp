<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
  <title>Employee Login form</title>
  <link rel="stylesheet" href="manager.css">
</head>
<body>
  <div class="wrapper">
    <h1>Employee Login</h1>
    &nbsp;
    &nbsp;
    <form name="form" action="EmpLogin" id="from" method="post">
      <label>UserId</label>
      <input type="text" placeholder="Enter UserId" required id="UserId" name="empId">
      <br>
      <label>PassWord</label>
      <input type="password" placeholder="Password" required id="password" name="pass">
      <p class="recover">
        <a href="#">Recover Password</a>
      </p>
      <button type="submit">Submit</button>
    </form>
  </div>
</body>
</html>