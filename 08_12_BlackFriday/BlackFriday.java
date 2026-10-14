import java.util.Scanner;

public class BlackFriday {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the price:");
        double price = sc.nextDouble();
        sc.nextLine();

        System.out.println("Do you have a loyalty card? (yes/no):");
        String card = sc.nextLine();

        double discount;

        if (price > 60) {
            if (card.equalsIgnoreCase("yes")) {
                discount = 0.20;
            } else {
                discount = 0.10;
            }
        } else {
            if (card.equalsIgnoreCase("yes")) {
                discount = 0.05;
            } else {
                discount = 0;
            }
        }

        double finalPrice = price * (1 - discount);

        System.out.printf("Final price: %.2f €", finalPrice);

        sc.close();
    }
}