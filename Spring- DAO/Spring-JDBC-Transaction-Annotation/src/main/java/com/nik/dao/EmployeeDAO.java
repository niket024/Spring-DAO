package com.nik.dao;

import com.nik.model.Employee;

public interface EmployeeDAO {
	public Employee findEmployee(int empId);

	public void insertEmployee(Employee emp);
}
