package Entity;
import java.sql.Date;

public class Employees {
	 private int employeeId;
	 private int userId;
	 private String firstName;
	 private String lastName;
	 private String department;
	 private String designation;
	 private Date dateOfJoining; 
	 private String status; 
	 private String contactNumber;
	 
	 public Employees() {}
	 
	 public Employees(int employeeId, int userId, String firstName, String lastName, String department, String designation, Date dateOfJoining, String status, String contactNumber) {
		 
         this.setEmployeeId(employeeId);
         this.setUserId(userId);
         this.setFirstName(firstName);
         this.setLastName(lastName);
         this.setDepartment(department);
         this.setDesignation(designation);
         this.setDateOfJoining(dateOfJoining);
         this.setStatus(status);
         this.setContactNumber(contactNumber);
         }

		public int getEmployeeId() {
			return employeeId;
		}

		public void setEmployeeId(int employeeId) {
			this.employeeId = employeeId;
		}

		public int getUserId() {
			return userId;
		}

		public void setUserId(int userId) {
			this.userId = userId;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public String getDepartment() {
			return department;
		}

		public void setDepartment(String department) {
			this.department = department;
		}

		public String getDesignation() {
			return designation;
		}

		public void setDesignation(String designation) {
			this.designation = designation;
		}

		public Date getDateOfJoining() {
			return dateOfJoining;
		}

		public void setDateOfJoining(Date dateOfJoining) {
			this.dateOfJoining = dateOfJoining;
		}

		public String getStatus() {
			return status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getContactNumber() {
			return contactNumber;
		}

		public void setContactNumber(String contactNumber) {
			this.contactNumber = contactNumber;
		}
		
		@Override
		public String toString() {
			return "employeeId: " + getEmployeeId() +
		               ", userId: " + getUserId() +
		               ", firstName: " + getFirstName() +
		               ", lastName: " + getLastName() +
		               ", department: " + getDepartment() +
		               ", designation: " + getDesignation() +
		               ", dateOfJoining: " + getDateOfJoining() +
		               ", status: " + getStatus() +
		               ", contactNumber: " + getContactNumber();
		}

}
