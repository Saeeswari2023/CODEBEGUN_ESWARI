package javaPrograms.SwappingTwoNumbers;

import java.util.Scanner;

public class SwapUsingThirdVariableMain {

	public static void main(String[] args) {
		int inputOne,inputTwo;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter inputOne and inputTwo :: ");
		inputOne = sc.nextInt();
		inputTwo = sc.nextInt();
		swap(inputOne,inputTwo);
	}

	private static void swap(int inputOne, int inputTwo) {
		int result;
		result = inputOne;
		inputOne = inputTwo;
		inputTwo = result;
		System.out.println("inputOne = " + inputOne + "," + "inputTwo = " + inputTwo);
	}

}
