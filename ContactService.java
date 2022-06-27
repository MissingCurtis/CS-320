//Author Name: Jon Curtis

//Date: 06/11/2022

//Course ID: CS-320

//Description: Contact Service works with Contact to create and delete contacts

package main;

import java.util.ArrayList;


public class ContactService {
	
	//array list to hold contacts, calling Contact class
	public static ArrayList<Contact> contactList = new ArrayList<Contact>();
	
	//adds a contact to contacts list
	public static void addNewContact(String id, String firstName, String lastName, String phone, String address) {
		
		for(int i = 0; i < contactList.size(); i++) {
			if(contactList.get(i).getId().contentEquals(id)) {
				throw new IllegalArgumentException("Error Id exists");
			}
		}
		
		// Add new contact to list
		Contact newService = new Contact(id, firstName, lastName, phone, address);
        contactList.add(newService);
      		
    }
	
	//delete a contact to contacts list	
	public static void deleteContact(String id) {
		
		for(int i = 0; i < contactList.size(); i++) {
			if(contactList.get(i).getId().equals(id)) {
			contactList.remove(i);
			break;
			}
			if(i == contactList.size()-1) {
			System.out.println("Contact ID: " + id + " not found.");
			throw new IllegalArgumentException("Error unable to delete contact");
			}
		}
	    	
		
	}
	
	//adds a contact to contacts list
	public static void updateContact(String id, String firstName, String lastName, String phone, String address) {
		
        for(int i = 0; i < contactList.size(); i++) {
			if(contactList.get(i).getId().equals(id)) {
				contactList.get(i).setFirstName(firstName);
				contactList.get(i).setLastName(lastName);
				contactList.get(i).setPhone(phone);
				contactList.get(i).setAddress(address);
				break;
			}
			if(i == contactList.size()-1) {
				System.out.println("Contact ID: " + id + " not found.");
				throw new IllegalArgumentException("Error unable to find contact");
			}
		}	
    }
	
}
	    

