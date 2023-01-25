<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
  <head>
    <title>Web Page </title>
    <link rel="stylesheet" href="landpage.css" />
  </head>
  <body background="C:\Users\ajay3349\eclipse-workspace\Sample\src\main\webapp\images\from-home.jpg">
    <div class="conatiner">
      <header>
        <div class="label">
          <a href="#"></a>
        </div>
        <div class="navbar">
          <ul>
            <li><a href="#">Home</a></li>
            <li><a href="#">About</a></li>
            <li><a href="#">Contact Us</a></li>
            <li><button onclick="document.getElementById('id01').style.display='block'" style="width:auto;">Login</button></li>
          </ul>
        </div>
      </header>
      <div class="body-content">
        <div class="b-title">
          <h1>Absence<br /><span>Tracking</span><br />System</h1>
          <button>Go</button>
          <div class="icons">
            <img src="facebook.png" />
            <img src="youtube.png" />
            <img src="insta.png" />
          </div>
        </div>

        <div class="b-img">
          <img src="C:\Users\ajay3349\eclipse-workspace\Sample\src\main\webapp\images\from-home.jpg" />
        </div>
      </div>
    </div>
    <section class="services" background="C:\Users\ajay3349\Desktop\Aj\pexels-moose-photos-1037993.jpg">
        <div class="container">
          <div class="title">
            <h1>Absence Tracking System</h1>
          </div>
          <div class="services_boxes">
            <div class="box">
              <i class="fa-solid fa-hotel"></i>
              <h4>Attendance</h4>
              <p>Attendance Management can be done by recording employee hours on paper, using spreadsheets, punching time cards, or using online attendance software for your company.</p>
            </div>
    
            <div class="box br">
              <i class="fa-solid fa-plane"></i>
              <h4>Time</h4>
              <p>Time and attendance systems are employee time-tracking software that integrate with payroll software. Running payroll with a time and attendance system improves efficiency and accuracy by reducing the need for double entry.</p>
            </div>
    
            <div class="box">
              <i class="fa-solid fa-mountain-sun"></i>
              <h4>Salary</h4>
              <p>The system of the payment of the monthly wages to the employees by the organization. It takes into account the number of hours or days worked by the employees, their pay rate, and their applicable deductions.</p>
            </div>
          </div>
      </div>
      </section>

      
<div id="id01" class="modal">
  
  <form class="modal-content animate" action="" method="post">
    <div class="imgcontainer">
      <span onclick="document.getElementById('id01').style.display='none'" class="close" title="Close Modal">&times;</span>
    </div>

    <div class="container">
      <label for="uname"><b>Role</b></label>
      <select id="Name"  onchange="location = this.value;">
        <option value="">Others</option>
        <option value="AdminLogin.jsp">Admin</option>
        <option value="Manager.jsp">Manager</option>
        <option value="EmpLogin.jsp">Employee</option>
    </select>
    </div>


    <div class="container" style="background-color:#f1f1f1">
      <button type="button" onclick="document.getElementById('id01').style.display='none'" class="cancelbtn">Cancel</button>
    </div>
  </form>
</div>

<script>
// Get the modal
var modal = document.getElementById('id01');

// When the user clicks anywhere outside of the modal, close it
window.onclick = function(event) {
    if (event.target == modal) {
        modal.style.display = "none";
    }
}
</script>
  </body>
</html>

    