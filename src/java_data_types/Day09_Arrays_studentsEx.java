package java_data_types;

public class Day09_Arrays_studentsEx {

	public static void main(String[] args) {
		// int[] rollNumber; // declare a array variable
				// rollNumber = new int[5];
				
				int[] student = new int[5];
				
				student [0] = 100;
				student [1] = 200;
				student [2] = 300;
				student [3] = 400;
				student [4] = 500;
				System.out.println(student [4]);
				
				
				
				String [] ChineYear = new String [8];
				ChineYear [0] = "Monkey";
				ChineYear [1] = "Dog";
				ChineYear [2] = "Chicken";
				ChineYear [3] = "Rat";
				ChineYear [4] = "Snake";
				ChineYear [5] = "Dragon";
				ChineYear [6] = "Shark";
				ChineYear [7] = "Horse";

				System.out.println(ChineYear [6]);

				String [] FirstNames = new String [5];
				FirstNames [0]= "Aimal";
			    FirstNames [1]= "Anya";
				FirstNames [2]= "Ashiyana";
				FirstNames [3]= "Ali";
				FirstNames [4]= "Ayeda";
				System.out.println(FirstNames [3]);

				

				
				int[] rollNum = {100, 200, 300, 400, 500, 100, 200, 300, 400, 500};
				System.out.println(rollNum[3]);
				
				System.out.println(rollNum.length);
				 for (int i=0; i <rollNum.length; i++) {
					 System.out.println(rollNum[i]);
				 }

				 String [] FirstNames1 = new String [5];
					FirstNames1 [0]= "Aimal";
				    FirstNames1 [1]= "Anya";
					FirstNames1 [2]= "Ashiyana";
					FirstNames1 [3]= "Ali";
					FirstNames1 [4]= "Ayeda";
					for (int b = 0; b < FirstNames1.length; b++); {
						
					} int b;
					System.out.println(FirstNames1[5]);
					
					String[] Pets = { "Cat", "Dog", "Rabbit", "Bird", "Monkey" };
					System.out.println(Pets[4]);
					System.out.println(Pets.length);
					for (int A = 0; A < 5; A++) {
						System.out.println(Pets[A]);
					}
				 
	}
}
