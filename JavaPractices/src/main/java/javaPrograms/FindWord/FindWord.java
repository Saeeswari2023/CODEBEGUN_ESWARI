package javaPrograms.FindWord;

import java.util.Scanner;

public class FindWord {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentence :: ");
		String str = sc.nextLine().toLowerCase();
		String[] splitString = str.split(" ");
		System.out.println("String length :: " + splitString.length);
		System.out.println("Enter search word :: ");
		String word = sc.next().toLowerCase();
		findWord(str,splitString,word);
		
		while(true) {
			System.out.println("If no match found press 1 :: ");
			int choice = sc.nextInt();
			System.out.println("Given choice is :: " + choice);
			if(choice == 1) {
				System.out.println("Enter search word :: ");
				String nextWord = sc.next();
				findWord(str,splitString,nextWord);
			}else if(choice > 1) {
				System.out.println("Program Terminated !!");
				break;
			}
		}
	}
	private static void findWord(String str, String[] splitString, String word) {
		boolean wordFound = false;
		for(int i=0; i<splitString.length; i++) {
			if(splitString[i].equals(word)) {
				System.out.println("Matched word :: " + splitString[i]);
				wordFound = true;
			}
		}
		if(!wordFound) {
			System.out.println("No word found");
		}
		
	}
}
