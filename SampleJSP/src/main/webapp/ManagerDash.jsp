<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
  <title>Manager Dashboard</title>
  <link rel="stylesheet" href="empDash.css" />
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
        <h4>Sanjay</h4>
      </div>
    </div>
  </header>
  <div class="container">
    <nav>
      <div class="side_navbar">
        <span>Main Menu</span>
        <a href="#" class="active">Dashboard</a>
        <a href="#">Profile</a>
        <a href="AddEmp.jsp">Add Employee</a>
        <a href="#">Take Leave</a>
        <a href="#">Employee Leave Request</a>
        <a href="#">Report</a>

        <div class="links">
          <span>Quick Link</span>
          <a href="#">Payslip</a>
      <form action="ManagerlogOut" method="post">
      <input type="submit" value="Logout">
   </form>
        </div>
      </div>
    </nav>

    <div class="main-body">
      <h2>Attendance</h2>
      <div class="promo_card">
        <h1>Manager...!</h1>
        <button>Learn More</button>
      </div>

      <div class="history_lists">
        <div class="list1">
          <div class="row">
            <h4>Manager Attendance</h4>
            <a href="#">Download</a>
          </div>
          <%
          Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:Xe", "system", "oracle");
          String m1 = "select managerid,manager_name,manager_phone,manager_email from manager";
			PreparedStatement b = conn.prepareStatement(m1);
			ResultSet rs = b.executeQuery();
          %>
          <table>
            <thead>
              <tr>
                <th>ManagerId</th>
                <th>ManagerName</th>
                <th>Mobile Number</th>
                <th>E-Mail</th>
              </tr>
            </thead>
            <tbody>
               <%while(rs.next()){ %>
                <tr>
                <td><%=rs.getInt(1)%></td>
                <td><%=rs.getString(2) %></td>
                 <td><%=rs.getLong(3) %></td>
                 <td><%=rs.getString(4) %></td>
              </tr>
                 <% } %>
            </tbody>
          </table>
          <%
 
          Connection connect1 = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:Xe", "system", "oracle");
          String emp1 = "select * from employee ";
			PreparedStatement c2 = connect1.prepareStatement(emp1);
			ResultSet sr = c2.executeQuery();
          %>
          <div class="row">
            <h4>Employee Details</h4>
            <a href="#">Download</a>
          </div>
          <table>
            <thead>
              <tr>
                <th>EmployeeId</th>
                <th>EmployeeName</th>
                <th>PassWord</th>
                <th>E-Mail</th>
                <th>Mobile Number</th>
                <th>Salary</th>
              </tr>
            </thead>
            <tbody>
               <%while(sr.next()){ %>
                <tr>
                <td><%=sr.getInt(1)%></td>
                <td><%=sr.getString(2) %></td>
                 <td><%=sr.getString(3) %></td>
                 <td><%=sr.getLong(4) %></td>
                 <td><%=sr.getString(5) %></td>
                 <td><%=sr.getInt(6) %></td>
              </tr>
                 <% } %>
            </tbody>
          </table>
          <%
 
          Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:Xe", "system", "oracle");
          String logIn = "select managerid,name,login_intime,logout_outtime,min from attendance_login ";
			PreparedStatement a = connection.prepareStatement(logIn);
			ResultSet time = a.executeQuery();
          %>
          <div class="list2">
            <div class="row">
              <h4>Manage Login Details</h4>
              <a href="#">Upload</a>
            </div>
            <table>
              <thead>
                <tr>
                  <th>ManagerId</th>
                  <th>ManagerName</th>
                  <th>LoginTime</th>
                  <th>LogOutTime</th>
                  <th>Total Working Hours</th>
                </tr>
              </thead>
              <tbody>
               <%while(time.next()){ %>
                <tr>
                <td><%=time.getInt(1)%></td>
                <td><%=time.getString(2) %></td>
                 <td><%=time.getString(3) %></td>
                 <td><%=time.getString(4) %></td>
                 <td><%=time.getString(5) %></td>
              </tr>
                 <% } %>
              </tbody>
            </table>
            
          </div>
        </div>
  

    </div>
  </div>
</body>
</html>