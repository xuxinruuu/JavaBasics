import java.util.Scanner;

public class ScannerEx3 {
	public static void main (String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter street number: ");
		int number = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Enter street name: ");
		String name = scanner.nextLine();
		
		System.out.println("Enter city: ");
		String city = scanner.nextLine();
		
		System.out.println("Enter country: ");
		String country = scanner.nextLine();
		
		System.out.println("Enter postal code: ");
		String code = scanner.nextLine();
		
		System.out.println("Your address is: \n" + number + name + "\n" + city + "\n" + country + "\n" + code);
		
		scanner.close();
	}
}