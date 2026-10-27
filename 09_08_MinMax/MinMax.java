import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double min = 0;
        double max = 0;
        boolean hasNumbers = false;
        
        System.out.println("Enter a positive double (negative number to finish):");
        double numero = scanner.nextDouble();
        
        while (numero >= 0) {
            if (!hasNumbers) {
                min = numero;
                max = numero;
                hasNumbers = true;
            } else {
                if (numero < min) {
                    min = numero;
                }
                if (numero > max) {
                    max = numero;
                }
            }
            System.out.println("Enter a positive double (negative number to finish):");
            numero = scanner.nextDouble();
        }
        
        if (hasNumbers) {
            System.out.println("MINIM = " + min);
            System.out.println("MAXIM = " + max);
        } else {
            System.out.println("No numbers entered");
        }
        
        scanner.close();
    }
}