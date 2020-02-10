//This program demonstrates how numeric types and operators behave in Java
import java.util.Scanner;
public class Lab2 {

	public static void main(String[] args) {
				//System.out.println("100 and 95 have an average of "+((100.0+95.0)/2)+"\n212 degrees Farenheit equals "+((5.0/9)*(212.0-32))+" degrees Celsius"+"\nGoodbye");
		
				//TASK #2 Create a Scanner object here 
				Scanner in=new Scanner(System.in);
				
				//identifier declarations
				final int NUMBER = 2; // number of scores
				int score1 = 100; // first test score
				int score2 = 95; // second test score
				final int BOILING_IN_F = 212; // boiling temperature
				double fToC; // temperature in Celsius
				double average; // arithmetic average
				String output; // line of output to print out
				
				//Task #2 declare a variable to hold the user’s temperature
				double userTemp;
				
				//Task #2 prompt user to input score1
				System.out.println("Enter 1'st score: ");
				
				//Task #2 read score1
				score1=in.nextInt();
				
				//Task #2 prompt user to input score2
				System.out.println("Enter 2'nd score: ");
				
				//Task #2 read score2 
				score2=in.nextInt();
				
				// Find an arithmetic average
				average = ((double)score1 + score2) / NUMBER;
				output = score1 + " and " + score2 + " have an average of " + average;	
				System.out.println(output);
				
				// Convert Fahrenheit temperatures to Celsius
				fToC = (5.0/9.0) * (BOILING_IN_F - 32);
				output = BOILING_IN_F + " in Fahrenheit is " + fToC + " in Celsius.";
				System.out.println(output);
				
				//Task #2 prompt user to input another temperature
				System.out.println("\nInput temperature in Farenheit: ");
				
				//Task #2 read the user’s temperature in Fahrenheit
				userTemp=in.nextDouble();
				
				//Task #2 convert the user’s temperature to Celsius
				double celsius=(5.0/9.0)*(userTemp-32);
				
				//Task #2 print the user’s temperature in Celsius
				System.out.println(userTemp+" degrees Farenheit is equal to "+celsius+" degrees Celsius");
				System.out.println("Goodbye"); // to show that the program is ended

	}

}