package com.bridgelabz.testregistration;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestMobileNumberValidator {

	static UserValidator validator;
	@BeforeClass
	public static void createObj() {
		validator = new UserValidator();
	}
	@AfterClass
	public static void nullObj() {
		validator = null;
	}
	@Test
	public void givenMobileNumber_WhenProper_thenAssertionHappy() throws UserValidatorException {
		assertTrue(validator.validateMobileNo("91 9876543210"));
	}
	@Test
	public void givenMobileNumber_WhenNoCountryCode_thenAssertionSad() {
		try {
			assertFalse(validator.validateMobileNo("9263827272"));
		} catch (UserValidatorException e) {
			e.printStackTrace();
		}
	}
	@Test
	public void givenMobileNumber_WhenMobNoLessThan10Digits_thenAssertionSad() {
		try {
			assertTrue(validator.validateMobileNo("91 98263729"));
		} catch (UserValidatorException e) {
			e.printStackTrace();
		}
	}
	@Test
	public void givenMobileNumber_WhenMobNoSpace_thenAssertionSad() {
		try {
			assertFalse(validator.validateMobileNo("919876543210"));
		} catch (UserValidatorException e) {
			e.printStackTrace();
		}
	}
}
