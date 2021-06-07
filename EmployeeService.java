package service;

import com.Address;
import com.Employee;

public interface EmployeeService {
	
	public void displayAllEmployee();
	
	public double calculateYearlySallary(int no);
	
	public Employee findByEmpNo(int no);
	
	public Employee updateEmployee (int no, double sallry, Address adres);
	
	public void deleteEmployee (int no);
}
