import java.util.Scanner;
public class cafe_billing {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Cafe Billing System");
        System.out.printf("======================================\n");
        System.out.print("Enter price of Item1: ");
        double p1=sc.nextDouble();
        System.out.print("Enter price of Item2: ");
        double p2=sc.nextDouble();
        System.out.print("Enter price of Item3: ");
        double p3=sc.nextDouble();
        double sub_total=p1+p2+p3;
        double gst=sub_total*0.05;
        double final_amount=sub_total-gst;
        System.out.printf("Subtotal            : Rs.%.2f\n",sub_total);
        System.out.printf("GST                 : Rs.%.2f\n",gst);
        System.out.printf("======================================\n");
        System.out.printf("Final price         : Rs.%.2f\n",final_amount);
        System.out.printf("======================================\n");
        sc.close();
    }
} 