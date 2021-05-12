package fa.training.abstraction;

import java.util.Scanner;

public class ProductionStaff extends Employee{
	private static final int UNIT_PRICE = 20;
	private double amountOfProduct;
	
	
	
	@Override
	public double calcSalary() {
		// TODO Auto-generated method stub
		return amountOfProduct * UNIT_PRICE;
	}
	
	@Override
	protected void inputData(Scanner scanner) {
		// TODO Auto-generated method stub
		super.inputData(scanner);
		
		System.out.println("Enter amount of produc: ");
		amountOfProduct = Double.parseDouble(scanner.nextLine());
		System.out.println("========================");
		
	}
	
	@Override
	protected void dispaly() {
		// TODO Auto-generated method stub
		super.dispaly();
		
		System.out.println("\t " + amountOfProduct + "\t" + this.calcSalary() + "\n");
	}

}
