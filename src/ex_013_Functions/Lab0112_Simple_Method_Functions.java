package ex_013_Functions;

public class Lab0112_Simple_Method_Functions {
    public static void main(String[] args) {
        //call
      //poornima_f1(); will not return you anything
        int result = return_int();
        System.out.println(result); //20

        int a1 = return_int1();
        System.out.println(a1);  //10

        boolean r = return_boolean();
        System.out.println(r);  //true

        long l1 = return_long();
        System.out.println(l1); //10

        float f1 = return_float_pi();
        System.out.println(f1); //3.14

        byte b1 = return_byte();        //assigning value is better option
        System.out.println(b1); //100

        System.out.println(return_string()); //poooo

    }

    // return data type - it can be void or any other datatype
    //void means no return
    //ex- if u give money to beggar, he will not return
    //2 things can happen - function can return something, or cannot return anything

    //static return/no return datatype f1() { }


    //only the limitation is int and return value datatype should be same


    static void poornima_f1() {
        System.out.println("No Return");
    }

    static int return_int1() {    //datatype same -> int &10
        return 10;
    }

    static int return_int() {    //datatype same ->int & 20
        return 20;
    }

    static boolean return_boolean() {    //datatype same ->boolean & true
        return true;
    }

    static float return_float_pi() {    //datatype same -> float & 3.14
        return 3.14f;
    }

    static byte return_byte() {
        return 100;
    }

    static long return_long() { // //datatype same -> long and 10l
        return 10l;
    }

    static String return_string() {
        return "Pooooo";
    }
}


