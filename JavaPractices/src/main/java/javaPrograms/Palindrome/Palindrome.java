package javaPrograms.Palindrome;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		palindrome();
		
		while(true) {
			System.out.println("If given string is not palindrome press 1 or press any other:: ");
			int choice = sc.nextInt();
			System.out.println("Given choice is :: " + choice);
			if(choice == 1) {
				palindrome();
			}else if(choice > 1) {
				System.out.println("Program Terminated !!");
				break;
			}
		}
	}

	private static void palindrome() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String :: ");
		String s = sc.nextLine().toLowerCase();
	    String res = "";
	    for(int i=0;i<s.length();i++) {
	    	res = s.charAt(i) + res;
	    }
	    if(res.equals(s)) {
	    	System.out.println("Palindrome");
	    }else {
	    	System.out.println("Not a Palindrome");	
	    }
	}
}
