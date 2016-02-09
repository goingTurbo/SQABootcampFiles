package com.sqa.ts.actions;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author Trevor
 *
 */
public class GradeValues {
	/**
	 * @param args
	 */
	private static Scanner scanner;
	
	public static void main(String[] args) {
	//TODO Refactor code once approved 
	boolean keepGoing = true;
	String grade; // initializing variable for grade
	
	
	while(keepGoing){
		System.out.println("What percentage did you get? ");  //Ask User the question
		scanner = new Scanner(System.in); //starting the scanner 
		grade = scanner.nextLine();  //storing user input of percentage
		
		int percentage;
		try {  // Start to check for anything that isn't a number
			percentage = Integer.parseInt(grade); //converting string to a int
		} catch (NumberFormatException e) {  //Beginning of the check for non numbers
			// TODO Auto-generated catch block
			System.out.println("We need a number!");  //  Message to user that they messed up.
			continue;  //this will start the while loop over again
		}  
	
		if(percentage >= 80 && percentage <= 100){
			System.out.println("Your grade is an A!  Awesome job!");
		}else if(percentage >= 70 && percentage <= 79){
			System.out.println("Your grade is an B!  Nice work!");
		}else if(percentage >= 60 && percentage <= 69){
			System.out.println("Your grade is an C!  That's average. =( ");
		}else if(percentage >= 50 && percentage <= 59){
			System.out.println("Your grade is an D!  Come on man, you can do better.");
		}else if(percentage < 50){
			System.out.println("Your grade is an F!  You need to hit the books again and try again.");
		}else{
			System.out.println("I think you type the wrong value.");
		}
	
	System.out.println("Would you like to check another grade?");  //Asking user if they want to do it again
	Scanner choice = new Scanner(System.in);  //Gets user input
	String answer = choice.nextLine();  // Stores input in variable "answer"
	if("yes".equals(answer)){
	    keepGoing = true;  //While loop should keep going

	}else{
		keepGoing = false;  //While loop should stop
	    break;  //this should stop program
	}
	}
	}
}
 //VAL Code should be double checked by partner
 //FIXME Fix this code if there is a problem
