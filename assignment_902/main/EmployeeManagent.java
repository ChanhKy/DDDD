package fa.training.main;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import fa.training.entities.Airport;
import fa.training.server.AirportService;
import fa.training.utils.IOEservice;

public class EmployeeManagent {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		String checkContinue = "";
		Scanner scanner = new Scanner(System.in);
		ArrayList<Airport> airports = new ArrayList<>();
		
		airports.add(new Airport("AP00002", "Nha Trang", 200.0, 200.0, 200.0, new ArrayList<>(), new ArrayList<>()));
		airports.add(new Airport("AP00003", "Sai Gon", 300.0, 300.0, 300.0, new ArrayList<>(), new ArrayList<>()));
		airports.add(new Airport("AP00004", "Ha Noi", 400.0, 400.0, 400.0, new ArrayList<>(), new ArrayList<>()));

		// read data from file
		airports = IOEservice.read();
		
		do {
			showMenu();
			String number = scanner.nextLine();
			switch (number) {
			case "1":
				AirportService.addAirport(airports);
				IOEservice.write(airports);
				break;
			case "2":
				AirportService.addFixedwing(airports);
				IOEservice.write(airports);
				break;
			case "3":
				AirportService.addHelicopter(airports);
				IOEservice.write(airports);
				break;
			case "4":
				AirportService.removeFixedwing(airports);
				IOEservice.write(airports);
				break;
			case "5":
				AirportService.removeHelicopter(airports);
				IOEservice.write(airports);
				break;
			case "6":
				AirportService.chanePlaneTypeAndRunwaySizeOffFixedwing(airports);
				IOEservice.write(airports);
				break;
			case "7":
				AirportService.displayBySortID(airports);
				break;
			case "8":
				AirportService.displayStatusAirport(airports);
				break;
			case "9":
				AirportService.displayFixdwing(airports);
				break;
			case "10":
				AirportService.displayHelicopter(airports);
				break;
			case "0":
				System.out.println("Ban da thoat chuong trinh!");
				break;

			}

		} while (checkContinue!="0");
		System.out.println("Bey!!!");
		scanner.close();
	}

	public static void showMenu() {
		System.out.println("Choose function: ");
		System.out.println("1. Add a new Airport");
		System.out.println("2. Add a Fixedwing to an Airport");
		System.out.println("3. Add a Helicopter to an Airport");
		System.out.println("4. Remove a Fixedwing to an Airport");
		System.out.println("5. remove a Helicopter to an Airport");
		System.out.println("6. Chane plance type and min need ruunway size off take");
		System.out.println("7. Display lis of all airport information");
		System.out.println("8. Dispaly the status of one airport, selected in ID");
		System.out.println("9. Dis list of all fixewd wing ");
		System.out.println("10. Display list all Helicopter");
		System.out.println("0 . Exit");

	}
}
