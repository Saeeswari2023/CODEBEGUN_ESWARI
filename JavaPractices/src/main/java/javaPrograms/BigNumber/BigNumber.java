package javaPrograms.BigNumber;

import java.util.Scanner;

public class BigNumber {

	static public void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		bigNumber();
		while(true) {
			System.out.println("Want to continue choose 1 :: ");
			int choice = sc.nextInt();
			System.out.println("You choose the number :: " + choice);
			if(choice == 1) {
				bigNumber();
			}else if(choice > 1) {
				System.out.println("Program terminated!!");
				break;
			}
		}
	}

	private static void bigNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an array of numbers :: ");
		String str = sc.nextLine();
		String[] split = str.split(",");
		System.out.println("Split " + split.length); //Split string length
		int max = Integer.parseInt(split[0]);
		
		for(int i=1;i<split.length;i++) {
			if(max < Integer.parseInt(split[i])) {
				max = Integer.parseInt(split[i]);
			}
		}
		System.out.println("Big number in an array :: " + max);
	}
}
