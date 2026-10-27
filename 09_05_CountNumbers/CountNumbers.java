import java.util.Scanner;

public class CountNumbers {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);

        int c0 = 0, c1 = 0, c2 = 0, c3 = 0, c4 = 0;
        int c5 = 0, c6 = 0, c7 = 0, c8 = 0, c9 = 0;

        System.out.println("Enter a number between 0 and 9. Enter -1 to finish:");
        int num = sc.nextInt();

        while (num != -1){
            switch(num){
                case 0 -> c0++;
                case 1 -> c1++;
                case 2 -> c2++;
                case 3 -> c3++;
                case 4 -> c4++;
                case 5 -> c5++;
                case 6 -> c6++;
                case 7 -> c7++;
                case 8 -> c8++;
                case 9 -> c9++;
                default -> System.out.println("Invalid number. Enter between 0 and 9. Enter -1 to finish.");
            }
            num = sc.nextInt();
        }

        System.out.println("Total 0: " + c0);
        System.out.println("Total 1: " + c1);
        System.out.println("Total 2: " + c2);
        System.out.println("Total 3: " + c3);
        System.out.println("Total 4: " + c4);
        System.out.println("Total 5: " + c5);
        System.out.println("Total 6: " + c6);
        System.out.println("Total 7: " + c7);
        System.out.println("Total 8: " + c8);
        System.out.println("Total 9: " + c9);

        sc.close();
    }
}