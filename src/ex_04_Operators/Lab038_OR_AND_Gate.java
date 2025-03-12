package ex_04_Operators;

public class Lab038_OR_AND_Gate {
    public static void main(String[] args) {
        //OR  || gate
        System.out.println(true||true); //t
        System.out.println(true||false); //t
        System.out.println(false||true); //t
        System.out.println(false||false); //f

        //AND  && gate
        //only true && true returns true
        System.out.println(true && true); //t
        System.out.println(true && false); //f
        System.out.println(false && true); //f
        System.out.println(false && false); //f

    }
}
