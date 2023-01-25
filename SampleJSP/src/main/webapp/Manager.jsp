<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
  <title>Manager Login form</title>
  <link rel="stylesheet" href="manager.css">
</head>
<body>
  <div class="wrapper">
    <h1>Manager Login</h1>
    &nbsp;
    &nbsp;
    <form action="ManagerLogin" id="fromManager" method="post">
      <input type="text" placeholder="Enter userName" required id="manager" name="managerUserId">
      <br>
      <input type="text" placeholder="Password" required id="passwordManager" name="passwordManager">
      <p class="recover">
        <a href="#">Recover Password</a>
      </p>
      <button type="submit">Submit</button>
    </form>
  </div>
</body>
</html>