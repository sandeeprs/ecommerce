package com.sandeep.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sandeep.ecommerce.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
