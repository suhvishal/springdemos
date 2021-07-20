package demo1;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

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
	
	@OneToOne(cascade = {CascadeType.PERSIST, CascadeType.REMOVE, CascadeType.MERGE}, fetch = FetchType.LAZY)
	private Department department;
	
	public Employee() {
		super();
	}

	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", eName=" + eName + ", city=" + city + ", salary=" + salary
				+ ", department=" + department + "]";
	}




	public Employee(int empId, String eName, String city, double salary) {
		super();
		this.empId = empId;
		this.eName = eName;
		this.city = city;
		this.salary = salary;
	}

	public Employee(int empId, String eName, String city, double salary, Department department) {
		super();
		this.empId = empId;
		this.eName = eName;
		this.city = city;
		this.salary = salary;
		this.department = department;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
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
