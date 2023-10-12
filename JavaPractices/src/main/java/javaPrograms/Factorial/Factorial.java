package javaPrograms.Factorial;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input :: ");
		int input = sc.nextInt();
		int fact = 1;
		
		if(input < 0) {
			System.out.println("Input should not be negative");
		}else {
			for(int nextNum=2;nextNum<=input;nextNum++) {
				fact *= nextNum;
			}
			System.out.println("Factorial value is :: " + fact);
		}
	}

}
