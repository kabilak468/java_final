package codeio_oops;
public class access_modifier{
    //Passing input through methods instead of variables
    public static void main(String[] args){
        //Object creation
        application_form sc = new application_form();
        sc.name="Kabi";
        sc.rollNo=167;
        sc.setCutoff(194.5);//declared as private in another class
        /*
        //private methods are not accessible within another class
        sc.disp();
        here,the disp()..cant be accessed because it is declared as private in another class
        */
        sc.display();
    }
}
