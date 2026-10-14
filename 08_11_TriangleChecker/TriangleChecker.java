import java.util.Scanner;

public class TriangleChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of the first side:");
        double a = sc.nextDouble();
        System.out.println("Enter the length of the second side:");
        double b = sc.nextDouble();
        System.out.println("Enter the length of the third side:");
        double c = sc.nextDouble();

        if (a + b > c && a + c > b && b + c > a) { // formen un triangle
            if (a == b && b == c) { 
                System.out.println("Type: Equilateral");
            } else if (a == b || a == c || b == c) {
                System.out.println("Type: Isosceles");
            } else {
                System.out.println("Type: Scalene");
            }
        } else {
            System.out.println("The sides cannot form a triangle");
        }

        sc.close();
    }
}