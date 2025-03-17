package ex_07_Increment_Decrement_Opr;

public class Lab064_Advance_Post_Inc_Op3 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a++ + a);
        //Divide and conquer rule
        //A + B   consider
        //A -> a++  -> ExpA = 10 , a=11
        // + --> as it is
        //B -> a  -> ExpB -> 11, a =11
        //A+B -> ExpA + ExpB = 10+11 = 21

        //Line no | a | result
          // 5  | 10  | NA
          // 6  | 10  | 11

    }
}
