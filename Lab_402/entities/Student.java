package fa.training.entities;

import java.util.Scanner;

public class Student {
	private int id;
	private String name;
	private double age;
	private double gpa;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String name, double age, double gpa) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gpa = gpa;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAge() {
		return age;
	}

	public void setAge(double age) {
		this.age = age;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name +
				", age=" + age + ", gpa=" + gpa + "]";
	}
	
	
	public void input ()	 {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap ma SV: ");
		id = Integer.parseInt(scanner.nextLine());
		System.out.print(" Nhap ten SV: ");
		name = scanner.nextLine();
		System.out.print("Nhap tuoi sinh vien: ");
		age = Double.parseDouble(scanner.nextLine());
		System.out.print(" Nhap GPA SV: ");
		gpa = Double.parseDouble(scanner.nextLine());
	
	}
}
