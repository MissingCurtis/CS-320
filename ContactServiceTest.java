//Author Name: Jon Curtis

//Date: 06/11/2022

//Course ID: CS-320

//Description: Contact Service Test tests ContactService

package test;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import main.ContactService;
import main.Contact;

class ContactServiceTest {
	
	// Tests addNewContact
	@Test
	void testContactService() {
		Contact contacts = new Contact("1234567890", "1234567890", "1234567890", "1234567890", "123456789012345678901234567890");
		ContactService.addNewContact("1234567890", "1234567890", "1234567890", "1234567890", "123456789012345678901234567890");
		assertTrue(contacts.getId().equals("1234567890"));
		assertTrue(contacts.getFirstName().equals("1234567890"));
		assertTrue(contacts.getLastName().equals("1234567890"));
		assertTrue(contacts.getPhone().equals("1234567890"));
		assertTrue(contacts.getAddress().equals("123456789012345678901234567890"));
	}
	
	// Tests addNewContact error
	@Test
	void testAddNewContactExists() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			ContactService.addNewContact("1234567890", "1234567890", "1234567890", "1234567890", "123456789012345678901234567890");
			ContactService.addNewContact("1234567890", "1234567890", "1234567890", "1234567890", "123456789012345678901234567890");
		});
	}
	
	// Tests deleteContact error
	@Test
	void testdeleteContact() {
		ContactService.addNewContact("G234567890", "1234567890", "1234567890", "1234567890", "123456789012345678901234567890");
		ContactService.deleteContact("G234567890");
	}
	
	// Tests deleteContact error
	@Test
	void testdeleteContact2() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			ContactService.addNewContact("B234567890", "1234567890", "1234567890", "1234567890", "123456789012345678901234567890");
			ContactService.deleteContact("B234567890");
			ContactService.deleteContact("B234567890");
		});
	}
	
	// Tests updateContact error
	@Test
	void testupdateContact() {
		Contact contacts = new Contact("C234567890", "C234567890", "C234567890", "C234567890", "C23456789012345678901234567890");
		ContactService.addNewContact("D234567890", "D234567890", "D234567890", "D234567890", "D23456789012345678901234567890");
		ContactService.updateContact("D234567890", "A234567890", "A234567890", "A234567890", "A23456789012345678901234567890");
		assertTrue(contacts.getId().equals("C234567890"));
		assertTrue(contacts.getFirstName().equals("C234567890"));
		assertTrue(contacts.getLastName().equals("C234567890"));
		assertTrue(contacts.getPhone().equals("C234567890"));
		assertTrue(contacts.getAddress().equals("C23456789012345678901234567890"));
	}
	
	// Tests updateContact error
	@Test
	void testupdateContact2() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			ContactService.addNewContact("A234567890", "A234567890", "A234567890", "A234567890", "A23456789012345678901234567890");
			ContactService.updateContact("F234567890", "F234567890", "F234567890", "F234567890", "F23456789012345678901234567890");
		});;
	}

}
