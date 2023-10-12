package Factorial;

import java.util.Scanner;

public class FactorialMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number :: ");
		int input = sc.nextInt();
		factorial(input);
		
		while(true) {
			System.out.println("If you want to continue enter 1:: ");
			int choice = sc.nextInt();
			System.out.println("Given choice is :: " + choice);
			if(choice == 1) {
				System.out.println("Enter your input :: ");
				int next_num = sc.nextInt();
				factorial(next_num);
			}else if(choice > 1) {
				System.out.println("Program terminated!!");
				break;
			}
		}
	}

	private static void factorial(int input) {
		int fact = 1;
		for(int i=0;i<input;i++) {
			fact *= (input-i);
		}
		System.out.println("Factorial of given number :: " + fact);
	}
}
