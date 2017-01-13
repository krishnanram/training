package lab02;

public class Test {

	public static int squareit(int y) {
		return y * y ;
	}


	public static void main (String... args) {
		
		Interface1 i1  = y -> { System.out.println ( y * y ); } ;
		i1.printSquareOfA(3);
		
		Interface2 i2 = Test::squareit ;
		System.out.println(i2.getSquareOfA(5));
	}
	
}
