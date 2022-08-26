package java_data_types;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		// 
		Scanner getInput = new Scanner(System.in);
		System.out.println("enter first value: ");
		
		int aa = getInput.nextInt();
		System.out.println("enter the second value: ");
		int bb = getInput.nextInt();
		
		System.out.println("enter the third value: ");
		int cc = getInput.nextInt();
		
		int dd = aa+bb+cc;
		System.out.println("the sum is : "+dd);
		
		
		
	}

}
