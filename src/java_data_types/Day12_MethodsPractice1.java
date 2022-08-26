package java_data_types;

public class Day12_MethodsPractice1 {

	public static void main(String[] args) {
		int sum = task(); //95
		System.out.println(sum);
		
		int sum2 = task2(4, 3); //7
		System.out.println(sum2);
		
		boolean a = isRaining();
		System.out.println(a);
		
}
	private static boolean isRaining() {
		// TODO Auto-generated method stub
		return true;
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
