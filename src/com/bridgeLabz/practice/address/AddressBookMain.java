package com.bridgeLabz.practice.address;

import java.util.Scanner;

public class AddressBookMain {
   public static void main(String[] args) {
	   System.out.println("Welcome to Address Book Problem");
	   while(1==1)
	   {
		   
		   System.out.println("Press 0 to exit");
		   System.out.println("Press 1 to add a contact");
		   Scanner s = new Scanner(System.in);
		   int choice = s.nextInt();
		   
		   switch(choice)
		   {
		   case 0:
			   System.exit(1);
			   
			   
		   case 1:
			   System.out.println("Enter firstname ");
			   s = new Scanner(System.in);
			   String firstname = s.nextLine();
			   System.out.println("Enter lastname");
			   s = new Scanner(System.in);
			   String lastname = s.nextLine();
			   System.out.println("Enter address");
			   s = new Scanner(System.in);
			   String address = s.nextLine();
			   System.out.println("Enter city");
			   s = new Scanner(System.in);
			   String city= s.nextLine();
			   System.out.println("Enter state");
			   s = new Scanner(System.in);
			   String state = s.nextLine();
			   System.out.println("Enter zip");
			   s = new Scanner(System.in);
			   String zip = s.nextLine();
			   System.out.println("Enter phone number");
			   s = new Scanner(System.in);
			   String phone = s.nextLine();
			   System.out.println("Enter email");
			   s = new Scanner(System.in);
			   String email = s.nextLine();
			   
			   Contact person = new Contact(firstname,lastname,address,city,state,zip,phone,email);
			   AddressBook book1 = new AddressBook();
			   book1.addContact(person);
		   
			   
		   }
	   
	   
	   
       }
   }
}
