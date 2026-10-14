import java.util.Scanner;

public class GradeClassification {
    public static void main (String[] args){
    
    Scanner sc = new Scanner (System.in);

    System.out.println("Enter the numeric grade (0-100):");
    int num = sc.nextInt();

    if (num >=0 && num < 50){
        System.out.println("F = Fail");
    }else if (num >=50 && num <60){
        System.out.println("D = Pass");
    }else if (num >=60 && num < 70){
        System.out.println("C = Satisfactory");
    }else if (num >=70 && num < 90){
        System.out.println("B = Good");
    }else if (num >=90 && num < 100){
        System.out.println("A = Excellent");
    }else{
        System.out.println("Invalid grade");
    }

    sc.close();
    }
}

