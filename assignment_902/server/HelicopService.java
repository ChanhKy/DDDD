package fa.training.server;

import java.util.ArrayList;

import fa.training.entities.Airport;
import fa.training.entities.Helicopter;

public class HelicopService {
	public static void display(ArrayList<Airport> airports) {
		System.out.println("List of helicopter: ");
		for (Airport airport : airports) {
			for (Helicopter helicopter : airport.helicopters) {
				System.out.println(helicopter + "AirportID: " + airport.ID + "Airport Name: " + airport.name);
			}
		}
	}
	
	public static void addHelicopter(ArrayList<Airport> airports, String ID) {
		Helicopter helicopter = new Helicopter();
		for (Airport airport: airports) {
			if (airport.ID.equals(ID)) {
			
				System.out.println("Add new Helicopter to Airport " + ID); 
				helicopter.input(airports);
				airport.helicopters.add(helicopter);
				System.out.println("Add success");
			}
		}
	}
}
