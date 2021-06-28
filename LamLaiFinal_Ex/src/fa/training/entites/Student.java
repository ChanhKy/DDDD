package fa.training.entites;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import fa.training.exception.InvalidateDOBException;
import fa.training.exception.InvalidateFullNameException;
import fa.training.exception.InvalidatePhoneNumberException;
import fa.training.validate.invalidate;

public class Student {
	private String fullName;
	private Date dob;
	private String sex;
	private String phone;
	private String universityName;
	private String gradeLevel;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String fullName, Date dob, String sex, String phone, String universityName, String gradeLevel) {
		super();
		this.fullName = fullName;
		this.dob = dob;
		this.sex = sex;
		this.phone = phone;
		this.universityName = universityName;
		this.gradeLevel = gradeLevel;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getUniversityName() {
		return universityName;
	}
	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}
	public String getGradeLevel() {
		return gradeLevel;
	}
	public void setGradeLevel(String gradeLevel) {
		this.gradeLevel = gradeLevel;
	}
	@Override
	public String toString() {
		return  fullName + "\t" + dob + "\t" + sex + "\t" + phone	+ "\t" + universityName + "\t" + gradeLevel;
	}
	
	public void showMyInfor() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		System.out.print(
						fullName 		+"\t"+  
						dateFormat.format(dob) +"\t"+ 
						sex  			+"\t"+
						phone		 	+"\t"+ 
						universityName  +"\t"+ 
						gradeLevel		+"\t"
				);
	}
	public void input() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			try {
				if (fullName == null) {
					System.out.print("Nhap ten sinh vien: ");
					String fullName = sc.nextLine();
					if(invalidate.isFullName(fullName)) {
						this.fullName = fullName;
					}else {
						throw new InvalidateFullNameException("fullName toi thieu 10 vaf toi da 50 ki tu: ");
					}
				}
				if(dob == null) {
					System.out.print("Nhap ngay thang nam sinh, vi du:29/12/1995: ");
					String date = sc.nextLine();
					if(invalidate.isDOB(date)) {
						this.dob = new Date(date);
					}else {
						throw new InvalidateDOBException("Ngay thang nhap vao khong dung");
					}
				}
				if (sex == null) {
					System.out.print("Nhap gioi tinh: ");
					this.sex = sc.nextLine();
				}
				if (phone == null) {
					System.out.print("Nhap so dien thoai: ");
					String phone = sc.nextLine();
					if(invalidate.isPhoneNumber(phone)) {
						this.phone = phone;
					}else {
						throw new InvalidatePhoneNumberException("So din thoai nhap vao khong hop le: ");
					}
				}
				if (universityName == null) {
					System.out.print("Nhap ten truong dai hoc: ");
					this.universityName = sc.nextLine();
				}
				if (gradeLevel == null) {
					System.out.print("Nhap xep loai cua sinh vien: ");
					this.gradeLevel = sc.nextLine();
				}
				break;
			}catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}

