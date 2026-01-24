package test;

import org.junit.jupiter.api.BeforeAll;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import com.junit.EvenOrNot;

public class EvenOrNotTest {
	static EvenOrNot obj;
	
	@BeforeAll
	public static void before() {
		obj=new EvenOrNot();
	}
	
	@ParameterizedTest
	@ValueSource(ints= {1,2,3})
	public void testEvenOrNot(int x) {
		assertTrue(obj.isEven(x));
	}
	
	@AfterAll
	public static void after() {
		System.out.println("The test is finished");
	}
}
