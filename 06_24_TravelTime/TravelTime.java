import java.util.Scanner;

public class TravelTime {
    public static void main(String[] args) {
        final int timeStops = 3;
        final int timeTransfers = 6;

        Scanner sc = new Scanner(System.in);

        System.out.println("Number of stops:");
        int stops = sc.nextInt();

        System.out.println("Number of transfers:");
        int transfers = sc.nextInt();

        int totalMin = (stops * timeStops) + (transfers * timeTransfers);
        int totalSec = totalMin * 60;
        int hours = totalSec / 3600;
        int s = totalSec % 3600;
        int minutes = s / 60;

        System.out.printf("Total traveling time is %02d:%02d\n", hours, minutes);

        sc.close();
    }
}