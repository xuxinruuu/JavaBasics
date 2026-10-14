import java.util.Scanner;

public class PizzaCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the diameter of the first pizza (cm):");
        int pizza1 = sc.nextInt();
        
        System.out.println("Enter the diameter of the second pizza (cm):");
        int pizza2 = sc.nextInt();
        
        System.out.println("Enter the diameter of the third pizza (cm):");
        int pizza3 = sc.nextInt();
        
        // Comprovem les diferents situacions amb if-else
        if (pizza1 == pizza2 && pizza2 == pizza3) {
            System.out.println("All pizzas have the same size.");
        } else if (pizza1 != pizza2 && pizza2 != pizza3 && pizza1 != pizza3) {
            System.out.println("All pizzas have different sizes.");
        } else {
            System.out.println("Two pizzas have the same size.");
        }
        
        sc.close();
    }
}