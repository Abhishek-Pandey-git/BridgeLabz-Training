package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.*;

import com.junit.ListManager;

public class ListManagerTest {
	static ListManager obj;
	
	@BeforeAll
	public static void setup() {
		obj = new ListManager();
	}
	
	@Test
	public void testAddElement() {
		List<Integer> list = new ArrayList<>();
		obj.addElement(list, 10);
		obj.addElement(list, 20);
		
		assertEquals(2, list.size());
		assertTrue(list.contains(10));
		assertTrue(list.contains(20));
	}
	
	@Test
	public void testRemoveElement() {
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		
		obj.removeElement(list, 20);
		
		assertEquals(2, list.size());
		assertFalse(list.contains(20));
		assertTrue(list.contains(10));
		assertTrue(list.contains(30));
	}
	
	@Test
	public void testGetSize() {
		List<Integer> list = new ArrayList<>();
		
		assertEquals(0, obj.getSize(list));
		
		list.add(5);
		assertEquals(1, obj.getSize(list));
		
		list.add(10);
		list.add(15);
		assertEquals(3, obj.getSize(list));
	}
	
	@Test
	public void testSizeAfterAddAndRemove() {
		List<Integer> list = new ArrayList<>();
		obj.addElement(list, 100);
		obj.addElement(list, 200);
		assertEquals(2, obj.getSize(list));
		
		obj.removeElement(list, 100);
		assertEquals(1, obj.getSize(list));
	}
	
	@AfterAll
	public static void afterAllTests() {
		System.out.println("List Manager Tests Complete");
	}
}
