package models;

import org.junit.jupiter.api.Test;
import utilities.GenderType;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CustomerTest {

    //G
    @Test
    void testGetGender() {
        GenderType expectedGender = GenderType.FEMALE;
        Customer customer = new Customer("Ms", "Alice", "Smith", "12 Oak Street",
                "555-0101", "alice@example.com", 1, expectedGender);

        assertEquals(expectedGender, customer.getGender());
    }

    //G
    @Test
    void testGetMailingName() {
        Customer customer = new Customer("Ms", "Alice", "Smith", "12 Oak Street",
                "555-0101", "alice@example.com", 1, GenderType.FEMALE);

        assertEquals("Ms A Smith", customer.getMailingName());
        
    }


}
