package ex_05_Java_TypeCasting;

public class Lab049_TypeCasting_Narrowing {
    public static void main(String[] args) {

        int val = 300;
        //byte b = val; // Invalid - Narrowing - Implicit casting is not possible
        // As the byte is shorter data type than int.
        byte b2 = (byte)val; //Possible - Narrowing Explicit Casting
        //Data Loss
        //200 will converted into binary number and only 8 bits will be taken
        System.out.println(b2);

    }
}
