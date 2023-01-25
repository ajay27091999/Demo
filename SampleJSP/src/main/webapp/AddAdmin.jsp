<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <title>Add Admin</title>
      <link rel="stylesheet" href="AddAdmin.css" type="text/css">
  </head>
  <body>
    <div class="signup-box">
      <h1>Admin Registration</h1>
       <div id="error_message"></div>
      <form  id="fromAdmin" onsubmit="AdminForm()" action="AddAdmin" method="post">
        <label>Admin Name</label>
        <input type="text" placeholder="Enter the Name" name="adminName" id="username" required/>
        <label>Password</label>
        <input type="text" placeholder="Enter the passWord" name="pass" id="pwd" required/>
        <label>Email</label>
        <input type="email" placeholder="Enter the Email" name="EmailId" id="email" required/>
        <label>Mobile Number</label>
        <input type="text" placeholder="Enter the Mobile Number" name="number" id="phone" required/>
        <button type="submit">Submit</button>
      </form>
    </div>
    <script>
    function AdminForm(){
        event.preventDefault();
        let username =document.querySelector("#username").value;
        let email=document.querySelector("#email").value;
        let pwd =document.querySelector("#pwd").value;
        let phone =document.querySelector("#phone").value;
        var error= document.getElementById("error_message");
        var text;
        error.style.padding = "10px";
        if(username==null ){
            text = "Enter the Invaild Name";
            error.innerHTML = text;
            return false;
          }
          else if(username.length<3){
            text = "Max 3 Character";
            error.innerHTML = text;
            return false;
          }
        else if(email==null){
            text="you missed the “@” character — “Enter a email address";
            error.innerHTML = text;
            return false;
          }
          else if(pwd.length<8){
            text="Password Must be min 8 Characters";
            error.innerHTML=text;
            return false;
          }
         else if(phone.length<10){
           text="Please put 10 digit mobile number";
           error.innerHTML=text;
            return false;
          }
          else if(phone.length>10){
          text="Please put 10 digit mobile number";
          error.innerHTML=text;
            return false;
          }
          else{
              alert ("Registration SuccessFully "+username);
             }
    
             let form = document.querySelector("#fromAdmin");
             form.style.display = 'none';
                form.submit();
    }
    </script>
  </body>
</html>