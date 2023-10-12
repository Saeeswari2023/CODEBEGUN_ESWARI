package javaPrograms.exceptionHandling;

import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println(1/1);
			System.out.println(args[0]);
		}catch(ArithmeticException a) {
			System.out.println("Arithmetic Exception :: ");
		}catch(Exception e) {
			System.out.println("Array Index Out of Bound Exception :: ");
		}finally {
			System.out.println("Finally block :: ");
			sc.close();
		}
	}
}
