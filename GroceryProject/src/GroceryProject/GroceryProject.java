package GroceryProject;

import java.util.Scanner;

public class GroceryProject {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);		
		double moneySpent = 1;
		
		while (moneySpent != 0);
		System.out.print("Please enter the cost of your groceries, or type '0' to quit");
		moneySpent = in.nextDouble();
		
		if (moneySpent == 0) {
			
		}
		
				
		double eightPercentDiscount = moneySpent*0.08;
		double tenPercentDiscount = moneySpent*0.10;
		double twelvePercentDiscount = moneySpent*0.12;
		double fourteenPercentDiscount = moneySpent*0.14;
		
		if (moneySpent < 10) {
			System.out.println("You are not eligible for a coupon.");
		}
		else if (moneySpent <= 60) {
			System.out.print("you have earned a discount of $");
			System.out.printf("%.2f", eightPercentDiscount);
			System.out.print(". (8% of your purchase)");
			System.out.println(" ");
			
		}
		else if (moneySpent <= 150) {
			System.out.print("you have earned a discount of $");
			System.out.printf("%.2f", tenPercentDiscount);
			System.out.print(". (10% of your purchase)");
			System.out.println(" ");
		}
		else if (moneySpent <= 210) {
			System.out.print("you have earned a discount of $");
			System.out.printf("%.2f", twelvePercentDiscount);
			System.out.print(". (12% of your purchase)");
			System.out.println(" ");
		}
		
		else if (moneySpent > 210) {
			System.out.print("You have earned a discount of $");
			System.out.printf("%.2f", fourteenPercentDiscount);
			System.out.print(". (14% of your purchase)");
			System.out.print(" ");
		}
		
		System.out.println(" ");
		
		}
		
		
	}
		
		

		
		
		
		
				
		




