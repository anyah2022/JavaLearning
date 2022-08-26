package java_data_types;

public class Day10_2D_Array {

	public static void main(String[] args) {
		
		String[][] countries = new String[2][2];
		countries [0][0] = "USA";
		countries [0][1] = "Canada";
		countries[1][0] = "France";
		countries[1][1] = "Mexico";
		
		System.out.println(countries[1][1] );
		System.out.println(countries[1][0]);

		
		int [][] Salary = new int [2][3];
		Salary [0][0] = 10000;
		Salary [0][1] = 20000;
		Salary [1][0] = 30000;
		Salary [1][1] = 40000;
		Salary [0][2] = 50000;
		System.out.println(Salary[0][1]);
		
		String [][] _countries = {
				{"USA", "Canada"},
				{"France", "Switzerland"},
				{"Germani", "England"}
		};
		System.out.println(_countries[0][0]);
		System.out.println(_countries[2][1]);

	}

}
