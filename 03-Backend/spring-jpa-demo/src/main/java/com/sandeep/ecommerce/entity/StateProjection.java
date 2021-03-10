package com.sandeep.ecommerce.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

@Projection(
		name= "StateProjection",
		types = {State.class})
public interface StateProjection {
	
	@Value("#{target.id}")
	int getId();
	
	String getName();
	

}
