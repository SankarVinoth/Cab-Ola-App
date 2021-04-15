package com.sankarVinoth;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;


public class DateExample {
	public static void main(String args[]) {
		LocalDate now= LocalDate.now();         //inbuilt function here used to print current date
		System.out.println(now);
		LocalTime time= LocalTime.now();      //inbuilt function here used to print current time
		System.out.println(time);
		LocalDateTime datetime=LocalDateTime.now();      //inbuilt function here used to print current date and time
	    System.out.println(datetime);
	    LocalDateTime timedate=LocalDateTime.now();
	    System.out.println(timedate);
	    Scanner scr=new Scanner(System.in);
	    System.out.println("Enter your Date Of Birth");
	    String str=scr.next();
	    System.out.print("DOB of yours is:");
	    LocalDate dateofbirth=LocalDate.parse(str);                 
	    System.out.println(dateofbirth);
	    String  times="16:30:04";//HH:MM:SS(Hours+Minutes+Seconds)
	    LocalTime cabtime=LocalTime.parse(times);                  //here parse is used to convert the string to Integer
	    System.out.println(times);
	    
	    LocalDate currentdate= LocalDate.now();
	    if(dateofbirth.isBefore(currentdate)) {       //is after used to check the date isbefore or not
	    	System.out.println("isBefore");
	    }
	    if(dateofbirth.isAfter(currentdate)) {       //is after used to check the date isafter or not
	    	System.out.println("is after");
	    }
	    
	    LocalTime cabtimes = LocalTime.parse("17:00");      // sepearte cabtimes and hour variables are used here to get the date for further process  
	    int hour=cabtimes.getHour();
	    System.out.println("Hour :"+hour);
	    if(hour >=16 && hour <=18) {
	    	System.out.println("This is Peak hours");
	    }
	    String cabtype="micro";
	    if(cabtype.equals("micro")) {      //equals is used to compare strings
	    	System.out.println("Same");
	    }
	    else {
	    	System.out.println("not same");
	    }
	    if(cabtype.equalsIgnoreCase("Micro")) {     //ignore the mismatches between caps and small
	    	
	    }
	    if(dateofbirth.isEqual(LocalDate.now())) {                   
	    	System.out.println("Given Date is todays date");
	    	
	    }
	    Long mobileno=9995677899L; //long values should ends with L
	    String mobilenostring=String.valueOf(mobileno); // convert to string
	    if(mobilenostring.length()==10) {                // to check the phoneno length typed is correct or not
	    	System.out.println("Number is same");
	    }
	    
	    scr.close();
	    }
	    
	    
	}


