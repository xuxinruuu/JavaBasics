import java.util.Scanner;

public class GuessNumberWhile {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        int numSecret = 52;
        int num = 0;
        int attempts = 0;

        System.out.println("Enter a number between 1 and 100:");
        num = sc.nextInt();

        while(num != numSecret){
            attempts++;

            if (num < 1) {
                System.out.println("At least 1!");
            } else if (num > 100) {
                System.out.println("At most 100!");
            } else if (num < numSecret) {
                System.out.println("It's greater than " + num);
            } else if (num > numSecret) {
                System.out.println("It's smaller than " + num);
            }
            
            System.out.println("Enter a number between 1 and 100:");
            num = sc.nextInt();
        }
        attempts++;

        System.out.println("You guessed it!");
        System.out.println("Attempts: " + attempts);

        sc.close();
    }
}