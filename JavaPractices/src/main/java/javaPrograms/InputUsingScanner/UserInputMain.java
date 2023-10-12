package javaPrograms.InputUsingScanner;

import java.util.Scanner;

public class UserInputMain {

	public static void main(String[] args) {
		int integer; String str; float f;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter String :: ");
		str = sc.nextLine();
		System.out.println("String Value :: " + str);
		
		System.out.println("Enter Integer :: ");
		integer = sc.nextInt();
		System.out.println("Integer Value :: " + integer);
		
		System.out.println("Enter Float :: ");
		f = sc.nextFloat();
		System.out.println("Float Value :: " + f);
	}

}
