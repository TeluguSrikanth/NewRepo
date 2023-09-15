package com.example.test.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.test.entity.Test;

@Repository
public interface TestRepo extends JpaRepository<Test, Integer> {

	
}
