package PackaheOne;

import PackageTwo.ClassThree;

public class ClassOne {
	public int a1 = 10; 
	private int b1 = 20;
	int c1 = 90;
	
	public static void main(String[] args) {
		ClassOne c1 = new ClassOne();
		c1.methodSeven();
		System.out.println(c1.c1);
	
		
		
		
		ClassThree c3 = new ClassThree();
		
	}
	static void methodSeven() {
		System.out.println("this is method Seven");
	}

	public static void methodOne() {
		System.out.println("this is method 1");

	}
	private static void methodFour() {
		System.out.println("this is method 4");
	}

}
