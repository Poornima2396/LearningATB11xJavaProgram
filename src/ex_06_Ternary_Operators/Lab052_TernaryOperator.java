package ex_06_Ternary_Operators;

public class Lab052_TernaryOperator {
    public static void main(String[] args) {
        // ?: - it is a conditional statement of  if&else in a single line

        //Syntax - result = condition ? expression1 : expression2
        //you can add bracket also

        int age = 10;
        String CanIVote = 10>=18 ? "Yes you can vote" : "No you can't vote";
        System.out.println(CanIVote); //output - No you can't vote
        //? will check conditions and print

    }

}
