import java.util.Scanner;

public class BiggestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter positive numbers. Enter a negative number to finish:");
        
        int max = 0;
        boolean hasPositive = false;
        
        int numero = scanner.nextInt();
        
        while (numero >= 0) {
            if (numero > 0) {
                if (!hasPositive) {
                    max = numero;
                    hasPositive = true;
                } else if (numero > max) {
                    max = numero;
                }
            }
            numero = scanner.nextInt();
        }
        
        if (hasPositive) {
            System.out.println("The biggest number is: " + max);
        } else {
            System.out.println("No positive numbers were entered");
        }
        
        scanner.close();
    }
}
