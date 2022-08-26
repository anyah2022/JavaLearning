package java_data_types;

import java.util.Scanner;

public class Day05_scanner {

	public static void main(String[] args) {
		// create an object / instance of the class
		
		//classname objectname = new classname();
		Scanner getInput = new Scanner(System.in);
		//getInput in the object of the scanner class.
		
		System.out.println("Enter the first value: ");
		//scanner class has methods which takes the int value as an input
		int aa =getInput.nextInt();
		
		System.out.println("Enter the second value: ");
		int bb = getInput.nextInt();
		
		int cc = aa+bb;
		System.out.println("the sum is :" + cc);

	}

}
