import java.util.Scanner;

public class ShowRange2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the starting number:");
        int start = scanner.nextInt();

        System.out.println("Enter the ending number:");
        int end = scanner.nextInt();
        while (end == start) {
            System.out.println("Enter the ending number:");
            end = scanner.nextInt();
        }

        if (start <= end) {
            for (int i = start; i <= end; i++) {
                System.out.print(i + " ");
            }
        } else {
            for (int i = start; i >= end; i--) {
                System.out.print(i + " ");
            }
        }
        
        System.out.println();
        scanner.close();
    }
}