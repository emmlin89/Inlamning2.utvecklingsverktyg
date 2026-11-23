package models;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class BookTest {

	//G
	@Test
	public void test2EqualBooks() {
		Book book1 = new Book(1, "The Hobbit", "J.R.R. Tolkien", "9780261102217", "Main Branch", 320);
		Book book2 = new Book(1, "The Hobbit", "J.R.R. Tolkien", "9780261102217", "Main Branch", 320);

		assertTrue(book1.equals(book2));
	}

	//G
	@Test
	public void test2NonEqualBooks() {
		Book book1 = new Book(1, "The Hobbit", "J.R.R. Tolkien", "9780261102217", "Main Branch", 320);
		Book book2 = new Book(2, "Pride and Prejudice", "Jane Austen", "9780141439518", "West Branch", 480);

		assertFalse(book1.equals(book2));

	}

	//G
	@Test
	void booksWithSameIdAndTitleShouldBeEqual() {
		Book book1 = new Book(1, "The Hobbit", "J.R.R. Tolkien", "9780261102217", "Main Branch", 320);
		Book book2 = new Book(1, "The Hobbit", "Another Author", "9780547928227", "West Branch", 300);

		assertTrue(book1.equals(book2));

	}

	//G
	@Test
	void booksWithDifferentIdsShouldNotBeEqual() {
		Book book1 = new Book(1, "The Hobbit", "J.R.R. Tolkien", "9780261102217", "Main Branch", 320);
		Book book2 = new Book(2, "The Hobbit", "J.R.R. Tolkien", "9780261102217", "Main Branch", 320);

		assertFalse(book1.equals(book2));

	}


	//G
	@Test
	void booksWithSameIdButDifferentTitlesShouldNotBeEqual() {
		Book book1 = new Book(1, "The Hobbit", "J.R.R. Tolkien", "9780261102217", "Main Branch", 320);
		Book book2 = new Book(1, "The Lord of the Rings", "J.R.R. Tolkien", "9780261102217", "Main Branch", 320);

		assertFalse(book1.equals(book2));

	}
}
