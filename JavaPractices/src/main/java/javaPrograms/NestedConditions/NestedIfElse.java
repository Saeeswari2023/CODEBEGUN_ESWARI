package javaPrograms.NestedConditions;

import java.util.Scanner;

public class NestedIfElse {

	public static void main(String[] args) {
		int qualifyMarks = 35;
		char grade;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your marks :: ");
		int marks = sc.nextInt();
		
		if(marks >= qualifyMarks) {
			if(marks >= 90) {
				grade = 'A';
			}else if(marks >= 75) {
				grade = 'B';
			}else if(marks >= 60) {
				grade = 'C';
			}else {
				grade = 'D';
			}
			System.out.println("You passed the exam and the grade is :: " + grade);
		}else {
			grade = 'F';
			System.out.println("You failed the exam and the grade is :: " + grade);
		}
	}

}
