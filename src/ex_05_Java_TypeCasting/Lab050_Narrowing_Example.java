package ex_05_Java_TypeCasting;

public class Lab050_Narrowing_Example {
    public static void main(String[] args) {
        long phone_no = 8737382345l;
        //short s = phone_no; //Implicit not possible
        short s = (short) phone_no;//Explicit casting - narrowing - allowed
        System.out.println(s); //output will be garbage check in chatgpt for better explanation



    }
}
