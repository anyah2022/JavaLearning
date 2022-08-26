package java_data_types;

public class Iphone extends Phone_java {

	public static void main(String[] args) {
		Iphone mob1 = new Iphone();
		mob1.imei =234457776;
		mob1.make = "Apple";
		mob1.model = "Iphone 13";
		mob1.color = "Red";
		mob1.memory = 64;
		mob1.camera = "20";
		
		mob1.makecalls();
		

	}

}
