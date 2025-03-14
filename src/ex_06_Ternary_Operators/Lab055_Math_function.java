package ex_06_Ternary_Operators;

public class Lab055_Math_function {
    public static void main(String[] args) {
        //FInd the maximum number between two  numbers
        int a = 10;
        int b = 20;
        System.out.println(Math.max(a,b)); //20

        //using ternary
        String max =  a>b ? "A is max": "B is max";
        System.out.println(max);


    }
}
