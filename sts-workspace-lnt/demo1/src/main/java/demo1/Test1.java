package demo1;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("demo1");
		EntityManager manager = factory.createEntityManager();
		
		
		//TypedQuery<Employee> q1 =	manager.createQuery("SELECT e FROM Employee e", Employee.class);
		
		TypedQuery<Employee> q1 =	manager.createNamedQuery("getAllEmp", Employee.class);
		
		q1.setParameter(1, "HYD");
		
		List<Employee> list = q1.getResultList();
		
		for(Employee e : list) {
			System.out.println(e);
		}
		
		
//		Department dept = new Department(101, "HR");
//		manager.getTransaction().begin();
//		
//
//		Employee emp1 = new Employee();
//		emp1.setId(1);
//		emp1.setName("Vinod");
//		emp1.setAge(34);
//		emp1.setDepartment(dept);
//		emp1.setSalary(2000);
//		emp1.setCity("Mumbai");
//		manager.persist(emp1);
//		
//
//		manager.getTransaction().commit();

	}

}
