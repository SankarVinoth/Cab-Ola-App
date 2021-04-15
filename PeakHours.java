package com.sankarVinoth;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class PeakHours {
    public static void peakhours() {
    	Scanner scr=new Scanner(System.in);
    	int cabno;

         System.out.println("enter your pickup time");
		String str2=scr.next();
    	LocalTime cabtimes = LocalTime.parse(str2);      // sepearte cabtimes and hour variables are used here to get the date for further process  
	    int hour=cabtimes.getHour();
	    System.out.println("Hour :"+hour);
	    if(hour >=16 && hour <=18) {
	    	System.out.println("This is Peak hours");
	    }
	    if(true) {
	    	System.out.println("You have to pay 1.25% of your pay");
	        LocalDate now= LocalDate.now();         //inbuilt function here used to print current date
	 		System.out.println(now);
	 		int year=now.getYear();
	 		System.out.println("Enter your date of birth");
	 		String dob=scr.next();
	 		LocalDate dob1= LocalDate.parse(dob);
	 		int actyear=dob1.getYear();
	 		int age=(year-actyear);
	 		System.out.println( "your age is"+age);
	 		if(age>50) {
	 			System.out.println("your age is greater than 50 so u have 50% reduction in pay!!!!!!!! enjoy!!!!!!");
	 		}
	    	System.out.println("enter your cab no");
	    	
	    	cabno=scr.nextInt();
			if(cabno==1 || age>50) {
				System.out.println("enter the no of kms you want to travel (per km -10 rupees");
				int kms;
				kms=scr.nextInt();
				double fare= (kms*10);
				System.out.println("Your fare is "+fare);
			    double gsts=((fare*20)/100);
			    System.out.println("Your gst is "+gsts);
			    double peakhourscharge=((fare*125)/100);
			    double amount = (fare+gsts+peakhourscharge);
			    System.out.println("Your amount is "+amount);
			}
			if(cabno==2 || age>50) {
				System.out.println("enter the no of kms you want to travel (per km -10 rupees");
				int kms;
				kms=scr.nextInt();
				double fare= (kms*15);
				System.out.println("Your fare is "+fare);
				 double gsts=((fare*20)/100);
				    System.out.println("Your gst is "+gsts);
				    double peakhourscharge=((fare*125)/100);
				    double amount = (fare+gsts+peakhourscharge);
				   
				    System.out.println("Your amount is "+amount);
			}
			if(cabno==3 || age>50) {
				System.out.println("enter the no of kms you want to travel (per km -10 rupees");
				int kms;
				kms=scr.nextInt();
				double fare= (kms*30);
				System.out.println("Your fare is "+fare);
				 double gsts=((fare*20)/100);
				    System.out.println("Your gst is "+gsts);
				    double peakhourscharge=((fare*125)/100);
				  double   amount = (fare+gsts+peakhourscharge);
				    System.out.println("Your amount is "+amount);
			}
	    }
    }
	    
	   /* payment options
	    * card-expiry date (optional)
	    * YearMonth cardExpiryDate=YearMonth.parse("2021-05");//yyyy-mm
	    * if(cardExpiryDate.isbefore(YearMonth.now()) {
	    * system.out.println("ard expired");
	    * }
	    * else {
	    * system.out.println("card expired");
	    * }
	    * */
	    
	    
	   
    }

