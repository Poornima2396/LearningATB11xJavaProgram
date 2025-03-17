package ex_07_Increment_Decrement_Opr;

public class Lab059_Inc_Dec_Op {
    public static void main(String[] args) {
//Take Inputs
        String age_String = args[0]; //argument 0
        String a1 = args[1]; //argument 1
        String a2 = args[2]; //argument 2
        String a3 = args[3]; //argument 3
       // String a4 = args[4]; //argument 4 is not present in theEdit config - so
        // ArrayIndexOutOfBoundsException
        int age = Integer.parseInt(age_String);
        System.out.println(age); //65 //first run empty so that it will get empty configuration
        //above click on dropdown to edit configuration
        //output ->65 //this is where we add CLI arguments
        //you can have multiple arguments also , start with 0,1,2,3
        System.out.println(a1); //output - 12
        System.out.println(a2); //output - poornima
        System.out.println(a3); //output 23

    }
}
