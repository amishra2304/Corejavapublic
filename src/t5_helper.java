public class t5_helper {
int num=4;
//suppose if i write something like num=4 then this num is instance variable
    //the instance variables goes into heap section

    public int add(int a,int b){
        System.out.println("added");
        return a+b;//here a and b are local variables
    }
}
