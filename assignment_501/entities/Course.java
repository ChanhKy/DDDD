package fa.training.entities;

import java.util.Scanner;

import fa.training.utils.Validator;

public class Course {
	private String id;
	private String name;
	private double duration;
	private String status;
	private String flag;
	
	public Course() {
	}
	
	public Course(String id, String name, double duration, String status, String flag) {
		super();
		this.id = id;
		this.name = name;
		this.duration = duration;
		this.status = status;
		this.flag = flag;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getDuration() {
		return duration;
	}
	public void setDuration(double duration) {
		this.duration = duration;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getFlag() {
		return flag;
	}
	public void setFlag(String flag) {
		this.flag = flag;
	}
	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", duration=" + duration + ", status=" + status + ", flag="
				+ flag + "]";
	}
	
	public void input() {
		Scanner scanner =new Scanner(System.in);
		boolean sta;
	do {
		sta = false ;
		System.out.print("Enter Course Code : ");
		try {
			id = scanner.nextLine();
			sta = !(Validator.isCoureCode(id));
		} catch ( Exception exception) {
			sta = true;
		}
	}	while (sta);
		
		System.out.print("Enter Name Course: ");
		name = scanner.nextLine();
		System.out.print("Enter duraion : ");
		duration = Double.parseDouble(scanner.nextLine());
		
		do {
			sta = false;
			System.out.print("Enter Status Course: ");
			try {
				status = scanner.nextLine();
				sta = !(Validator.isStatus(status));
			} catch (Exception exception) {
				sta = true;
			}
		}	while (sta);
		
		do {
			sta = false;
			System.out.print("Enter Flag: ");
			try {
				flag = scanner.nextLine();
				sta = !(Validator.isFlag(flag));
			} catch (Exception exception) {
				sta = true;
			}
		} while (sta);
	}
	
	

}
