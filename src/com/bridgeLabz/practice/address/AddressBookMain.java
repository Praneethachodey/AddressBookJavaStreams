package com.bridgeLabz.practice.address;

import java.util.*;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AddressBookMain {
   public static void main(String[] args) {
	   System.out.println("Welcome to Address Book Problem");
	   Map<String,AddressBook> bookList = new HashMap<String,AddressBook>();
	   Map<String,ArrayList<Contact>> cityBook = new HashMap<>(); 
	   Map<String,ArrayList<Contact>> stateBook = new HashMap<>(); 
	   while(1==1)
	   {
		   
		   System.out.println("Press 0 to exit");
		   System.out.println("Press 1 to add a contact");
		   System.out.println("Press 2 to edit a contact");
		   System.out.println("Press 3 to delete a contact");
		   System.out.println("press 4 to add a new address book");
		   System.out.println("press 5 to view persons in a specific city");
		   System.out.println("press 6 to view persons in a specific state");
		   Scanner s = new Scanner(System.in);
		   int choice = s.nextInt();
		   
		   switch(choice)
		   {
		   case 0:
			   System.exit(1);
			   
			   
		   case 1:
			   System.out.println("select a address book to enter the contact");
			   if(bookList.size()!=0)
				   System.out.println(bookList.keySet());
			   else 
				   System.out.println("There are no books..enter the name to create one");
			   s=new Scanner(System.in);
			   String bookname=s.nextLine();
			   if(bookList.size()==0) bookList.put(bookname,new AddressBook());
			   System.out.println("Enter firstname ");
			   s = new Scanner(System.in);
			   String firstname = s.nextLine();
			AddressBook returnedBook =  bookList.entrySet().stream().filter(book-> bookname.equals(book.getKey())).map(Map.Entry::getValue).findFirst().orElse(null);
			if(returnedBook.Book.entrySet().stream().anyMatch(contact -> firstname.equals(contact.getKey())))
				{System.out.println("contact exists");
			break;}
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
			   bookList.get(bookname).addContact(firstname, person);
			   if(cityBook.containsKey(person.city)) 
			   {
			      cityBook.get(person.city).add(person);
				  stateBook.get(person.state).add(person);
			   }
			   else 
			   {
				  cityBook.put(person.city, new ArrayList<Contact>());
			   	  stateBook.put(person.state, new ArrayList<Contact>());
			   	
			    }
			   break;
			   
		   
		   case 2:
			   System.out.println("Enter the address book");
			   if(bookList.size()!=0)
				   System.out.println(bookList.keySet());
			   else 
				   {
				   System.out.println("There are no books..");
				   break;
				   }
			   s=new Scanner(System.in);
			   String bookname1=s.nextLine();
			   System.out.println("Enter the name of the contact you want to edit");
			   s=new Scanner(System.in);
			   String name=s.nextLine();
			   System.out.println("Enter field you want to edit");
			   s= new Scanner(System.in);
			   String field = s.nextLine();
			   System.out.println("Enter the new value");
			   s=new Scanner(System.in);
			   String newValue=s.nextLine();
			   bookList.get(bookname1).edit(name,field,newValue);
			   break;
			   
			   
		   case 3:
			   System.out.println("Enter the address book");
			   s=new Scanner(System.in);
			   String bookname2=s.nextLine();
			   System.out.println("Enter the name of the contact you want to delete");
			   s=new Scanner(System.in);
			   bookList.get(bookname2).deleteContact(s.nextLine());
			   break;
			   
			   
		   case 4:
			   System.out.println("Enter the name of the book");
			   s=new Scanner(System.in);
			   AddressBook book2 = new AddressBook();
			   bookList.put(s.nextLine(), book2);
			   break;
			   
		   case 5:
			   System.out.println("Enter the city you want");
			   s= new Scanner(System.in);
			   String cityToSearch = s.nextLine();
			   bookList.values().stream().forEach(book ->
			   book.Book.values().stream().filter(contact -> contact.city.equals(cityToSearch)).collect(Collectors.toList()).forEach(contact -> System.out.println(contact.firstname))
					   );
			   break;
			   
		   case 6:
			   System.out.println("Enter the state you want");
			   s= new Scanner(System.in);
			   String st = s.nextLine();
			   if(stateBook.containsKey(st)) {
				   ArrayList listOfContactsbyState= stateBook.get(st);
				   Iterator<Contact> iter1 = listOfContactsbyState.iterator();
				   while(iter1.hasNext())
				   {
					   Contact p1 = iter1.next();
					   System.out.println(p1.firstname + p1.lastname);
					   System.out.println("No of persons in that state : " + stateBook.get(st).size());;
				   }
				   
			   }
			   else
				   System.out.println("Sorry there are no contacts in that state");
			   
//			   bookList.values().stream().forEach(book ->
//			   book.Book.values().stream().filter(contact -> contact.state.equals(stateToSearch)).collect(Collectors.toList()).forEach(contact -> System.out.println(contact.firstname))
//					   );
//			   break;
//			  
			  
			   
	    }
		  
	   	   
      }
   }
}