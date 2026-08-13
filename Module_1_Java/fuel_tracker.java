import java.util.Scanner;
public class fuel_tracker {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Fuel Expense Tracker");
        System.out.println("============================");
        System.out.print("Enter the distance(km) : ");
        double distance = sc.nextDouble();
        System.out.print("Enter the mileage(km/l): ");
        double mileage = sc.nextDouble();
        System.out.print("Enter the cost of fuel(per ltr): ");
        double fuel_cost = sc.nextDouble();
        double fuel=distance/mileage;
        double total_fuel_cost=fuel_cost*fuel;
        System.out.printf("Amount of fuel consumed : %.2f l%n",fuel);
        System.out.printf("Total cost of the fuel  : Rs.%.2f",total_fuel_cost);
        sc.close();
    }
}