package ex_06_Ternary_Operators;

public class Lab057_Max_number_usingTO {
    public static void main(String[] args) {
        int n1 = 2;
        int n2 = 9;
        int n3 = -11;

        //Logic Building Formula
        //Step 1 : Find Inputs and outputs
        //I/O -> n1,n2,n3 - int
        //O/P -> String - max number

       // Step 2 : Rough logic and think
        //n1 > n2 and n1 > n3 -> n1 = 2
        //n2 > n3 and n2 > n1 -> n2 = 9
        //n3 = -11

        int max = (n1 > n2) ? (n1 > n3) ? n1 : n3 : ((n2 > n3)? n2 : n3);
        //this will solve the inside brackets first
        System.out.println(max);

    }
}
