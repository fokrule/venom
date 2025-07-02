package com.upskill.assignment_1;

public class assignment_1_1 {

	public static void main(String[] args) {
		// A triangle three arms are: 5, 7 and 11 inches. Write a method to display the perimeter of triangle in console output.
		perimeter(5, 7, 11);
	}
	
	public static void perimeter(int a, int b, int c ) {
		int d = a + b + c;
		System.out.println( "Perimeter of triangle is :" + d);
	}

}
