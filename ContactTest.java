//Author Name: Jon Curtis

//Date: 06/11/2022

//Course ID: CS-320

//Description: Contact test tests Contact

package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import main.Contact;


class ContactTest {

	// Test adding contact
	@Test
	void testContactTest() {
		Contact contacts = new Contact("1234567890", "1234567890", "1234567890", "1234567890", "123456789012345678901234567890");
		assertTrue(contacts.getId().equals("1234567890"));
		assertTrue(contacts.getFirstName().equals("1234567890"));
		assertTrue(contacts.getLastName().equals("1234567890"));
		assertTrue(contacts.getPhone().equals("1234567890"));
		assertTrue(contacts.getAddress().equals("123456789012345678901234567890"));
	}
	
	// Test adding contact id to long
	@Test
	void testContactIDToLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12345678901", "1234567890", "1234567890", "1234567890", "123456789012345678901234567890");
		});
	}
	
	// Test adding contact first name to long
	@Test
	void testContactFirstNameToLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1234567890", "12345678901", "1234567890", "1234567890", "123456789012345678901234567890");
		});
	}
	
	// Test adding contact last name to long
	@Test
	void testContactLastNameToLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1234567890", "1234567890", "12345678901", "1234567890", "123456789012345678901234567890");
		});
	}
	
	// Test adding contact phone to long
	@Test
	void testContactPhoneToLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1234567890", "1234567890", "1234567890", "12345678901", "123456789012345678901234567890");
		});
	}
	
	// Test adding contact address to long
	@Test
	void testContactAddressToLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1234567890", "1234567890", "1234567890", "1234567890", "1234567890123456789012345678901");
		});
	}

}
