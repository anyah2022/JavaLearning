package java_data_types;

public class Day10_ArraySum {

	public static void main(String[] args) {

		int[] numbers = { 2, 3, 4, 5, 6, 8, 9 };
		int sum = 0;
		for (int a = 0; a < numbers.length; a++) {
			sum = sum + numbers[a];
		}
		System.out.println("The sum is : " + sum);
		
		
		

		int[] salaries = { 200, 300, 500, 700, 1000 };
		int sum1 = 0;
		for (int A = 0; A < salaries.length; A++) {
			sum1 = sum1 + salaries[A];
		}
		System.out.println("the sum1 is :" + sum1);

	}

}
