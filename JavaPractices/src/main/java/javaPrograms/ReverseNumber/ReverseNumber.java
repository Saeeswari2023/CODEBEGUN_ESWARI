package javaPrograms.ReverseNumber;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input :: ");
		String input = sc.next();
		String[] split = input.split("");
		String reverse = "";
		
//		while(input != 0) {
//			reverse = reverse * 10;
//			reverse = reverse + (input % 10);
//			input = input / 10;
//		}
//		System.out.println("Reverse of given input number is :: " + reverse);
		for(int i=0;i<split.length;i++) {
			reverse = split[i] + reverse;
		}
		System.out.println("Reversed String is :: " + reverse);
	}

}
