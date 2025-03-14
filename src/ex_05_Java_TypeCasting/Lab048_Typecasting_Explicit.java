package ex_05_Java_TypeCasting;

public class Lab048_Typecasting_Explicit {
    public static void main(String[] args) {
        //Explicit Widening
        //not necessary but can perform
        byte b = 10;
        int a = b; //valid - Implicit Casting Automatically
        int a1 = (int)b; //Explicit casting - Widening - ->
        // (doesnot require) but you can mention which datatype (int) explicitly

    }
}
