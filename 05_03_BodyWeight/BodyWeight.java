import java.util.Scanner;

public class BodyWeight {

    public static void main(String[] args) {

        // Constants
        final byte K_MEN = 4;
        final float K_WOMEN = 2.5f;

        // Create the Scanner
        Scanner sc = new Scanner(System.in);

        // Request the input (2 integers)
        System.out.println("Enter your height in cm:");
        int height = sc.nextInt();

        System.out.println("Enter your age:");
        int age = sc.nextInt();

        // Calculate the body weight for men
        double weightMen = (height - 100) - (double) (height - 150) / 4 + (double) (age - 20) / K_MEN;

        // Display the body weight for men
        System.out.printf("Ideal Body Weight for Men = %.2fkg%n", weightMen);

        // Calculate the body weight for women
        double weightWomen = (height - 100) - (double) (height - 150) / 4 + (age - 20) / K_WOMEN;

        // Display the body weight for women
        System.out.printf("Ideal Body Weight for Women = %.2fkg%n", weightWomen);

        // Close the Scanner
        sc.close();
    }

}