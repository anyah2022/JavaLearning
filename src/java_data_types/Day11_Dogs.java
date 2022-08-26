package java_data_types;

public class Day11_Dogs {
	String breed;
	String size;
	String color;
	int age;

	public static void main(String[] args) {
		// classname objname = new classname ();
		
		Day11_Dogs dog1 = new Day11_Dogs();
		dog1.breed ="German shepherd";
		dog1.size = "Big";
		dog1.color = "Black / Brown";
		dog1.age = 3;
		
		Day11_Dogs dog2 = new Day11_Dogs();
		dog2.breed ="chow chow";
		dog2.size = "Small";
		dog2.color = "Brown";
		dog2.age = 2;
		
		System.out.println(dog1.breed);
		System.out.println(dog1.size);
		System.out.println(dog1.age);
		System.out.println(dog1.color);
		System.out.println(dog2.breed);
		System.out.println(dog2.size);
		System.out.println(dog2.age);
		System.out.println(dog2.color);

	}

}
