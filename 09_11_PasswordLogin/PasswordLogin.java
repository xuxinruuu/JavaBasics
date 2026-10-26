import java.util.Scanner;

public class PasswordLogin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String correctPassword = "Qwert?9876";
        int attempts = 0;
        
        System.out.println("Enter the password:");
        String password = scanner.nextLine();
        attempts++;
        
        while (!password.equals(correctPassword)) {
            System.out.println("Incorrect, try again:");
            password = scanner.nextLine();
            attempts++;
        }
        
        System.out.println("Access granted!");
        System.out.println("Attempts: " + attempts);
        
        scanner.close();
    }
}