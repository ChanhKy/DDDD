package fa.training.entites;

import java.util.Scanner;

import fa.training.utils.Validator;

public class Student extends Person{
	private String studenId;
	private double theory;
	private double practive;
	
	public Student() {
	}

	public Student(String name, String gender, String phoneNumber, String email 
		, String studentId, double theory, double practive) {
		super(name, gender, phoneNumber, email);
		this.studenId = studentId;
		this.theory = theory;
		this.practive = practive;
	}

//	@Override
//	public void purchaseParkingPass() {
//		// TODO Auto-generated method stub
//		
//	}
	
	public double calculateFinalMath() {
		return (theory + practive) / 2;
	}
	
	@Override
	public void input() {
		super.input();
		Scanner sc = new Scanner(System.in);
		boolean status;
		System.out.println(" Nhap ma Sinh vien: ");
		studenId = sc.nextLine();
		
		do {
			status = false;
			System.out.println("Nhap diem ly thuyet: ");
		try {
			theory = Double.parseDouble(sc.nextLine());
			status =!(Validator.isTheoryPactice(theory));
		} catch (Exception exception) {
			status = true;
		}	
		} while (status);
		
		do {
			status = false;
			System.out.println("Nhap diem thuc hanh: ");
			try { 
				practive = Double.parseDouble(sc.nextLine());
				status = !(Validator.isTheoryPactice(practive));
				
			}catch (Exception exception) {
				status = true;
			}
		} while (status);
	}

	@Override
	public String toString() {
		return "Student [studenId=" + studenId + ", theory=" + theory + ", practive=" + practive + ", getName()="
				+ getName() + ", getGender()=" + getGender() + ", getPhoneNumber()=" + getPhoneNumber()
				+ ", getEmail()=" + getEmail() + "]";
	}

	public String getStudenId() {
		return studenId;
	}

	public void setStudenId(String studenId) {
		this.studenId = studenId;
	}

	public double getTheory() {
		return theory;
	}

	public void setTheory(double theory) {
		this.theory = theory;
	}

	public double getPractive() {
		return practive;
	}

	public void setPractive(double practive) {
		this.practive = practive;
	}
	
}
