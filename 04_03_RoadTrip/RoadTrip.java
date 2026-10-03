public class RoadTrip {
    public static void main (String[] args){

        double outboundDis = 347.8;
        double liter = 6.7;
        double gasPrice = 1.92;
        int numPassengers = 4;
        double tollPrice = 12.65; //peatges
        double outboundFood = 30;
        double returnFood = 30;
        double parking = 18.5;


        double totalDistance = outboundDis * 2;
        double totalConsum = liter / 100 * totalDistance;
        double totalGasPrice = totalConsum * 1.92;
        double totalTollPrice = tollPrice * 2;
        double totalFood = outboundFood + returnFood;
        double totalCost = totalGasPrice + totalTollPrice + parking + totalFood;
        double costPerPerson = totalCost / numPassengers;


        System.out.printf("===========%11S===========%n", " ROAD TRIP ");
        System.out.printf("%-20s%10.2f km%n", "Round trip distance:", totalDistance);
        System.out.printf("---------------------------------%n");
        System.out.printf("%-20s%10.2f L%n", "Fuel needed:", totalConsum);
        System.out.printf("%-20s%10.2f €%n", "Fuel cost:", totalGasPrice);
        System.out.printf("---------------------------------%n");
        System.out.printf("%-20s%10.2f €%n", "Tolls:", totalTollPrice);
        System.out.printf("%-20s%10.2f €%n", "Parking price:", parking);
        System.out.printf("%-20s%10.2f €%n", "Food:", totalFood);
        System.out.printf("---------------------------------%n");
        System.out.printf("%-20s%10.2f €%n", "Total trip cost:", totalCost);
        System.out.printf("%-20s%10d%n", "Passengers:", numPassengers);
        System.out.printf("%-20s%10.2f €%n", "Cost per passenger:", costPerPerson);
        System.out.printf("=================================%n");
    }
}