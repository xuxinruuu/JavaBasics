import java.util.Scanner;

public class PasswordCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String correctPassword = "jupiter4321";
        int maxAttempts = 3;
        
        for (int attempt = 1; attempt <= maxAttempts; attempt++) {
            System.out.println("Enter your password:");
            String enteredPassword = sc.next();
            
            if (enteredPassword.equals(correctPassword)) {
                System.out.println("Access granted. Welcome!");
                sc.close();
                return; 
            } else {
                if (attempt < maxAttempts) {
                    System.out.println("Incorrect password. Try again.");
                } else {
                    System.out.println("Your account is locked. Please contact your administrator.");
                }
            }
        }
        
        sc.close();
    }
}