package ex_014_Strings_concept;

public class Lab0117_String_Immutable_Example {
    public static void main(String[] args) {

        //string is a bunch of characters
        //Non-primitive data type (user defined)
        //String is a Built-In in java.lang.String package --by java guys
        //string is a final class-> Inherited (cannot have children of string class)
        //Strings are constant

        //Immutable vs Mutable
        //Mutable -> can be change
        //Immutable -> cannot be changed

            //How strings are stored in JVM?
        //1.String constant pool 2.Heap Area (Object)

        String name = "Poornima";
       // name.toUpperCase();  // this function makes the name to uppercase
        name=name.toUpperCase(); //POORNIMA
        System.out.println(name); //but is printing  name Poornima older value
        //if u want to change then it should be name=name.toUpperCase();








    }
}
