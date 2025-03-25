package ex_014_Strings_concept;

public class Lab0122_String_InterviewQ2 {
    public static void main(String[] args) {
//        String s1 = "Hello"; //SCP
//        String s2 = "Hello"; //SCP
//        String s3 = "Hello"; //SCP
        //How many strings are present in string constant pool?
        //1 --> because SCP will not take duplicate values

        String s4 = new String("Hello"); //Object area always creates new
        String s5 = new String("Hello"); //Object area always creates new
        String s6 = new String("Hello"); //Object area always creates new
        //Hello prints 3 times here



    }
}
