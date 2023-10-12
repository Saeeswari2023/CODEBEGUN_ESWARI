package javaPrograms.Loops;

import java.util.Scanner;

public class SimpleForLoop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input :: ");
		int input = sc.nextInt();
		
		for(int i=0;i<=input;i++) {
			System.out.println("Given Range of number is : " + i);
		}
	}

}
