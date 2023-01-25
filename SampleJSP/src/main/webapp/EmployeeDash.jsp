<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8" />
  <title>Employee Dashboard</title>
  <link rel="stylesheet" href="Employ.css" />
</head>
<body>
  <header class="header">
    <div class="logo">
      <a href="#">Absence Tracking System</a>
      <div class="search_box">
        <input type="text" placeholder="Search">
        <i class="fa-sharp fa-solid fa-magnifying-glass"></i>
      </div>
    </div>

    <div class="header-icons">
      <i class="fas fa-bell"></i>
      <div class="account">
        <h4>Surya</h4>
      </div>
    </div>
  </header>
  <div class="container">
    <nav>
      <div class="side_navbar">
        <span>Main Menu</span>
        <a href="#" class="active">Dashboard</a>
        <a href="#">Profile</a>
        <a href="#">Take Leave</a>
        <a href="#">Employee Leave Request</a>
        <a href="#">Report</a>

        <div class="links">
          <span>Quick Link</span>
          <a href="#">Payslip</a>
              <form action="EmpLogout" method="post">
      <input type="submit" value="Logout">
   </form>
        </div>
      </div>
    </nav>

    <div class="main-body">
      <h2>Attendance</h2>
      <div class="promo_card">
        <h1>Employee...!</h1>
        <button>Learn More</button>
      </div>

      <div class="history_lists">
        <div class="list1">
          <div class="row">
            <h4>Employee Attendance</h4>
            <a href="#">Download</a>
          </div>
            <%
          Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:Xe", "system", "oracle");
          String e1 = "select employeeid,employee_name,employee_phone,employee_email from employee";
			PreparedStatement b = conn.prepareStatement(e1);
			ResultSet s = b.executeQuery();
          %>
          <table>
            <thead>
              <tr>
                <th>EmployeeId</th>
                <th>EmployeName</th>
                <th>E-Mail</th>
                <th>Mobile Number</th>
              </tr>
            </thead>
            <tbody>
              <%while(s.next()){ %>
                <tr>
                <td><%=s.getInt(1)%></td>
                <td><%=s.getString(2) %></td>
                 <td><%=s.getLong(3) %></td>
                 <td><%=s.getString(4) %></td>
              </tr>
                 <% } %>
            </tbody>
          </table>
              <%
          Connection connect1 = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:Xe", "system", "oracle");
          String a1 = "select employeeid,name,login_intime,logout_outtime,min from attendance_employee where employeeid=4001";
			PreparedStatement sp = conn.prepareStatement(a1);
			ResultSet set = sp.executeQuery();
          %>

          <div class="list2">
            <div class="row">
              <h4>Employee Login Details</h4>
              <a href="#">Upload</a>
            </div>
            
            <table>
              <thead>
                <tr>
                  <th>EmployeeId</th>
                  <th>EmployeeName</th>
                  <th>LoginTime</th>
                  <th>LogOutTime</th>
                  <th>Total Working Hours</th>
                </tr>
              </thead>
              <tbody>
               <%while(set.next()){ %>
                <tr>
                <td><%=set.getInt(1)%></td>
                <td><%=set.getString(2) %></td>
                 <td><%=set.getString(3) %></td>
                 <td><%=set.getString(4) %></td>
                 <td><%=set.getString(5) %></td>
              </tr>
                 <% } %>
              </tbody>
            </table>
            
          </div>
        </div>
  </div>
</body>
</html>