package com.sandeep.ecommerce.entity;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

@Projection(
		name = "ProductCategoryProjection",
		types = {ProductCategory.class})
public interface ProductCategoryProjection {
	
	@Value("#{target.id}")
	long getId();
	
	String getCategoryName();
	
	//List<Product> getProducts();
	
	/*
	 * @Value("#{target.getProducts().size()}") int getProductsCount();
	 */

}
