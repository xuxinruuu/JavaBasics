import java.util.Scanner;

public class ScannerEx2 {
	public static void main (String[] args){
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Enter first temp: ");
		float temp1 = scanner.nextFloat();
		
		System.out.println("Enter second temp: ");
		float temp2 = scanner.nextFloat();
	
		
		System.out.println("Enter third temp: ");
		float temp3 = scanner.nextFloat();
		
		System.out.println("Enter fourth temp: ");
		float temp4 = scanner.nextFloat();
		
		System.out.println("Enter fifth temp: ");
		float temp5 = scanner.nextFloat();
		
		float maxVal = Math.max(temp1, Math.max(temp2, Math.max( temp3, Math.max( temp4,temp5 ))));
		float minVal = Math.min(temp1, Math.min(temp2, Math.min( temp3, Math.min( temp4,temp5 ))));
		
		System.out.println("Max: " + maxVal);
		System.out.println("Mix: " + minVal);
		
		scanner.close();
	}
}


		