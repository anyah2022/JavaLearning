package java_data_types;

public class Day04_NestedIF_Example2 {

	public static void main(String[] args) {
		// if the person's age is less than 18, he can apply for learned
		// and if age is greater than 18 then he can apply for driving license
		// if the age is greater than 21 he can start working 
		// if the age is greater than 65 he is ready to retire
		
		int age = 65;
		String name = "John";
		
		 if (age < 18) {
			 System.out.println(name + " can apply for learner's permit.");
		 } else {
			 System.out.println(name + " is greater than age 18, He can apply for driving licanse");
			 if (age < 21) {
				 System.out.println(name + " is less than 21. You are not ready to work");
			 } else {
				 System.out.println(name + " is greater than 21. you can start working");
				 if(age < 65) {
					 System.out.println(name + " can continue to work.");
				 } else {
					 System.out.println(name + " is ready to retire.");
				 }
			 }
		 }
	
   }

}
