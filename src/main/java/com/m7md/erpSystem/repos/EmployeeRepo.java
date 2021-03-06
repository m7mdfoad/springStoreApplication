package com.m7md.erpSystem.repos;

import com.m7md.erpSystem.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {

    Optional<Employee> findEmployeeById(Long id);


}
