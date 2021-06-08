package com.test;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

import com.Employee;

import service.EmployeeServiceImpl;

public class TestCases {
	
	EmployeeServiceImpl service = new EmployeeServiceImpl();

	
	@Test
	public void testCalculateYearlySallary() {
		
		double salary = service.calculateYearlySallary(1);
		assertNotEquals(45000,salary);
	}
	
	

}
