package com.bridgelabz.codeinclub.main;
/*
Main AddressBook File
@author Manjit Khurana
*/
import com.bridgelabz.codeinclub.utils.ReadCSV;
import java.util.*;

import com.bridgelabz.codeinclub.utils.AddressBookUtill;

import com.bridgelabz.codeinclub.services.AddressBookService;

import com.bridgelabz.codeinclub.services.AddressBookServiceImpl;


public class Main{
    

    public static void main(String[] args){
    AddressBookService addressBookService = new AddressBookServiceImpl(new ReadCSV());
   
    // int select=0;

		//while(select!=4){
while(true){
        
       System.out.println("Select the task to perform \n"+
								"1. Create new People Entry \n"+
								"2. Show existing Entry\n"+
								"3. Save AddressBook \n"+
								"4.Close AddressBook\n");     
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
                    System.out.println("Write in csv file ");
                    addressBookService.saveInfo();
                    break;
				case 4:
				 System.out.println("Close AddressBook App");
                System.exit(0);
                default:
                    System.out.println("Invalid range ");
            }
        }

    }
}
