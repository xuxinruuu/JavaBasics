import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter available balance:");
        double balance = sc.nextDouble();

        System.out.println("Enter withdrawal amount:");
        double amount = sc.nextDouble();

        System.out.println("Do you have a credit line? (true/false)");
        boolean hasCredit = sc.nextBoolean();

        if (amount <= 0) {
            System.out.println("Withdrawal not possible");
        } else if (amount % 20 != 0) {
            System.out.println("Withdrawal amount must be a multiple of 20 €");
        } else if (amount > 600) {
            System.out.println("The maximum daily withdrawal is 600 €");
        
        } else if (balance >= amount) {
            double newBalance = balance - amount;
            double commission = 0.00;

            System.out.println("Please take your money");
            System.out.printf("Your new balance is now: %.2f €\n", newBalance);
            System.out.printf("Commission: %.2f €\n", commission);

        } else if (hasCredit && (amount - balance <= 300)) {
            double newBalance = balance - amount;
            double commission = 5.00;

            System.out.println("Please take your money");
            System.out.printf("Your new balance is now: %.2f €\n", newBalance);
            System.out.printf("Commission: %.2f €\n", commission);
        
        } else {
            System.out.println("Withdrawal not possible");
        }

        sc.close();
    }
}