import java.util.Scanner;

public class TemperatureSensor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter temperature from sensor 1:");
        int t1 = sc.nextInt();

        System.out.println("Enter temperature from sensor 2:");
        int t2 = sc.nextInt();

        System.out.println("Enter temperature from sensor 3:");
        int t3 = sc.nextInt();

        if (t1 <= 30 && t2 <= 30 && t3 <= 30) { 
            if (t1 >= t2 && t1 >= t3) {
                System.out.println("Temperature: " + t1);
            } else if (t2 >= t1 && t2 >= t3) {
                System.out.println("Temperature: " + t2);
            } else {
                System.out.println("Temperature: " + t3);
            }
        } else if (t1 <= 30 && t2 <= 30) {
            if (t1 >= t2) {
                System.out.println("Temperature: " + t1);
            } else {
                System.out.println("Temperature: " + t2);
            }
        } else if (t1 <= 30 && t3 <= 30) {
            if (t1 >= t3) {
                System.out.println("Temperature: " + t1);
            } else {
                System.out.println("Temperature: " + t3);
            }
        } else if (t2 <= 30 && t3 <= 30) {
            if (t2 >= t3) {
                System.out.println("Temperature: " + t2);
            } else {
                System.out.println("Temperature: " + t3);
            }
        } else if (t1 <= 30) {
            System.out.println("Temperature: " + t1);
        } else if (t2 <= 30) {
            System.out.println("Temperature: " + t2);
        } else if (t3 <= 30) {
            System.out.println("Temperature: " + t3);
        } else {
            System.out.println("Temperature: ERROR");
        }

        sc.close();
    }
}