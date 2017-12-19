package oops.java;

public class Employee {
	
	private int employeeId;
	private String FirstName;
	private String LastName;
	private String dob;
	private String employeeaddress;
	private String employeecontact;
	
	

	public Employee(int employeeId, String firstName, String lastName, String dob, String employeeaddress,
			String employeecontact) {
		super();
		this.employeeId = employeeId;
		FirstName = firstName;
		LastName = lastName;
		this.dob = dob;
		this.employeeaddress = employeeaddress;
		this.employeecontact = employeecontact;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getEmployeeaddress() {
		return employeeaddress;
	}

	public void setEmployeeaddress(String employeeaddress) {
		this.employeeaddress = employeeaddress;
	}

	public String getEmployeecontact() {
		return employeecontact;
	}

	public void setEmployeecontact(String employeecontact) {
		this.employeecontact = employeecontact;
	}
	
	
	

}
