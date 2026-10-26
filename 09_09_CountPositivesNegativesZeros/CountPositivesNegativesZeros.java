import java.util.Scanner;

public class CountPositivesNegativesZeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("How many numbers?");
        int n = scanner.nextInt();
        
        while (n <= 0) {
            System.out.println("How many numbers?");
            n = scanner.nextInt();
        }
        
        int positives = 0;
        int negatives = 0;
        int zeros = 0;
        
        int count = 0;
        while (count < n) {
            System.out.println("Enter number:");
            int numero = scanner.nextInt();
            
            if (numero > 0) {
                positives++;
            } else if (numero < 0) {
                negatives++;
            } else {
                zeros++;
            }
            
            count++;
        }
        
        System.out.println("Positive: " + positives);
        System.out.println("Negative: " + negatives);
        System.out.println("Zeros: " + zeros);
        
        scanner.close();
    }
}