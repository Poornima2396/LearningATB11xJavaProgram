package ex_014_Strings_concept;

public class Lab0123_String_InterviewQ3IMP {
    public static void main(String[] args) {
        String s1 = "Hello"; //SCP - same
        String s4 = "Hello"; //SCP - same

        String s2 = new String("Hello"); //OA - new
        String s3= new String("Hello"); //OA - new
        String s5= new String("hello"); //OA - new

        // == -> Comparison -> In String this checks the location ref..
        System.out.println(s1==s3); //false
        System.out.println(s1==s2); //false
        System.out.println(s2==s3); //false

        System.out.println(s1==s4); //true bcz they are in same area
        System.out.println(s3==s5); //false bcz they are in new area where new is used

        //equals (content) - value
        System.out.println(s1.equals(s2)); //true
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s4));
        System.out.println(s3.equals(s5));
        System.out.println(s3.equalsIgnoreCase(s5)); //this will ignore case sensitive
         //true


    }
}
