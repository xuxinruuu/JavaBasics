import java.util.Scanner;

public class SplitElectricityBill{
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		
        System.out.println("Number of people:");
        int numPeople = sc.nextInt();

        System.out.println("Enter electricity consumption (kWh):");
        double kwh = sc.nextDouble();

        System.out.println("Enter price per kWh (€):");
        double price = sc.nextDouble();

        System.out.println("Enter fixed monthly charge (€):");
        double fixed = sc.nextDouble();

        System.out.println("Enter tax (%):");
        double tax = sc.nextDouble();

        double energyCost = kwh * price;
        double subtotal = energyCost + fixed;
        double taxAmount = subtotal * (tax / 100.0);
        double total = subtotal + taxAmount;
        double totalPerPerson = total / numPeople;

        System.out.printf("Energy cost = %.2f €%n", energyCost);
        System.out.printf("Fixed charge = %.2f €%n", fixed);
        System.out.printf("Subtotal = %.2f €%n", subtotal);
        System.out.printf("Tax = %.2f €%n", taxAmount);
        System.out.printf("Total = %.2f €%n", total);
        System.out.printf("Total per person = %.2f €%n", totalPerPerson);

        sc.close();
		
	}
}