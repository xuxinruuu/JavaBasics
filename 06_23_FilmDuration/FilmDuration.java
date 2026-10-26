import java.util.Scanner;

public class FilmDuration {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);

        System.out.println("Frames per second (fps):");
        int fps = sc.nextInt();
        System.out.println("Duration of film in minutes:");
        int duration = sc.nextInt();
        System.out.println("Name of the film:");
        sc.nextLine();
        String name = sc.nextLine();

        int totalFrames = fps * duration * 60;
        System.out.printf("Total frames of film \"%s\" is %d", name, totalFrames);        

        sc.close();
    }
}