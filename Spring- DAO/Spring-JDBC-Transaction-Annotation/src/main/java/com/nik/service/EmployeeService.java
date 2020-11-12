package com.nik.service;

import com.nik.model.Employee;

public interface EmployeeService {
	public Employee getEmployee(int empId);

	public void addEmployee(Employee emp);
}
