package com.sankarVinoth;

import java.util.Scanner;

public class GSTCalculation {
	public static void gst() {
		System.out.println("enter the type of cab you want like 1/2/3");
		Scanner scr=new Scanner(System.in);
		int cabno;
		cabno=scr.nextInt();
		if(cabno==1) {
			System.out.println("enter the no of kms you want to travel (per km -10 rupees");
			int kms;
			kms=scr.nextInt();
			double fare= (kms*10);
			System.out.println("Your fare is "+fare);
		    double gsts=((fare*20)/100);
		    System.out.println("Your gst is "+gsts);
		    double amount = (fare+gsts);
		    System.out.println("Your amount is "+amount);
		}
		if(cabno==2) {
			System.out.println("enter the no of kms you want to travel (per km -10 rupees");
			int kms;
			kms=scr.nextInt();
			double fare= (kms*15);
			System.out.println("Your fare is "+fare);
			 double gsts=((fare*20)/100);
			    System.out.println("Your gst is "+gsts);
			    double amount = (fare+gsts);
			    System.out.println("Your amount is "+amount);
		}
		if(cabno==3) {
			System.out.println("enter the no of kms you want to travel (per km -10 rupees");
			int kms;
			kms=scr.nextInt();
			double fare= (kms*30);
			System.out.println("Your fare is "+fare);
			 double gsts=((fare*20)/100);
			    System.out.println("Your gst is "+gsts);
			    double amount = (fare+gsts);
			    System.out.println("Your amount is "+amount);
		}
	
	}

}
