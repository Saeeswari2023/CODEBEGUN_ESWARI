package javaPrograms.Calculator;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		calculator();
		
		while(true) {
			System.out.println("want to continue choose 1 ::");
			int choice = sc.nextInt();
			System.out.println("Given choice is :: " + choice);
			if(choice == 1) {
				calculator();
			}	
			else {
				System.out.println("Program Terminated!!");
			    break;
			}    
		}
	}

	private static void calculator() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter inputOne :: ");
		int inputOne = sc.nextInt();
		System.out.println("Enter inputTwo :: ");
		int inputTwo = sc.nextInt();
		System.out.println("Enter operator +, -, *, /, % :: ");
		String operator = sc.next();
		
		switch(operator) {
		case "+":
			System.out.println("Add of two numbers :: " + (inputOne + inputTwo));
			break;
		case "-":
			System.out.println("Add of two numbers :: " + (inputOne - inputTwo));
			break;
		case "*":
			System.out.println("Add of two numbers :: " + (inputOne * inputTwo));
			break;
		case "/":
			System.out.println("Add of two numbers :: " + (inputOne / inputTwo));
			break;
		case "%":
			System.out.println("Add of two numbers :: " + (inputOne % inputTwo));
			break;	
		}
	}
}
