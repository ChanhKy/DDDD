package fa.training.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import fa.training.utils.AirplanceAvaildator;
import fa.training.utils.HelicopAvaildator;

public class Helicopter extends Airplance {
	private static final long serialVersionUID = 1L;
	private double range; // tam bay

	public Helicopter() {
		super();
	}

	public Helicopter(String iD, String model, double cruiseSpeed, double emptyWeight, double maxTakeOff) {
		super(iD, model, cruiseSpeed, emptyWeight, maxTakeOff);
		this.range = range;
	}

	 

	@Override
	public String toString() {
		return "Airplance [ID=" + ID + ", model=" + model + ", cruiseSpeed=" + cruiseSpeed + ", emptyWeight="
				+ emptyWeight + ", maxTakeOff=" + maxTakeOff + ", range= " + range + "]";
	}

	public void input (ArrayList<Airport> airports) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			try {
				if(ID == null) {
					System.out.println("enter ID: ");
					String ID = scanner.nextLine();
					this.ID = HelicopAvaildator.isHelicopter(ID, airports)? ID: null;	
				}
				if (model == null) {
					System.out.println("Enter model: ");
					String model = scanner.nextLine();
					this.model = AirplanceAvaildator.isModel(ID)? model: null;
				}
				if(cruiseSpeed == 0) {
					System.out.println("Enter speed");
					this.cruiseSpeed = Double.parseDouble(scanner.nextLine());
				}
				if(emptyWeight == 0 ) {
					System.out.println("Enter empty weight: ");
					this.emptyWeight = Double.parseDouble(scanner.nextLine());
				}
				if(maxTakeOff ==0) {
					System.out.println("Enter max take off");
					this.maxTakeOff = Double.parseDouble(scanner.nextLine());
				}
				if(range == 0) {
					System.out.println("Enter range: ");
					this.range = Double.parseDouble(scanner.nextLine());
				}
				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}

	@Override
	public void fly() {
		System.out.println("Rotated wing");

	}

	public double getRange() {
		return range;
	}

	public void setRange(double range) {
		this.range = range;
	}

}
