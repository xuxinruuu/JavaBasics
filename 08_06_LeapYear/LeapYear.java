import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a year:");
        int year = sc.nextInt();
        
        // Un any és de traspàs si:
        // (és divisible per 4 i no per 100) O (és divisible per 400)
        boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        
        System.out.println(isLeap);
        
        sc.close();
    }
}
