package com.sandeep.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.sandeep.ecommerce.entity.ProductCategory;
import com.sandeep.ecommerce.entity.ProductCategoryProjection;

@CrossOrigin(value = "http://localhost:4200")
@RepositoryRestResource(excerptProjection = ProductCategoryProjection.class)
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Long> {

}
