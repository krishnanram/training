package ch16moderate.Q16_01_Number_Swapper;
//QE16.1
public class NumberSwapper {
	
	public static void main(String[] args) {
		
		int a = 10 ;
		int b = 20 ;
		System.out.println("A:" +a + "B:"+b);

		swap(a,b);
		
	}
	
	private static void swap(int a, int b ) {
		
		a = a-b;
		b = b + a ;
		a = b -a ;
		
		System.out.println("A:" +a + "B:"+b);
		
	}
	
}