package ex_07_Increment_Decrement_Opr;

public class LAb066_Adv_Pre_Inc_Op4 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(++a + ++a); //23
        System.out.println(a); //12
        //Divide and conquer rule
        //A-> ++a -> ExpA = 11 , a=11
        //+
        //B-> ++a -> ExpB = 12, a = 11+1 = 12
        //ExpA+ExpB = 11+12 = 23 & a =12


    }
}
