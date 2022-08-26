package java_data_types;

import java.util.Scanner;

public class Day10_ArraysHomework {

	public static void main(String[] args) {
		//we are getting input from the user
		
		Scanner getInput = new Scanner(System.in);
				System.out.println("how many values do you need: ");
				int values = getInput.nextInt();
				
				int[] arr = new int[values];
				int sum =0;
				
				for(int i=0; i<arr.length; i++) {
					System.out.println("enter the" +(i+1) + "value : ");
					arr[i] = getInput.nextInt();
					sum = sum + arr[i];
					
				}
				System.out.println("The sum of " +arr.length+" values is : "+sum);
				

	}

}
