package oops.java;

public class Department {
	
	private String deptname;
	
	public Department(String deptname) {
		super();
		this.deptname = deptname;
	}
	
	@Override
	public int hashCode() {
	//	return Objects.hashCode(this.deptname);
		return this.deptname.hashCode();
	}  
	
	Employee emp;

	private Employee[] employee;

	public String getDeptname() {
		return deptname;
	}

	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}

	public Employee[] getEmployee() {
		return this.employee;
	}

	public void setEmployee(Employee[] employee) {
		this.employee = employee;
	}
	
	


	
	

}
