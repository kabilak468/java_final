import java.util.Scanner;
public class USD_Conversion {
    public static void main(String[] args){
        System.out.println("Dollar Exchange System");
        System.out.println("==========================");
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the amount(in INR)             : ");
        double INR=sc.nextDouble();
        System.out.print("Enter the exchange rate(INR per 1USD): ");
        double exchangeRate=sc.nextDouble();
        double commission=0.02;
        double p_fee=50.00;
        double deducted_amount=INR-p_fee;
        double sub_total=deducted_amount/exchangeRate;
        double charge=sub_total*commission;
        double final_amount=sub_total*commission;
        System.out.printf("Deducted Amount       : %.2f%n",(double)deducted_amount);
        System.out.printf("Converted amount(USD) : %.2f%n",sub_total);
        System.out.printf("Commission charge(USD): %.2f%n",charge);
        System.out.printf("========================================%n");
        System.out.printf("Final USD amount      : %.2f%n",final_amount);
        System.out.printf("========================================%n");
        sc.close();
    }
}
