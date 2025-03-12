package ex_04_Operators;

public class Lab031_Relational_Operators {
    public static void main(String[] args) {
        // < Less than
        // <= Less than equal to
        // > Greater than
        // >= Greater than equal to
        // == Equal to (basically checking)
        // != Not equal to

        //the output will always be Boolean
        int a=10;
        int b=20;
        boolean c = a>b; //10>30
        System.out.println(c);  //false

        int age_babita = 23;
        int age_ravina = 23;
        boolean result = age_ravina >= age_babita;
        System.out.println(result);
    }
}
