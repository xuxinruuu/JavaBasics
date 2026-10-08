import java.util.Scanner;

public class Formulas1 {
    public static void main (String[] args){
        
        Scanner sc = new Scanner(System.in);

        double a = 25.5;
double b = 50.67;
double c = 2.0;
double d = 10.5;
double e = -2.5;
double f = 13.6;
double h = Math.PI;
    
    System.out.println("Formula 1 = " + (Math.sqrt(a) + (Math.pow(b,4) / c) ));
    System.out.println("Formula 2 = " + ( 2 * h * ((Math.pow(d,3) - Math.pow(e,4)) / (f-h) ) ));
    
    sc.close();
    }
}