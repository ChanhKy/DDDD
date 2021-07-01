package fa.training.entites;

import java.util.Date;
import java.util.Scanner;

public class GoodStudent extends Student {
	private double gpa;
	private String bestWardName;

	public GoodStudent() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GoodStudent(String fullName, Date dob, String sex, String phone, String universityName, String gradeLevel,
			double gpa, String bestWardName) {
		super(fullName, dob, sex, phone, universityName, gradeLevel);
		this.gpa = gpa;
		this.bestWardName = bestWardName;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	public String getBestWardName() {
		return bestWardName;
	}

	public void setBestrewardName(String bestrewardName) {
		this.bestWardName = bestrewardName;
	}

	@Override
	public String toString() {
		return "GoodStudent : " + super.toString() + "\t" + gpa + "\t" + bestWardName;
	}

	@Override
	public void showMyInfor() {
		super.showMyInfor();
		System.out.println(gpa + "\t" + bestWardName);
	}
	
	@Override
	public void input() {
		super.input();
		Scanner sc = new Scanner(System.in);
		while(true) {
			try {
				if (gpa == 0) {
					System.out.print("Nhap diem trung binh hoc tap: ");
					this.gpa = Double.parseDouble(sc.nextLine());
				}
				if (bestWardName == null) {
					System.out.print(" Nhap giai thuong nhan duoc: ");
					this.bestWardName = sc.nextLine();
				}
				break;
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
