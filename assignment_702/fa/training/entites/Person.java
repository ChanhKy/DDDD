package fa.training.entites;

import java.util.Scanner;

import fa.training.utils.Validator;

public abstract class Person {
	private String name;
	private String gender;
	private String phoneNumber;
	private String email;
	
	public Person() {
	
	}
	public Person(String name, String gender, String phoneNumber, String email) {
		this.name = name;
		this.gender = gender;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", gender=" + gender + ", phoneNumber=" + phoneNumber + ", email=" + email
				+ "]";
	}
//	public void purchaseParkingPass();
	
	public void input()	{
		boolean status;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ten cua ban: ");
		name = sc.nextLine();
		System.out.println("Nhap gioi tinh: ");
		gender = sc.nextLine();
		System.out.println("Nhap so dien thoai: ");
		phoneNumber = sc.nextLine();
		
		do {
			status  = false;
			System.out.println("Nhap email: ");
			try {
				email = sc.nextLine();
				status = !(Validator.isEmail(email));
			} catch (Exception exeption) {
				status = true;
			}
		} while (status) ;
		
	}
}
