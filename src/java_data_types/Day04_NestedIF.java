package java_data_types;

public class Day04_NestedIF {

 
	public static void main(String[] args) {
	 // VP 200000 Sr/ Jr, IT_PROG 12000, ANALYST 8000
		
		String title = "VP";
		String role = "junior";
		
		if (title == "VP") {
			System.out.println("Vice President");
			if (role == "junior") {
				System.out.println("salary is $200,000");
			} else if (role == "senior") {
				System.out.println("Salary is 250,000");
			} else {
				System.out.println("The role does not exist.");
			}
		} else if (title == "IT_PROG") {
			System.out.println("It Programmer");
			
			if (role =="junior") {
				System.out.println("salary is $120,000");
			}
		}
		
}
	

	}

