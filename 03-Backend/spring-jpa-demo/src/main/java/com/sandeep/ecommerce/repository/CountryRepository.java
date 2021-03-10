package com.sandeep.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.sandeep.ecommerce.entity.Country;
import com.sandeep.ecommerce.entity.CountryProjection;

@CrossOrigin("http://localhost:4200")
@RepositoryRestResource(excerptProjection = CountryProjection.class)
public interface CountryRepository extends JpaRepository<Country, Integer> {

}
