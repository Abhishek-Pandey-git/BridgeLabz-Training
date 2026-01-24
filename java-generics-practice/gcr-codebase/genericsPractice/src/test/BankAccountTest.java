package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

import com.junit.BankAccount;

public class BankAccountTest {
	static BankAccount account;
	
	@BeforeEach
	public void setup() {
		account = new BankAccount(1000.0);
	}
	
	@Test
	public void testDeposit() {
		account.deposit(500.0);
		assertEquals(1500.0, account.getBalance());
	}
	
	@Test
	public void testWithdraw() {
		account.withdraw(300.0);
		assertEquals(700.0, account.getBalance());
	}
	
	@Test
	public void testInsufficientFunds() {
		assertThrows(IllegalArgumentException.class, () -> account.withdraw(1500.0));
	}
	
	@Test
	public void testNegativeDeposit() {
		assertThrows(IllegalArgumentException.class, () -> account.deposit(-100.0));
	}
	
	@Test
	public void testGetBalance() {
		assertEquals(1000.0, account.getBalance());
	}
	
	@AfterAll
	public static void afterAllTests() {
		System.out.println("Bank Account Tests Complete");
	}
}
