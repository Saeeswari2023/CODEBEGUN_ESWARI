package javaPrograms.OddAndEvenProgram;

import java.util.Scanner;

public class OddAndEven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input :: ");
		int input = sc.nextInt();
		for(int value=0; value<=input; value++) {
			if(value % 2 == 0) {
				System.out.println("Even number is :: " + value);
			}else {
				System.out.println("Odd number is :: " + value);
			}
		}
	}

}
