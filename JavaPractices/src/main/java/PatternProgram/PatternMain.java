package PatternProgram;

import java.util.Scanner;

public class PatternMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a value :: ");
		int n = sc.nextInt();
		String s = "";
		
		PatternAscending ascending = new PatternAscending();
		ascending.patternOne(n,s);
		ascending.patternTwo(n,s);
		ascending.patternThree(n,s);
		ascending.patternFour(n,s);
		
		while(true) {
			System.out.println("If you want to continue enter 1:: ");
			int choice = sc.nextInt();
			System.out.println("Given choice is :: " + choice);
			if(choice == 1) {
				System.out.println("Enter your input :: ");
				int next_num = sc.nextInt();
				ascending.patternOne(next_num,s);
				ascending.patternTwo(next_num,s);
				ascending.patternThree(next_num,s);
				ascending.patternFour(next_num,s);
			}else if(choice > 1) {
				System.out.println("Program terminated!!");
				break;
			}
		}
	}
}
