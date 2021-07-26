package com.example.demo;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductDAO extends PagingAndSortingRepository<Product, Integer>{
	
//	  <S extends T> save(Entity e)
//     Optional<T> findById(Id id)
//     Iterable<T> findAll()
//     void deleteById(Id id)
//     void deleteAll()
//     long count()
	
	//using spring data jpa "Query Lookup" methods
	
	Product findByName(String name);
	
	List<Product> findAllByPriceGreaterThan(double price);
	
	List<Product> findAllByNameLikeAndPriceGreaterThan(String name, double price);
	
	List<Product> findByIdIn(List<Integer> list, Pageable pageable );
	
	
	//custom jpql query with indexed parameter 
//	@Query("SELECT p FROM Product p WHERE p.price > ?1")
//	List<Product> getProducts(double price);

	//custom JPQL query with named parameter
//	@Query("SELECT p FROM Product p WHERE p.price > :price")
//	List<Product> getProducts(@Param("price") double price);
	
//	//native sql query statement 
//	@Query(value = "SELECT * from Product where price > ?1", nativeQuery = true)
//	List<Product> getProducts(double price);
	
	//native sql query statement 
//	@Query(value = "SELECT * from Product where price > :price", nativeQuery = true)
//	List<Product> getProducts(@Param("price") double price);
}


//container will create the proxy instance programmatically using spring's ProxyFactory


