package fa.training.abstraction;

import java.util.Scanner;

public class Manager extends Employee{
	private double wage;
	private double basicSalary;
	
	
	@Override
	public double calcSalary() {
		// TODO Auto-generated method stub
		return wage * basicSalary;
	}
	
	@Override
	protected void inputData(Scanner scanner) {
		// TODO Auto-generated method stub
		super.inputData(scanner);
		System.out.println("Enter wage: ");
		wage = Double.parseDouble(scanner.nextLine());
		
		System.out.println("Enter basic Salary: ");
		basicSalary = Double.parseDouble(scanner.nextLine());
		
	}
	
	
	@Override
	protected void dispaly() {
		// TODO Auto-generated method stub
		super.dispaly();
		
		System.out.println("\t" + wage + "\t" + basicSalary + "\t"+ this.calcSalary());
	}
	
	
}
