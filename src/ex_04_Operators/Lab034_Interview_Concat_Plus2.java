package ex_04_Operators;

public class Lab034_Interview_Concat_Plus2 {
    public static void main(String[] args) {
        String first_name = "Poornima";
        String last_name = "K";

        int a=10;
        int b=20;

        System.out.println(first_name + last_name + a + b); //output - PoornimaK1020
        //It will check 1st operator and then concatinate
        System.out.println(a + b + first_name + last_name); //output - 30PoornimaK
        //first it checks operator it is integer
        System.out.println(first_name + last_name + (a + b)); //output - PoornimaK30
        //BODMAS - use bracket - add,sub,mul,div

    }
}
