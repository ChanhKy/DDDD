package fa.training.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

import fa.training.utils.AirplanceAvaildator;
import fa.training.utils.FixedwingAvaildator;

public class Fixedwing extends Airplance implements Serializable {
	public  String type; // kieu may bay
	public double minNeedRun; // duong bang bay

	public Fixedwing() {
		super();

	}

	public Fixedwing(String iD, String model, double cruiseSpeed, double emptyWeight, double maxTakeOff, String type,
			double minNeedRun) {
		super(iD, model, cruiseSpeed, emptyWeight, maxTakeOff);
		this.type = type;
		this.minNeedRun = minNeedRun;

	}

	@Override
	public String toString() {

		return "Fixedwing [ID=" + ID + ", model=" + model + ", cruiseSpeed=" + cruiseSpeed + ", emptyWeight="
				+ emptyWeight + ", maxTakeOff=" + maxTakeOff + ", type= " + type + ",minNeedRun" + minNeedRun + "]";
	}

	public void input(double maxFixWingPark, ArrayList<Airport> airport) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			try {
				if(ID == null) {
					System.out.println("Enter ID: ");
					String ID = scanner.nextLine();
					this.ID = FixedwingAvaildator.isID(ID, airport)? ID : null;
				}
				if(model == null) {
					System.out.println("Enter type Model: ");
					String model = scanner.nextLine();
					this.model = AirplanceAvaildator.isModel(model)? model : null;
				}
				if(cruiseSpeed == 0) {
					System.out.println("Enter speed:");
					this.cruiseSpeed = Double.parseDouble(scanner.nextLine());
				}
				if(emptyWeight ==0) {
					System.out.println("enter empty weight: ");
					this.emptyWeight = Double.parseDouble(scanner.nextLine());
				}
				if(maxTakeOff == 0) {
					System.out.println("enter max take off weight: ");
					this.maxTakeOff = Double.parseDouble(scanner.nextLine());
				}
				if(type == null) {
					System.out.println("enter type : ");
					String type = scanner.nextLine();
					this.type = FixedwingAvaildator.isType(type)? type : null;
				}
				if(minNeedRun == 0) {
					System.out.println("enter min run need");
					this.minNeedRun = Double.parseDouble(scanner.nextLine());
				}
				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}

	}

	@Override
	public void fly() {
		System.out.println("Fixed - wing fly");

	}

}
