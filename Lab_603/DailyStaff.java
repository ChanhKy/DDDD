package fa.training.abstraction;

import java.util.Scanner;



public class DailyStaff extends Employee{
	private static final int UNIT_PRICE = 15;
	private double numberOfProduct;
	
	
	@Override
	public double calcSalary() {
		// TODO Auto-generated method stub
		return numberOfProduct * UNIT_PRICE;
	}
	
	@Override
	protected void inputData(Scanner scanner) {
		// TODO Auto-generated method stub
		super.inputData(scanner);
		
		System.out.println("Enter amount product: ");
		numberOfProduct = Double.parseDouble(scanner.nextLine());
		System.out.println("================");
	}
	
	@Override
	protected void dispaly() {
		// TODO Auto-generated method stub
		super.dispaly();
		System.out.println("\t" + numberOfProduct + "\t" + this.calcSalary() +"\n");
	}
}
