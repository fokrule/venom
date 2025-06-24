package com.upskill.java_1;

public class MethodType {

	/*
	 * Types of Methods
	 * 1. Void Method
	 * Static Method
	 * Return type method
	 * */
	public static void main(String[] args) {
		
		MethodType obj = new MethodType();
		obj.annualIncome();
		System.out.println("My Monthly Income is : " + obj.monthlyIncomeReturn());
		MethodType.weeklyIncomeStatic();
		
		

	}
	
	public static int hourlyRate  = 90;
	
	//void method 
	public void annualIncome ()
	{
		int totalAnnualIncome = hourlyRate * 2000;
		System.out.println("My yearly Income is : " + totalAnnualIncome);
	}
	
	// return type method
	public int monthlyIncomeReturn() {
		return hourlyRate * 200;
	}
	
	// static method
	public static void weeklyIncomeStatic () {
		System.out.println("My weekly Income is : " + hourlyRate*40);
	}
}
