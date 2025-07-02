package com.upskill.assignment_2;

public class Asg_3 {

	public static void main(String[] args) {
		/*
		 * Write two java functions which will return two different integer values,
		 * write a program to compare those numbers and send message that one number is
		 * bigger than other. (hints: using if..else)
		 */
		if ( firsNmuber() > secondNumber() ) {
			System.out.println("First number is bigger");
		}
		else {
			System.out.println("Second number is bigger");
		}

	}

	private static int firsNmuber() {
		return 52;
	}
	
	private static int secondNumber() {
		return 6;
	}
	
}
