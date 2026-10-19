import java.util.Scanner;

public class FoodTruck {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter your choice (burger/tacos/pizza):");
        String mainCourse = sc.nextLine().toLowerCase();
        double price = 0.00;

        switch(mainCourse){
            case "burger" -> {
                price += 10.50;
                System.out.println("Fries size? (large/small):");
                String size = sc.nextLine().toLowerCase();

                switch(size){
                    case "large" ->{
                        price += 4.50;
                    }
                    case "small" ->{
                        price += 3.75;
                    }
                    default -> {
                        System.out.println("Invalid choice");
                        return;
                    }
                }

            }
            case "tacos" -> {
                price += 8.50;
                System.out.println("Sauce? (cheese/guacamole):");
                String sauce = sc.nextLine().toLowerCase();
                
                switch(sauce){
                    case "cheese" ->{
                        price += 2.50;
                    }
                    case "guacamole" ->{
                        price += 2.60;
                    }
                    default -> {
                        System.out.println("Invalid choice");
                        return;
                    }
                }
            }
            case "pizza" -> {
                price += 12.50;
                System.out.println("Topping? (pepperoni/carbonara):");
                String topping = sc.nextLine().toLowerCase();
                
                switch(topping){
                    case "pepperoni" ->{
                        price += 3.50;
                    }
                    case "carbonara" ->{
                        price += 3.30;
                    }
                    default -> {
                        System.out.println("Invalid choice");
                        return;
                    }
                }
            }
            default -> {
                System.out.println("Invalid choice");
                return;
            }
        }

        System.out.println("Choose your drink (soft/beer/water):");
        String drink = sc.nextLine().toLowerCase();
        
        switch(drink){
            case "soft" -> {
                price += 3.50;
            }
            case "beer" -> {
                price += 5.50;
            }
            case "water" -> {
                price += 2.20;
            }
        default -> {
            System.out.println("Invalid choice");
            return;
        }
        }
        System.out.printf("Total: %.2f €", price);

        sc.close();
    }
}


