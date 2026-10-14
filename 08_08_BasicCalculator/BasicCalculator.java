import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the first integer:");
        int num1 = sc.nextInt();
        
        System.out.println("Enter an operator (+, -, *, /, %):");
        String operator = sc.next();
        
        System.out.println("Enter the second integer:");
        int num2 = sc.nextInt();
        
        if (operator.equals("+")) {
            System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        } else if (operator.equals("-")) {
            System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
        } else if (operator.equals("*")) {
            System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
        } else if (operator.equals("/")) {
            if (num2 == 0) {
                System.out.println("Error: Division by zero is not allowed");
            } else {
                System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
            }
        } else if (operator.equals("%")) {
            if (num2 == 0) {
                System.out.println("Error: Division by zero is not allowed");
            } else {
                System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
            }
        } else {
            System.out.println("Invalid operator!");
        }
        
        sc.close();
    }
}