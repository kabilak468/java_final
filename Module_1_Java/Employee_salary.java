import java.util.Scanner;
public class Employee_salary {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Employee Salary Calculator");
        System.out.println("==========================");
        System.out.print("Enter employee ID  : ");
        String e_id=sc.nextLine();
        System.out.print("Enter employee name: ");
        String e_name=sc.nextLine();
        System.out.print("Enter basic Salary : ");
        double b_salary=sc.nextDouble();
        double hra=0.20*b_salary;
        double da=0.15*b_salary;
        double p_tax=250;
        double g_salary=b_salary+hra+da;
        double total_deduction=p_tax;
        double net_salary=g_salary-total_deduction;
        System.out.println("Employee ID  : "+e_id);
        System.out.println("Employee Name: "+e_name);
        System.out.printf("Calculated Gross Salary: Rs.%.2f%n",g_salary);
        System.out.println("=======================================");
        System.out.printf("Net Salary             : Rs.%.2f",net_salary);
        System.out.printf("%n=======================================");
        sc.close();
    }
}
