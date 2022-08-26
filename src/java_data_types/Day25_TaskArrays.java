package java_data_types;

public class Day25_TaskArrays {

	public static void main(String[] args) {

		
		String sentence = "We are practicing more STRINGS ";
		String[] words = sentence.split(""); 
		
		
		for(int a=0;a<words.length;a++) {
			String word = words[a];
			char[] characs = word.toCharArray();
			for(int b=0;b<characs.length;b++) {
			System.out.println(characs[b]);
	}
			System.out.println("***************");
		}

    }
}