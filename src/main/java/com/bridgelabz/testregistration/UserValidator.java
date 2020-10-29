package com.bridgelabz.testregistration;

import java.util.regex.Pattern;

public class UserValidator {

	private static final String NAME_PATTERN = "^[A-Z][a-z]{2,}$";
	private static final String MOBILE_NO_PATTERN = "^[1-9]{2,3}\\s[7-9]{1}[0-9]{9}$";
	private static final String EMAIL_PATTERN = "^[0-9a-zA-Z]+([._+-][0-9a-zA-Z]+)*@[0-9a-zA-Z]+.[a-zA-Z]{2,4}([.][a-zA-Z]{2})?$";

	public boolean validateFirstName(String firstName) throws UserValidatorException {
		if (Pattern.compile(NAME_PATTERN).matcher(firstName).matches())
			return true;
		else
			throw new UserValidatorException("Please enter valid first name.");
	}

	public boolean validateLastName(String lastName) throws UserValidatorException {
		if (Pattern.compile(NAME_PATTERN).matcher(lastName).matches())
			return true;
		else
			throw new UserValidatorException("Please enter valid last name.");
	}

	public boolean validateMobileNo(String mobileNo) throws UserValidatorException {
		if (Pattern.compile(MOBILE_NO_PATTERN).matcher(mobileNo).matches())
			return true;
		else
			throw new UserValidatorException("Please enter valid mobile number.");
	}

	public boolean validatePassword(String password) throws UserValidatorException {
		if (Pattern.compile("[\\w\\W]{8,}").matcher(password).matches()
				&& Pattern.compile(".*[A-Z].*").matcher(password).matches()
				&& Pattern.compile(".*[0-9].*").matcher(password).matches()
				&& password.length() - password.replaceAll("\\W", "").length() == 1)
			return true;
		else
			throw new UserValidatorException("Please enter valid password.");
	}

	public boolean validateEmailId(String emailid) throws UserValidatorException {
		if (Pattern.compile(EMAIL_PATTERN).matcher(emailid).matches())
			return true;
		else
			throw new UserValidatorException("Please enter valid email id.");
	}
}
