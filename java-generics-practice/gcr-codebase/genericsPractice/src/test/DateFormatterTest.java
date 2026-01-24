package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

import com.junit.DateFormatter;

public class DateFormatterTest {
	static DateFormatter formatter;
	
	@BeforeAll
	public static void setup() {
		formatter = new DateFormatter();
	}
	
	@Test
	public void testValidDateFormat() {
		assertEquals("15-08-2024", formatter.formatDate("2024-08-15"));
		assertEquals("01-01-2023", formatter.formatDate("2023-01-01"));
	}
	
	@Test
	public void testInvalidDateFormat() {
		assertThrows(IllegalArgumentException.class, () -> formatter.formatDate("15-08-2024"));
	}
	
	@Test
	public void testInvalidDate() {
		assertThrows(IllegalArgumentException.class, () -> formatter.formatDate("2024-13-01"));
		assertThrows(IllegalArgumentException.class, () -> formatter.formatDate("2024-02-30"));
	}
	
	@Test
	public void testNullDate() {
		assertThrows(IllegalArgumentException.class, () -> formatter.formatDate(null));
	}
	
	@Test
	public void testEmptyDate() {
		assertThrows(IllegalArgumentException.class, () -> formatter.formatDate(""));
	}
	
	@AfterAll
	public static void afterAllTests() {
		System.out.println("Date Formatter Tests Complete");
	}
}
