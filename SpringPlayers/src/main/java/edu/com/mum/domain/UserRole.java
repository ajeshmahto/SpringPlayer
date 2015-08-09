package edu.com.mum.domain;


public class UserRole {
	

	private Long id;
	

	private String username;
	

	private String userrole;
	

	
	public UserRole() {
		// TODO Auto-generated constructor stub
	}
	
	

	public UserRole(String username, String userrole) {
		this.username = username;
		this.userrole = userrole;
	}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUserrole() {
		return userrole;
	}

	public void setUserrole(String userrole) {
		this.userrole = userrole;
	}
	


}
