package com.upskill.assignment_2;

public class Asg_6 {

	public static void main(String[] args) {
		// Write a java program to find the prime number from 1 to 100 and print them
		
		for ( int i = 2; i <= 100; i++ ) {
			if ( i == 2 ) {
				System.out.println(i);
			}
			else {
				boolean isPrime = true;
				for ( int j = 2; j < i; j++ ) {
					if ( i % j == 0 ) {
						isPrime = false;
						break;
					}
				}
				if ( isPrime ) {
					System.out.println(i);
				}
			}
		}

	}

}
