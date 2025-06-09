package Entity;

public class Users {
	 private int userId;
	 private String username;
	 private String passwordHash;
	 private String role; 
	 private String email;
	 private boolean isActive;
	  
	 public Users() {}
	 
	 public Users(int userId, String username, String passwordHash, String role, String email, boolean isActive) {
		 this.userId= userId;
		 this.setUsername(username);
		 this.setPasswordHash(passwordHash);
		 this.setRole(role);
		 this.setEmail(email);
		 this.setActive(isActive);
	 }
	 
	 
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPasswordHash() {
		return passwordHash;
	}

	public void setPasswordHash(String passwordHash) {
		this.passwordHash = passwordHash;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	
	@Override
	public String toString() {
		return "userId: " + userId +
			   ", username: " + username +
			   ", passwordHash: " + passwordHash +
			   ", role: " + role + 
			   ", email: " + email +
			   ", isActive: " + isActive ; 
	}


}
