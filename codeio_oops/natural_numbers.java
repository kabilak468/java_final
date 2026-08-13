//Recursive Function
package codeio_oops;
public class natural_numbers{
    public static void main(String args[]){
        natural(10);
    }
    public static void natural(int n){
        //Base case
        if(n==1){
            System.out.println(1);
        }
        //Recursive case
        else{
            System.out.println(n);
            natural(n-1);
        }
    }
}