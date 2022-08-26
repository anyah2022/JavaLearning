package java_data_types;


public class Day24_Task1 {

	public static void main(String[] args) {
		
		taskOne("Hello");
		taskOne("USA");
		taskTwo("abcdef");
		System.out.println(taskThree("anya", "hauk"));
		System.out.println(taskThree("Anya", "Anya"));
	
		}
			 public static void taskOne(String word) { 
				 
				 int wordLength = word.length();
				 if(wordLength >= 5) {
					 if (wordLength % 2 == 1) {
						int center =  wordLength / 2;
						System.out.println(word.substring(center, center + 1));
			 }
		 }
			 
	}
			 
 public static void taskTwo (String word) { 
				 
				 int wordLength = word.length();
				 if(wordLength > 5) {
					 if (wordLength % 2 == 0) {
						int center =  wordLength / 2;
						System.out.println(word.substring(center - 1, center + 1));
			 }
		 }
			 
	}
 public static boolean taskThree(String valueOne, String valueTwo ) {
	 return valueOne.equals(valueTwo);
	 
 }
}
			
