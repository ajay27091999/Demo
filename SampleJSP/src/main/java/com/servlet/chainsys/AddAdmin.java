package com.servlet.chainsys;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import com.sampleJsp.AdminAdd;
import com.validation.sample.AlreadyGmail;

/**
 * Servlet implementation class AddAdmin
 */
@WebServlet("/AddAdmin")
public class AddAdmin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddAdmin() {
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
		AdminAdd c1=new AdminAdd();
		  AlreadyGmail mail=new AlreadyGmail();
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			try {
				Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:Xe", "system", "oracle");
				c1.setAdminName(request.getParameter("adminName"));
				//mail.attendanceNameValidation1(c1);
				c1.setAdminPassWord(request.getParameter("pass"));
				//mail.emailValidation(a);
				//mail.exitGmail(a);
		         c1.setAdminEmail(request.getParameter("EmailId"));
				String num=request.getParameter("number");
				Long phone=Long.parseLong(num);
		         c1.setPhone(phone);
				String query1 = "INSERT INTO admin(hrid,hr_name,password,phone,email)VALUES(hrid.nextval,?,?,?,?)";
				PreparedStatement s = connection.prepareStatement(query1);
				s.setString(1,c1.getAdminName());
				s.setString(2,c1.getAdminPassWord());
				s.setLong(3,c1.getPhone());
				s.setString(4,c1.getAdminEmail());
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
