package models;

import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import utilities.GenderType;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoanTest {

	//G
	@Test
	public void testDueDate() {
		Customer customer = new Customer("Ms", "Alice", "Smith", "12 Oak Street",
				"555-0101", "alice@example.com", 1, GenderType.FEMALE);
		Book book = new Book(1, "Learning Java", "Jane Taylor", "9780134685991",
				"Main Branch", 320);

		LocalDate expectedDueDate = LocalDate.now().plusDays(14);
		Loan loan = new Loan(1, customer, book);

		assertEquals(expectedDueDate, loan.getDueDate());


   }

	//VG
	@Test
	void newLoanShouldBeCurrent() {

	}
	
	//VG
	@Test
	void endLoanShouldBeHistoric() {
		
	}	
}