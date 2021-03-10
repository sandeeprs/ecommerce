package com.sandeep.ecommerce.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import com.sandeep.ecommerce.entity.Product;
import com.sandeep.ecommerce.entity.ProductProjection;

@CrossOrigin(value = "http://localhost:4200")
@RepositoryRestResource(excerptProjection = ProductProjection.class)
public interface ProductRepository extends JpaRepository<Product, Long> {

	Page<Product> findByProductCategoryId(@RequestParam("id") long id, Pageable pageable);
	
	//@Transactional
	//@Query("select p from Product p where p.name LIKE %:keyword% ")
	Page<Product> findByNameContaining(@RequestParam("name") String name, Pageable pageable);
	
	Page<Product> findById(@RequestParam("id") long id, Pageable pageable);
}
