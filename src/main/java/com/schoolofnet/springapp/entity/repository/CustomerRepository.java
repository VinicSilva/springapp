package com.schoolofnet.springapp.entity.repository;

import org.springframework.data.repository.CrudRepository;

import com.schoolofnet.springapp.entity.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

}
