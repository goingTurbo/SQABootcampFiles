package com.sqa.ts.math;

import java.util.Scanner;

public class Operations {

	public static void main(String[] args) {
		
//		String operation = args[0];
//		String num1 = args[1];
//		String num2 = args[2];
		double input1;
    	double input2;
		double total = 0;
		boolean decision = true;
	 	
//	while(decision == true){		
	do{
		System.out.println("What operation would you like to use? ");
		Scanner scanner1 = new Scanner(System.in);
		String method = scanner1.nextLine();
		
		System.out.println("What is the first number?");
		Scanner scanner2 = new Scanner(System.in);
		String num1 = scanner2.nextLine();		
		
		System.out.println("What is the second number?");
		Scanner scanner3 = new Scanner(System.in);
		String num2 = scanner3.nextLine();
		
		input1 = Double.parseDouble(num1);
		input2 = Double.parseDouble(num2);
	 	//String function = args[0];

	 	switch(method) {
			case "A":
				double valueA = input1 + input2;
				System.out.println("The sum of " + input1 + " + " + input2 + " = " + valueA);
				break;

			case "S":
				double valueS = input1 - input2;
				System.out.println("The sum of " + input1 + " - " + input2 + " = " + valueS);
				break;

			case "M":
				double valueM = input1 * input2;
				System.out.println("The total of " + input1 + " * " + input2 + " = " + valueM);
				break;

			case "D":
				double valueD = input1 / input2;
				System.out.println("The total of " + input1 + " / " + input2 + " = " + valueD);
				break;

			case "MD":
				double value = input1 % input2;
				System.out.println("The modulus of " + input1 + " % " + input2 + " is " + value);
				break;
				
			default:
				System.out.println("You typed something wrong!?");
		}
	 	
		System.out.println("Do you want to try again?");
		Scanner scanner4 = new Scanner(System.in);
		String choice = scanner4.nextLine();
		if(choice == "yes"){
		    decision = true;
		}else{
			decision = false;
		}
	}while(decision = true);
	System.exit(0);
	}
}
