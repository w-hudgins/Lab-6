import java.util.*;
import java.lang.*;


//This file has been publicly added to GitHub

public class Calculator {
	
	public static void main (String[] args) {
		
		double firstOp, secondOp;
		int choice;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter first operand: "); //first operand (Prompt1)
		firstOp = input.nextDouble();
		
		System.out.print("Enter second operand: "); //second operand (Prompt2)
		secondOp = input.nextDouble();
		
		
		System.out.println("\n" + "Calculator Menu"); //Calculator Menu
		System.out.println("---------------");
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division" + "\n");
		
		System.out.print("Which operation do you want to perform? "); //Prompt 3
		choice = input.nextInt();
		
		switch (choice) {
			case 1:
			System.out.println("\n" + "The result of the operation is " + (firstOp + secondOp) + "." + " Goodbye!");
			break;
			
			case 2:
			System.out.println("\n" + "The result of the operation is " + (firstOp - secondOp) + "." + " Goodbye!");
			break;
			
			case 3:
			System.out.println("\n" + "The result of the operation is " + (firstOp * secondOp) + "." + " Goodbye!");
			break;
			
			case 4:
			System.out.println("\n" + "The result of the operation is " + (firstOp / secondOp) + "." + " Goodbye!");
			break;
			
			default:
			System.out.println("\n" + "Error: Invalid selection! Terminating program.");
			break;
			
		}

		
	}
}
