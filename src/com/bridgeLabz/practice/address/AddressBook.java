package com.bridgeLabz.practice.address;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class AddressBook {
	Map<String,Contact> Book = new HashMap<String,Contact>();
	
	public void addContact(String firstname , Contact person)
	{
		Book.put(firstname,person);
		System.out.println("Contact added: " + firstname);
		person.print();
	}
	
	public void edit(String firstname, String field,String newValue)
	{
		if(Book.size()==0) {System.out.println("empty book"); 
		return;}
		
		Contact p = Book.get(firstname);
		if(field.equalsIgnoreCase("firstname"))
			p.firstname=newValue;
		if(field.equalsIgnoreCase("lastname"))
			p.lastname=newValue;
		if(field.equalsIgnoreCase("address"))
			p.address=newValue;
		if(field.equalsIgnoreCase("city"))
			p.city=newValue;
		if(field.equalsIgnoreCase("state"))
			p.state=newValue;
		if(field.equalsIgnoreCase("zip"))
			p.zip=newValue;
		if(field.equalsIgnoreCase("phone number"))
			p.phone=newValue;
		if(field.equalsIgnoreCase("email"))
			p.email=newValue;
		System.out.println("Edited successfull : " +field + " to " + newValue );
		p.print();
		
	}
	
	public void deleteContact(String firstname)
	{
		if(Book.containsKey(firstname)) {
		Book.remove(firstname);
		System.out.println("Contact successfully deleted");}
		else System.out.println("Contact not found");
	}
	
	 //Method to add data to a file
    public void writeData(ArrayList<Contact> contacts) {
        StringBuffer contactBuffer = new StringBuffer();
        contacts.forEach(contact -> {
            String contactData = contact.toString().concat("\n");
           contactBuffer.append(contactData);
        });
        try {
            Files.write(Paths.get("addressFile.txt"), contactBuffer.toString().getBytes());

        } catch (IOException e) {

        }
    }

}