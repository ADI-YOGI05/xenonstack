package com.sou.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sou.model.Customer;

@Repository
public interface CustomerDao extends CrudRepository<Customer, Integer> {

}
