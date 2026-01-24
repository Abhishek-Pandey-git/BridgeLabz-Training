package test;


import static org.junit.jupiter.api.Assertions.*;
//importing all annotations
import org.junit.jupiter.api.*;

//importing the class
import org.junit.jupiter.api.Test;

import com.junit.StringUtils;

class StringUtilsTest {
	static StringUtils obj;
	
	
	@BeforeAll
	public static void before() {
		obj=new StringUtils();
	}

	@Test
	void testReverse() {
		assertEquals(obj.reverse("Aman"), "namA");
	}
	
	@Test 
	public void testPalindrom() {
		assertTrue(obj.isPalindrom("jahaj"));
	}
	
	@Test 
	public void testUpperCase() {
		assertEquals(obj.toUpperCase("Aman"),"AMAN");
	}
	
	@AfterAll
	public static void afterTest() {
		System.out.println("Test Complete");
	}

}
