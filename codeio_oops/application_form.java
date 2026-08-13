//class & objects
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
