package java_data_types;

public class Day12_Methods {

	public static void main(String[] args) {
//		name();
		
		//argument
//		name2("John");
//		name2("ali");
//		name2("ken");
//		
//		name3("John", 25);
//		name3("Mike", 35);
//		name3("Lucy", 40);
//		
	
	String a = day(); // in return is going to give a string value
	System.out.println(a);
	
	System.out.println(day());
	
	 String b = month(); //August
	 System.out.println(b);
	}
	public static String day() {
		String todayDay = "Tuesday";
		return todayDay;
	
	}
	public static String month() {
		return "August";
		
		
		}


	//method without parameter
	public static void name() {
		System.out.println("Me name is Anya");
	}
	
	//method with parameter
	public static void name2(String a) {
		System.out.println("Me name is "+ a);
	}
	//method with 2 parameters
	public static void name3(String name, int age) {
		System.out.println(name + " is " + age + " years old.");
	}

}
