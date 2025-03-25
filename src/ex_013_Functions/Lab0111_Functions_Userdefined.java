package ex_013_Functions;

public class Lab0111_Functions_Userdefined {
    public static void main(String[] args) {

        //calling of function -->Step2 -

        //Defination -->Step1

        f1(); //step 2 call - u can call infinite number of times
        f1();
        name_of_function();  //calling is important
    }
           //Step1 - Def
            static void f1() {  //Step1 -->Defination
            System.out.println("Hi");
        }
            static void name_of_function() {
                System.out.println("I want to execute this code");
            }




}
