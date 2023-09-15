package com.example.test.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.example.test.entity.Test;
import com.example.test.repo.TestRepo;
@RestController
public class TestController {

	@Autowired
	TestRepo testRepo;
	
	@PostMapping("/saveTest")
	public Test saveTest(@RequestBody Test test)
	{
		return testRepo.save(test);
	}
	
	@GetMapping("/fetch")
	public List<Test> findAll()
	{
		return testRepo.findAll();
	}
	@GetMapping("/fetch/{Id}")
	public Optional<Test> findMhr(@PathVariable Integer Id)
	{
		return testRepo.findById(Id); 
	}
	@PutMapping("/edit")
	public Test update(@RequestBody Test test)
	{
		return testRepo.save(test);
	}
	
	@PutMapping("/edit/{id}")
	public Test updateOne(@RequestBody Test test,@PathVariable Integer id)
	{
		Test test1=testRepo.findById(id).get();
		test1.setFirstName(test.getFirstName());
		testRepo.save(test1);
		return test1;
	}
	
	
	@DeleteMapping("/delete/{Id}")
	public String delete(@PathVariable Integer Id)
	{
		testRepo.deleteById(Id);
		return "Record deleted";
	}
	

}
