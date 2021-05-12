package fa.training.abstraction;

import java.util.Scanner;

public abstract class Employee {
	private String name;
	private String dayOfBirth;
	private String address;
	private static String nameCompany;
	
	public static void setNameCompany(String nameCompany) {
		Employee.nameCompany = nameCompany;
	}
	
	public static String getNameCompany()	{
		return nameCompany;
	}
	
	protected void inputData(Scanner scanner) {
		System.out.print(" Enter name: ");
		name = scanner.nextLine();
		System.out.print("Enter day Of Birth: ");
		dayOfBirth = scanner.nextLine();
		System.out.print("Enter Address: ");
		address = scanner.nextLine();
	}
	
	protected void dispaly ()	{
		System.out.print(name + "\t" + dayOfBirth + "\t" + address	+ "\t" + nameCompany	);
	}
	
	public abstract double calcSalary();

	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDayOfBirth() {
		return dayOfBirth;
	}
	public void setDayOfBirth(String dayOfBirth) {
		this.dayOfBirth = dayOfBirth;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
}
