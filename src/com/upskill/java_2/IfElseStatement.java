package com.upskill.java_2;

public class IfElseStatement {

	public static void main(String[] args) {
		int age = 105;
		
		if (age < 13){									//Conditional Statement
			System.out.println("You are children");
		} else if(age>=13 && age <18){
			System.out.println("You are Teenager");
		} else if(age>=60){								//Nested if else
			if (age<100){
				System.out.println("You are Senior");
			} else {
				System.out.println("You are Champion");
			}
		} else {
			System.out.println("You are adult");
		}

	}

}
