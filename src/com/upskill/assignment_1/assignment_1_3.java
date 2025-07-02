package com.upskill.assignment_1;

public class assignment_1_3 {

	public static void main(String[] args) {
		//  A function which returns the multiply value of a and b where a = 9 and b = 11.      
		// Write a program which will display addition of a +b + function returns value.
		assignment_1_3 ob  = new assignment_1_3();
		int e = ob.returnMultiplyValue(9, 11);
		additonValue(9,11,e);
	}
	
	public int returnMultiplyValue( int a, int b ) {
		return a*b;
	}
	
	public static void additonValue (int a, int b, int c) {
		int d = a + b + c;
		System.out.println("Addition Value : " + d );
	}

}
