import org.w3c.dom.ls.LSOutput;

public class t5_oops {
//this is the main program
    //t5_helper is the helping calculator class
    //now lets see what happens inside.
    //inside, jvm machine's memory is divided into heap and stacks
    //every method will have its own stack
    //main stack have two columns and rows acc. to needs
    //value stored in key value format;

    public static void main(String[] args){
        int n1=4;
        int n2=5;
        t5_helper obj=new t5_helper();//this obj is a reference variable and not the actual object
        //object will be created in the heap memory and the reference obj which is in the stack will contain
        // the address of that object which is in heap memory;
        //the object which is made in heap will have two parts, one for instance variables and other for
        // method declaration etc...the content of method will be in stack only as previously written
        //just the definition of method will be there.
        int result=obj.add(n1,n2);
         System.out.println(result);
    }

}
