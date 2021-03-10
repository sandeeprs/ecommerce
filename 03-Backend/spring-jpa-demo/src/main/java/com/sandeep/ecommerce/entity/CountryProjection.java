package com.sandeep.ecommerce.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

@Projection(
		name= "CountryProjection",
		types = {Country.class})
public interface CountryProjection {
	
	@Value("#{target.id}")
	int getId();
	
	String getCode();
	
	String getName();

}
