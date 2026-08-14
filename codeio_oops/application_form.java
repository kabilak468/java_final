//class & objects
package codeio_oops;
public class application_form{
    String name;
    int rollNo;
    double mark;
    public void display(){
        System.out.println(name);
        System.out.println(rollNo);
    }
    //disp is declared as private
    private void disp(){
        System.out.println(mark);
    }
    public void setCutoff(double cutoff){
        mark=cutoff;
    }
    //Passing input through methods instead of variables
    public static void main(String[] args){
        //Object creation
        application_form sc = new application_form();
        sc.name="Kabi";
        sc.rollNo=167;
        sc.setCutoff(194.5);
        sc.display();
        //private methods are accessible within the same class 
        sc.disp();
    }
}


//Creating class and objects

/*
package codeio_oops;

public class application_form {
    String name;
    int rollNo;

    public void display(){
        System.out.println(name);
        System.out.println(rollNo);
    }

    public static void main(String[] args){
        application_form app =new application_form();
        app.name="Kabi";
        app.rollNo=167;
        app.display();
    }
}
*/