package javaPrograms.Operators;

import java.util.Scanner;

public class ArthimaticOperators {

	public static void main(String[] args) {
		int inputOne,inputTwo;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter inputOne and inputTwo :: ");
		inputOne = sc.nextInt();
		inputTwo = sc.nextInt();
		add(inputOne,inputTwo);
		sub(inputOne,inputTwo);
		mul(inputOne,inputTwo);
		div(inputOne,inputTwo);
		mod(inputOne,inputTwo);
	}

	private static void mod(int inputOne, int inputTwo) {
		System.out.println("Modulus of two numbers is :: " + (inputOne % inputTwo));
	}

	private static void div(int inputOne, int inputTwo) {
		System.out.println("Division of two numbers is :: " + (inputOne / inputTwo));
	}

	private static void mul(int inputOne, int inputTwo) {
		System.out.println("Multiplication of two numbers is :: " + (inputOne * inputTwo));
	}

	private static void sub(int inputOne, int inputTwo) {
		System.out.println("Subtraction of two numbers is :: " + (inputOne - inputTwo));
	}

	private static void add(int inputOne, int inputTwo) {
		System.out.println("Addition of two numbers is :: " + (inputOne + inputTwo));
	}

}
