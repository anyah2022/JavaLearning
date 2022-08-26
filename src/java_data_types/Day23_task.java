package java_data_types;

public class Day23_task {

	public static void main(String[] args) {
		String firstname = "Anya";
		String lastname = "Hauk";
		System.out.println("The length of first name is :"+firstname.length());
		System.out.println("The length of last name is :" + lastname.length());
		
		int len = lastname.length();
		System.out.println(firstname.compareTo(lastname));
		
		if (len <= 0) {
				System.out.println("The value is negative");
		} else {
			System.out.println("The value is positive");
		}
		
		

	}

}
