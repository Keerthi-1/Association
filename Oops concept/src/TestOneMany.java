import oops.java.Department;
import oops.java.Employee;

public class TestOneMany {

	public static void main(String[] args) {
		
		Department department = new Department("Developing");
		
		Employee[] employee = new Employee[2];
		
		employee[0] = new Employee(31456, "John", "Williams", "07/25/1990", "Virginia", "225-465-4852");
		employee[1] = new Employee(37902, "Alicia", "Cooper", "01/15/1980", "California", "246-413-7902");
		
		
		department.setEmployee(employee);
		
		Employee[] emp = department.getEmployee();
		
		System.out.println("Employee Details from the Department "+department.getDeptname());
		
		System.out.println("ID : "+emp[0].getEmployeeId());
		System.out.println("First Name: "+emp[0].getFirstName());
		System.out.println("Last Name: "+emp[0].getLastName());
		System.out.println("Loaction: "+emp[0].getEmployeeaddress());
		System.out.println("Contact: "+emp[0].getEmployeecontact());
		
	}

}
