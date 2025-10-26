public class Contact {
    private final String contactId; // Contact ID number
    private String firstName; // First name
    private String lastName; // Last name
    private String phone; // Phone number
    private String address; // Address

    // Validate the fields when creating new entries
    public addContact(String contactId, String firstName, String lastName, String phone, String address) {
        if (contactId == null || contactId.length() > 10)
            throw new IllegalArgumentException("Invalid contact ID");
        if (firstName == null || firstName.length() > 10)
            throw new IllegalArgumentException("Invalid first name");
        if (lastName == null || lastName.length() > 10)
            throw new IllegalArgumentException("Invalid last name");
        if (phone == null || !phone.matches("\\d{10}"))
            throw new IllegalArgumentException("Invalid phone number");
        if (address == null || address.length() > 30)
            throw new IllegalArgumentException("Invalid address");

        this.contactId = contactId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.address = address;
    }

    // Get contact ID
    public String getContactId() { return contactId; }

    // Get first name
    public String getFirstName() { return firstName; }

    // Get last name
    public String getLastName() { return lastName; }

    // Get phone number
    public String getPhone() { return phone; }

    // Get address
    public String getAddress() { return address; }

    
    // Validate first name
    public void setFirstName(String firstName) {
        if (firstName == null || firstName.length() > 10)
            throw new IllegalArgumentException("Invalid first name");
        this.firstName = firstName;
    }
    
    // Validate last name
    public void setLastName(String lastName) {
        if (lastName == null || lastName.length() > 10)
            throw new IllegalArgumentException("Invalid last name");
        this.lastName = lastName;
    }

    // Validate phone number
    public void setPhone(String phone) {
        if (phone == null || !phone.matches("\\d{10}"))
            throw new IllegalArgumentException("Invalid phone number");
        this.phone = phone;
    }

    // Validate address
    public void setAddress(String address) {
        if (address == null || address.length() > 30)
            throw new IllegalArgumentException("Invalid address");
        this.address = address;
    }
}
