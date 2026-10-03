import java.util.Scanner;

public class ScannerDAW1A {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your name: ");
		String name = scanner.nextLine();
		System.out.println("name =  "+name);
		
		System.out.println("Enter your age: ");
		byte age = scanner.nextByte();
		System.out.println("age =  "+age);
		
		System.out.println("Enter the price: ");
		double price = scanner.nextDouble();
		System.out.println("price=  "+price);
		
		scanner.close();
		
	}
}