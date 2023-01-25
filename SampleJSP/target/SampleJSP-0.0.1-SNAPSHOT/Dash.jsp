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
          <h1>Attendance List</h1>
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
    </section>
  </div>

</body>
</html>