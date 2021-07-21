package demo1;

import javax.persistence.Entity;

@Entity
public class Accountant extends Person {

	private String dept;

	public Accountant() {
		super();
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
	
	
}
