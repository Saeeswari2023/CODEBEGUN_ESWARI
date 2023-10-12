package javaPrograms.NumberOfWords;

import java.util.Scanner;

public class NumberOfWords {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		noOfWords();
		while(true) {
			System.out.println("Want to continue choose 1 :: ");
			int choice = sc.nextInt();
			System.out.println("You choose the number :: " + choice);
			if(choice == 1) {
				noOfWords();
			}else if(choice > 1) {
				System.out.println("Program terminated!!");
				break;
			}
		}
	}

	private static void noOfWords() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sentence :: ");
		String str = sc.nextLine();
		String[] split = str.split(" ");
		int len = split.length;
		System.out.println("No of words in given sentence :: " + len);
	}
}
