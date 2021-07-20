package demo1;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "emp_table")
public class Employee {
	
	@Id
	@Column(name = "id")
	private int empId;
	
	@Column(name = "emp_name", length = 50)
	private String eName;
	private String city;
	private double salary;
	
	public Employee() {
		super();
	}

	public Employee(int empId, String eName, String city, double salary) {
		super();
		this.empId = empId;
		this.eName = eName;
		this.city = city;
		this.salary = salary;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	} 
	
	

}
