import oops.java.Department;

public class TestHashCode {

	public static void main(String[] args) {
		
		Department department = new Department("Testing");
		Department dept = new Department("Testing");
		
		department.hashCode();
		dept.hashCode();
		
		System.out.println(department.hashCode());
		System.out.println(dept.hashCode());
		
		
	}

}
