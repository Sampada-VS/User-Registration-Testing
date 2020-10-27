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
	public void givenMobileNumber_WhenProper_thenAssertionHappy() {
		assertTrue(validator.validateMobileNo("91 9876543210"));
	}
	@Test
	public void givenMobileNumber_WhenNoCountryCode_thenAssertionSad() {
		assertFalse(validator.validateMobileNo("9263827272"));
	}
	@Test
	public void givenMobileNumber_WhenMobNoLessThan10Digits_thenAssertionSad() {
		assertFalse(validator.validateMobileNo("91 98263729"));
	}
	@Test
	public void givenMobileNumber_WhenMobNoSpace_thenAssertionSad() {
		assertFalse(validator.validateMobileNo("919876543210"));
	}
}
