package com.nik;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nik.model.Address;
import com.nik.model.Employee;
import com.nik.service.EmployeeService;
import com.nik.service.EmployeeServiceImpl;

public class App {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appcontext.xml");
		EmployeeService empService = context.getBean("employeeServiceImpl", EmployeeServiceImpl.class);
		empService.addEmployee(createEmployee());
		context.registerShutdownHook();
	}

	// Method to create Employee object
	private static Employee createEmployee() {
		Employee emp = new Employee();
		Address addr = new Address();
		emp.setEmpId(106);
		emp.setEmpName("John");
		emp.setAge(25);
		// same as employee ID
		addr.setId(emp.getEmpId());
		addr.setAddrLine("Hunters Lane");
		addr.setCity("Princeton");
		emp.setAddress(addr);
		return emp;
	}

}
