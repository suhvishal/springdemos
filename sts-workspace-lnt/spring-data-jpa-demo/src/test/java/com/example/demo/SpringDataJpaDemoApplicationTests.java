package com.example.demo;

 
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;

import com.mysql.cj.x.protobuf.MysqlxDatatypes.Array;
import com.querydsl.jpa.impl.JPAQuery;
	
@SpringBootTest
class SpringDataJpaDemoApplicationTests {
	
	@Autowired
	ProductDAO productDAO;
	
	@PersistenceContext
	private EntityManager entityManager;

	@Test
	void contextLoads() {
	}

//	@Test
//	public void testCreateProduct() {
//		Product p1 = new Product(1, "P1", "P1 Description", 2000.00);
//		
//		productDAO.save(p1);
//		productDAO.save(new Product(2, "P2", "P2 Description", 1500.00));
//		productDAO.save(new Product(3, "P3", "P3 Description", 1500.00));
//		productDAO.save(new Product(4, "P4", "P4 Description", 2500.00));
//		productDAO.save(new Product(5, "P5", "P5 Description", 4000.00));
//		productDAO.save(new Product(6, "P6", "P6 Description", 2100.00));
//		productDAO.save(new Product(7, "P7", "P7 Description", 1500.00));
//		productDAO.save(new Product(8, "P8", "P8 Description", 4300.00));
//
//	}
	
	
	
//	@Test 
//	public void testFind() {
//		System.out.println("finding products : " + productDAO.count() );
//	  Iterable<Product> list =	productDAO.findAll(Sort.by(new Sort.Order(Direction.DESC, "price"), new Sort.Order(Direction.ASC,  "name")));
//	  
//	  for(Product p : list) {
//		  System.out.println(p.getName() + " " + p.getPrice());
//	  }
//	}
	
//	@Test 
//	public void testPaging() {
//		
//		Pageable pageable = PageRequest.of(0, 2);
//		Page<Product> page = productDAO.findAll(pageable);
//		
//		for(Product p : page) {
//			System.out.println(p.getName() + " " + p.getPrice());
//		}
//		
//		 System.out.println("total pages = " + page.getTotalPages());
//	
//	}
	
//	@Test
//	public void findIdIn() {
//		Pageable pageable = PageRequest.of(0, 2);
//		List<Integer> list = new ArrayList<>();
//		list.addAll(Arrays.asList(1,3,2,5));
//		
//	    	productDAO.findByIdIn(list, pageable).forEach(p-> System.out.println(p.getName() + " " + p.getPrice()));
//	}
	
	@Test
	public void testQueryDSL() {
	
		JPAQuery<Person> query = new JPAQuery<>(entityManager);
		QPerson person = QPerson.person;
		
		List<Person> list =	query.from(person)
									.where(person.firstname.contains("vinod"))
									.fetch();
		list.forEach(p -> System.out.println(p));
		

	}
	
	
//	@Test
//	public void findProduct() {
////	 Optional<Product> optionalProduct =	productDAO.findById(1);
////	 
////	 if(optionalProduct.isPresent())
////		 	System.out.println(optionalProduct.get());
//		
//		//productDAO.getProducts();
////		Product p = productDAO.findByName("P1");
////		System.out.println(p);
//		
//		productDAO.findAllByPriceGreaterThan(4000);
//	}
	
}
