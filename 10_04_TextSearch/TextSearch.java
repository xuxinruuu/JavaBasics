import java.util.Scanner;

public class TextSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many texts?");
        int num = scanner.nextInt();
        while (num <= 0) {
            System.out.println("How many texts?");
            num = scanner.nextInt();
        }

        scanner.nextLine(); 

        System.out.println("Word to search for:");
        String word = scanner.nextLine();

        int exactMatches = 0;
        int matchesIgnoringCase = 0;

        for (int i = 1; i <= num; i++) {
            System.out.println("Enter text " + i + ":");
            String text = scanner.nextLine();

            if (text.equals(word)) {
                exactMatches++;
            } else if (text.equalsIgnoreCase(word)) {
                matchesIgnoringCase++;
            }
        }

        System.out.println("Exact matches: " + exactMatches);
        System.out.println("Matches ignoring case: " + matchesIgnoringCase);

        scanner.close();
    }
}