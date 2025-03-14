package ex_05_Java_TypeCasting;

public class Lab051_Narrowing_Example02 {
    public static void main(String[] args) {
        int course = 100;
        float GST = 18.45f;
        //int total = course+GST; //NArrow Implicit
          int total1 = course+(int)GST;//NArrow Explicit - output->118
        System.out.println(total1);
        // DAtaloss - output expected 118.45

        float total2 = course+GST; //float is bigger than int
        //Widening - Automatically - Implicit
        System.out.println(total2); //output - 118.45
        //Explicit also possible both will give same result
        float total3 = (float)course+GST; //Explicit
        System.out.println(total3); //output - 118.45






    }
}
