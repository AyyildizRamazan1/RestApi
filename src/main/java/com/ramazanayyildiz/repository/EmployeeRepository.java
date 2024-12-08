package com.ramazanayyildiz.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ramazanayyildiz.model.Employee;

@Repository
public class EmployeeRepository {

	@Autowired
	private List<Employee> employeeList;

	public List<Employee> getAllEmployeeList() {
		return employeeList;
	}

	public Employee getEmployeeById(String id) {// Try-catch ile kontroller sağlanacak!!!
		Employee findEmployee = null;
		for (Employee employee : employeeList) {
			if (id.equals(employee.getId())) {
				findEmployee = employee;
				break;
			}
		}
		return findEmployee;
	}

	public List<Employee> getEmployeeWithParams(String firstName, String lastName) {
		List<Employee> employeeWithParams = new ArrayList<>();

		if (firstName == null && lastName == null) {
			return employeeList;
		}
		for (Employee employee : employeeList) {
			if (firstName != null && lastName != null) {
				if (employee.getFirstName().equalsIgnoreCase(firstName)
						&& employee.getLastName().equalsIgnoreCase(lastName)) {
					employeeWithParams.add(employee);
				}
			}
			if (firstName != null && lastName == null) {
				if (employee.getFirstName().equalsIgnoreCase(firstName)) {
					employeeWithParams.add(employee);
				}
			}
			if (lastName != null && firstName == null) {
				if (employee.getLastName().equalsIgnoreCase(lastName)) {
					employeeWithParams.add(employee);
				}
			}
		}
		return employeeWithParams;
	}

	public Employee saveEmployee(Employee newEmployee) {
		employeeList.add(newEmployee);
		return newEmployee;
	}

	public boolean deleteEmployee(String id) {
		// delete from Employee where id= :id
		Employee deleteEmployee = null;
		for (Employee employee : employeeList) {
			if (id.equals(employee.getId())) {
				deleteEmployee = employee;
				break;
			}
		}
		if (deleteEmployee == null) {
			return false;
		} else {
			employeeList.remove(deleteEmployee);
		}
		return true;
	}

}
