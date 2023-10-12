package javaPrograms.FibanocciSeries;

import java.util.Scanner;

public class Fibanocci {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		fibanocci();
		while(true) {
			System.out.println("if you want to continue enter 1 :: ");
			int choice = sc.nextInt();
			System.out.println("Given choice is :: " + choice);
			if(choice == 1) {
				fibanocci();
			}else {
				System.out.println("Program Terminated!!");
				break;
			}
		}
	}

	private static void fibanocci() {
		System.out.println("Enter input :: ");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int firstNumber = 0, nextNumber = 1, result;
		System.out.print("Fibanocci series :: ");
		System.out.print(firstNumber + " " + nextNumber + " ");
		for(int i=0; i<=input; i++) {
			result = firstNumber + nextNumber;
			firstNumber = nextNumber;
			nextNumber = result;
			System.out.print(result + " ");
		}
	}
}
