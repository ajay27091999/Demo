<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<% Class.forName("oracle.jdbc.driver.OracleDriver"); %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Attendance Dashboard </title>
  <link rel="stylesheet" href="dash.css" />
</head>
<body>
  <div class="container">
    <nav>
      <ul>
        <li><a href="#" class="logo">
          <img src="ad.jpg">
          <span class="nav-item">Admin</span>
        </a></li>
        <li><a href="AddAdmin.jsp" class="logo">
            <img src="addAdmin.png">
          <span class="nav-item">Add Admin</span>
        </a></li>
        <li><a href="AddManager.jsp" class="logo">
            <img src="addemp.png">
          <span class="nav-item">Add Manager</span>
        </a></li>
        <li><a href="#">
            <i class="fas fa-database"></i>
            <span class="nav-item">Manager Leave Approval</span>
          </a></li>
        <li><a href="#">
          <i class="fas fa-database"></i>
          <span class="nav-item">Report</span>
        </a></li>
        <li><a href="#">
          <i class="fas fa-chart-bar"></i>
          <span class="nav-item">Attendance</span>
        </a></li>
        <li><a href="#">
          <i class="fas fa-cog"></i>
          <span class="nav-item">Setting</span>
        </a></li>
         <li><a href="LandingPage.jsp">
          <i class="fas fa-cog"></i>
          <span class="nav-item">LogOut</span>
        </a></li>
      </ul>
    </nav>
     <form action="Servlet2" method="post">
      <input type="submit" value="Logout">
   </form>
    <section class="main">
      <div class="main-top">
        <h1>Attendance</h1>
        <i class="fas fa-user-cog"></i>
      </div>
      <%
    Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:Xe", "system", "oracle");
      String select="SELECT * FROM admin";
      PreparedStatement s=connection.prepareStatement(select);
      ResultSet rs=s.executeQuery();
      %>
           <section class="attendance">
        <div class="attendance-list">
          <h1>Admin List</h1>
          <table class="table">
            <thead>
              <tr>
                <th>AdminID</th>
                <th>AdminName</th>
                <th>PassWord</th>
                <th>MobileNumber</th>
                <th>Email</th>
              </tr>
            </thead>
            <tbody>
                <%while(rs.next()){ %>
              <tr>
                <td><%=rs.getInt(1)%></td>
                <td><%=rs.getString(2) %></td>
                 <td><%=rs.getString(3) %></td>
                <td><%=rs.getLong(4) %></td>
                 <td><%=rs.getString(5) %></td>
              </tr>
                 <% } %>
            </tbody>
          </table>
        </div>
      </section>
        <%
    Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:Xe", "system", "oracle");
      String sel="SELECT * FROM manager";
      PreparedStatement s1=connection.prepareStatement(sel);
      ResultSet result=s1.executeQuery();
      %>
    
      <div class="attendance">
        <div class="attendance-list">
          <h1>Manager List</h1>
          <table class="table">
            <thead>
              <tr>
                <th>ManagerID</th>
                <th>ManagerName</th>
                <th>PassWord</th>
                <th>MobileNumber</th>
                <th>Email</th>
                <th>Salary</th>
              </tr>
            </thead>
            <tbody>
                <%while(result.next()){ %>
              <tr>
                <td><%=result.getInt(1)%></td>
                <td><%=result.getString(2) %></td>
                 <td><%=result.getString(3) %></td>
                <td><%=result.getLong(4) %></td>
                 <td><%=result.getString(5) %></td>
                 <td><%=result.getInt(6) %>
              </tr>
                 <% } %>
            </tbody>
          </table>
        </div>
      </div>
      
           <%
    Connection connect1 = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:Xe", "system", "oracle");
      String emp="SELECT * FROM employee";
      PreparedStatement e1=connection.prepareStatement(emp);
      ResultSet r=e1.executeQuery();
      %>
    
      <div class="attendance">
        <div class="attendance-list">
          <h1>Employee List</h1>
          <table class="table">
            <thead>
              <tr>
                <th>EmployeeID</th>
                <th>EmployeeName</th>
                <th>PassWord</th>
                <th>MobileNumber</th>
                <th>Email</th>
                <th>Salary</th>
              </tr>
            </thead>
            <tbody>
                <%while(r.next()){ %>
              <tr>
                <td><%=r.getInt(1)%></td>
                <td><%=r.getString(2) %></td>
                 <td><%=r.getString(3) %></td>
                <td><%=r.getLong(4) %></td>
                 <td><%=r.getString(5) %></td>
                 <td><%=r.getInt(6) %>
              </tr>
                 <% } %>
            </tbody>
          </table>
        </div>
      </div>
    </section>
  </div>

</body>
</html>