package java_data_types;

abstract class Day22_Shape {

	abstract int RectangleArea (double length, double width);
	abstract int SquareArea (double side);
	abstract int CircleArea (double R);
}
	
	class Area extends Day22_Shape {
		
	 int RectangleArea (double length, double width) {
		 double R = length * width;
		 System.out.println("The rectangle Area is :" + R );		
	}
	 int SquareArea (double side) {
	  double S = side * side;
	  System.out.println("The SquareArea is :" +S + "m2");
	  }
	 
	   int CircleArea (double R) {
		 double CA = 2*3.14*R;
		 System.out.println("The CircleArea is :" + CA + "m2");
	 }
	 


	public static Day22_Shape_Main {
		

		public static void main(String[] args) {
		Area a = new Area();		
		a.RectangleArea(0, 0);
		a.SquareArea(0);
		a.CircleArea(0);
		
		}
	}
}	