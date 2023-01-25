package com.servlet.chainsys;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EmpLogout
 */
@WebServlet("/EmpLogout")
public class EmpLogout extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmpLogout() {
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
				Connection connect2 = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:Xe", "system", "oracle");
				String y1 = "update attendance_employee  Set logout_outtime = ?  Where employeeid = 4001 ";
				PreparedStatement s5 = connect2.prepareStatement(y1);
				java.sql.Timestamp sqlDate = new java.sql.Timestamp(new java.util.Date().getTime()); /// Set TimeStamp
				s5.setTimestamp(1, sqlDate);
				int rows = s5.executeUpdate();
				//total time
				Connection connect = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:Xe", "system", "oracle");
				String qurey1 = "SELECT login_intime,logout_outtime,totaltime from attendance_employee  Where employeeid=4001";
				PreparedStatement s1 = connect.prepareStatement(qurey1);
				ResultSet time = s1.executeQuery();
				while (time.next()) {
					String timing = time.getString("login_intime");
					String out = time.getString("logout_outtime");
					//testing
					SimpleDateFormat sdf= new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
					
					Date d1=sdf.parse(timing);
					Date d2=sdf.parse(out);
					Long time_diff=d2.getTime()- d1.getTime();
					Long difference_In_Seconds= (time_diff / 1000)% 60;
		              Long difference_In_Minutes= (time_diff/ (1000 * 60))% 60;
		               Long difference_In_Hours= (time_diff/ (1000 * 60 * 60))% 24;
					
		        	String diff1=difference_In_Minutes.toString();
		        	String diff2=difference_In_Hours.toString();
		        	Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:Xe", "system", "oracle");
					String query2 = "update  attendance_employee Set hours = ? ,min=?  Where employeeid = 4001 ";
					PreparedStatement ps = conn.prepareStatement(query2);
		        	ps.setString(1,diff2);
		        	ps.setString(2,diff1 );
		        	ps.executeUpdate();
				
				}
				request.getRequestDispatcher("LandingPage.jsp").forward(request, response);
				System.out.println("Done.....!");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
