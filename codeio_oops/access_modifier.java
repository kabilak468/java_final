package codeio_oops;
public class access_modifier{
    /*String name;
    int rollNo;
    double mark;
    private void display(){
        System.out.println(name);
        System.out.println(rollNo);
        System.out.println(mark);
    }
    public void setCutoff(double cutoff){
        mark=cutoff;
    }*/
    //Passing input through methods instead of variables
    public static void main(String[] args){
        //Object creation
        application_form sc = new application_form();
        sc.name="Kabi";
        sc.rollNo=167;
        sc.setCutoff(194.5);
        sc.display();
    }
}
