package com.sankarVinoth;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class Booking {
	public static void booking() {
		Scanner scr=new Scanner(System.in);
		System.out.println("enter the type of cab you want like 1/2/3");
		
		String cartype;
		System.out.println("enter the car type(micro/mini/prime)");
		cartype =scr.next();
		System.out.println("you selected "+cartype);
		System.out.println("enter  your journey date(YY-MM-DD):");
	    String str=scr.next();
		System.out.print("journey date  of yours is:");
		LocalDate journeydate=LocalDate.parse(str);                 
		System.out.println(journeydate);
		LocalDate currentdate= LocalDate.now();
		if(journeydate.isAfter(currentdate)) {       //is after used to check the date isafter or not
	    	System.out.println("is after");
	    }
		System.out.println("enter your pickup time");
		String str2=scr.next();
		
		 LocalTime cabtimes = LocalTime.parse(str2);      // sepearte cabtimes and hour variables are used here to get the date for further process  
		    int hour=cabtimes.getHour();
		    System.out.println("pickup Time :"+hour);

		
		
		
		
	}

}
