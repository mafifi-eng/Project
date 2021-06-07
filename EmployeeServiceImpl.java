package service;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

import com.Address;
import com.Employee;
/*
 * Junit to be implemented!
 */

public class EmployeeServiceImpl implements EmployeeService {
	
	private static List employees = new ArrayList<Employee>();
	private static final Logger logger = Logger.getLogger(EmployeeServiceImpl.class.getName());

	public EmployeeServiceImpl() {
		super();
		Address ad = new Address("Buffalo", "NY");
		Address ad1 = new Address("Carrollton", "TX");
		Address ad2 = new Address("Falls Church", "VA");
		Employee emp = new Employee(1, "John", 3750, ad);
		Employee emp1 = new Employee(2, "Ali", 4000, ad1);
		Employee emp2 = new Employee(3, "Murali", 4250, ad2);
		
		employees.add(emp);
		employees.add(emp2);
		employees.add(emp1);
		BasicConfigurator.configure(); 
	}

	public void displayAllEmployee() {
		employees.stream().forEach(System.out::println);
		logger.info("Display all employees!");
	}

	public double calculateYearlySallary(int no) {
		Employee emp = (Employee) employees.stream().filter(e -> ((Employee) e).getEmpNo() == no);
		logger.info("Calculating employee sallry!");
		return (emp.getSalary() * 12);
	}

	public Employee findByEmpNo(int no) {
		logger.info("Finding employee by ID!");
		return (Employee) employees.stream().filter(e -> ((Employee) e).getEmpNo() == no);
	}

	public Employee updateEmployee(int no, double sallry, Address adres) {
		Employee emp = (Employee) employees.stream().filter(e -> ((Employee) e).getEmpNo() == no);
		emp.setAddress(adres);
		emp.setSalary(sallry);
		logger.info("Employee Updated!");
		return emp;
	}

	public void deleteEmployee(int no) {
		Employee emp = (Employee) employees.stream().filter(e -> ((Employee) e).getEmpNo() == no);
		logger.info("Employee Deleted!");
		employees.remove(emp);
	}

}
