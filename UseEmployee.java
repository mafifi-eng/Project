package runnable;

import java.util.Scanner;

import com.Address;
import com.Employee;

import service.EmployeeServiceImpl;

public class UseEmployee {

	public static void main(String[] args) {
		EmployeeServiceImpl service = new EmployeeServiceImpl();
		
		while(true) {
			System.out.println("Please choose an option");
			System.out.println("1. List all employees");
			System.out.println("2. Display yearly sallry");
			System.out.println("3. Display specific employee details");
			System.out.println("4. Modify employee details");
			System.out.println("5. Delete specific employee");
			Scanner scan = new Scanner(System.in);
			int option = scan.nextInt();
			
			switch (option) {
			case 1:
				service.displayAllEmployee();
				System.out.println("\n\n\n");
				break;
			case 2:
				System.out.println("Enter Employee ID");
				int no = scan.nextInt();
				System.out.println(service.calculateYearlySallary(no));
				System.out.println("\n\n\n");
				break;
			case 3:
				System.out.println("Enter Employee ID");
				no = scan.nextInt();
				Employee e = service.findByEmpNo(no);
				System.out.println(e.toString());
				System.out.println("\n\n\n");
				break;
			case 4:
				System.out.println("Enter Employee ID");
				no = scan.nextInt();
				System.out.println("Enter address city");
				String city = scan.nextLine();
				System.out.println("Enter address state");
				String state = scan.nextLine();
				System.out.println("Enter sallry");
				double sallry = scan.nextDouble();
				Address ad = new Address(city, state);
				service.updateEmployee(no, sallry, ad);
				System.out.println("\n\n\n");
				break;
			case 5:
				System.out.println("Enter Employee ID");
				no = scan.nextInt();
				service.deleteEmployee(no);
				System.out.println("\n\n\n");
				break;
			}
		}

	}

}
