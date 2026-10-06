import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Monthly electricity cost:");
        double electricityCost = sc.nextDouble();

        System.out.println("Monthly coffee machine rental cost:");
        double rentalCost = sc.nextDouble();

        System.out.println("Number of coffees:");
        int numberOfCoffees = sc.nextInt();

        System.out.println("Average coffee price:");
        double avgCoffeePrice = sc.nextDouble();

        System.out.println("Coffee price per kilo:");
        double coffeePricePerKilo = sc.nextDouble();

        System.out.println("Kilograms of coffee:");
        double kgOfCoffee = sc.nextDouble();

        System.out.println("Milk price per litre:");
        double milkPricePerLitre = sc.nextDouble();

        System.out.println("Liters of milk:");
        double litersOfMilk = sc.nextDouble();

        double totalIncome = numberOfCoffees * avgCoffeePrice;
        double totalExpenses = electricityCost + rentalCost 
                             + (coffeePricePerKilo * kgOfCoffee) 
                             + (milkPricePerLitre * litersOfMilk);

        System.out.println("Should we buy the coffee machine? " + (totalIncome > totalExpenses));

        sc.close();
    }
}