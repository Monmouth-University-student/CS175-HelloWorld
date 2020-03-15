package Assging3;

import java.util.Scanner;

public class LetterSize {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("Enter the length of your letter in inches: ");
		double inch =input.nextDouble();
		double milimeters = inch * 25.4;
		System.out.println("The lenght of your paper in milimiters is " +milimeters);
		{
			System.out.print("enter the width of your paper in inches: ");
			double inch2 = input.nextDouble();
			var milimeters2 = inch2 * 25.4;
			System.out.println("The width of your paper in milimeters is " +milimeters2);
		}
		

	}

}
