<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="addmanager.css" type="text/css">
        <title>Employee Registration</title>
        <body bgcolor="black">
        <form name="employees-from" onsubmit="employeeForm()" action="AddManager" method="post" id="fromEmployee">
            <!-- class named "container" is assigned to div -->
            <div class="container">
              <h1>Employee Registration</h1>
              <p>Kindly fill in this form to register.</p>
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
            try{
            if(username==null ){
              throw new Error("Enter Correct UserName ");
            }
            else if(username.length<3){
              throw new Error("The UserName is Too Short");
            }
          else if(email==null){
              alert("you missed the “@” character — “Enter a email address");
              return false;
            }
            else if(pwd.length<8){
              throw new Error("Password Must be min 8 Characters");
            }
           else if(phone.length<10){
            throw new Error("Please put 10 digit mobile number");
            }
            else if(phone.length>10){
            throw new Error("Please put 10 digit mobile number");
            }
            else if(emp<1000 || emp>100000){
              throw new Error("Please put 5 digit  number");
            }
             else{
              alert ("Registration SuccessFully "+username);
             }
    
             let form = document.querySelector("#fromEmployee");
                form.submit();

              }
                //catch(Exception err) => err.getMessage()
                catch(err){
                    console.error(err);
                    console.log("Validation FAiled:" + err.message);
                     alert("Error:"+ err.message);
                }
          }
        </script>
        </body>
      
    </head>
</html>