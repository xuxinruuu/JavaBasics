import java.util.Scanner;

public class ChangeSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the starting number:");
        int start = sc.nextInt();

        System.out.println("Enter the ending number:");
        int end = sc.nextInt();
        while (end <= start) {
            System.out.println("Enter the ending number:");
            end = sc.nextInt();
        }

        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                System.out.print((i * 2) + " ");
            } else {
                System.out.print((i / 2) + " ");
            }
        }

        System.out.println();
        sc.close();
    }
}
