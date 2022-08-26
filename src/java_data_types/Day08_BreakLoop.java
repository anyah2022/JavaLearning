package java_data_types;

public class Day08_BreakLoop {

	public static void main(String[] args) {
		 int a = 0;
		 do {
			 System.out.println("Hello");
			 if(a==10) {
				 System.out.println("the value of a is 5");
				 break;
			 }
			 a++;
		 } while(a <=15);
	}

}
