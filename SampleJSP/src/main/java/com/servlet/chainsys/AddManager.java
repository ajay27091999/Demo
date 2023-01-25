package com.servlet.chainsys;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;



import com.sampleJsp.Admin;
import com.validation.sample.AlreadyGmail;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddManager
 */
@WebServlet("/AddManager")
public class AddManager extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddManager() {
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
		  Admin a=new Admin();
		  AlreadyGmail mail=new AlreadyGmail();
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			try {
				Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:Xe", "system", "oracle");
				a.setUserName(request.getParameter("username"));
				mail.attendanceNameValidation1(a);
				String email=request.getParameter("email");
				a.setEmail(email);
				mail.emailValidation(a);
				mail.exitGmail(a);
				String passWord=request.getParameter("pwd");
				a.setPassWord(passWord);
				mail.passValidation1(a);
				String num=request.getParameter("phone");
				String salary=request.getParameter("salary");
				Long phone=Long.parseLong(num);
				a.setPhone(phone);
				mail.phoneValidation(a);
				Integer amount=Integer.parseInt(salary);
				a.setSalary(amount);
				mail.salaryValidation(a);
				String query1 = "INSERT INTO MANAGER(managerid,manager_name,manager_password,manager_phone,manager_email,manager_salary)VALUES(managerid.nextval,?,?,?,?,?)";
				PreparedStatement s = connection.prepareStatement(query1);
				s.setString(1,a.getUserName());
				s.setString(4,a.getEmail());
				s.setString(2,a.getPassWord());
				s.setLong(3,a.getPhone());
				s.setInt(5, a.getSalary());
				
				int rows=s.executeUpdate();
				System.out.println("Rows "+rows);

			} catch (SQLException e) {
				e.printStackTrace();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
