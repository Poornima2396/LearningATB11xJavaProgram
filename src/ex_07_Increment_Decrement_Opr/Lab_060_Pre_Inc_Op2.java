package ex_07_Increment_Decrement_Opr;

public class Lab_060_Pre_Inc_Op2 {
    public static void main(String[] args) {
        //Pre Increment --> ++Operand
        //value is incremented first and then stored in the result.
        //value will be incresed by 1
        int a = 10;
        int b = ++a; //10+1 = 11 -> b
        System.out.println(b); //11
        System.out.println(a); //11

        //Explanation
        //Expression and Result Table
        //Line No | a | Result b
        // 8      |10 | NA
        // 9      |11 | 11
        // 10     |NA | 11
        // 11     |11 | 11


    }
}
