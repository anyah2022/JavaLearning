package java_data_types;

public class Day23_Task2 {

	public static void main(String[] args) {
		String firstname = "Anya";
		String lastname = "Hauk";
		
		int len = lastname.length();
		System.out.println(firstname.compareTo(lastname));
		System.out.println(firstname.compareToIgnoreCase(lastname));
		
		if (len < 0) {
				System.out.println("The value is negative");
		} else 
		if (len > 0) {
			System.out.println("The value is positive");
		}else
			System.out.println("the value is 0");
		
		}
		


	}

