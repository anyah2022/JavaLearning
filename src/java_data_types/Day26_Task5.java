package java_data_types;

public class Day26_Task5 {

	public static void main(String[] args) {
	System.out.println(noSpaceSentence("Create a method that will take 1 String sentence as a parameter.Inside your method write a code that should return a String without any spaces."));
	System.out.println(returnNumberOfCharacters("12354654dhbfkshdbkjbGHJ$%^&*"));
	
	String a = "Today is a good day. It is Thursday. We have a Java Class";
	String[] sen = a.split("\\.");
	System.out.println(sen.length);
	}

	
	public static String noSpaceSentence(String sentence) {
		return sentence.replaceAll(" ", "");
		
	}
	
	public static int returnNumberOfCharacters(String words) {
		String specialCharacters = words.replaceAll("[A-Za-z0-9]", "");
		int specialCharacterCount = specialCharacters.length();
		return specialCharacterCount;
		
		
	}
}
