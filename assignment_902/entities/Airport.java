package fa.training.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

import fa.training.utils.AirportAvalidator;

public class Airport implements Serializable {
	private static final long seriaVersionUID =1L;
	
	public String ID;	//ma san bay
	public String name;	//ten san bay
	public double runwaySize;	// kich thuoc duong bang
	public double maxFixWingPark;	//dau may bay toi da
	public double maxRotatedWingPark;	// dau truc thang toi da
	
	public ArrayList<Helicopter> helicopters;
	public ArrayList<Fixedwing> fixedwings;
	
	
	public Airport() {
	}
	
	public Airport(String iD, String name, double runwaySize, double d, double e,
			ArrayList<Helicopter> helicopter, ArrayList<Fixedwing> fixedwing) {
		
		ID = iD;
		this.name = name;
		this.runwaySize = runwaySize;
		this.maxFixWingPark = d;
		this.maxRotatedWingPark = e;
		this.helicopters = helicopters;
		this.fixedwings = fixedwings;
	}

	@Override
	public String toString() {
		
		return "Airport [ ID =" +ID + ", name= " + name +", runwaySize= " + runwaySize 
				+ ", maxFixedwingParkingPlace= " + maxFixWingPark + ", maxRotatedwingParkingPalce= " 
				+ maxRotatedWingPark + ", helicopters= " + helicopters +", fixedwing= " + fixedwings +"]";
	}
	
	public void input(ArrayList<Airport> airport) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			try {
				if ( ID == null) {
					System.out.println("enter ID ex: AP00001");
					String ID = scanner.nextLine();
					this.ID = AirportAvalidator.isAriport(ID, airport)? ID : null;
				}
				if (name == null) {
					System.out.println("Enter name:");
					this.name = scanner.nextLine();
				}
				if (runwaySize == 0) {
					System.out.println("Enter runway: ");
					this.runwaySize = Double.parseDouble(scanner.nextLine());
				}
				if (maxFixWingPark == 0) {
					System.out.println("Enter max fix wing parking palce: ");
					this.maxFixWingPark = Double.parseDouble(scanner.nextLine());
				}
				if (maxRotatedWingPark == 0) {
					System.out.println("Enter max rotated wingpalce: ");
					this.maxRotatedWingPark = Double.parseDouble(scanner.nextLine());
				}
				
				if (fixedwings == null) {
					fixedwings = new ArrayList<>();
				}
				if (helicopters == null) {
					helicopters = new ArrayList<>();
				}
				break;
			} catch (Exception e ) {
				System.out.println(e.getMessage());
			}
		}
	}
	
	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getRunwaySize() {
		return runwaySize;
	}

	public void setRunwaySize(double runwaySize) {
		this.runwaySize = runwaySize;
	}

	public double getMaxFixWingPark() {
		return maxFixWingPark;
	}

	public void setMaxFixWingPark(int maxFixWingPark) {
		this.maxFixWingPark = maxFixWingPark;
	}

	public double getMaxRotatedWingPark() {
		return maxRotatedWingPark;
	}

	public void setMaxRotatedWingPark(int maxRotatedWingPark) {
		this.maxRotatedWingPark = maxRotatedWingPark;
	}

	public ArrayList<Helicopter> getHelicopters() {
		return helicopters;
	}

	public void setHelicopters(ArrayList<Helicopter> helicopters) {
		this.helicopters = helicopters;
	}

	public ArrayList<Fixedwing> getFixedwings() {
		return fixedwings;
	}

	public void setFixedwing(ArrayList<Fixedwing> fixedwings) {
		this.fixedwings = fixedwings;
	}
	
	
	
}
