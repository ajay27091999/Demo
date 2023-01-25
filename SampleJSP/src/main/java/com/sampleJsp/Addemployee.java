package com.sampleJsp;

public class Addemployee {
	
	private String userNameEmp;
	private String passWordEmp;
	private String emailId;
	private Long phoneEmp;
	private Integer salaryEmp;
	
	
	public Addemployee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Addemployee [userNameEmp=" + userNameEmp + ", passWordEmp=" + passWordEmp + ", emailId=" + emailId
				+ ", phoneEmp=" + phoneEmp + ", salaryEmp=" + salaryEmp + "]";
	}

	public String getUserNameEmp() {
		return userNameEmp;
	}
	public void setUserNameEmp(String userNameEmp) {
		this.userNameEmp = userNameEmp;
	}
	public String getPassWordEmp() {
		return passWordEmp;
	}
	public void setPassWordEmp(String passWordEmp) {
		this.passWordEmp = passWordEmp;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public Long getPhoneEmp() {
		return phoneEmp;
	}
	public void setPhoneEmp(Long phoneEmp) {
		this.phoneEmp = phoneEmp;
	}
	public Integer getSalaryEmp() {
		return salaryEmp;
	}
	public void setSalaryEmp(Integer salaryEmp) {
		this.salaryEmp = salaryEmp;
	}

	
}
