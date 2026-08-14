//Constructor-->Parameterised and default(Non-parameterised constructor)
package codeio_oops;

class sample {
    int rollNo;
    int marks;
    //default constructor
    sample(){
        rollNo=5034;//default value=5034 instead of 0;
        marks=50;//default marks=50 instead of 0;
    }
}

class Constructor{
    public static void main(String[] args) {
        sample obj=new sample();//Here, sample() is the constructor
        System.out.println(obj.rollNo);
        System.out.println(obj.marks);
    }
}