package com.nik.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.nik.dao.EmployeeDAO;
import com.nik.model.Employee;

@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeDAO empDAO;

	public Employee getEmployee(int empId) {
		return empDAO.findEmployee(empId);
	}

	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public void addEmployee(Employee emp) {
		empDAO.insertEmployee(emp);
	}
}