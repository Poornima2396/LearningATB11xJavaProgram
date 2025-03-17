package ex_07_Increment_Decrement_Opr;

public class Lab_061_Post_Inc_Dec {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(++a); //10+1 = 11
        System.out.println(a); //11

        //Post Increment -> Print first and then increase
        int a_post = 10;
        System.out.println(a_post++); // 10
        System.out.println(a_post); //11 -> 10+1 ->Prints first and then increase

    }
}
