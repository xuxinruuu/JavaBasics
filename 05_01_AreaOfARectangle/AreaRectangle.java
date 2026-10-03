import java.util.Scanner;

public class AreaRectangle {
	public static void main (String[] args){
	
		Scanner scanner = new Scanner(System.in);

        System.out.println("Enter side A:");
        double a = scanner.nextDouble();

        System.out.println("Enter side B:");
        double b = scanner.nextDouble();

        System.out.println("Enter units:");
        scanner.nextLine();
        String units = scanner.nextLine();

        double area = a * b;

        System.out.println("Area = " + area + " " + units + "^2");

        scanner.close();
    }
}

