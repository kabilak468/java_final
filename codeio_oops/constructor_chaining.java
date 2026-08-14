//constructor chaining
//this() and super() can call each other at the first line of a method or constructor but they both can't appear at the same time in a same method or coonstructor
package codeio_oops;
class demo{
    demo(){
        this(5);
        System.out.println("Default constructor of demo class");
    }
    demo(int a){
        System.out.println("could be the first line");
    }
}
public class constructor_chaining extends demo/*inheritence of demo*/{
    constructor_chaining(){
        this(5);//to call next chain by int type
        System.out.println("This is going to be the last line");
    }
    constructor_chaining(int a){
        this("String value");
        System.out.println("int constructor");
    }
    constructor_chaining(String name){
        super();
        System.out.println("string constructor");
    }
    int rollNo;
    public static void main(String[] args) {
        constructor_chaining obj=new constructor_chaining();
        obj.rollNo=123;
    }
}
