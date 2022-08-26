package java_data_types;

public class Day05_SwitchCase {

	public static void main(String[] args) {
	// starts here	
		String day = "sunday";
		
		switch(day) {
		
		case "monday":
			System.out.println("1st day of the week");
			break;
		case "tuesday":
			System.out.println("2st day of the week");
			break;
		case "wednesday":
			System.out.println("3st day of the week");
			break;
		case "thursday":
			System.out.println("4st day of the week");
			break;
		case "friday":
			System.out.println("5st day of the week");
			break;
		case "saturday":
			System.out.println("6st day of the week");
			break;
		case "sunday":
			System.out.println("7st day of the week");
			break;
		default:
			System.out.println("You have entered an invalid day.");
		
		}
		//ends here
		
		int age = 1;
		switch(age) {
		case 1:
			System.out.println("the value is 1");
			break;
		case 2:
			System.out.println("the value is 2");
			break;
		case 3:
			System.out.println("the value is 3");
			break;
		case 4:
			System.out.println("the value is 4");
			break;
		case 5:
			System.out.println("the value is 5");
			break;
			default:
				System.out.println("the value is something else");
		}
	//ends here
		
		char gender = 'F';
		switch(gender) {
		case 'F':
			System.out.println("The employee gender is Female");
			break;
		case 'M':
			System.out.println("the employee gender is Male");
		break;
		default:
			System.out.println("You have entered incorrect gender");
		}
	}

}
