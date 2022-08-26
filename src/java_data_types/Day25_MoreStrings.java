package java_data_types;

public class Day25_MoreStrings {

	public static void main(String[] args) {
		String words = "BEFTljhgh3g14l3h5b3l6jhb456lj %^&**(";
		String noNumbers = words.replaceAll("[0-9]", "");
		System.out.println("Before removing[0-9] numbers : "+words);
		System.out.println("After removing [0-9] numbers : " +noNumbers);
		
		String noUpperCase = words.replaceAll("[A-Z]", "");
		System.out.println("after removing [A-Z] characters : " +noUpperCase);
		
		String noLowerCase = words.replaceAll("[a-z]", "");
		System.out.println("after removing [a-z] characters : " +noLowerCase);
		
		
		String onlySpecialCharacters = words.replaceAll("[A-Za-z0-9]", "");
		System.out.println("this will show special characters only : " +onlySpecialCharacters);
		
		String showNumbersOnly = words.replaceAll("[^0-9]", "");
		System.out.println(showNumbersOnly);
		
		String showUpperCaseOnly = words.replaceAll("[^A-Z]", "");
		System.out.println(showUpperCaseOnly);
		
		String showLowerCaseOnly = words.replaceAll("[^a-z]", "");
		System.out.println(showLowerCaseOnly);
		
	}
	

}
