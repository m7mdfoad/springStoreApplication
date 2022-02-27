package com.m7md.erpSystem.services;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.m7md.erpSystem.exceptions.UserNotFoundException;
import com.m7md.erpSystem.models.Employee;
import com.m7md.erpSystem.repos.EmployeeRepo;

@Service
public class EmployeeService {

	private final EmployeeRepo employeeRepo;

	@Autowired
	public EmployeeService(EmployeeRepo employeeRepo) {
		super();
		this.employeeRepo = employeeRepo;
	}

	public Employee addEmployee(Employee employee) {
		employee.setEmployeeCode(UUID.randomUUID().toString());

		return employeeRepo.save(employee);
	}

	public List<Employee> finEmployees(){
		
		return employeeRepo.findAll();
		
	}
	public Employee updateEmployee(Employee employee) {
		return employeeRepo.save(employee);
	}
	
	public void deleteEmployee(Long employeeId) {
		employeeRepo.deleteById(employeeId);
	}
	public Employee findEmployeeById(Long id) {
		return employeeRepo.findEmployeeById(id).orElseThrow(()->new UserNotFoundException("user with id: "+id+" was not found"));
	}
}
