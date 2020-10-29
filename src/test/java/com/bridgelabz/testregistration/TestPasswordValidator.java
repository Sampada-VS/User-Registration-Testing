package com.bridgelabz.testregistration;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestPasswordValidator {

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
	public void givenPassword_WhenProper_thenAssertionHappy() throws UserValidatorException {
		assertTrue(validator.validatePassword("hjh@623Thj"));
	}
	@Test
	public void givenPassword_WhenLessThan8Char_thenAssertionSad() {
		try {
			assertFalse(validator.validatePassword("@623Thj"));
		} catch (UserValidatorException e) {
			e.printStackTrace();
		}
	}
	@Test
	public void givenPassword_WhenNoUpperCaseLetter_thenAssertionSad() {
		try {
			assertFalse(validator.validatePassword("hjh@623hf"));
		} catch (UserValidatorException e) {
			e.printStackTrace();
		}
	}
	@Test
	public void givenPassword_WhenNoNumericNumber_thenAssertionSad() {
		try {
			assertFalse(validator.validatePassword("hjh@gfgjThj"));
		} catch (UserValidatorException e) {
			e.printStackTrace();
		}
	}
	@Test
	public void givenPassword_WhenNoSpecialCharacter_thenAssertionSad() {
		try {
			assertFalse(validator.validatePassword("hjhgfgjThj"));
		} catch (UserValidatorException e) {
			e.printStackTrace();
		}
	}
	@Test
	public void givenPassword_WhenMoreThan1SpecialChar_thenAssertionSad() {
		try {
			assertFalse(validator.validatePassword("hjh@gfg#jThj"));
		} catch (UserValidatorException e) {
			e.printStackTrace();
		}
	}
}
