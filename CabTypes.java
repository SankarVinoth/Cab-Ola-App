package com.sankarVinoth;

import java.util.Arrays;
import java.util.Scanner;

public class CabTypes {
	public static void main(String args[]){
		Scanner scr=new Scanner(System.in);
		System.out.println("Welcome to Login Page");
		Long mobileno;
		System.out.println("Enter your Mobile Number");
		mobileno=scr.nextLong();
		 String mobilenostring=String.valueOf(mobileno); 
		 if(mobilenostring.length()==10) {                // to check the phoneno length typed is correct or not
		    	
		    }
		 else {
			 System.out.println("Please enter Correct Number");
		 }
		 System.out.println("Enter Password");
		 Long password;
		 password= scr.nextLong();
		 String passwordstring=String.valueOf(password); 
		 if(passwordstring.length()==8) {                // to check the phoneno length typed is correct or not
		    	
		    }
		 else {
			 System.out.println("Please enter eight digit password");
		 }
		 System.out.println("welcome to CabTyoes page");
		 
		 String Cartypes1="micro";
		 String Cartypes2="mini";
		 String Cartypes3="prime";
		String[] cartypes=new String[3];
		cartypes[0]="micro";
		cartypes[1]="mini";
		cartypes[2]="prime";
		System.out.println("cartypes"+cartypes);
		System.out.println("cabtypes"+Arrays.toString(cartypes));
		System.out.println("No of cabTypes"+cartypes.length);
		for(int i=0;i<cartypes.length;i++) {
			String Ctypes=cartypes[i];
			System.out.println(Ctypes);
			
		}
		//for each
		for(String c:cartypes) {
			System.out.println(c);
		}
		
      GSTCalculation.gst();
	 
      Booking.booking();
	  PeakHours.peakhours();
	
	 
	 
	}

}

