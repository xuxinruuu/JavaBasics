import java.util.Scanner;

public class Astrophotography {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Free space in MB:");
        int space = sc.nextInt();

        System.out.println("Battery level in %:");
        int battery = sc.nextInt();

        System.out.println("Humidity in %:");
        int humidity = sc.nextInt();

        System.out.println("Wind speed in km/h:");
        int wind = sc.nextInt();

        System.out.println("Connected to external power (true/false):");
        boolean isConnected = sc.nextBoolean();

        boolean isReady = (space >= 250) && ((battery >= 20) || isConnected) && (humidity < 60) && (wind <= 10);

        System.out.println("Ready to take photo: " + isReady);

        sc.close();
    }
}