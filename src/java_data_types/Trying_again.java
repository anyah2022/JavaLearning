package java_data_types;

public class Trying_again {

	public static void main(String[] args) {
		//// if the person is 18 and above - he can work in the casino
		// if the person is 16 he can get a drivers license
		// if the person is 21 and older, she can buy alcohol
		// if the person is 18 he is graduating school
		
		int age = 25;
		String name = "Alexa";
		
		 if (age < 16) {
			 System.out.println(name + " has to continue going to school.");
		 } else {
			 System.out.println(name + " is greater than age 16, she can apply for driving license");
			 if (age >= 18) {
				 System.out.println(name + " can work in the casino in CA");		 
				 } else {
				 System.out.println(name + " is to young for this job and Should focus on other professions");			 
			 if(age >= 21) {
				 System.out.println(name + " can buy alcohol.");
				 } else {
				System.out.println(name + " cannot buy alcohol.");
				 }
			 }
		 }
	
   }

}
