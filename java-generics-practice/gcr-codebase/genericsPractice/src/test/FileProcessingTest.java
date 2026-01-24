package test;


import java.io.IOException;
import static  org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.*;


import com.junit.FileProcessing;


//setting ordering


@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class FileProcessingTest {
	
	static FileProcessing obj;
	
	@BeforeAll
	public static void setup() {
		obj=new FileProcessing();
	}
	
	@Test
	@Order(1)
	public void testFileWriting() throws IOException{
		obj.writeToFile("input.txt", "Hello my name is Abhishek");
		
		String ans=obj.readFromFile("input.txt");
		
		
		assertEquals(ans,"Hello my name is Abhishek");
	}
	
	@Test
	@Order(2)
	public void testFileException() {
		assertThrows(IOException.class, ()->obj.readFromFile("output.txt"));
	}
	
	@Test 
	@Order(3)
	public void testFileExistence() {
		assertTrue(obj.fileExistence("input.txt"));
	}
	
	@AfterAll
	public static void after() {
		System.out.println("All tests complete");
	}
}
