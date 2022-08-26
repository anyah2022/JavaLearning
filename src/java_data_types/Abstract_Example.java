package java_data_types;

abstract class DogType {
	abstract void color();

	abstract void age();

	abstract void size();

}

abstract class dog extends DogType {
	void color() {
		System.out.println("The dog color method");
	}

	void age() {
		System.out.println("the dog age method");

	}

	abstract void size();
}

class brand1 extends dog {
	void dimension() {
		System.out.println("this is a dimension method");
	}

	void weight() {
		System.out.println("this is a weight method");
	}

	void size() {
		System.out.println("this is a size method");
	}
}

public class Abstract_Example {

	public static void main(String[] args) {
		brand1 q = new brand1();
		q.color();
		q.age();
		q.size();
	}
}
