package fa.training.entites;

import java.util.Scanner;

public class Teacher extends Person {
	private double bassicSalary;
	private double subsidy;
	
	
	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Teacher(String name, String gender, String phoneNumber, String email
			, double bassicSalary, double subsidy) {
		super(name, gender, phoneNumber, email);
		this.bassicSalary = bassicSalary;
		this.subsidy = subsidy;
	}


//	@Override
//	public void purchaseParkingPass() {
//		// TODO Auto-generated method stub
//		
//	}
	
	public double getBassicSalary() {
		return bassicSalary;
	}


	public void setBassicSalary(double bassicSalary) {
		this.bassicSalary = bassicSalary;
	}


	public double getSubsidy() {
		return subsidy;
	}


	public void setSubsidy(double subsidy) {
		this.subsidy = subsidy;
	}


	public  double calculateSalary () {
		return bassicSalary + subsidy;
	}
	
	public void input () {
		super.input();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap Salary co bann: ");
		bassicSalary = Double.parseDouble(sc.nextLine());
		System.out.println("Nhap Susidy: ");
		subsidy = Double.parseDouble(sc.nextLine());
	}
}
