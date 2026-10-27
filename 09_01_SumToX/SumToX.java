import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter number > 10:");
        int num = sc.nextInt();

        while (num <= 10) {
            System.out.println("Enter number > 10:");
            num = sc.nextInt();
        }

        int total = 0;
        int i = 1;
        while (i <= x) {
            total += i;
            i++;
        }

        System.out.println("Total = " + total);
        
        sc.close();
    }
}