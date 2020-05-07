package com.bridgelabz.codeinclub.main;
/*
Main AddressBook File
@author Manjit Khurana
*/
import com.bridgelabz.codeinclub.utils.ReadCSV;
import com.bridgelabz.codeinclub.utils.AddressBookUtill;
import com.bridgelabz.codeinclub.services.AddressBookService;
import com.bridgelabz.codeinclub.services.AddressBookServiceImpl;
import java.util.*;


public class Main{
    
//Main Method
    public static void main(String[] args){
	    System.out.println("Welcome to AddressBook Application");
    AddressBookService addressBookService = new AddressBookServiceImpl();
   
  	while(true){
        
      		 System.out.println("Select the task to perform \n"+
								"1. Create new People Entry \n"+
								"2. Show existing Entry\n"+
								"3. Save AddressBook \n"+
								"4.Delete AddressBook\n"+
								"5.Close AddressBook\n");      
         	final int select = AddressBookUtill.getUserNumber();
            	
            	switch(select){
                case 1:
		 System.out.println("Add People Entry");
		 addressBookService.addPerson();
                 break;
                case 2:
                  System.out.println("show Contacts Details");
                  addressBookService.showData();
                  break;
                case 3:
                    System.out.println("Write data in csv file ");
                    addressBookService.saveInfo();
                    break;
		case 4:
		   System.out.println("Delete AddressBook App");
		   //addressBookService.deletePeople();
		case 5:
		 System.out.println("Close Address-Book App");
                 System.exit(0);
                
		default:
                 System.out.println("Invalid range ");
            }
        }

    }
}
