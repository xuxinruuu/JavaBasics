import java.util.Scanner;

public class Podium {
    public static void main (String[] args){
    
    Scanner sc = new Scanner (System.in);

    System.out.println("Enter the score of the first athlete:");
    int s1 = sc.nextInt();

    System.out.println("Enter the score of the second athlete:");
    int s2 = sc.nextInt();

    System.out.println("Enter the score of the third athlete:");
    int s3 = sc.nextInt();

    System.out.println("Enter \"asc\" or \"desc\":");
    String order = sc.next().toLowerCase();

    int min, max, mid;

    if( s1 <= s2 && s1 <= s3 && s2 <= s3 ){ // EX: 1 <= 2 <= 3
        min = s1;
        mid = s2;
        max = s3;
    }else if( s1 <= s2 && s1 <= s3 && s3 <= s2 ){ // EX: 1 <= 3 <= 2
        min = s1;
        mid = s3;
        max = s2;
    }else if( s2 <= s1 && s2 <= s3 && s1 <= s3 ){ // EX: 2 <= 1 <= 3
        min = s2;
        mid = s1;
        max = s3;
    }else if( s2 <= s3 && s2 <= s1 && s3 <= s1 ){ // EX: 2 <= 3 <= 1
        min = s2;
        mid = s3;
        max = s1;
    }else if( s3 <= s2 && s3 <= s1 && s2 <= s1 ){ // EX: 3 <= 2 <= 1
        min = s3;
        mid = s2;
        max = s1;
    }else{ // EX: 3 <= 1 <= 2
        min = s3;
        mid = s1;
        max = s2;
    }

    if(order.equals("asc")){
        System.out.printf("Podium: %d %d %d", min, mid, max);
    }else if (order.equals("desc")){
        System.out.printf("Podium: %d %d %d", max, mid, min);
    }

    sc.close();
    }
}