package com.sandeep.ecommerce.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestParam;

import com.sandeep.ecommerce.entity.CountryProjection;
import com.sandeep.ecommerce.entity.State;
import com.sandeep.ecommerce.entity.StateProjection;

@CrossOrigin("http://localhost:4200")
@RepositoryRestResource(excerptProjection = StateProjection.class)
public interface StateRepository extends JpaRepository<State, Integer> {
	
	List<State> findByCountryId(@RequestParam("id") int id);

}
