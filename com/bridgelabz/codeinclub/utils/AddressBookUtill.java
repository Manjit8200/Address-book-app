package com.bridgelabz.codeinclub.utils;

import java.util.Scanner;

public final class AddressBookUtill {

    private final static Scanner scanner = new Scanner(System.in);

    private AddressBookUtill(){
        // default constructor 
    }

    public static int getUserNumber(){
        return scanner.nextInt();
    }

    public static String getUserString(){
        return scanner.nextLine();
    }

}