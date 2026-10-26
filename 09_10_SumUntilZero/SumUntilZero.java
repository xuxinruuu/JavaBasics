import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int sum = 0;
        int count = 0;
        
        System.out.println("Enter number:");
        int numero = scanner.nextInt();
        
        while (numero != 0) {
            sum += numero;
            count++;
            
            System.out.println("Enter number:");
            numero = scanner.nextInt();
        }
        
        System.out.println("Sum: " + sum);
        System.out.println("Count: " + count);
        
        scanner.close();
    }
}