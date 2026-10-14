import java.util.Scanner;

public class MovieRecommender {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String movie;

        System.out.println("Welcome to the Movie Recommender!");

        System.out.println("Do you like action movies? (yes/no):");
        String action = sc.nextLine();

        if (action.equalsIgnoreCase("yes")) {  // Step 2A
            System.out.println("Do you prefer superhero or spy movies? (superhero/spy/other):");
            String type = sc.nextLine();

            if (type.equalsIgnoreCase("superhero")) {
                movie = "Avengers: Endgame";
            } else if (type.equalsIgnoreCase("spy")) {
                movie = "Mission: Impossible Fallout";
            } else {
                movie = "Mad Max: Fury Road";
            }
        } else {   // Step 2B
            System.out.println("Do you like comedies? (yes/no):");
            String comedies = sc.nextLine();

            if (comedies.equalsIgnoreCase("yes")) {    // Step 3A
                System.out.println("Do you prefer smart humor or silly humor? (smart/silly/other):");
                String humor = sc.nextLine();

                if (humor.equalsIgnoreCase("smart")) {
                    movie = "The Grand Budapest Hotel";
                } else if (humor.equalsIgnoreCase("silly")) {
                    movie = "The Hangover";
                } else {
                    movie = "The Mask";
                }
            } else {    // Step 3B
                System.out.println("Do you like independent films? (yes/no):");
                String ind = sc.nextLine();

                if (ind.equalsIgnoreCase("yes")) {    // Step 4A
                    System.out.println("Do you prefer drama or experimental style? (drama/experimental/other):");
                    String style = sc.nextLine();

                    if (style.equalsIgnoreCase("drama")) {
                        movie = "Lady Bird";
                    } else if (style.equalsIgnoreCase("experimental")) {
                        movie = "Everything Is Illuminated";
                    } else {
                        movie = "Moonlight";
                    }
                } else {
                    movie = "Home Alone";
                }
            }
        }

        System.out.println("You should watch '" + movie + "'.");
        System.out.println("Thanks for using the Movie Recommender!");

        sc.close();
    }
}