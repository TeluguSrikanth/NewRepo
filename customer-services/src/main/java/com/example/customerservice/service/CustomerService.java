package com.example.customerservice.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.customerservice.entity.Customer;
@Service
public interface CustomerService {

	public Customer addCustomer(Customer customer);
//	
//	public List<Customer> getAllCustomers();

	public List<Customer> findAllCust();

    Customer findCustomerById(Integer id);
    
    public Customer updateCustomer(Customer customer);

    Customer updateOneCustomer(Integer id);
	
    String deleteCustomerById(Integer id);
    

	

	
}
