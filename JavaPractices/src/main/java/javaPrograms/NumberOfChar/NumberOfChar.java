package javaPrograms.NumberOfChar;

import java.util.Scanner;

public class NumberOfChar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		noOfChar();
		while(true) {
			System.out.println("Want to continue choose 1 :: ");
			int choice = sc.nextInt();
			System.out.println("You choose the number :: " + choice);
			if(choice == 1) {
				noOfChar();
			}else if(choice > 1) {
				System.out.println("Program terminated!!");
				break;
			}
		}
	}

	private static void noOfChar() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the word :: ");
		String word = sc.next();
		int characters = word.length();
		System.out.println("No of Characters in given word :: " + characters);
	}
}
