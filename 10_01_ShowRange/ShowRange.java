import java.util.Scanner;

public class ShowRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the starting number:");
        int start = scanner.nextInt();

        System.out.println("Enter the ending number:");
        int end = scanner.nextInt();
        while (end <= start) {
            System.out.println("Enter the ending number:");
            end = scanner.nextInt();
        }

        for (int i = start; i <= end; i++) {
            System.out.print(i + " ");
        }

        System.out.println();
        scanner.close();
    }
}