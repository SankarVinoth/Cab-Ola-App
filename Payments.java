package com.sankarVinoth;

import java.time.YearMonth;

public class Payments {

	public static void main(String[] args) {
		// payment options
		    // card-expire date (optional)
		     YearMonth cardExpiryDate=YearMonth.parse("2021-05");        //yyyy-mm
		     if(cardExpiryDate.isBefore(YearMonth.now())) {
		     System.out.println("Card expired");
		     }
		     else {
		     System.out.println("card not  expired");
		     }
		    
		    

	}

}
