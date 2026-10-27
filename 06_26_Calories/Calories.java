import java.util.Scanner;

public class Calories {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter calories to burn:");
        int calories = sc.nextInt();

        System.out.println("Enter MET value:");
        float met = sc.nextFloat();

        System.out.println("Enter your weight in kg:");
        float kg = sc.nextFloat();

        double totalMinutes = (calories * 200.0) / (met * 3.5 * kg);
        int totalSeconds = (int)(totalMinutes * 60);

        int minutes = totalSeconds / 60;
        int seconds = totalSeconds % 60;

        System.out.printf("Running time: %02d:%02d\n", minutes, seconds);

        sc.close();
    }
}