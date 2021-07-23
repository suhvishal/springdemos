package com.example.demo;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringDataJpaDemoApplicationTests {
	
	@Autowired
	ProductDAO productDAO;

	@Test
	void contextLoads() {
	}

	@Test
	public void testCreateProduct() {
		Product p1 = new Product(1, "P1", "P1 Description", 2000.00);
		
		productDAO.save(p1);
		
	}
	
	@Test
	public void findProduct() {
	 Optional<Product> optionalProduct =	productDAO.findById(1);
	 
	 if(optionalProduct.isPresent())
		 	System.out.println(optionalProduct.get());
	}
	
}
