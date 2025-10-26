import java.util.HashMap;
import java.util.Map;

public class ContactService {
    private Map<String, Contact> contacts = new HashMap<>(); // Store IDs in a map

    // Add contact
    public boolean addContact(Contact contact) {
        if (contacts.containsKey(contact.getContactId())) return false;
        contacts.put(contact.getContactId(), contact);
        return true;
    }

    // Delete contact
    public boolean deleteContact(String contactId) {
        return contacts.remove(contactId) != null;
    }

    // Update first name
    public boolean updateFirstName(String contactId, String firstName) {
        Contact c = contacts.get(contactId);
        if (c == null) return false;
        c.setFirstName(firstName);
        return true;
    }

    // Update last name
    public boolean updateLastName(String contactId, String lastName) {
        Contact c = contacts.get(contactId);
        if (c == null) return false;
        c.setLastName(lastName);
        return true;
    }

    // Update phone
    public boolean updatePhone(String contactId, String phone) {
        Contact c = contacts.get(contactId);
        if (c == null) return false;
        c.setPhone(phone);
        return true;
    }

    // Update address
    public boolean updateAddress(String contactId, String address) {
        Contact c = contacts.get(contactId);
        if (c == null) return false;
        c.setAddress(address);
        return true;
    }

    // Get contact
    public Contact getContact(String contactId) {
        return contacts.get(contactId);
    }
}