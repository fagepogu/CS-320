import static org.junit.Assert.*;
import org.junit.Test;

public class ContactServiceTest {

    @Test
    public void testAddContact() {
        ContactService s = new ContactService();
        Contact c = new Contact("C101", "Faith", "Agepogu", "4056174382", "630 NW 22nd St");
        assertTrue(s.addContact(c));
    }

    @Test
    public void testAddDuplicate() {
        ContactService s = new ContactService();
        Contact c1 = new Contact("C102", "Taylor", "Swift", "1234567890", "123 Oak Ave");
        Contact c2 = new Contact("C102", "Miley", "Cyrus", "9876543210", "456 Pine St");
        s.addContact(c1);
        assertFalse(s.addContact(c2));
    }

    @Test
    public void testDeleteContact() {
        ContactService s = new ContactService();
        Contact c = new Contact("C103", "Ariana", "Grande", "2223334444", "789 Maple Rd");
        s.addContact(c);
        assertTrue(s.deleteContact("C103"));
    }

    @Test
    public void testUpdateFirstName() {
        ContactService s = new ContactService();
        Contact c = new Contact("C104", "Harry", "Styles", "5556667777", "321 Birch Blvd");
        s.addContact(c);
        s.updateFirstName("C104", "NewName");
        assertEquals("NewName", s.getContact("C104").getFirstName());
    }
}
