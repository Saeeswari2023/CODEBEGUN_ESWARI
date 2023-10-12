package javaPrograms.Loops;

import java.util.Scanner;

public class WhileLoopMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input :: ");
		int input = sc.nextInt();
		int i = 0;
		while(i < input) {
			System.out.println("You entered input is :: " + i);
			i++;
		}
		System.out.println("Out of the loop");
	}
}
