package ex_014_Strings_concept;

public class Lab0120_Strings_Functions {
    public static void main(String[] args) {
        char a ='A';
        System.out.println(a); //A

        String s1 = "ABcd";
        System.out.println(s1.length()); //4
        System.out.println(s1.toLowerCase()); //abcd
        System.out.println(s1.toUpperCase()); //ABCD
        System.out.println(s1.concat("E")); //ABcdE
    }
}
