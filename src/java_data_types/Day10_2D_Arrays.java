package java_data_types;

public class Day10_2D_Arrays {

	public static void main(String[] args) {
		
		
		String [][] _countries = {
				{"USA", "Canada"},
				{"France", "Switzerland", "Ireland"},
				{"Germani", "England"}
		};
		
			System.out.println(_countries.length);
			
			for(int rows=0; rows <_countries.length; rows++) {
				for(int column = 0; column < _countries[rows].length; column++) {
					System.out.println(_countries[rows][column]);
				}
			}
			
			String [][] names = {
					{"Anya", "Marina"},
					{"Irina", "Marta", "Olga"},
					{"Tanya", "Manya"}
			};
			
				System.out.println(names.length);
				
				for(int rows=0; rows <names.length; rows++) {
					for(int column = 0; column < names[rows].length; column++) {
						System.out.println(names[rows][column]);
					}
			
			
	}

 }
}
