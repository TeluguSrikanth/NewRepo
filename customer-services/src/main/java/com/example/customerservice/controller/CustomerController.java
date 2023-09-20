package com.example.customerservice.controller;

import java.util.List;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.customerservice.entity.Customer;
import com.example.customerservice.service.CustomerService;
import ch.qos.logback.classic.Logger;


@RestController
public class CustomerController {

	private final org.slf4j.Logger LOGGER = 
			LoggerFactory.getLogger(CustomerController.class);
	@Autowired
	CustomerService customerserv;

	@PostMapping("/addCustomer")
	public Customer addCustomer(@RequestBody Customer customer) {
		return customerserv.addCustomer(customer);

	}
	
	
	@GetMapping("/fetch")
	public List<Customer> getAllCustomer()
	{
		LOGGER.info("Srikanth Successfully executed the code");
		return customerserv.findAllCust();
	}
	
	@GetMapping("/fetch/{id}")
	public Customer findCustById(@PathVariable Integer id)
	{
		return customerserv.findCustomerById(id);
	}
	
	@PutMapping("/updateCustomer")
	public Customer updateAll(@RequestBody Customer customer)
	{
		return customerserv.addCustomer(customer);

	}
	
	@PutMapping("/updateById/{id}")
	public Customer updateOne(@RequestBody Customer customer,@PathVariable Integer id)
	{
		Customer cust=customerserv.findCustomerById(id);
		
		cust.setName(customer.getName());
		cust.setEmail(customer.getEmail());
		cust.setPassword(customer.getPassword());
		customerserv.addCustomer(cust);
		return cust;
	}	

	@DeleteMapping("/deleteCust/{id}")
	public String deleteCustomer(@PathVariable Integer id)
	{
		return customerserv.deleteCustomerById(id);
		
	}
	
	
	
	
}
















