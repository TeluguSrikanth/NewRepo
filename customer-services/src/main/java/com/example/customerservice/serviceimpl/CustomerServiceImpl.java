package com.example.customerservice.serviceimpl;

import java.util.List;

import javax.activation.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.customerservice.entity.Customer;
import com.example.customerservice.repo.CustomerRepo;
import com.example.customerservice.service.CustomerService;
@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerRepo customerRepo;
	
	@Override
	public Customer addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return customerRepo.save(customer);
	}

	@Override
	public List<Customer> findAllCust() {
		// TODO Auto-generated method stub
		return customerRepo.findAll();
	}

	@Override
	public Customer findCustomerById(Integer id) {
		// TODO Auto-generated method stub
		return customerRepo.findById(id).get();
	}

	@Override
	public Customer updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return customerRepo.save(customer);
	}

	@Override
	public Customer updateOneCustomer(Integer id) {
		// TODO Auto-generated method stub
		return customerRepo.findById(id).get();
	}

	

	@Override
	public String deleteCustomerById(Integer id) {
		// TODO Auto-generated method stub
		customerRepo.deleteById(id);
		return "Record Deleted By Srikanth";
	}

	
	
	
	

	


	
	
	
}

	


