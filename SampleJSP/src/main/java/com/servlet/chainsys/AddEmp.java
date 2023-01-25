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

import com.sampleJsp.Addemployee;

/**
 * Servlet implementation class AddEmp
 */
@WebServlet("/AddEmp")
public class AddEmp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddEmp() {
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
		    Addemployee v1=new Addemployee();
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			try {
				Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:Xe", "system", "oracle");
				v1.setUserNameEmp(request.getParameter("Empusername"));
				v1.setPassWordEmp(request.getParameter("pwdEmp"));
				v1.setEmailId(request.getParameter("Empemail"));
				String num=request.getParameter("phoneEmp");
				String salary=request.getParameter("salaryEmp");
				Long phone=Long.parseLong(num);
				v1.setPhoneEmp(phone);
				Integer amount=Integer.parseInt(salary);
				v1.setSalaryEmp(amount);
				String query1 = "INSERT INTO EMPLOYEE(employeeid,employee_name,employee_password,employee_phone,employee_email,employee_salary)VALUES(employeeid.nextval,?,?,?,?,?)";
				PreparedStatement s = connection.prepareStatement(query1);
				s.setString(1,v1.getUserNameEmp());
				s.setString(2,v1.getPassWordEmp());
				s.setLong(3,v1.getPhoneEmp());
				s.setString(4,v1.getEmailId());
				s.setInt(5, v1.getSalaryEmp());
				
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
