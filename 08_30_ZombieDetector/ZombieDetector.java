import java.util.Scanner;

public class ZombieDetector{
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter body temperature:");
        double temp = sc.nextDouble();

        String result = (temp <= 30.0) ? "Zombie detected!" : "Human detected!" ;
        System.out.println(result);

        sc.close();
    }
}