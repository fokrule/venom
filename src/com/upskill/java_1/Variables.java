package com.upskill.java_1;

public class Variables {

	public static void main(String[] args) {
		//	Variables in Java:
		//	Instance OR global variable - Variables declared in Class level, outside method
		//	Static variable - variables belong to class and don't required creating object
		//	Local variable - variables declared in methods 
		//	Method parameter - variables used as method parameter
		
		System.out.println(region);
		Variables obj = new Variables();			// Object = ClassName ObjectName = new ClassName();
		System.out.println(obj.country);
		
		obj.nj("John");
		obj.ny();
		obj.CT();
	}
	
	String country = "USA";							//Global variable - Variables declared in Class level, outside method
	static String region = "North America";			//Static variable - variables belong to class and don't required creating object
	
	public void ny(){
		String city = "Jackson Heights";			//Local variable - variables declared in methods
		String county = "Queens";
		System.out.println(county);
	}
	
	public void nj(String mayor){					//Method parameter - variables used as method parameter
		String city = "Paterson";					//Local variable - variables declared in methods
		String county = "Essex";
		System.out.println(mayor);
	}
	
	public void CT(){
		String city = "Stamford";					//Local variable - variables declared in methods
		String county = "Fairfield";
		System.out.println(country);
	}
	
	// note to remember 
	/*
	 * Static variable can be access from static function without creating object
	 * public can't be accessed from static function without creating object
	 * */

}
