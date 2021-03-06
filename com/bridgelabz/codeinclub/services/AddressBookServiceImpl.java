package com.bridgelabz.codeinclub.services;
/**
 In this service to implements the method and pass data on ReadCSV file
  @author manjit Khurana
*/
import com.bridgelabz.codeinclub.utils.ReadCSV;
import com.bridgelabz.codeinclub.utils.AddressBookUtill;
import com.bridgelabz.codeinclub.modles.People;
import java.util.*;

// Implent  AddressBookService Method 

public class AddressBookServiceImpl implements AddressBookService
{
  final ReadCSV readInput;
  
  public AddressBookServiceImpl(ReadCSV readInput){
        this.readInput = readInput;
    }

	@Override
	public void addPerson(){
		
		AddressBookUtill.getUserString();
		
		System.out.println("Enter First name ");
		final String firstName = AddressBookUtill.getUserString();
		
        	System.out.println("Enter Last name ");
	    	final String lastName = AddressBookUtill.getUserString();  
		
       		System.out.println("Enter Address ");
		final String address = AddressBookUtill.getUserString();
		
       		System.out.println("Enter City ");
	    	final String city = AddressBookUtill.getUserString();
		
       		System.out.println("Enter State ");
		final String state = AddressBookUtill.getUserString();
		
       		System.out.println("Enter Phone number ");
	   	final String phoneNumber = AddressBookUtill.getUserString();      	   
		
       		System.out.println("Enter ZipCode ");
		final String zip = AddressBookUtill.getUserString();	  
		
	
		final People people = new People(firstName,lastName,address,city,state,phoneNumber,zip);		;		
		readInput.addToAddressBook(people);
		
 }

         @Override
	public void saveInfo(){
    	  readInput.storeInfo();
   	 }
	
	@Override
        public void showData(){
	readInput.showDetails();
    }

}
