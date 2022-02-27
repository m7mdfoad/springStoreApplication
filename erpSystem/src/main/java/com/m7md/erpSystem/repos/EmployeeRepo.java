package com.m7md.erpSystem.repos;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.m7md.erpSystem.models.Employee;

public interface EmployeeRepo extends JpaRepository<Employee,Long>{

	Optional<Employee> findEmployeeById(Long id);

}
