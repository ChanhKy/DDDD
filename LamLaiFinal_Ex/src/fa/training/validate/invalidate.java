package fa.training.validate;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import fa.training.exception.InvalidateDOBException;
import fa.training.exception.InvalidateFullNameException;
import fa.training.exception.InvalidatePhoneNumberException;

public class invalidate {

	public static boolean isFullName(String name) throws InvalidateFullNameException {
		if (name.length() > 50 || name.length() < 10) {
			throw new InvalidateFullNameException("name length is more than 50 and least 10");
		}
		return true;
	}

	public static boolean isPhoneNumber(String phone) throws InvalidatePhoneNumberException {
		if (phone.matches("^((090|098|091|031|035|033)\\d{7})$")) {
			return true;
		} else {
			throw new InvalidatePhoneNumberException("Phone is invalid");
		}
	}

	public static boolean isDOB(String dob) throws InvalidateDOBException {
		try {
			LocalDate.parse(dob, DateTimeFormatter.ofPattern("d/M/yyyy"));
		} catch (Exception e) {
			throw new InvalidateDOBException("Date of birth is invalid");
		}
		return true;

//		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
//		dateFormat.setLenient(false);
//		try {
//			Date d = dateFormat.parse(dob);
//			dateFormat = new SimpleDateFormat("yyyy");
//			if (Integer.valueOf(dateFormat.format(d)) <1000) return false;
//		} catch (Exception e) {
//			throw new InvalidateDOBException("Date of birth is invalid");
//			
//		}
//		return true;
	}

}
