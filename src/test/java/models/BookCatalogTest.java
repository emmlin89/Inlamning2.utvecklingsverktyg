package models;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BookCatalogTest {

	private BookCatalog bc;
	private Book book1;

	public BookCatalogTest() {
		bc = new BookCatalog();
		book1 = new Book(1,"Learning Java","","","",0);
		bc.addBook(book1);
	}

	//G
	@Test
	public void testAddABook() {
		Book book = new Book(2, "Effective Java", "Joshua Bloch", "9780134685991", "Main Branch", 416);

		bc.addBook(book);

		assertEquals(2, bc.getNumberOfBooks());
		assertSame(book, bc.getBookArray()[1]);

	}

	//G
	@Test
	public void testFindBook() throws BookNotFoundException {
		Book foundBook = bc.findBook("Learning Java");

		assertSame(book1, foundBook);

	}

	//G
	@Test
	public void testFindBookIgnoringCase() throws BookNotFoundException {
		Book foundBook = bc.findBook("learning java");

		assertSame(book1, foundBook);

	}

	//G
	@Test
	public void testFindBookWithExtraSpaces() throws BookNotFoundException {
		Book foundBook = bc.findBook(" Learning Java ");

		assertSame(book1, foundBook);

	}

	//G
	@Test
	public void shouldThrowExceptionWhenCatalogIsEmpty() {
		BookCatalog emptyCatalog = new BookCatalog();

		assertThrows(BookNotFoundException.class, () -> emptyCatalog.findBook("Learning Java"));

	}

	//VG
	// This test should throw BookNotFoundException in order to pass.
	@Test
	public void testFindBookThatDoesntExist() throws BookNotFoundException {

	}

	//VG
	//Skriv ett parameteriserat test som verifierar att metoden findBook(String title)
	// hittar samma bok oavsett hur titeln skrivs med stora och små bokstäver.
	//Du kan testa med
	// "Learning Java"
	//"learning java"
	//"LEARNING JAVA"

	public void shouldFindBookRegardlessOfCase(String title) throws BookNotFoundException {

	}

}
