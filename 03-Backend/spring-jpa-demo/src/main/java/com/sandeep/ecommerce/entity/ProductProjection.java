package com.sandeep.ecommerce.entity;

import java.math.BigDecimal;
import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

@Projection(
		name = "ProductProjection",
		types = {Product.class})
public interface ProductProjection {

	@Value("#{target.id}")
	long getId();
	
	String getSku();
	
	String getDescription();
	
	String getName();
	
	BigDecimal getUnitPrice();
	
	String getImageUrl();
	
	boolean isActive();
	
	int getUnitsInStock();
	
	Date getDateCreated();
	
	Date getLastUpdated();
	
	//ProductCategory getProductCategory();
	
	/*
	 * @Value("#{target.getProductCategory().size()}") int
	 * getProductCategorycount();
	 */
}
