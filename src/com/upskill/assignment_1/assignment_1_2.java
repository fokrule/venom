package com.upskill.assignment_1;

public class assignment_1_2 {

	public static void main(String[] args) {
		// A rectangle width and length are: 9 and 13 inches. Write a method to display the perimeter of rectangle in console output.
		assignment_1_2 ob = new assignment_1_2();
		System.out.println("perimeter of rectangle is : " + ob.rectenglePerimeter(9, 13));
	}

	public int rectenglePerimeter( int a, int b) {
		int d = 2 * ( a+b );
		return d;
	}
}
