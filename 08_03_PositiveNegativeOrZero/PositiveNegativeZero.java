import java.util.Scanner;

public class PositiveNegativeZero {
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an integer:");
        int num = sc.nextInt();

        if (num > 0){
            System.out.printf("The number %d is positive", num);
        }else if (num < 0){
            System.out.printf("The number %d is negative", num);
        }else{
            System.out.println("The number 0 is zero");
        }        

        sc.close();
    }
}