package java_data_types;

interface example {
	void test();
	void test2();
	void test3();
	int a=10;
}

interface example3 extends example{
	void test4();
	
}
class example2 implements example3 {
	public void test() {
		System.out.println("this is a test method");
	}
	public void test2() {
		System.out.println("this is a test2 method");
	}
	public void test3() {
		System.out.println("this is a test3 method");
	}
	public void test4() {
		
	}
}

public class Day21_Interface {

	public static void main(String[] args) {
		
		example ex = new example2();
		ex.test();
		ex.test2();
		ex.test3();
		//direct way of creating an object
		example2 ex2 = new example2();
		ex2.test();
		ex2.test2();
		
		
	}

}
