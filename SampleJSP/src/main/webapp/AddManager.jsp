<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="addmanager.css" type="text/css">
        <title>Employee Registration</title>
        </head>
        <body bgcolor="black">
        <form name="employees-from" onsubmit="employeeForm()" action="AddManager" method="post" id="fromEmployee">
            <!-- class named "container" is assigned to div -->
            <div class="container">
              <h1>Manager Registration</h1>
              <p>Kindly fill in this form to register.</p>
             <div id="error_message"></div>
              <label><b>Username</b></label>
              <input
                type="text"
                placeholder="Enter username"
                name="username"
                id="username"
                required
              />
      
              <label><b>Email</b></label>
              <input
                type="text"
                placeholder="Enter Email"
                name="email"
                id="email"
                required
              />
      
              <label><b>Password</b></label>
              <input
                type="text"
                placeholder="Enter Password"
                name="pwd"
                id="pwd"
                required
              />
      
              <label><b>Phone Number</b></label>
              <input
              type="text"
              placeholder="Enter Number"
              name="phone"
              id="phone"
              required
            />
            <label ><b>Salary</b></label>
            <input
              type="text"
              placeholder="Enter Salary"
              name="salary"
              id="emp"
              required
            />
              <button type="submit">Register</button>
            </div>
        </form>
             <script>
          function employeeForm(){
            event.preventDefault();
            let username =document.querySelector("#username").value;
            let email=document.querySelector("#email").value;
            let pwd =document.querySelector("#pwd").value;
            let phone =document.querySelector("#phone").value;
            let  emp=document.querySelector("#emp").value;
            var error= document.getElementById("error_message");
            var text;
            error.style.padding = "10px";
            
            if(username==null ){
             text="Enter Correct UserName ";
             error.innerHTML = text;
             return false;
            }
            else if(username.length<3){
              text="The UserName is Too Short";
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
              error.innerHTML = text;
              return false;
            }
           else if(phone.length<10){
            text="Please put 10 digit mobile number";
            error.innerHTML = text;
            return false;
            }
            else if(phone.length>10){
            text="Please put 10 digit mobile number";
            error.innerHTML = text;
            return false;
            }
            else if(emp<1000 || emp>100000){
              text="Please put 5 digit  number";
              error.innerHTML = text;
              return false;
            }
             else{
              alert ("Registration SuccessFully "+username);
             }
    
             let form = document.querySelector("#fromEmployee");
             form.style.display = 'none';
                form.submit();

          
             
          }
        </script>
        </div>
        </body>
</html>