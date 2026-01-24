package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

import com.junit.PasswordValidator;

public class PasswordValidatorTest {
	static PasswordValidator validator;
	
	@BeforeAll
	public static void setup() {
		validator = new PasswordValidator();
	}
	
	@Test
	public void testValidPassword() {
		assertTrue(validator.isValid("Password123"));
	}
	
	@Test
	public void testPasswordTooShort() {
		assertFalse(validator.isValid("Pass1"));
	}
	
	@Test
	public void testPasswordNoUpperCase() {
		assertFalse(validator.isValid("password123"));
	}
	
	@Test
	public void testPasswordNoDigit() {
		assertFalse(validator.isValid("Password"));
	}
	
	@Test
	public void testNullPassword() {
		assertFalse(validator.isValid(null));
	}
	
	@AfterAll
	public static void afterAllTests() {
		System.out.println("Password Validator Tests Complete");
	}
}
