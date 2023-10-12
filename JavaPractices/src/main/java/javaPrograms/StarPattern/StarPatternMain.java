package javaPrograms.StarPattern;

import java.util.Scanner;

public class StarPatternMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a value :: ");
		int n = sc.nextInt();
		String s = "";
		
		StarPatternMethod pattern = new StarPatternMethod();
		pattern.patternOne(n,s);
		pattern.patternTwo(n,s);
		pattern.patternThree(n,s);
		pattern.patternFour(n,s);
		
		while(true) {
			System.out.println("If you want to continue enter 1:: ");
			int choice = sc.nextInt();
			System.out.println("Given choice is :: " + choice);
			if(choice == 1) {
				System.out.println("Enter your input :: ");
				int next_num = sc.nextInt();
				pattern.patternOne(next_num,s);
				pattern.patternTwo(next_num,s);
				pattern.patternThree(next_num,s);
				pattern.patternFour(next_num,s);
			}else if(choice > 1) {
				System.out.println("Program terminated!!");
				break;
			}
		}
	}

}
