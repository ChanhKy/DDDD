package fa.training.entities;

import java.util.Scanner;

public class Multimedia {
	private String name;
	private double duration;

	public Multimedia() {
	}

	public Multimedia(String name, double duration) {
		this.name = name;
		this.duration = duration;
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

	public void createMultimedia() {
		
		Scanner scanner = new Scanner(System.in);
		while(true) {
			try {
				if (name == null) {
					System.out.println("Enter name Multimedia: ");
					name = scanner.nextLine();
				}
				if (duration == 0.0) {
					System.out.println("Enter duration: ");
					duration = Double.parseDouble(scanner.nextLine());
				}
				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
		
	}

}
