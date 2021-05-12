package fa.training.abstraction;

import java.util.Scanner;

public class EmployeeManagement {
	public static void main(String[] args) {
		
	Employee []	employees = new Employee[3];
	
	ProductionStaff productionSaff	 = new ProductionStaff();
	DailyStaff dailySaff = new DailyStaff();
	Manager manager= new Manager();
	
	Scanner scanner = new Scanner(System.in);
	
	// call inputData
	System.out.println(" Employee 1: ");
	productionSaff.inputData(scanner);
	
	System.out.println("Employee 2:");
	dailySaff.inputData(scanner);
	
	System.out.println("  Employee 3: ");
	manager.inputData(scanner);
	
	Employee.setNameCompany("FPT");
	
	employees[0] = productionSaff;
	employees[1] = dailySaff;
	employees[2] = manager;
	
	//loop
	
	for (Employee employee: employees) {
		employee.dispaly();
	}
	
	scanner.close();
}
}