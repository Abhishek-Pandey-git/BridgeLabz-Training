package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

import com.junit.UserRegistration;

public class UserRegistrationTest {
	static UserRegistration registration;
	
	@BeforeAll
	public static void setup() {
		registration = new UserRegistration();
	}
	
	@Test
	public void testValidRegistration() {
		assertTrue(registration.registerUser("john123", "john@example.com", "password123"));
	}
	
	@Test
	public void testInvalidUsername() {
		assertThrows(IllegalArgumentException.class, 
			() -> registration.registerUser("ab", "john@example.com", "password123"));
	}
	
	@Test
	public void testInvalidEmail() {
		assertThrows(IllegalArgumentException.class, 
			() -> registration.registerUser("john123", "invalidemail", "password123"));
	}
	
	@Test
	public void testInvalidPassword() {
		assertThrows(IllegalArgumentException.class, 
			() -> registration.registerUser("john123", "john@example.com", "12345"));
	}
	
	@Test
	public void testNullUsername() {
		assertThrows(IllegalArgumentException.class, 
			() -> registration.registerUser(null, "john@example.com", "password123"));
	}
	
	@Test
	public void testNullEmail() {
		assertThrows(IllegalArgumentException.class, 
			() -> registration.registerUser("john123", null, "password123"));
	}
	
	@AfterAll
	public static void afterAllTests() {
		System.out.println("User Registration Tests Complete");
	}
}
