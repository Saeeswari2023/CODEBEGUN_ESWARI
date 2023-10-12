package javaPrograms.SwappingTwoNumbers;

import java.util.Scanner;

public class SwapNoUsingThirdVariableMain {

	public static void main(String[] args) {
		int inputOne,inputTwo;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter inputOne and inputTwo :: ");
		inputOne = sc.nextInt();
		inputTwo = sc.nextInt();
		swap(inputOne,inputTwo);
	}

	private static void swap(int inputOne, int inputTwo) {
		inputOne = inputOne + inputTwo;
		inputTwo = inputOne - inputTwo;
		inputOne = inputOne -inputTwo;
		System.out.println("inputOne = " + inputOne + "," + "inputTwo = " + inputTwo);
	}

}
