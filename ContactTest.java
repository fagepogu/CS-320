import static org.junit.Assert.*;
import org.junit.Test;

public class ContactTest {
    // Contact successfully created
    @Test public void createContactSuccess() {
        Contact c = new Contact("C001", "Faith", "Agepogu", "4056174382", "630 NW 22nd St");
        assertEquals("C001", c.getContactId());
        assertEquals("Faith", c.getFirstName());
        assertEquals("Agepogu", c.getLastName());
        assertEquals("4056174382", c.getPhone());
        assertEquals("630 NW 22nd St", c.getAddress());
    }

    // Fail if the ID is too long
    @Test(expected = IllegalArgumentException.class)
    public void idTooLongFail() {
        new Contact("12345678901", "Faith", "Agepogu", "4056174382", "630 NW 22nd St");
    }
    
    // Fail if the first name is too long
    @Test(expected = IllegalArgumentException.class)
    public void firstNameTooLongFail() {
        new Contact("C002", "Somelongfirstnamegoeshere", "Agepogu", "4056174382", "630 NW 22nd St");
    }

    // Fail if the last name is too long
    @Test(expected = IllegalArgumentException.class)
    public void lastNameTooLongFail() {
        new Contact("C003", "Faith", "Somelonglastnamegoeshere", "4056174382", "630 NW 22nd St");
    }

    // Fail if the phone number includes characters that are not numbers
    @Test(expected = IllegalArgumentException.class)
    public void phoneNotDigitsFail() {
        new Contact("C004", "Faith", "Agepogu", "abcdefghij", "630 NW 22nd St");
    }

    // Fail if the phone number is too short
    @Test(expected = IllegalArgumentException.class)
    public void phoneTooShortFail() {
        new Contact("C005", "Faith", "Agepogu", "405617", "630 NW 22nd St");
    }

    // Phone update successful
    @Test public void updatePhoneSuccess() {
        Contact c = new Contact("C002", "Ashley", "Tisdale", "1111111111", "123 Oak Ave");
        c.setPhone("2223334444");
        assertEquals("2223334444", c.getPhone());
    }
    
    // Fail if the address is too long
    @Test(expected = IllegalArgumentException.class)
    public void addressTooLongFail() {
        new Contact("C003", "Zac", "Efron", "9999999999", "1234 Long Street Name Goes Here");
    }
}
