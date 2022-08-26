package java_data_types;

import java.util.Scanner;

public class Day07_Loops {

	public static void main(String[] args) {

		Scanner monthInput = new Scanner(System.in);
		for (int a = 0; a < 3; a++) {
		System.out.println("PLEASE ENTER THE MONTH YOU WERE BORN :    ");
		
		
		String monthName = monthInput.next();
		if (monthName.equals("Jan") || monthName.equals("Feb") || monthName.equals("Mar")) {
			System.out.println("You were born in winter");
			
		
		} else if (monthName.equals("Apr") || monthName.equals("May") || monthName.equals("Jun")) {
			System.out.println("You were born in Spring");

		} else if (monthName.equals("Jul") || monthName.equals("Aug") || monthName.equals("Sep")) {
			System.out.println("You were born in Summer");

		} else if (monthName.equals("Oct") || monthName.equals("Nov") || monthName.equals("Dec")) {
			System.out.println("You were born in Fall");
		} else {
			System.out.println(" Provide a valid month");
		}
	}
  }
}