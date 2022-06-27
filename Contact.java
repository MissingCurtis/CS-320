//Author Name: Jon Curtis

//Date: 06/11/2022

//Course ID: CS-320

//Description: Contact has setters and getters for making contacts

package main;

public class Contact {

	private String id;
	private String firstName;
    private String lastName;
    private String phone;
    private String address;
    
    // Constructor
    public Contact (String id, String firstName, String lastName, String phone, String address) {
    	
    	if(id == null || id.length() > 10) {
    		System.out.println(id + " exists");
    		throw new IllegalArgumentException("Invalid id");
    	}
    	if(firstName == null || firstName.length() > 10) {
    		System.out.println("Invalid first name");
    		throw new IllegalArgumentException("Invalid first name");
    	}
    	if(lastName == null || lastName.length() > 10) {
    		System.out.println("Invalid last name");
    		throw new IllegalArgumentException("Invalid last name");
    	}
    	if(phone == null || phone.length() > 10) {
    		System.out.println("Invalid phone");
    		throw new IllegalArgumentException("Invalid phone");
    	}
    	if(address == null || address.length() > 30) {
    		System.out.println("Invalid address");
    		throw new IllegalArgumentException("Invalid address");
    	}
    	
    	setId (id);
    	setFirstName(firstName);
    	setLastName(lastName);
    	setPhone(phone);
    	setAddress(address);
    }
    
    // Setters and Getters
    public String getId() {
    	return id;
    }
    
    public String getFirstName() {
    	return firstName;
    }
    
    public String getLastName() {
    	return lastName;
    }
    
    public String getPhone() {
    	return phone;
    }
    
    public String getAddress() {
    	return address;
    }
    
    public void setId(String id) {
    	this.id = id;
    }
    
    public void setFirstName(String firstName) {
    	this.firstName = firstName;
    }
    
    public void setLastName(String lastName) {
    	this.lastName = lastName;
    }
    
    public void setPhone(String phone) {
    	this.phone = phone;
    }
    
    public void setAddress(String address) {
    	this.address = address;
    }
    
}
