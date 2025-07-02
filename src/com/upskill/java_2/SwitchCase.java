package com.upskill.java_2;

public class SwitchCase {

	public static void main(String[] args) {
		int day = 6;
		
		switch (day) {
			case 1: 
				System.out.println("Today is Monday");
				break;
			case 2: 
				System.out.println("Today is Tuesday");
				break;
			case 3: 
				System.out.println("Today is Wednesday");
				break;
			case 4: 
				System.out.println("Today is Thursday");
				break;
			case 5: 
			case 6:
				System.out.println("Today is Friday");
				break;
			default: 
				System.out.println("Today is Holoday");
				break;
		}
		
		String name = "atm";
		
		String printName = switch (name) {
			case "forhad", "atm" -> "Fokrule"; 
			default -> "Not Fokrule Maybe";
		};
		System.out.println(name);
	}
}
