package fa.training.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {
	private static final String VALID_EMAIL_REGEX 
	= ("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$");
	
	private static final String VALID_DATE_REGEX 
	= "^([0-2][0-9]||3[0-1])/(0[0-9]||1[0-2])/([0-9][0-9])?[0-9][0-9]$"; 
	
	public static boolean isEmail(String email) {
		Pattern patter = Pattern.compile(VALID_EMAIL_REGEX);
		Matcher matcher = patter.matcher(email);
		return matcher.matches();
	}
	
	public static boolean isTheoryPactice (double scores) {
		if ((scores == 0) || (scores == 1) || (scores == 2) || (scores == 3) || (scores == 4) 
				||( scores == 5) || (scores == 6 )|| (scores == 7 )|| (scores == 8) ||( scores == 9) || (scores == 10)) { 
		return true;
	} 
		return false; 
	}

	public static boolean isBirthDate(String birthDate) {
		Pattern patter = Pattern.compile(VALID_DATE_REGEX);
		Matcher matcher = patter.matcher(birthDate);
		return matcher.matches();
	}
} 
