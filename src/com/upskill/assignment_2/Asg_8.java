package com.upskill.assignment_2;

public class Asg_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Asg_8 obj = new Asg_8();
		System.out.println(obj.factorial(5));

	}

	private int factorial (int number) {
		if ( number == 0 || number == 1 ) {
			return 1;
		}
		else {
			return number * factorial(number-1);
		}
	}
}
