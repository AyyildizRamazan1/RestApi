package com.ramazanayyildiz.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ramazanayyildiz.model.Employee;
import com.ramazanayyildiz.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	public List<Employee> getAllEmployeeList() {
		return employeeRepository.getAllEmployeeList();

	}
}