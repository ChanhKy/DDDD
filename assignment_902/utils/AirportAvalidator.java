package fa.training.utils;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import fa.training.entities.Airport;

public class AirportAvalidator {
	private static final String VALID_AIRPORT_REGEX = "^(AP)\\d{5}$";
	
	// dinh dang ID San Bay
	public static boolean isAriport(String ID, ArrayList<Airport> airports) {
		for (Airport airport : airports	) {
			if (airport.ID.equals(ID)) 
				throw new RuntimeException("ID da ton tai.");
			
		} 
		if(ID.matches(VALID_AIRPORT_REGEX)) return true;
		throw new RuntimeException("ID sai, Vi du: AP00001");
	}
}
