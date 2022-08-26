package java_data_types;

import java.util.Scanner;

public class Day06_anotherTest {

	public static void main(String[] args) {
		// Lets do this
		Scanner aa = new Scanner(System.in);

		System.out.println("Plesase enter the first value: ");
		int a = aa.nextInt();

		System.out.println("Please enter the second value: ");
		int b = aa.nextInt();
		
		System.out.println("What operation would you like to perform? : ");

		char input = aa.next().charAt(0);
				
		if(input == '+') {
			System.out.println(a+b);
			
		} else if(input == '-') {
			System.out.println(a-b);
		} else if(input == '/') {
			System.out.println(a/b);
		} else if(input == '*') {
			System.out.println(a*b);
		} else 
			System.out.println("you have enterred an invalid operation");

	}

}
