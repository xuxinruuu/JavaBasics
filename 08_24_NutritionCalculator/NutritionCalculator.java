import java.util.Scanner;

public class NutritionCalculator {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.printf("Nutrition calculator: %n1. Calculate calories %n2. Calories per serving %n3. Daily calories %nChoose an option:%n");
        int option = sc.nextInt();

        switch (option) {
        case 1 -> {
            System.out.println("Enter protein (g):");
            double protein = sc.nextDouble();
            System.out.println("Enter carbohydrates (g):");
            double carbohydrates = sc.nextDouble();
            System.out.println("Enter fat (g):");
            double fat = sc.nextDouble();

            double totalCalories = protein *4 + carbohydrates *4 + fat *9;
            System.out.printf("Total calories: %.2f kcal", totalCalories);
        }
        case 2 -> {
            System.out.println("Enter calories per 100 g:");
            double c = sc.nextDouble();
            System.out.println("Enter serving size (g):");
            double size = sc.nextDouble();

            double caloriesServing = c * size / 100;
            System.out.printf("Calories per serving: %.2f kcal", caloriesServing);
        }
        case 3 -> {
            System.out.println("Enter age (years):");
            int age = sc.nextInt();
            System.out.println("Enter height (cm):");
            int height = sc.nextInt();
            System.out.println("Enter weight (kg):");
            double weight = sc.nextDouble();
            System.out.println("Enter sex (M/F):");
            String sex = sc.next().toUpperCase();
            System.out.println("Enter activity factor (1.2 to 1.9):");
            double af = sc.nextDouble();

            double tdee = 0.0;

            switch(sex){
                case "M" -> {
                    tdee = af * (10 * weight + 6.25 * height - 5 * age + 5);
                }
                case "F" -> {
                    tdee = af * (10 * weight + 6.25 * height - 5 * age - 161);
                }
            }

            System.out.printf("Daily calories: %.2f kcal", tdee);
        }
        default -> {
            System.out.println("Default: Value is: " + option);
        }
    }
    sc.close();
    }
}