package demo1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("demo1");
		EntityManager manager = factory.createEntityManager();
		
		
		Department dept = new Department(101, "HR");
		manager.getTransaction().begin();
		

		Employee emp1 = new Employee();
		emp1.setId(1);
		emp1.setName("Vinod");
		emp1.setAge(34);
		emp1.setDepartment(dept);
		emp1.setSalary(2000);
		emp1.setCity("Mumbai");
		manager.persist(emp1);
		

		manager.getTransaction().commit();

	}

}
