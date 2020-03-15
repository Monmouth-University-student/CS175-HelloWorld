package Assging3;

import java.util.Scanner;

public class partTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double tank;
		double mpg;
		double gas;
		
		System.out.print("Enter amount of gallons in your tank: ");
		tank = input.nextFloat();
		
		System.out.print("Enter your miles per gallon: ");
		mpg = input.nextFloat();
		
		System.out.print("Enter the price per gallon: ");
		gas = input.nextFloat();
		
		double pricePerTank = tank * gas;
		double amountOfGallons = 100/mpg;
		double pricePerTrip = amountOfGallons*gas;
		
		System.out.println("The price for your trip is:"+pricePerTrip);
		
		
		
		

	}

}
