package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

import com.junit.TemperatureConverter;

public class TemperatureConverterTest {
	static TemperatureConverter converter;
	
	@BeforeAll
	public static void setup() {
		converter = new TemperatureConverter();
	}
	
	@Test
	public void testCelsiusToFahrenheit() {
		assertEquals(32.0, converter.celsiusToFahrenheit(0.0));
		assertEquals(212.0, converter.celsiusToFahrenheit(100.0));
		assertEquals(98.6, converter.celsiusToFahrenheit(37.0), 0.1);
	}
	
	@Test
	public void testFahrenheitToCelsius() {
		assertEquals(0.0, converter.fahrenheitToCelsius(32.0), 0.1);
		assertEquals(100.0, converter.fahrenheitToCelsius(212.0), 0.1);
		assertEquals(37.0, converter.fahrenheitToCelsius(98.6), 0.1);
	}
	
	@Test
	public void testNegativeTemperatures() {
		assertEquals(-40.0, converter.celsiusToFahrenheit(-40.0));
		assertEquals(-40.0, converter.fahrenheitToCelsius(-40.0), 0.1);
	}
	
	@AfterAll
	public static void afterAllTests() {
		System.out.println("Temperature Converter Tests Complete");
	}
}
