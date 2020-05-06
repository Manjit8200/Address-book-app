package com.bridgelabz.codeinclub.modles;

/*
Address Book Entity
@author Manjit Khurana
*/

public class People{
    // class variable
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private String zip;
    private String phoneNumber;

// Default constructor
    public People()
	{ 
		// Default constructor
    }

// Parameterized constructor
    public People(String firstName,String lastName,String address,String city,String state,String zip,String phoneNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phoneNumber = phoneNumber;
    }

 // getter & Setter Method 
 
    public String getFirstName(){
        return firstName;
    }
	 public void setFirstName( String firstName){
        this.firstName = firstName;
     }
//LastName	
    public String getLastName(){
        return lastName;
    }
    public void setLastName( String lastName){
        this.lastName = lastName;
     }
//Address
    public String getAddress(){
        return address;
	 }
    public void setAddress( String address){
        this.address = address;
     }
//City	
    public String getCity(){
        return city;
    }
	  public void setCity( String city){
        this.city = city;
    }
//State
    public String getState(){
        return state;
    }
	  
    public void setState( String state){
        this.state = state;
    }
//ZipCode
    public String getZip(){
        return zip;
    }
	
    public void setZip( String zip){
        this.zip = zip;
    }
//PhoneNumber
    public String getPhoneNumber(){
        return phoneNumber;
    }
    public void setPhoneNumber( String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
}
