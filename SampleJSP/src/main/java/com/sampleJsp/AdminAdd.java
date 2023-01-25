package com.sampleJsp;

public class AdminAdd {
	
	private String adminName;
	private String adminPassWord;
	private String adminEmail;
	private Long phone;
	
	
	
	@Override
	public String toString() {
		return "AddAdmin [adminName=" + adminName + ", adminPassWord=" + adminPassWord + ", adminEmail=" + adminEmail
				+ ", phone=" + phone + "]";
	}
	public AdminAdd() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getAdminName() {
		return adminName;
	}
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	public String getAdminPassWord() {
		return adminPassWord;
	}
	public void setAdminPassWord(String adminPassWord) {
		this.adminPassWord = adminPassWord;
	}
	public String getAdminEmail() {
		return adminEmail;
	}
	public void setAdminEmail(String adminEmail) {
		this.adminEmail = adminEmail;
	}
	public Long getPhone() {
		return phone;
	}
	public void setPhone(Long phone) {
		this.phone = phone;
	}

	
}
