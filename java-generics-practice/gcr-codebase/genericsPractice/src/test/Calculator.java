package test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

import com.junit.CalculatorTest;

public class Calculator {
	static CalculatorTest  obj;
	
	@BeforeAll
	public static void setup() {
		obj=new CalculatorTest();
		
	}
	
	@Test
	public void testAdd() 
	{
		
		assertEquals(obj.add(3, 4), 7);
		
	}
	
	@Test
	public void testSubtraction() {
		assertEquals(obj.subtraction(4, 3), 1);
		
	}
	
	@Test
	public void testMultiply() {
		assertEquals(obj.multiply(3, 4), 12);
		
	}
	
	@Test
	public void testDivide() {
		assertEquals(obj.divide(30, 5),6);
	}
	
	@Test 
	public void testDivideException() {
		assertThrows(IllegalArgumentException.class, ()->obj.divide(0, 0));
	}
	
	
	@AfterAll
	public static void afterAllTests() {
		System.out.println("Tests Complete");
	}
	
	
	
	
}
