package com.example.customerservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.customerservice.entity.Customer;

@Repository
public interface CustomerRepo extends JpaRepository<Customer,Integer>{

	

}
