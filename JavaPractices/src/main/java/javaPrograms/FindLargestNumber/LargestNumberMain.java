package javaPrograms.FindLargestNumber;

import java.util.Scanner;

public class LargestNumberMain {

	public static void main(String[] args) {
		int inputOne,inputTwo,inputThree;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three inputs :: ");
		inputOne = sc.nextInt();
		inputTwo = sc.nextInt();
		inputThree = sc.nextInt();
		largestNumber(inputOne,inputTwo,inputThree);
	}

	private static void largestNumber(int inputOne, int inputTwo, int inputThree) {
		if(inputOne > inputTwo && inputOne > inputThree) {
			System.out.println("inputOne is Largest Number :: " + inputOne);
		}else if(inputOne < inputTwo && inputThree < inputTwo) {
			System.out.println("inputTwo is Largest Number :: " + inputTwo);
		}else if(inputThree > inputOne && inputThree > inputTwo) {
			System.out.println("inputThree is Largest Number :: " + inputThree);
		}else {
			System.out.println("Entered numbers are not distinct.");
		}
	}

}
