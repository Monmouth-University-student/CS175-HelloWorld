package gpa;

public class gpa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		import java.util.Scanner
			
			
				
				//User inputs the number of classes he/she has
				Scanner input = new Scanner (System.in);
				System.out.println("Please enter your number of classes");
				int classes;
				classes = input.nextInt();
				String Grade = "";
				int totalHours = 0;
				int totalHoursEarned = 0;
				int hours;
				double gpa;
				double number=0;
				
				//String of if and else statements that set the number to the appropriate GPA
				if(Grade == "A")
					number = 4.0;
				else if(Grade == "A-")
					number = 3.67;
				else if(Grade == "B+")
					number = 3.33;
				else if(Grade == "B")
					number = 3.0;
				else if(Grade == "B-")
					number = 2.67;
				else if(Grade == "C+")
					number = 2.33;
				else if(Grade == "C")
					number = 2.0;
				else if(Grade == "C-")
					number = 1.67;
				else if(Grade == "D+")
					number = 1.33;
				else if(Grade == "D")
					number = 1.0;
				else if(Grade == "D-")
					number = 0.67;
				else if(Grade == "F")
					number = 0;
				
				//Loop that ends once the student has put information in on all his classes
				for(int count = 0; count < classes; count++)
				{
					
					
					
					//Reads the number of hours each class was
					Scanner input2 = new Scanner (System.in);
					System.out.println("Please enter the number of hours this course was");
					hours = input2.nextInt();
					//reads the letter grade using the String Grade prompt
					Scanner input3 = new Scanner(System.in);
					System.out.println("Please enter your grade for this class");
					Grade = input3.next();
					
					//algorithm for finding the GPA
					totalHours += hours;
					totalHoursEarned += (hours * number);
					
				}
			//for loop ends
				
				//GPA is calculated for all the students classes
				gpa = totalHoursEarned / totalHours;
				
				//GPA is printed to the screen
				System.out.println(gpa);
				
				
			
			}
	}

}
