import java.util.Scanner;
public class restaurant{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double result;
        System.out.println("Restaurant Invoice System");
        System.out.println("===========================");
        System.out.print("Enter Customer Name     : ");
        String c_name=sc.nextLine();
        System.out.print("Enter no. of adult meals: ");
        int n_a_meals=sc.nextInt();
        System.out.print("Enter no. of child meals: ");
        int n_c_meals=sc.nextInt();
        double a_meal=280.00;
        double c_meal=160.00;
        double service=0.08;
        double gst=0.05;
        double coupon=250.00;
        double raw_amount=(n_a_meals*a_meal)+(n_c_meals*c_meal);
        double service_total=raw_amount*service;
        double gst_total=raw_amount*gst;
        double final_amount=raw_amount-(service_total+gst_total);
        System.out.println("Customer Name           : "+c_name);
        System.out.printf("Total price             : %.2f%n",raw_amount);
        if (final_amount>3000.00){
            result=final_amount-coupon;
            System.out.println("Claimed discount of Rs.250.");
        }else{
            result=final_amount;
        }
        System.out.printf("=======================================%n");
        System.out.printf("Final Amount to be paid : %.2f%n",result);
        System.out.printf("=======================================%n");
        sc.close();
    }
}