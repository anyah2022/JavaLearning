package java_data_types;

public class Day23_Strings {

	public static void main(String[] args) {
		
		String topic = new String("What is the topic we are learning today ?");
		
		int len = topic.length();
		System.out.println(topic.length());
		
		
		String name = "JOHN";
		String lastname = "King";
		System.out.println("this will print the length of name variable : " +name.length());
		System.out.println("this will print the name variable : " +name);
		String lowerName = name.toLowerCase();
		System.out.println("this will convert the name variable to lowercase : "+lowerName);
		System.out.println(topic.toUpperCase());
		System.out.println(name.equalsIgnoreCase(lastname));
		System.out.println("Using equals method : "+name.equals(lastname));
		System.out.println(name.compareTo(lastname));
		System.out.println(name.compareToIgnoreCase(lastname));
		
	}

}
