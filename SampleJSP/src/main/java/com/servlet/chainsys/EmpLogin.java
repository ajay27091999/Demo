package com.servlet.chainsys;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class EmpLogin
 */
@WebServlet("/EmpLogin")
public class EmpLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmpLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			try {
				Connection connec = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:Xe", "system", "oracle");
				String id=request.getParameter("empId");
			    String passWord=request.getParameter("pass");
				String user = "select employeeid,employee_password from employee "; // Log in Access
				PreparedStatement ps = connec.prepareStatement(user);
				ResultSet rs = ps.executeQuery();
				while (rs.next()) {
					String usesId = rs.getString(1);
					if (usesId.equals(id)) {
						String upass = rs.getString(2);
						if (upass.equals(passWord)) {
							String qurey1 = "update attendance_employee  Set login_intime = ?  Where employeeid = ? ";
							PreparedStatement s1 = connec.prepareStatement(qurey1);
							java.sql.Timestamp sqlDate = new java.sql.Timestamp(new java.util.Date().getTime());
							s1.setTimestamp(1, sqlDate);
							s1.setString(2, id);
							int rows = s1.executeUpdate();
						
							request.getRequestDispatcher("EmployeeDash.jsp").forward(request, response);
							
						} else {
							System.out.println("Incorrect User");
						}
					}

				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
