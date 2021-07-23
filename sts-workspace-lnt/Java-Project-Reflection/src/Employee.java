
public class Employee {
	
	private int empId;
	private String name;
	
	public Employee() {
		super();
		System.out.println("Employee Class no-arg constructor");
	}

	public Employee(int empId, String name) {
		super();
		this.empId = empId;
		this.name = name;
	}
	
	private String showEmp(String name) {
		System.out.println("showEmp()");
		return empId + " " + name;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	} 
	
	

}
