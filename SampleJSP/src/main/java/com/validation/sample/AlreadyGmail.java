package com.validation.sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


import com.sampleJsp.Admin;


public class AlreadyGmail {

	public Boolean exitGmail(Admin a) throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:Xe", "system", "oracle");
	               String  mail=a.getEmail();
		 String user="select manager_email from manager";              
		  PreparedStatement ps=connection.prepareStatement(user);  ///Already exiting Gmail
	        ResultSet rs=ps.executeQuery();
	        while(rs.next()) {
	        	 String userGmail=rs.getString(1);
	        	 if(userGmail.equals(mail)) {
	        		 throw new AlreadyExitingMailException();
	                
	        	 }
	        }
	        ps.close();
		return true;
		
	}
	
	public boolean attendanceNameValidation1(Admin c) throws Exception { // Name Validation1
		String name=c.getUserName();
		Pattern pattern = Pattern.compile("[a-zA-Z]{4,}");
		Matcher matcher = pattern.matcher(name);
		boolean a=matcher.matches();
		if(a) {
			return true;
		}
		else
			throw new InvalidNameException();
		
	}
	public boolean passValidation1(Admin a) throws Exception { //Phone Number Validation
		String pass=a.getPassWord();                           //Condition Validation
		Pattern pattern = Pattern.compile(".[A-Za-z0-9]{1,}[@#$!%^&?><]{1,}.*");
		Matcher matcher = pattern.matcher(pass);
		boolean matches = matcher.matches();
		if(matches) {
			return true;
		}
		else
			throw new InvalidPasswordException();
	}
		public boolean phoneValidation(Admin a) throws Exception { 
			Long num=a.getPhone();
			if(num<0) {
				throw new negativeValueExpection();
			}else
			{
			 String number=Long.toString(num);
			 ///regex
			Pattern pattern = Pattern.compile("^\\d{10}$");
			Matcher matcher = pattern.matcher(number);
			boolean matches = matcher.matches();
			if(matches) {
				return true;
			}
			else
				throw new PhoneException();
			}
			
		}
		
		public boolean emailValidation(Admin a) throws Exception { // Validation
			 String mail=a.getEmail();
			 ///regex
			Pattern pattern = Pattern.compile("^(.+)@(.+)$");
			Matcher matcher = pattern.matcher(mail);
			boolean matches = matcher.matches();
			if(matches) {
				return true;
			}
			else
				throw new EmailException();
		}
	
//		public boolean roleUser(String role) { // Validation
//			 String userRole=role;
//			 ///regex
//			Pattern pattern = Pattern.compile("[a-z A-Z]+");
//			Matcher matcher = pattern.matcher(userRole);
//			boolean matches = matcher.matches();
//			if(matches==true) {
//				System.out.println("Vaild Role");
//			}
//			else
//				System.out.println("InVaild");
//			return matches;
//		}
//		
	public boolean dValidation(Integer Id) throws Exception { // Validation
			String number=Integer.toString(Id);
			///regex
			Pattern pattern = Pattern.compile("^\\d{4}$");
			Matcher matcher = pattern.matcher(number);
			boolean matches = matcher.matches();
			if(matches) {
				return true;
			}
			else
				throw new IdException();
		}
		public boolean salaryValidation(Admin a) throws Exception { // Validation
			Integer num=a.getSalary();
				String n=Integer.toString(num);
			///regex
			Pattern pattern = Pattern.compile("^\\d{5}$");
			Matcher matcher = pattern.matcher(n);
			boolean matches = matcher.matches();
			if(matches) {
				return true;
			}
			else
				throw new SalaryException();
	}
		
}
