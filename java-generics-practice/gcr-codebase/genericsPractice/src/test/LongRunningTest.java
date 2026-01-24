package test;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import com.junit.LongRunning;

public class LongRunningTest {
	
	static LongRunning obj;
	
	@BeforeAll
	public static void setup() {
		obj=new LongRunning();
	}
	
	@Test
	@Timeout(2)
	public void testLongRunning() throws InterruptedException {
		obj.longRunningTask();
		
	}
	
	@AfterAll
	public static void finished() {
		System.out.println("Test Finished");
	}
	
}
