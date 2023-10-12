package javaPrograms.Conditions;

import java.util.Scanner;

public class IfElseConditionCheck {

	public void ifElseTwo() {
		int eligibleMarks = 50;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Marks :: ");
		int studentMarks = sc.nextInt();
		
		if(studentMarks >= eligibleMarks) {
			System.out.println("You are eligible for this category,congratulations!!");
		}else {
			System.out.println("you are not eligible,'Better Luck Next Time'");
		}
	}

}
