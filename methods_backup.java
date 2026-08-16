public class methods{
    public static void main(String[] args) {
        System.out.println(add(3,4));
        display();
    }
    //non-void function with parameters
    public static int add(int a,int b){
        int c=a+b;
        return c;
    }
    //void function with out parameters
    public static void display(){
        System.out.println("Output displayed!");
    }
}