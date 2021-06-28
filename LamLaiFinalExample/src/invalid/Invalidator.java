package invalid;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import exception.InvalidDOBException;
import exception.InvalidFullNameException;
import exception.InvalidPhoneNumberxception;

public class Invalidator {
	public static boolean isFullName(String name) throws InvalidFullNameException {
		if (name.length() > 50 || name.length() < 10 ) {
			throw new InvalidFullNameException("Name langth is more than 50 and least 10");
		}
		return true;
	}
	
	public static boolean isPhoneName(String phone) throws InvalidPhoneNumberxception {
		if (phone.matches("^((090|098|091|031|035|033)\\d{7})$")) return true;
		else throw new InvalidPhoneNumberxception("Phone is  invalid");
	}
	
	public static boolean isDOB(String dob) throws InvalidDOBException {
		try {
			LocalDate.parse(dob, DateTimeFormatter.ofPattern("d/M/yyyy"));
		}catch (Exception e) {
			throw new InvalidDOBException("Date of birth is invalid");
		}
		return true;
	}
}
