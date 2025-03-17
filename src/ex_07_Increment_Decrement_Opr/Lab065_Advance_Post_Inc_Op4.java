package ex_07_Increment_Decrement_Opr;

public class Lab065_Advance_Post_Inc_Op4 {
    public static void main(String[] args) {
        int a =10;
        System.out.println(a++ + ++a); //22
        System.out.println(a); //12
       //Divide and conquer rule
        //A -> a++ -> ExpA=10,  a=11
        //+
        //B -> ++a -> ExpB = 12 , a - 12
        //A+B = ExpA + ExpB ->  10+12=22 , a->12

    }
}
