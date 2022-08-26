package java_data_types;

import java.util.Scanner;

public class Day06_Scanner {

	public static void main(String[] args) {
		// how to create an object
		// classname objectname = new classname()
		
		Scanner takeInput = new Scanner(System.in);
		System.out.println("Enter the int value : ");
		int val1 = takeInput.nextInt();
		System.out.println("the enterred value is: "+val1);
		
		//nextBoolean (true, false)
		System.out.println("Is it raining outside : ");
		boolean val2 = takeInput.nextBoolean(); //true or false
		System.out.println("If it is true it is raining, if its false then its not raining : "+val2);
		
		//nextlife (String)
		System.out.println("Enter your name : ");
		String name = takeInput.next();
		System.out.println("the name you enterred is : "+name);
		
		//nextBite
		System.out.println("Enter your age: ");
		byte age = takeInput.nextByte();
		System.out.println("Your age is : "+age);
		
		//nextDouble
		System.out.println("Please enter the cash amount : ");
		double cash = takeInput.nextDouble();
		System.out.println("You have a balance of :"+cash);
		
		//nextFloat		
		System.out.println("what is the Air temperature today? : ");
		float temp = takeInput.nextFloat();
		System.out.println("The air temp is : "+temp);
		
		//nextShort
		System.out.println("How much would you like to deposit? : ");
		short deposit = takeInput.nextShort();
		System.out.println("You deposit amount is : "+deposit);
		
		   
		
	

	}

}
