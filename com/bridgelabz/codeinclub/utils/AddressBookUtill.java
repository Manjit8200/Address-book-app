package com.bridgelabz.codeinclub.utils;
/**
  In this UserInput Number and String couple time use any where
  @author manjit Khurana
*/
import java.util.Scanner;

public final class AddressBookUtill {

    private final static Scanner scan = new Scanner(System.in);

    private AddressBookUtill(){
        // default constructor 
    }
//User Input Number Get
    public static int getUserNumber(){
        return scan.nextInt();
    }

//User Input String Get
    public static String getUserString(){
        return scan.nextLine();
    }

}
