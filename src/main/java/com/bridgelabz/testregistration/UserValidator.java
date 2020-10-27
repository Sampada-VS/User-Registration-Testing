package com.bridgelabz.testregistration;

import java.util.regex.Pattern;

public class UserValidator {
	
	private static final String NAME_PATTERN = "^[A-Z][a-z]{2,}$";
	private static final String MOBILE_NO_PATTERN = "^[1-9]{2,3}\\s[7-9]{1}[0-9]{9}$";

	public boolean validateFirstName(String firstName) {
		return Pattern.compile(NAME_PATTERN).matcher(firstName).matches();	
	}
	public boolean validateLastName(String lastName) {
		return Pattern.compile(NAME_PATTERN).matcher(lastName).matches();	
	}
	public boolean validateMobileNo(String mobileNo) {
		return Pattern.compile(MOBILE_NO_PATTERN).matcher(mobileNo).matches();	
	}
	public boolean validatePassword(String password) {
		return (Pattern.compile("[\\w\\W]{8,}").matcher(password).matches() &&
			Pattern.compile(".*[A-Z].*").matcher(password).matches() &&
			Pattern.compile(".*[0-9].*").matcher(password).matches() &&
			password.length()-password.replaceAll("\\W", "").length() == 1);
	}
}
