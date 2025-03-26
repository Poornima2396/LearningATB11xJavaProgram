package ex_014_Strings_concept;

public class Lab0126_StringBuilder_Vs_Buffer {
    public static void main(String[] args) {
        //In automation String used - 90%
        //2 ways string can be created
        String s0 = "Poornima"; //scp
        String s1 = new String("Poornima"); //OA

        //to create string buffer - use string buffer class
        //to create string builder - use string builder class

        StringBuffer stringBuffer = new StringBuffer("Poornima");
        StringBuilder stringBuilder = new StringBuilder("Poornima");

        System.out.println(s0); //Poornima
        System.out.println(s1); //Poornima
        System.out.println(stringBuffer); //Poornima
        System.out.println(stringBuilder); //Poornima

        //while printing the output will be same but there is huge
        // difference between how they are stored..
        //4 types of strings are created




    }
}
