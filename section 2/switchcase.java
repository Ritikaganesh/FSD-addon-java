package program;

import java.util.Scanner;

public class switchcase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Select an operation: ");
		
		System.out.println("1. Addition");
		System.out.println("2. subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		
		System.out.println("Enter your choice (1/2/3/4): ");
		int choice = sc.nextInt();
		
		System.out.println("Enter the first number: ");
		double num1 = sc.nextDouble();
		
		System.out.println("Enter the secound number: ");
		double num2 = sc.nextDouble();
		
		double result;
		
		switch(choice) {
		case 1:
			result = num1 + num2;
			System.out.println("result: " +result);
			break;
		case 2:
			result = num1 - num2;
			System.out.println("result: " +result);
			break;
		case 3:
			result = num1 * num2;
			System.out.println("result: " +result);
			break;
		case 4:
			if(num2 !=0) {
			result = num1 / num2;
			System.out.println("result: " +result);
			}else {
				System.out.println("Error: Division by zero not allowed");
			}
			break;
			default:
				System.out.println("Invalid choice select the correct choice");
		}
	}

}
