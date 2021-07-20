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
		
		
		Employee emp1 = new Employee(101, "Yashwant", "Mumbai", 1000.00);
		EntityTransaction tx = manager.getTransaction();
		
		
//		tx.begin();
//		manager.persist(emp1);
//		tx.commit();

	}

}
