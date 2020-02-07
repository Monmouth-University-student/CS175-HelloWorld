package GroceryProject;

import java.util.Scanner;

public class GroceryProject {

	public static void main(String[] args) {
		
		double priceofGroceries = 1.00;
		double discountPercent = 0.0; 
		double discountDue = 1.00;
		
		Scanner in = new Scanner(System.in);
		int exitPlease = 1; 
		while(exitPlease != 0) {
		System.out.println("Please enter the cost of your groceries, or '0' to quit: ");
		priceofGroceries= in.nextDouble(); 
		
		if (priceofGroceries < 10);
		{ 
			discountPercent = 0.0;
			discountDue = 0.0;

		}
	    if (priceofGroceries <=60)  
		{
			discountPercent = 00.08;
		}
		else if (priceofGroceries <=150) 		{
			discountPercent = 00.10;
		}
		else if (priceofGroceries <=210) 
		{	
			discountPercent = 00.12;
		}
		else if (priceofGroceries > 210)
		{
			discountPercent = 00.14;
		}
		discountDue = discountPercent * priceofGroceries ; 
		System.out.println("You just saved "+ discountPercent + " on your purchase " +String.format("%.2f",+ discountDue));
		System.out.println("Price with coupon is $" + String.format("%.2f", (priceofGroceries - discountDue  ))) ;
		System.out.println( "Please enter 'Exit' to end the program. : ") ;
		if (in.next().equals("Exit")) {
			System.out.println("Have a nice day!");
		}
	}
		in.close();
}
}
		

		
		
		
		
				
		




