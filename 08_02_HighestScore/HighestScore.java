import java.util.Scanner;

public class HighestScore {
    public static void main (String[] args){

        Scanner sc = new Scanner (System.in);

        System.out.println("Enter the score of the first player:");
        int score1 = sc.nextInt();

        System.out.println("Enter the score of the second player:");
        int score2 = sc.nextInt();

        System.out.println("Enter the score of the third player:");
        int score3 = sc.nextInt();

        System.out.println("Enter the score of the fourth player:");
        int score4 = sc.nextInt();

        int maxScore = score1;

        if (maxScore < score2){
            maxScore = score2;
        }
        if (maxScore < score3){
            maxScore = score3;
        }
        if (maxScore < score4){
            maxScore = score4;
        }

        System.out.println("The highest score is: " + maxScore);

        sc.close();
        
    }
}