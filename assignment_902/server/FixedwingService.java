package fa.training.server;

import java.util.ArrayList;
import java.util.Scanner;

import fa.training.entities.Airport;
import fa.training.entities.Fixedwing;
import fa.training.utils.FixedwingAvaildator;

public class FixedwingService {
	
	public static void display (ArrayList<Airport> airports) {
		System.out.println("List of fixedwing: ");
		for (Airport airport: airports) {
			for (Fixedwing fixedwing : airport.fixedwings) {
				System.out.println(fixedwing + "AirportID" + airport.ID + "AirportName: " + airport.name);
			}
		}
	}
	
	public static void addFiwedwing(ArrayList<Airport> airports, String ID) {
		Fixedwing fixedwing = new Fixedwing();
		for (Airport airport : airports) {
			if (airport.ID.equals(ID)) {
				System.out.println("Add new Fixedwing to airport: " + ID);
				fixedwing.input(airport.maxFixWingPark, airports);
				airport.fixedwings.add(fixedwing);
				System.out.println("Add success");
			}
		}
	}
	public static void chanePlaneTypeAndRunwaySizeOffFixedwing(Fixedwing fixedwing, Double maxFixWingPark) {
		Scanner sc = new Scanner(System.in);
		fixedwing.type = null;
		fixedwing.minNeedRun = 0;
		while (true) {
			try {
				if (fixedwing.type == null) {
					System.out.println(":Enter type:");
					String type = sc.nextLine();
					fixedwing.type = FixedwingAvaildator.isType(type)? type : null;
				}
				if (fixedwing.minNeedRun == 0) {
					System.out.println("Enter min need runway: ");
					Double minNeedRun = Double.parseDouble(sc.nextLine());
					fixedwing.minNeedRun = FixedwingAvaildator.isParked(minNeedRun, maxFixWingPark) ? minNeedRun : null;
				}
				break;
			
		} catch (Exception e ) {
			System.out.println(e.getMessage());
		}
		}
	}
}
