import java.util.Scanner;

public class SumToN {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);

        int num = 0;

        while(num <= 1){
            System.out.println("Enter a number (greater than 1):");
            num = sc.nextInt();
        }

        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;
        }

        System.out.println("Sum = " + sum);

        sc.close();
    }
}