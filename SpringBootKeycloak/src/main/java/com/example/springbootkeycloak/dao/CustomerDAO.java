package com.example.springbootkeycloak.dao;

import com.example.springbootkeycloak.entity.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerDAO extends CrudRepository<Customer, Long> {

}
