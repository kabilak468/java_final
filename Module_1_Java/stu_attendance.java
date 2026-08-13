import java.util.Scanner;
public class stu_attendance {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Student Attendence percentage Calculator");
        System.out.println("=========================================");
        System.out.print("Enter the total no. of working days  : ");
        int w_days=sc.nextInt();
        System.out.print("Enter the total no. of days attended : ");
        int a_days=sc.nextInt();
        if (a_days>w_days){
            System.out.print("Invalid input");
        }else{
            double result=a_days%w_days;
            System.out.printf("Your Attendance percentage           : %.2f %%",result);
        }
        sc.close();
    }
}
