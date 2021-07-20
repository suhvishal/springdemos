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
		
		
		//Department dept = manager.find(Department.class, 103);
		manager.getTransaction().begin();
		
//		manager.persist(d1);
//		System.out.println(d1);

		
//		Employee emp1 = new Employee(4, "Yashwant", "Chennai", 2000.00, dept);
//		manager.persist(emp1);
		
	   Employee emp =  manager.find(Employee.class, 1);
	   manager.remove(emp);
		
		
		
		manager.getTransaction().commit();

	}

}
