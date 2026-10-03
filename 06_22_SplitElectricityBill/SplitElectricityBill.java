import java.util.Locale;
import java.util.Scanner;

public class SplitElectricityBill{
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
		
// 1. Lectura de dades des del teclat
        System.out.println("Number of people:");
        int numPeople = scanner.nextInt();

        System.out.println("Enter electricity consumption (kWh):");
        double kwh = scanner.nextDouble();

        System.out.println("Enter price per kWh (€):");
        double price = scanner.nextDouble();

        System.out.println("Enter fixed monthly charge (€):");
        double fixed = scanner.nextDouble();

        System.out.println("Enter tax (%):");
        double tax = scanner.nextDouble();

        // 2. Càlculs
        double energyCost = kwh * price;
        double subtotal = energyCost + fixed;
        double taxAmount = subtotal * (tax / 100.0);
        double total = subtotal + taxAmount;
        double totalPerPerson = total / numPeople;

        // 3. Sortida formatada amb 2 decimals (%.2f)
        System.out.printf("Energy cost = %.2f €%n", energyCost);
        System.out.printf("Fixed charge = %.2f €%n", fixed);
        System.out.printf("Subtotal = %.2f €%n", subtotal);
        System.out.printf("Tax = %.2f €%n", taxAmount);
        System.out.printf("Total = %.2f €%n", total);
        System.out.printf("Total per person = %.2f €%n", totalPerPerson);

        scanner.close();
		
	}
}