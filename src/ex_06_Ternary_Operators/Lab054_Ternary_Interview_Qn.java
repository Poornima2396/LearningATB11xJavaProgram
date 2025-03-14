package ex_06_Ternary_Operators;

public class Lab054_Ternary_Interview_Qn {
    public static void main(String[] args) {
        //Nested Ternary
 //Syntax: result = condition1 ? expression1 : (condition2 ? expression2 : expression3)

        int number = 5;
        String result = (number>10)? "A" : "B";
        System.out.println(result); //B

        //Nested
        int number1 = 25;
        String result1 = (number1>10) ? (number1>20? "N>20" : "N<20") : "B";
        System.out.println(result1); //N>20




    }
}
