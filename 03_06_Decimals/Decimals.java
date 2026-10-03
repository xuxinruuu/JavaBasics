public class Decimals {
	public static void main (String[] args) {
		
		double num = 12.3456789;
		
		long res0 = Math.round(num);
		double res2 = Math.round(num * Math.pow( 10 , 2 )) / Math.pow( 10.0 , 2 );
		double res4 = Math.round(num * Math.pow( 10 , 4 )) / Math.pow( 10.0 , 4 );
		double res6 = Math.round(num * Math.pow( 10 , 6 )) / Math.pow( 10.0 , 6 );
		
		System.out.println("Rounded to 0 decimals: " + res0);
		System.out.println("Rounded to 2 decimals: " + res2);
		System.out.println("Rounded to 4 decimals: " + res4);
		System.out.println("Rounded to 6 decimals: " + res6);
	}	
}