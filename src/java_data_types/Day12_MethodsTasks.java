package java_data_types;

public class Day12_MethodsTasks {

	public static void main(String[] args) {
		
		int sum = task(); //95
			if(sum%2==0) {
				System.out.println("the sum is even");
			} else {
				System.out.println("the sum is odd");
			}
	}
	public static int task() {
		int a = 5;
		int b = 90;
		int sum = a+b;
		return sum;
		

	}
	public static int task2(int a, int b) {
		int sum = a+b;
		return sum;
		
	}

}
