package com.example.demo;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductDAO extends CrudRepository<Product, Integer>{
	
//	  <S extends T> save(Entity e)
//     Optional<T> findById(Id id)
//     Iterable<T> findAll()
//     void deleteById(Id id)
//     void deleteAll()
//     long count()

}


//container will create the proxy instance programmatically using spring's ProxyFactory


