package java_data_types;

public class DAy19_This_Keyword {

	
	int rollNum;
	String name;
	float fee;
	
	DAy19_This_Keyword() {
		System.out.println("Hello this is default constructor");
	}
	
	DAy19_This_Keyword(int rollNum, String name, float fee) {
		this();
		this.rollNum = rollNum;
		this.name = name;
		this.fee = fee;
	}
	
	void displayData() {
		System.out.println("Roll Num :" +rollNum);
		System.out.println("Name :" +name);
		System.out.println("Fee :" +fee);

	
	}

}