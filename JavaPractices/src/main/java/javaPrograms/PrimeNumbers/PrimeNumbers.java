package javaPrograms.PrimeNumbers;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input :: ");
		int input = sc.nextInt();
		primeNumbers(input);
		
		while(true) {
			System.out.println("Want to continue choose 1 :: ");
			int choice = sc.nextInt();
			System.out.println("You choose the number :: " + choice);
			if(choice == 1) {
				System.out.println("Enter input :: ");
				int input1 = sc.nextInt();
				primeNumbers(input1);
			}else if(choice > 1) {
				System.out.println("Program terminated!!");
				break;
			}
		}
	}

	private static void primeNumbers(int input) {
		for(int i=2; i<=input; i++) {
			int count = 0;
			for(int j=1; j<=i; j++) {
				if(i%j == 0) {
					count += 1;
				}
			}
			if(count == 2) {
				System.out.println("Prime numbers :: " + i);
			}
		}
	}
}
